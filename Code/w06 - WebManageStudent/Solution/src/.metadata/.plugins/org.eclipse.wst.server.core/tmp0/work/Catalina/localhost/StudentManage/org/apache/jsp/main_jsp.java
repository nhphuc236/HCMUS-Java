/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-20 14:37:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Student Management</title>\r\n");
      out.write("	<!-- ... -->\r\n");
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
      out.write("        .option-btn {\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            height: 200px;\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("            display: inline-flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            justify-content: flex-end;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: black;\r\n");
      out.write("            text-shadow: 1px 1px 1px rgba(0,0,0,0.5);\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            transition: transform 0.2s ease-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .option-btn:hover {\r\n");
      out.write("            transform: scale(1.05);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .option-btn .name {\r\n");
      out.write("            font-size: 24px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            margin-bottom: -30px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .row {\r\n");
      out.write("	        margin-top: 50px;\r\n");
      out.write("	    }\r\n");
      out.write("        \r\n");
      out.write("        body {\r\n");
      out.write("		    background: radial-gradient(circle at center, #CBF1F5, #E3FDFD);\r\n");
      out.write("		}\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container text-center mt-5\">\r\n");
      out.write("    <h2>Choose your option:</h2>\r\n");
      out.write("    <div class=\"row mt-4\">\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("            <a href=\"students.jsp\" class=\"option-btn\" style=\"background-image: url('https://i.ibb.co/ch3HtTG/students.png');\">\r\n");
      out.write("                <div class=\"name\">Show Students</div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("            <a href=\"courses.jsp\" class=\"option-btn\" style=\"background-image: url('https://i.ibb.co/HY5HPSK/online-education.png');\">\r\n");
      out.write("                <div class=\"name\">Show Courses</div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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