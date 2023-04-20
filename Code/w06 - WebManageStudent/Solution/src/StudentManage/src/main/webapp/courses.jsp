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
	    
	    .flex-container {
		    display: flex;
		    align-items: center; /* center items vertically */
		    justify-content: center;
		  }
        
        #coursesDatagrid {
		  box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.2);
		  padding: 2px;
		  margin-bottom: 2rem;
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
    	<div class="flex-container">
		  <img src="https://i.ibb.co/1GLbQKL/home.png" onclick="toMainScreen()" class="clsbtnCursor"/>
		  <h2 class="myHeader">All Courses</h2>
		</div>
    	<div class="row">
    		<div id="coursesDatagrid"></div>
    	</div>
    	
    	<button class="button-add" onclick=addFunction()><img src="https://i.ibb.co/P5CV0FS/add-button.png" height="30" width="30"/></button>
	</div>
	
	
	<script>
	
	//----------------------------------------------
	function toMainScreen(){
		window.location.href = "main.jsp";
	}
	
	
	//----------------------------------------------
	function addFunction(){
		$('#coursesDatagrid').dxDataGrid('instance').addRow();
	}
	
	
	 var data1;
	
	 $.ajax({
	      url: "CourseServlet",
	      type: "GET",
	      dataType: "json",
	      success: function(courseList) {
	        data1 = courseList;
	        console.log(data1); // print the updated "data1" variable
	        
	        InitExtreme();
	      },
	      error: function(xhr, textStatus, errorThrown) {
	        console.log(xhr.responseText);
	      }
	    });
	
	//------------------------------------------
	function InitExtreme(){
		$("#coursesDatagrid").dxDataGrid({
            dataSource: data1,
            keyExpr: "_courseId",
            editing: {
                mode: 'form',
                form: {
                    items: [
                        {
                            dataField: '_courseId',
                        },
                        {
                            dataField: '_courseName',
                        },
                        {
                            dataField: '_lecture',
                        },
                        {
                            dataField: '_year',
                        },
                        {
                            dataField: '_note',
                        },
                        {
                            dataField: 'StudentList',
                            visible: false
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
            	var courseData = e.data;
            	var Nnote = courseData._note;
            	var newId = e.data._courseId;

            	if (Nnote == null)
            		{
            			Nnote = ' ';
            		}
            
                var existingIds = data1.map(function(item) {
                    return item._courseId;
                });
                
                
                if(existingIds.includes(newId)) {
                    e.cancel = true;
                    alert("This ID already exists. Please choose a different ID.");
                }
                else {
                	
                	//console.log(courseData._note);
                	
                	$.ajax({
                	    type: 'POST',
                	    url: 'CourseServlet',
                	    data: {
                	      courseId: courseData._courseId,
                	      courseName: courseData._courseName,
                	      lecture: courseData._lecture,
                	      year: courseData._year,
                	      note: Nnote,
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
            	var courseData = e.newData;
            	var oldCourse = e.oldData;
	           	  
	           	var courseId = oldCourse._courseId;
	           	
	           	var courseName = courseData._courseName !== undefined ? courseData._courseName : oldCourse._courseName;
	            var lecture = courseData._lecture !== undefined ? courseData._lecture : oldCourse._lecture;
	            var year = courseData._year !== undefined ? courseData._year : oldCourse._year;
	            
	            console.log(lecture);
	            
	            // Check if the note field has been modified
	            var isNoteModified = courseData.hasOwnProperty('_note') && courseData._note !== undefined;
	            
	            // Set the note variable based on the modified status
	            var note = isNoteModified ? courseData._note : oldCourse._note || '';
            	
            	if (note === null || note === '')
            		{
            			note = ' ';
            		}
            	
            	$.ajax({
            	    type: 'POST',
            	    url: 'CourseServlet',
            	    data: {
            	      courseId: courseId,
            	      courseName: courseName,
            	      lecture: lecture,
            	      year: year,
            	      note: note,
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
            	var courseData = e.data;
            	
            	$.ajax({
            		type: 'POST',
            		url: 'CourseServlet',
            		data: {
            			courseId: courseData._courseId,
              	      	courseName: courseData._courseName,
              	     	lecture: courseData._lecture,
              	     	year: courseData._year,
              	      	note: courseData._note,
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
                    dataField: '_courseId',
                    name: 'IDCol',
                    allowEditing: false,
                    validationRules: [{ type: 'required' }]
                },
                {
                    caption: 'Course Name',
                    width: '23%',
                    alignment: 'left',
                    dataField: '_courseName',
                    validationRules: [{ type: 'required' }]
                },
                {
                    caption: 'Lecture',
                    width: '15%',
                    dataField: '_lecture',
                    validationRules: [{ type: 'required' }]
                },
                {
                    caption: 'Year',
                    width: '10%',
                    alignment: 'center',
                    dataField: '_year',
                    validationRules: [{ type: 'required' }]
                },
                {
                    caption: 'Note',
                    width: '25%',
                    alignment: 'left',
                    dataField: '_note',
                },
                {
                    caption: 'Students List',
                    width: '10%',
                    alignment: 'center',
                    cellTemplate: function (container, options) {
                        $("<div>").append($("<img>", {
                            "class": "clsbtnCursor",
                            "src": "https://i.ibb.co/hMHRSL7/file.png",
                        })).on('dxclick', function () {
                        	
                        	var id = options.data._courseId; 
                            window.location.href = "StudentInCourse.jsp?id=" + id;
                            
                        }).appendTo(container);
                    }
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
                            $('#coursesDatagrid').dxDataGrid('instance').editRow(cellInfo.rowIndex);
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
                            $('#coursesDatagrid').dxDataGrid('instance').deleteRow(options.rowIndex);
                        }).appendTo(container);
                    }
                },
                
            ],
        });
	}
	
	
	//------------------------------------------
	$(document).ready(function(){
	})
	
	
	</script>
</body>
</html>