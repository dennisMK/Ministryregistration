package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Step2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"><head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" /><title>Untitled Document</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style1 {color: #0000FF}\n");
      out.write(".style2 {\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("\tfont-size: 24px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/bootstrap/css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/bootstrap/css/bootstrap-responsive.min.css\" />\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/jquery-1.8.0.min.js\"></script>\t\t\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/font-awesome-4.0.3/css/font-awesome.min.css\" />\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/dcvAttach/dcvAttach.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/dcvAttach/dcvAttach.js?version=1.0.2\"></script>\n");
      out.write("    </head><body>\n");
      out.write("    \n");
      out.write("     ");

   String fName = request.getParameter("firstName");
   String lName = request.getParameter("lastName");
   String oName = request.getParameter("otherName");
   String Uname = request.getParameter( "username" );
   String pWord = request.getParameter("password");
   String mB = request.getParameter("monthBirth");
   String yB = request.getParameter("yearBirth");
   String gen = request.getParameter( "gender" );
   String loc = request.getParameter( "location" );
   String tNo = request.getParameter( "telNo" );
   String eM = request.getParameter( "email" );
   
   session.setAttribute("firstName", fName);
   session.setAttribute("lastName", lName);
   session.setAttribute("otherName", oName);
   session.setAttribute( "username", Uname );
   session.setAttribute("password",pWord);
   session.setAttribute("monthBirth", mB);
   session.setAttribute("yearBirth", yB);
   session.setAttribute("gender", gen);
   session.setAttribute("location", loc);
   session.setAttribute("telNo", tNo);
   session.setAttribute("email", eM);

      out.write("\n");
      out.write("    \n");
      out.write("<div align=\"center\">\n");
      out.write("    <form id=\"form1\" name=\"form1\" method=\"post\" action=\"Step3.jsp\">\n");
      out.write("  <table style=\"width: 567px; height: 602px;\" bgcolor=\"#cccccc\" border=\"0\">\n");
      out.write("    <tbody><tr bordercolor=\"#0066FF\">\n");
      out.write("      <td colspan=\"2\" bgcolor=\"#0099cc\"><div class=\"style2\" align=\"center\">Teacher Registration Step 2 of 3 </div></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td style=\"vertical-align: top;\"><br />\n");
      out.write("      </td>\n");
      out.write("      <td style=\"vertical-align: top;\">Upload Photo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"file\" name=\"photo\" size=\"50\"/><br /></td>\n");
      out.write("    </tr>\n");
      out.write("<tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Marital Status </td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><select name=\"maritualStatus\" size=\"1\">\n");
      out.write("        <option>Select Maritual Status</option>\n");
      out.write("        <option value=\"Married\"> Married </option>\n");
      out.write("        <option value=\"Single\"> Single</option>\n");
      out.write("        <option value=\"Divorced\"> Divorced</option>\n");
      out.write("            </select></td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Number Of Children </td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><select name=\"noOfChildren\" size=\"1\">\n");
      out.write("        <option>Select Number Of Children</option>\n");
      out.write("        <option value=\"10\">10</option>\n");
      out.write("        <option value=\"9\">9</option>\n");
      out.write("        <option value=\"8\">8</option>\n");
      out.write("        <option value=\"7\">7</option>\n");
      out.write("        <option value=\"6\">6</option>\n");
      out.write("        <option value=\"5\">5</option>\n");
      out.write("        <option value=\"4\">4</option>\n");
      out.write("        <option value=\"3\">3</option>\n");
      out.write("        <option value=\"2\">2</option>\n");
      out.write("        <option value=\"1\">1</option>\n");
      out.write("        <option value=\"0\">0</option>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("      </select></td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td>Full Name OF Heir </td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><input name=\"heir\" type=\"text\" Placeholder=\"Heir\" /></td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><br />\n");
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><br />\n");
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><br />\n");
      out.write("</td>\n");
      out.write("      <td><br />\n");
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><br />\n");
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><br />\n");
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><br />\n");
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td><br />\n");
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("     <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\"><div align=\"center\"><br />\n");
      out.write("</div></td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Submit2\" value=\"Cancel\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("      <td><div align=\"center\">\n");
      out.write("        <input name=\"Continue\" value=\"Continue\" type=\"submit\" />\n");
      out.write("      </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bordercolor=\"#0066FF\">&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("  </tbody></table>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</body></html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
