/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-06-13 12:31:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Payment</title>\r\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">  <meta charset=\"utf-8\">\r\n");
      out.write(" \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("history.pushState(null, null, location.href);\r\n");
      out.write("window.onpopstate = function () {\r\n");
      out.write("    history.go(1);\r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("  font-family: Arial;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row {\r\n");
      out.write("  display: -ms-flexbox; /* IE10 */\r\n");
      out.write("  display: flex;\r\n");
      out.write("  -ms-flex-wrap: wrap; /* IE10 */\r\n");
      out.write("  flex-wrap: wrap;\r\n");
      out.write("  margin: 0 -16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-25 {\r\n");
      out.write("  -ms-flex: 25%; /* IE10 */\r\n");
      out.write("  flex: 25%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-50 {\r\n");
      out.write("  -ms-flex: 50%; /* IE10 */\r\n");
      out.write("  flex: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-75 {\r\n");
      out.write("  -ms-flex: 75%; /* IE10 */\r\n");
      out.write("  flex: 75%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-25,\r\n");
      out.write(".col-50,\r\n");
      out.write(".col-75 {\r\n");
      out.write("  padding: 0 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("  background-color: #f2f2f2;\r\n");
      out.write("  padding: 5px 20px 15px 20px;\r\n");
      out.write("  border: 1px solid lightgrey;\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text] {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  margin-bottom: 20px;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label {\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("  display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".icon-container {\r\n");
      out.write("  margin-bottom: 20px;\r\n");
      out.write("  padding: 7px 0;\r\n");
      out.write("  font-size: 24px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  margin: 10px 0;\r\n");
      out.write("  border: none;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:hover {\r\n");
      out.write("  background-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("  color: #2196F3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr {\r\n");
      out.write("  border: 1px solid lightgrey;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span.price {\r\n");
      out.write("  float: right;\r\n");
      out.write("  color: grey;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the \"cart\" column go on top) */\r\n");
      out.write("@media (max-width: 800px) {\r\n");
      out.write("  .row {\r\n");
      out.write("    flex-direction: column-reverse;\r\n");
      out.write("  }\r\n");
      out.write("  .col-25 {\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h2 style=\"text-align:center\">PAYMENT</h2>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"col-75\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-50\">\r\n");
      out.write("            <h3>Billing Address</h3>\r\n");
      out.write("            <label for=\"fname\"><i class=\"fa fa-user\"></i> Full Name</label>\r\n");
      out.write("            <input type=\"text\" id=\"fname\" name=\"firstname\" >\r\n");
      out.write("            <label for=\"email\"><i class=\"fa fa-envelope\"></i> Email</label>\r\n");
      out.write("            <input type=\"text\" id=\"email\" name=\"email\" >\r\n");
      out.write("            <label for=\"adr\"><i class=\"fa fa-address-card-o\"></i> Address</label>\r\n");
      out.write("            <input type=\"text\" id=\"adr\" name=\"address\" >\r\n");
      out.write("            <label for=\"city\"><i class=\"fa fa-institution\"></i> City</label>\r\n");
      out.write("            <input type=\"text\" id=\"city\" name=\"city\" >\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-50\">\r\n");
      out.write("                <label for=\"state\">State</label>\r\n");
      out.write("                <input type=\"text\" id=\"state\" name=\"state\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-50\">\r\n");
      out.write("                <label for=\"zip\">Zip</label>\r\n");
      out.write("                <input type=\"text\" id=\"zip\" name=\"zip\" >\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-50\">\r\n");
      out.write("            <h3>Payment</h3>\r\n");
      out.write("            <label for=\"fname\">Accepted Cards</label>\r\n");
      out.write("            <div class=\"icon-container\">\r\n");
      out.write("              <i class=\"fa fa-cc-visa\" style=\"color:navy;\"></i>\r\n");
      out.write("              <i class=\"fa fa-cc-amex\" style=\"color:blue;\"></i>\r\n");
      out.write("              <i class=\"fa fa-cc-mastercard\" style=\"color:red;\"></i>\r\n");
      out.write("              <i class=\"fa fa-cc-discover\" style=\"color:orange;\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <label for=\"cname\">Name on Card</label>\r\n");
      out.write("            <input type=\"text\" id=\"cname\" name=\"cardname\" >\r\n");
      out.write("            <label for=\"ccnum\">Credit card number</label>\r\n");
      out.write("            <input type=\"text\" id=\"ccnum\" name=\"cardnumber\">\r\n");
      out.write("            <label for=\"expmonth\">Exp Month</label>\r\n");
      out.write("            <input type=\"text\" id=\"expmonth\" name=\"expmonth\" >\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-50\">\r\n");
      out.write("                <label for=\"expyear\">Exp Year</label>\r\n");
      out.write("                <input type=\"text\" id=\"expyear\" name=\"expyear\" >\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-50\">\r\n");
      out.write("                <label for=\"cvv\">CVV</label>\r\n");
      out.write("                <input type=\"text\" id=\"cvv\" name=\"cvv\" >\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("        <label>\r\n");
      out.write("          <input type=\"checkbox\" checked=\"checked\" name=\"sameadr\"> Shipping address same as billing\r\n");
      out.write("        </label>\r\n");
      out.write("       \r\n");
      out.write("        <button type=\"button\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">Proceed Payment</button>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("  <!-- Modal -->\r\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("    \r\n");
      out.write("      <!-- Modal content-->\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("        <p style=\"text-align:center\">  Status</p>\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <p style=\"text-align:center\">Payment Successful</p>\r\n");
      out.write("          <form action=\"/olx_resale/proceedtopay\" method=\"POST\">\r\n");
      out.write("          <input type=\"submit\" value=\"ok\" class=\"btn btn-info\" >\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    \r\n");
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
