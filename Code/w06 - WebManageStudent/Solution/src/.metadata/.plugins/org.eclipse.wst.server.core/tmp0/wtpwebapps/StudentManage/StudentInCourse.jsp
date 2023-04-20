<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.google.gson.Gson" %>
<%@ page import="com.nhp.entity.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management</title>

<!-- ... -->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
 
    <!-- DevExtreme theme -->
    <link rel="stylesheet" href="https://cdn3.devexpress.com/jslib/22.2.5/css/dx.light.css">
 
    <!-- DevExtreme library -->
    <script type="text/javascript" src="https://cdn3.devexpress.com/jslib/22.2.5/js/dx.all.js"></script>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

	<style>
        .clsbtnCursor {
		    cursor: pointer;
		}
		
        .row {
	        margin-top: 50px;
	    }
	    
	    .myHeader{
	    	color: black;
            text-shadow: 1px 1px 1px rgba(0,0,0,0.5);
            margin-left: 10px;
	    }
        
        #studentsDatagrid {
		  box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.2);
		  padding: 2px;
		  margin-bottom: 2rem;
		}
        
        .flex-container {
		    display: flex;
		    align-items: center; /* center items vertically */
		    justify-content: center;
		  }
        
       .button-add{
       		background-color: transparent;
       		border: none;
       		position: fixed; 
       		top :12rem; 
       		right:3rem;
       }
       
        body {
		    background: radial-gradient(circle at center, #CBF1F5, #E3FDFD);
		}
    </style>


</head>
<body>
	<div class="container text-center mt-5">
	<a></a>
		<div class="flex-container">
		  <img src="https://i.ibb.co/1GLbQKL/home.png" onclick="toMainScreen()" class="clsbtnCursor"/>
		  <h2 class="myHeader">Students in Course </h2>
		</div>
    	<div class="row">
    		<div id="studentsDatagrid"></div>
    	</div>
    	<script type="text/html" id="content_template">
              <div id="gridInPopup"></div>
        </script>
    	
	</div>
	
	
	<script>
	
	//----------------------------------------------
	var courseId = <%= request.getParameter("id") %>;
	console.log("ID parameter value: " + courseId); 
	
	$('.myHeader').text('Students in Course ' + courseId);
	
	//----------------------------------------------
	function toMainScreen(){
		window.location.href = "main.jsp";
	}
	

	
	//-----------------------------------------------
	 var data1;
	
	 $.ajax({
	      url: "StudentInCourseServlet?id=" + courseId,
	      type: "GET",
	      dataType: "json",
	      success: function(studentList) {
	        data1 = studentList;
	        console.log(data1); // print the updated "data1" variable
	        
	        InitExtreme();
	      },
	      error: function(xhr, textStatus, errorThrown) {
	        console.log(xhr.responseText);
	      }
	    });
	
	 
	//------------------------------------------
	function loadCourse(callback) {
		  $.ajax({
		    url: "CourseServlet",
		    type: "GET",
		    dataType: "json",
		    success: function(courseList) {
		      callback(courseList);
		    },
		    error: function(xhr, textStatus, errorThrown) {
		      console.log(xhr.responseText);
		    }
		  });
		}
	 
	 
	//------------------------------------------
	function InitExtreme(){
		loadCourse(function(courseList) {
			
			$("#studentsDatagrid").dxDataGrid({
	            dataSource: data1,
	            keyExpr: "_studentId",
	            editing: {
	                mode: 'form',
	                form: {
	                    items: [
	                        {
	                            dataField: '_studentId',
	                        },
	                        {
	                            dataField: '_studentName',
	                        },
	                        {
	                            dataField: '_grade',
	                        },
	                        {
	                            dataField: '_birthdate',
	                        },
	                        {
	                        	dataField: '_address',
	                        },
	                        {
	                            dataField: '_note',
	                        },
	                        {
	                        	dataField: '_score',
	                        }
	                    ]
	                },
	            },
	            searchPanel: {
	            	visible: true,
	            },
	            scrolling: {
	                mode: "virtual"
	            },
	            showBorders: true,
	            showColumnLines: true,
	            wordWrapEnabled: true,
	            showRowLines: true,
	            remoteOperations: {
	                filtering: true,
	                paging: true,
	                sorting: false,
	                groupPaging: false,
	                grouping: false,
	                summary: true
	            },
	            selection: {
	                mode: 'single',
	                showCheckBoxesMode: 'always',
	                selectAllMode: 'page',
	            },
	            grouping: {
	                autoExpandAll: true,
	            },
	            onRowInserting: function(e) {
	            	var studentData = e.data;
	            	var Nnote = studentData._note;
	            	var score = studentData._score;
	            	var newId = e.data._studentId;

	            	if (Nnote == null)
	            		{
	            			Nnote = ' ';
	            		}
	            	
	            	if (score == null || score.trim().length == 0){
	            		score = '0.0';
	            	}
	            
	                var existingIds = data1.map(function(item) {
	                    return item._studentId;
	                });
	                
	                if(existingIds.includes(newId)) {
	                    e.cancel = true;
	                    alert("This ID already exists. Please choose a different ID.");
	                }
	                else {
	                	
	                	$.ajax({
	                	    type: 'POST',
	                	    url: 'StudentServlet',
	                	    data: {
	                	    	courseId: courseId,
	                	      	studentId: studentData._studentId,
	                	      	studentName: studentData._studentName,
	                	      	grade: studentData._grade,
	                	      	birthdate: studentData._birthdate,
	                	      	address: studentData._address,
	                	      	note: Nnote,
	                	      	score: score,      
	                	      	action: 'add'
	                	    },
	                	    success: function(response) {
	                	      console.log('post ok');
	                	      const msg = 'Add Success';
		            			DevExpress.ui.notify({
		            				message : msg,
		            				width: 300,
		            				position: {
		            					my: 'center top',
		            					at: 'center top',
		            				},
		            			}, 'success', 3000);
	                	    },
	                	    error: function(jqXHR, textStatus, errorThrown) {
	                	    	console.log(textStatus);
	                	    }
	                	  });
	                }
	            },
	            onInitNewRow: function(e) {
	            	e.component.columnOption('IDCol', 'allowEditing', true);
	            },
	            onEditingStart: function(e){
	            	e.component.columnOption('IDCol', 'allowEditing', false);
	            },
	            onRowUpdating: function(e) {
	            	var studentData = e.newData;
	            	var oldStudent = e.oldData;
		           	  
		           	var studentId = oldStudent._studentId;
		           	var studentName = studentData._studentName !== undefined ? studentData._studentName : oldStudent._studentName;
		            var grade = studentData._grade !== undefined ? studentData._grade : oldStudent._grade;
		            var birthdate = studentData._birthdate !== undefined ? studentData._birthdate : oldStudent._birthdate;
		            var address = studentData._address !== undefined ? studentData._address : oldStudent._address;
		            var score = studentData._score;
		            
		            if (score === null || score === '')
            		{
            			score = '0.0';
            		}
		            
		            // Check if the note field has been modified
		            var isNoteModified = studentData.hasOwnProperty('_note') && studentData._note !== undefined;
		            
		            // Set the note variable based on the modified status
		            var note = isNoteModified ? studentData._note : oldStudent._note || '';
	            	
	            	if (note === null || note === '')
	            		{
	            			note = ' ';
	            		}
	            	
	            	$.ajax({
	            	    type: 'POST',
	            	    url: 'StudentInCourseServlet',
	            	    data: {
	            	    	courseId: courseId,
	            	      	studentId: studentId,
	            	      	studentName: studentName,
	            	     	grade: grade,
	            	      	birthdate: birthdate,
	            	      	address: address,
	            	      	note: note,
	            	      	score: score,
	            	      	action: 'update'
	            	    },
	            	    success: function(response) {
	            	      console.log('post ok');
	            	      const msg = 'Update Success';
	            			DevExpress.ui.notify({
	            				message : msg,
	            				width: 300,
	            				position: {
	            					my: 'center top',
	            					at: 'center top',
	            				},
	            			}, 'success', 3000);
	            	    },
	            	    error: function(jqXHR, textStatus, errorThrown) {
	            	    	console.log(textStatus);
	            	    }
	            	  });
	            },
	            onRowRemoving: function(e) {
	            	var studentData = e.data;
	            	
	            	$.ajax({
	            		type: 'POST',
	            		url: 'StudentInCourseServlet',
	            		data: {
	            			courseId: courseId,
	            			studentId: studentData._studentId,
	              	        studentName: studentData._studentName,
	              	        grade: studentData._grade,
	              	        birthdate: studentData._birthdate,
	              	        address: studentData._address,
	              	      	note: studentData._note,
	              	        score: studentData._score,
	            			action: 'delete',
	            		},
	            		success: function(response) {
	            			const msg = 'Delete Success';
	            			DevExpress.ui.notify({
	            				message : msg,
	            				width: 300,
	            				position: {
	            					my: 'center top',
	            					at: 'center top',
	            				},
	            			}, 'success', 3000);
	            		},
	            		error: function(jqXHR, textStatus, errorThrown) {
	            			console.log(textStatus);
	            		}
	            	});
	            },
	            columns: [
	                {
	                    caption: 'ID',
	                    width: '7%',
	                    alignment: 'center',
	                    dataField: '_studentId',
	                    name: 'IDCol',
	                    allowEditing: false,
	                    validationRules: [{ type: 'required' }]
	                },
	                {
	                    caption: 'Student Name',
	                    width: '20%',
	                    alignment: 'left',
	                    dataField: '_studentName',
	                    validationRules: [{ type: 'required' }]
	                },
	                {
	                    caption: 'Grade',
	                    width: '5%',
	                    alignment: 'center',
	                    dataField: '_grade',
	                    validationRules: [{ type: 'required' }]
	                },
	                {
	                    caption: 'BirthDate',
	                    width: '10%',
	                    alignment: 'center',
	                    dataField: '_birthdate',
	                    dataType: 'date',
	                    validationRules: [{ type: 'required' }]
	                },
	                {
	                    caption: 'Address',
	                    width: '20%',
	                    alignment: 'left',
	                    dataField: '_address',
	                    validationRules: [{ type: 'required' }]
	                },
	                {
	                    caption: 'Note',
	                    width: '18%',
	                    alignment: 'left',
	                    dataField: '_note',
	                },
	                {
	                    caption: 'Score',
	                    width: '10%',
	                    alignment: 'center',
	                    dataField: '_score',
	                },
	                {
	                    caption: 'Edit',
	                    width: '5%',
	                    alignment: 'center',
	                    cellTemplate: function (container, cellInfo) {
	                        $("<div>").append($("<img>", {
	                            "class": "clsbtnCursor",
	                            "src": "https://i.ibb.co/Wzq5Nb9/edit.png",
	                        })).on('dxclick', function () {
	                            $('#studentsDatagrid').dxDataGrid('instance').editRow(cellInfo.rowIndex);
	                        }).appendTo(container);
	                    }
	                },
	                {
	                    caption: 'Delete',
	                    width: '5%',
	                    alignment: 'center',
	                    cellTemplate: function (container, options) {
	                        $("<div>").append($("<img>", {
	                            "class": "clsbtnCursor",
	                            "src": "https://i.ibb.co/HxkC20s/trash.png",
	                        })).on('dxclick', function () {
	                            $('#studentsDatagrid').dxDataGrid('instance').deleteRow(options.rowIndex);
	                        }).appendTo(container);
	                    }
	                },
	                
	            ], // Columns
	        }); //data grid
		  
		  
		  
		}); // loadCourse
	} // Init Extreme
	

	//------------------------------------------------------
	
	

	
	
	//------------------------------------------
	$(document).ready(function(){
	})
	
	
	</script>
</body>
</html>