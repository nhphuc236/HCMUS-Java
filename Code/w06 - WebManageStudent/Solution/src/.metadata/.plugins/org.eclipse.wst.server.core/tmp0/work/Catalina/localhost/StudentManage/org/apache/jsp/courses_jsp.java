/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-20 13:20:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.google.gson.Gson;
import com.nhp.entity.*;
import java.util.*;

public final class courses_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.nhp.entity");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.google.gson.Gson");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Student Management</title>\r\n");
      out.write("\r\n");
      out.write("<!-- ... -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("    <!-- DevExtreme theme -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn3.devexpress.com/jslib/22.2.5/css/dx.light.css\">\r\n");
      out.write(" \r\n");
      out.write("    <!-- DevExtreme library -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn3.devexpress.com/jslib/22.2.5/js/dx.all.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("	\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("	<style>\r\n");
      out.write("        .clsbtnCursor {\r\n");
      out.write("		    cursor: pointer;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("        .row {\r\n");
      out.write("	        margin-top: 50px;\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    .myHeader{\r\n");
      out.write("	    	color: black;\r\n");
      out.write("            text-shadow: 1px 1px 1px rgba(0,0,0,0.5);\r\n");
      out.write("            margin-left: 10px;\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    .flex-container {\r\n");
      out.write("		    display: flex;\r\n");
      out.write("		    align-items: center; /* center items vertically */\r\n");
      out.write("		    justify-content: center;\r\n");
      out.write("		  }\r\n");
      out.write("        \r\n");
      out.write("        #coursesDatagrid {\r\n");
      out.write("		  box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.2);\r\n");
      out.write("		  padding: 2px;\r\n");
      out.write("		  margin-bottom: 2rem;\r\n");
      out.write("		}\r\n");
      out.write("        \r\n");
      out.write("       .button-add{\r\n");
      out.write("       		background-color: transparent;\r\n");
      out.write("       		border: none;\r\n");
      out.write("       		position: fixed; \r\n");
      out.write("       		top :12rem; \r\n");
      out.write("       		right:3rem;\r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("        body {\r\n");
      out.write("		    background: radial-gradient(circle at center, #CBF1F5, #E3FDFD);\r\n");
      out.write("		}\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container text-center mt-5\">\r\n");
      out.write("    	<div class=\"flex-container\">\r\n");
      out.write("		  <img src=\"https://i.ibb.co/1GLbQKL/home.png\" onclick=\"toMainScreen()\" class=\"clsbtnCursor\"/>\r\n");
      out.write("		  <h2 class=\"myHeader\">All Courses</h2>\r\n");
      out.write("		</div>\r\n");
      out.write("    	<div class=\"row\">\r\n");
      out.write("    		<div id=\"coursesDatagrid\"></div>\r\n");
      out.write("    	</div>\r\n");
      out.write("    	\r\n");
      out.write("    	<button class=\"button-add\" onclick=addFunction()><img src=\"https://i.ibb.co/P5CV0FS/add-button.png\" height=\"30\" width=\"30\"/></button>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("	//----------------------------------------------\r\n");
      out.write("	function toMainScreen(){\r\n");
      out.write("		window.location.href = \"main.jsp\";\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	//----------------------------------------------\r\n");
      out.write("	function addFunction(){\r\n");
      out.write("		$('#coursesDatagrid').dxDataGrid('instance').addRow();\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	 var data1;\r\n");
      out.write("	\r\n");
      out.write("	 $.ajax({\r\n");
      out.write("	      url: \"CourseServlet\",\r\n");
      out.write("	      type: \"GET\",\r\n");
      out.write("	      dataType: \"json\",\r\n");
      out.write("	      success: function(courseList) {\r\n");
      out.write("	        data1 = courseList;\r\n");
      out.write("	        console.log(data1); // print the updated \"data1\" variable\r\n");
      out.write("	        \r\n");
      out.write("	        InitExtreme();\r\n");
      out.write("	      },\r\n");
      out.write("	      error: function(xhr, textStatus, errorThrown) {\r\n");
      out.write("	        console.log(xhr.responseText);\r\n");
      out.write("	      }\r\n");
      out.write("	    });\r\n");
      out.write("	\r\n");
      out.write("	//------------------------------------------\r\n");
      out.write("	function InitExtreme(){\r\n");
      out.write("		$(\"#coursesDatagrid\").dxDataGrid({\r\n");
      out.write("            dataSource: data1,\r\n");
      out.write("            keyExpr: \"_courseId\",\r\n");
      out.write("            editing: {\r\n");
      out.write("                mode: 'form',\r\n");
      out.write("                form: {\r\n");
      out.write("                    items: [\r\n");
      out.write("                        {\r\n");
      out.write("                            dataField: '_courseId',\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            dataField: '_courseName',\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            dataField: '_lecture',\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            dataField: '_year',\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            dataField: '_note',\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            dataField: 'StudentList',\r\n");
      out.write("                            visible: false\r\n");
      out.write("                        }\r\n");
      out.write("                    ]\r\n");
      out.write("                },\r\n");
      out.write("            },\r\n");
      out.write("            searchPanel: {\r\n");
      out.write("            	visible: true,\r\n");
      out.write("            },\r\n");
      out.write("            scrolling: {\r\n");
      out.write("                mode: \"virtual\"\r\n");
      out.write("            },\r\n");
      out.write("            showBorders: true,\r\n");
      out.write("            showColumnLines: true,\r\n");
      out.write("            wordWrapEnabled: true,\r\n");
      out.write("            showRowLines: true,\r\n");
      out.write("            remoteOperations: {\r\n");
      out.write("                filtering: true,\r\n");
      out.write("                paging: true,\r\n");
      out.write("                sorting: false,\r\n");
      out.write("                groupPaging: false,\r\n");
      out.write("                grouping: false,\r\n");
      out.write("                summary: true\r\n");
      out.write("            },\r\n");
      out.write("            selection: {\r\n");
      out.write("                mode: 'single',\r\n");
      out.write("                showCheckBoxesMode: 'always',\r\n");
      out.write("                selectAllMode: 'page',\r\n");
      out.write("            },\r\n");
      out.write("            grouping: {\r\n");
      out.write("                autoExpandAll: true,\r\n");
      out.write("            },\r\n");
      out.write("            onRowInserting: function(e) {\r\n");
      out.write("            	var courseData = e.data;\r\n");
      out.write("            	var Nnote = courseData._note;\r\n");
      out.write("            	var newId = e.data._courseId;\r\n");
      out.write("\r\n");
      out.write("            	if (Nnote == null)\r\n");
      out.write("            		{\r\n");
      out.write("            			Nnote = ' ';\r\n");
      out.write("            		}\r\n");
      out.write("            \r\n");
      out.write("                var existingIds = data1.map(function(item) {\r\n");
      out.write("                    return item._courseId;\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                if(existingIds.includes(newId)) {\r\n");
      out.write("                    e.cancel = true;\r\n");
      out.write("                    alert(\"This ID already exists. Please choose a different ID.\");\r\n");
      out.write("                }\r\n");
      out.write("                else {\r\n");
      out.write("                	\r\n");
      out.write("                	//console.log(courseData._note);\r\n");
      out.write("                	\r\n");
      out.write("                	$.ajax({\r\n");
      out.write("                	    type: 'POST',\r\n");
      out.write("                	    url: 'CourseServlet',\r\n");
      out.write("                	    data: {\r\n");
      out.write("                	      courseId: courseData._courseId,\r\n");
      out.write("                	      courseName: courseData._courseName,\r\n");
      out.write("                	      lecture: courseData._lecture,\r\n");
      out.write("                	      year: courseData._year,\r\n");
      out.write("                	      note: Nnote,\r\n");
      out.write("                	      action: 'add'\r\n");
      out.write("                	    },\r\n");
      out.write("                	    success: function(response) {\r\n");
      out.write("                	      console.log('post ok');\r\n");
      out.write("                	      const msg = 'Add Success';\r\n");
      out.write("	            			DevExpress.ui.notify({\r\n");
      out.write("	            				message : msg,\r\n");
      out.write("	            				width: 300,\r\n");
      out.write("	            				position: {\r\n");
      out.write("	            					my: 'center top',\r\n");
      out.write("	            					at: 'center top',\r\n");
      out.write("	            				},\r\n");
      out.write("	            			}, 'success', 3000);\r\n");
      out.write("                	    },\r\n");
      out.write("                	    error: function(jqXHR, textStatus, errorThrown) {\r\n");
      out.write("                	    	console.log(textStatus);\r\n");
      out.write("                	    }\r\n");
      out.write("                	  });\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            onInitNewRow: function(e) {\r\n");
      out.write("            	e.component.columnOption('IDCol', 'allowEditing', true);\r\n");
      out.write("            },\r\n");
      out.write("            onEditingStart: function(e){\r\n");
      out.write("            	e.component.columnOption('IDCol', 'allowEditing', false);\r\n");
      out.write("            },\r\n");
      out.write("            onRowUpdating: function(e) {\r\n");
      out.write("            	var courseData = e.newData;\r\n");
      out.write("            	var oldCourse = e.oldData;\r\n");
      out.write("	           	  \r\n");
      out.write("	           	var courseId = oldCourse._courseId;\r\n");
      out.write("	           	\r\n");
      out.write("	           	var courseName = courseData._courseName !== undefined ? courseData._courseName : oldCourse._courseName;\r\n");
      out.write("	            var lecture = courseData._lecture !== undefined ? courseData._lecture : oldCourse._lecture;\r\n");
      out.write("	            var year = courseData._year !== undefined ? courseData._year : oldCourse._year;\r\n");
      out.write("	            \r\n");
      out.write("	            console.log(lecture);\r\n");
      out.write("	            \r\n");
      out.write("	            // Check if the note field has been modified\r\n");
      out.write("	            var isNoteModified = courseData.hasOwnProperty('_note') && courseData._note !== undefined;\r\n");
      out.write("	            \r\n");
      out.write("	            // Set the note variable based on the modified status\r\n");
      out.write("	            var note = isNoteModified ? courseData._note : oldCourse._note || '';\r\n");
      out.write("            	\r\n");
      out.write("            	if (note === null || note === '')\r\n");
      out.write("            		{\r\n");
      out.write("            			note = ' ';\r\n");
      out.write("            		}\r\n");
      out.write("            	\r\n");
      out.write("            	$.ajax({\r\n");
      out.write("            	    type: 'POST',\r\n");
      out.write("            	    url: 'CourseServlet',\r\n");
      out.write("            	    data: {\r\n");
      out.write("            	      courseId: courseId,\r\n");
      out.write("            	      courseName: courseName,\r\n");
      out.write("            	      lecture: lecture,\r\n");
      out.write("            	      year: year,\r\n");
      out.write("            	      note: note,\r\n");
      out.write("            	      action: 'update'\r\n");
      out.write("            	    },\r\n");
      out.write("            	    success: function(response) {\r\n");
      out.write("            	      console.log('post ok');\r\n");
      out.write("            	      const msg = 'Update Success';\r\n");
      out.write("	          			DevExpress.ui.notify({\r\n");
      out.write("	          				message : msg,\r\n");
      out.write("	          				width: 300,\r\n");
      out.write("	          				position: {\r\n");
      out.write("	          					my: 'center top',\r\n");
      out.write("	          					at: 'center top',\r\n");
      out.write("	          				},\r\n");
      out.write("	          			}, 'success', 3000);\r\n");
      out.write("            	    },\r\n");
      out.write("            	    error: function(jqXHR, textStatus, errorThrown) {\r\n");
      out.write("            	    	console.log(textStatus);\r\n");
      out.write("            	    }\r\n");
      out.write("            	  });\r\n");
      out.write("            },\r\n");
      out.write("            onRowRemoving: function(e) {\r\n");
      out.write("            	var courseData = e.data;\r\n");
      out.write("            	\r\n");
      out.write("            	$.ajax({\r\n");
      out.write("            		type: 'POST',\r\n");
      out.write("            		url: 'CourseServlet',\r\n");
      out.write("            		data: {\r\n");
      out.write("            			courseId: courseData._courseId,\r\n");
      out.write("              	      	courseName: courseData._courseName,\r\n");
      out.write("              	     	lecture: courseData._lecture,\r\n");
      out.write("              	     	year: courseData._year,\r\n");
      out.write("              	      	note: courseData._note,\r\n");
      out.write("            			action: 'delete',\r\n");
      out.write("            		},\r\n");
      out.write("            		success: function(response) {\r\n");
      out.write("            			const msg = 'Delete Success';\r\n");
      out.write("            			DevExpress.ui.notify({\r\n");
      out.write("            				message : msg,\r\n");
      out.write("            				width: 300,\r\n");
      out.write("            				position: {\r\n");
      out.write("            					my: 'center top',\r\n");
      out.write("            					at: 'center top',\r\n");
      out.write("            				},\r\n");
      out.write("            			}, 'success', 3000);\r\n");
      out.write("            		},\r\n");
      out.write("            		error: function(jqXHR, textStatus, errorThrown) {\r\n");
      out.write("            			console.log(textStatus);\r\n");
      out.write("            		}\r\n");
      out.write("            	});\r\n");
      out.write("            },\r\n");
      out.write("            columns: [\r\n");
      out.write("                {\r\n");
      out.write("                    caption: 'ID',\r\n");
      out.write("                    width: '7%',\r\n");
      out.write("                    alignment: 'center',\r\n");
      out.write("                    dataField: '_courseId',\r\n");
      out.write("                    name: 'IDCol',\r\n");
      out.write("                    allowEditing: false,\r\n");
      out.write("                    validationRules: [{ type: 'required' }]\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    caption: 'Course Name',\r\n");
      out.write("                    width: '23%',\r\n");
      out.write("                    alignment: 'left',\r\n");
      out.write("                    dataField: '_courseName',\r\n");
      out.write("                    validationRules: [{ type: 'required' }]\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    caption: 'Lecture',\r\n");
      out.write("                    width: '15%',\r\n");
      out.write("                    dataField: '_lecture',\r\n");
      out.write("                    validationRules: [{ type: 'required' }]\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    caption: 'Year',\r\n");
      out.write("                    width: '10%',\r\n");
      out.write("                    alignment: 'center',\r\n");
      out.write("                    dataField: '_year',\r\n");
      out.write("                    validationRules: [{ type: 'required' }]\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    caption: 'Note',\r\n");
      out.write("                    width: '25%',\r\n");
      out.write("                    alignment: 'left',\r\n");
      out.write("                    dataField: '_note',\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    caption: 'Students List',\r\n");
      out.write("                    width: '10%',\r\n");
      out.write("                    alignment: 'center',\r\n");
      out.write("                    cellTemplate: function (container, options) {\r\n");
      out.write("                        $(\"<div>\").append($(\"<img>\", {\r\n");
      out.write("                            \"class\": \"clsbtnCursor\",\r\n");
      out.write("                            \"src\": \"https://i.ibb.co/hMHRSL7/file.png\",\r\n");
      out.write("                        })).on('dxclick', function () {\r\n");
      out.write("                        	\r\n");
      out.write("                        	var id = options.data._courseId; \r\n");
      out.write("                            window.location.href = \"StudentInCourse.jsp?id=\" + id;\r\n");
      out.write("                            \r\n");
      out.write("                        }).appendTo(container);\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    caption: 'Edit',\r\n");
      out.write("                    width: '5%',\r\n");
      out.write("                    alignment: 'center',\r\n");
      out.write("                    cellTemplate: function (container, cellInfo) {\r\n");
      out.write("                        $(\"<div>\").append($(\"<img>\", {\r\n");
      out.write("                            \"class\": \"clsbtnCursor\",\r\n");
      out.write("                            \"src\": \"https://i.ibb.co/Wzq5Nb9/edit.png\",\r\n");
      out.write("                        })).on('dxclick', function () {\r\n");
      out.write("                            $('#coursesDatagrid').dxDataGrid('instance').editRow(cellInfo.rowIndex);\r\n");
      out.write("                        }).appendTo(container);\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    caption: 'Delete',\r\n");
      out.write("                    width: '5%',\r\n");
      out.write("                    alignment: 'center',\r\n");
      out.write("                    cellTemplate: function (container, options) {\r\n");
      out.write("                        $(\"<div>\").append($(\"<img>\", {\r\n");
      out.write("                            \"class\": \"clsbtnCursor\",\r\n");
      out.write("                            \"src\": \"https://i.ibb.co/HxkC20s/trash.png\",\r\n");
      out.write("                        })).on('dxclick', function () {\r\n");
      out.write("                            $('#coursesDatagrid').dxDataGrid('instance').deleteRow(options.rowIndex);\r\n");
      out.write("                        }).appendTo(container);\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                \r\n");
      out.write("            ],\r\n");
      out.write("        });\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	//------------------------------------------\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
