/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-05-30 04:52:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("       href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("       href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("       src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("       src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#margin1 {\r\n");
      out.write("       margin: 15px;\r\n");
      out.write("       left: 260px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#margin2 {\r\n");
      out.write("       margin: 15px;\r\n");
      out.write("       left: 160px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#margin3 {\r\n");
      out.write("       margin: 15px;\r\n");
      out.write("       left: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#margin4 {\r\n");
      out.write("       margin: 15px;\r\n");
      out.write("       left: -100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#margin5 {\r\n");
      out.write("       margin: 15px;\r\n");
      out.write("       left: -100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".footer\r\n");
      out.write("{\r\n");
      out.write("  position: fixed;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   bottom: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   background-color:#D7DBDD;\r\n");
      out.write("       height: 200px;\r\n");
      out.write("       color: black;\r\n");
      out.write("       text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fa {\r\n");
      out.write("       padding: 5px;\r\n");
      out.write("       font-size: 20px;\r\n");
      out.write("       width: 30px;\r\n");
      out.write("       text-align: center;\r\n");
      out.write("       text-decoration: none;\r\n");
      out.write("       margin: 5px 2px;\r\n");
      out.write("       border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fa:hover {\r\n");
      out.write("       opacity: 0.7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fa-facebook {\r\n");
      out.write("       background: #3B5998;\r\n");
      out.write("       color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fa-twitter {\r\n");
      out.write("       background: #55ACEE;\r\n");
      out.write("       color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fa-google {\r\n");
      out.write("       background: #dd4b39;\r\n");
      out.write("       color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"footer\"   >\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write("              <div class=\"col-sm-2 col-md-2 col-lg-2 col-xs-2\" id=\"margin1\"\r\n");
      out.write("                     style=\"text-align: left\">\r\n");
      out.write("                     <p style=\"font-size: 15px;\">\r\n");
      out.write("                           POPULAR SEARCHES<br> Mobile<br> Cars<br> Bikes\r\n");
      out.write("                     </p>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"col-sm-2 col-md-2 col-lg-2 col-xs-2\" id=\"margin2\"\r\n");
      out.write("                     style=\"text-align: left\">\r\n");
      out.write("                     <p style=\"font-size: 15px;\">\r\n");
      out.write("                           TRENDING<br> Mobile<br> Cars<br> Bikes\r\n");
      out.write("                     </p>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"col-sm-2 col-md-2 col-lg-2 col-xs-2\" id=\"margin3\"\r\n");
      out.write("                     style=\"text-align: left\">\r\n");
      out.write("                     <p style=\"font-size: 15px;\">\r\n");
      out.write("                           ABOUT US<br> About OLX Group<br> Careers<br> Contact Us\r\n");
      out.write("                     </p>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"col-sm-2 col-md-2 col-lg-2 col-xs-2\" id=\"margin4\"\r\n");
      out.write("                     style=\"text-align: left\">\r\n");
      out.write("                     <p style=\"font-size: 15px;\">\r\n");
      out.write("                           OLX<br> Legal and Privacy information<br> Site Map<br>Help\r\n");
      out.write("                     </p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-sm-2 col-md-2 col-lg-2 col-xs-2\" id=\"margin5\">\r\n");
      out.write("                     <p>Follow us on</p>\r\n");
      out.write("                     <a href=\"#\" class=\"fa fa-facebook\"></a> <a href=\"#\"\r\n");
      out.write("                           class=\"fa fa-twitter\"></a> <a href=\"#\" class=\"fa fa-google\"></a>\r\n");
      out.write("              </div>\r\n");
      out.write("       </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
