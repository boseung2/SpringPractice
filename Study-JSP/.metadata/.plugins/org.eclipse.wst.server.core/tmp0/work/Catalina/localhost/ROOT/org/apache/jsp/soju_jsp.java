/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2021-01-21 09:02:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class soju_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>주루마블</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tbody {\r\n");
      out.write("\t  \tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tdiv.all {\r\n");
      out.write("\t\tdisplay: flex;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tbutton {\r\n");
      out.write("\t  background-color: #f44336;\r\n");
      out.write("\t  color: white;\r\n");
      out.write("\t  padding: 15px 25px;\r\n");
      out.write("\t  text-align: center;\r\n");
      out.write("\t  text-decoration: none;\r\n");
      out.write("\t  display: inline-block;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("    table, th, td {\r\n");
      out.write("        border: 1px solid black;\r\n");
      out.write("        border-collapse: collapse;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    table {\r\n");
      out.write("        width: 80%;\r\n");
      out.write("        height: 600px;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .goldblock {\r\n");
      out.write("        background-color: rgb(233, 204, 132);\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        width: 400px;\r\n");
      out.write("        height: 100px;\r\n");
      out.write("    }\r\n");
      out.write("    .whiteblock {\r\n");
      out.write("        background-color: white;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        width: 400px;\r\n");
      out.write("        height: 100px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #center {\r\n");
      out.write("        font-size: 50px;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

int random1 = (int) (Math.random() * 6 + 1);
int random2 = (int) (Math.random() * 6 + 1);
int sum = random1 + random2; 

      out.write("\r\n");
      out.write("<div class=\"all\">\r\n");
      out.write("<div class=\"a\">\r\n");
      out.write("<table>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"goldblock\" id=\"8\">8</td>\r\n");
      out.write("          <td class=\"goldblock\" id=\"9\">9</td>\r\n");
      out.write("          <td class=\"goldblock\" id=\"10\">10</td>\r\n");
      out.write("          <td class=\"goldblock\" id=\"11\">11</td>\r\n");
      out.write("          <td class=\"goldblock\" id=\"12\">12</td>\r\n");
      out.write("          <td class=\"goldblock\" id=\"13\">13</td>\r\n");
      out.write("          <td class=\"goldblock\" id=\"14\">14</td>\r\n");
      out.write("          <td class=\"goldblock\" id=\"15\">15</td>\r\n");
      out.write("          <td class=\"goldblock\" id=\"16\">16</td>\r\n");
      out.write("          <td class=\"goldblock\" id=\"17\">17</td>\r\n");
      out.write("          <td class=\"goldblock\" id=\"18\">18</td>\r\n");
      out.write("          <td class=\"goldblock\" id=\"19\">19</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td class=\"goldblock\" id=\"7\">7</td>\r\n");
      out.write("            <td colspan=\"10\" rowspan=\"6\" id=\"center\">주루마블</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"20\">20</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"goldblock\" id=\"6\">6</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"21\">21</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"goldblock\" id=\"5\">5</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"22\">22</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"goldblock\" id=\"4\">4</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"23\">23</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"goldblock\" id=\"3\">3</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"24\">24</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"goldblock\" id=\"2\">2</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"25\">25</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"goldblock\" id=\"1\">1</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"36\">36</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"35\">35</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"34\">34</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"33\">33</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"32\">32</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"31\">31</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"30\">30</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"29\">29</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"28\">28</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"27\">27</td>\r\n");
      out.write("            <td class=\"goldblock\" id=\"26\">26</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"b\">\r\n");
 
for(int i=1; i<=6; i++) {
	for(int j=1; j<=6; j++) {
		if(random1 == i && random2 == j) {

      out.write("\r\n");
      out.write("<img src=\"/image/dice");
      out.print(random1 );
      out.write(".jpg\" alt=\"dice\\\"><br>\r\n");
      out.write("<img src=\"/image/dice");
      out.print(random2 );
      out.write(".jpg\" alt=\"dice\\\"><br>\r\n");
 
				}
			}
		}

      out.write("\r\n");
      out.write("<button onclick=\"document.location='soju.jsp'\">Throw dice</button>\r\n");
      out.print(sum );
      out.write("\r\n");
      out.write("</div>\r\n");
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
