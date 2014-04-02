<%-- 
    Document   : Step2
    Created on : Mar 29, 2014, 8:25:58 PM
    Author     : mushabe
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>



<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" /><title>Untitled Document</title>

<style type="text/css">
<!--
.style1 {color: #0000FF}
.style2 {
	color: #FFFFFF;
	font-size: 24px;
	font-weight: bold;
}
-->
</style>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
        <link rel="stylesheet" type="text/css" href="assets/bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="assets/bootstrap/css/bootstrap-responsive.min.css" />

        
        <script type="text/javascript" src="assets/js/jquery-1.8.0.min.js"></script>		
        <script type="text/javascript" src="assets/bootstrap/js/bootstrap.min.js"></script>
        
        
        <link rel="stylesheet" type="text/css" href="assets/font-awesome-4.0.3/css/font-awesome.min.css" />
        
        <link rel="stylesheet" type="text/css" href="assets/dcvAttach/dcvAttach.css" />
        <script type="text/javascript" src="assets/dcvAttach/dcvAttach.js?version=1.0.2"></script>
    </head><body>
    
     <%
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
%>
    
<div align="center">
    <form id="form1" name="form1" method="post" action="Step3.jsp">
  <table style="width: 567px; height: 602px;" bgcolor="#cccccc" border="0">
    <tbody><tr bordercolor="#0066FF">
      <td colspan="2" bgcolor="#0099cc"><div class="style2" align="center">Teacher Registration Step 2 of 3 </div></td>
    </tr>
    
    <tr>
      <td style="vertical-align: top;"><br />
      </td>
      <td style="vertical-align: top;">Upload Photo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <div id="dcvAttach_controls"></div>
        <div id="dcvAttach_workArea"></div>
          
          <br />
         
      </td>
    </tr>
        
<tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Marital Status </td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><select name="maritualStatus" size="1">
        <option>Select Maritual Status</option>
        <option value="Married"> Married </option>
        <option value="Single"> Single</option>
        <option value="Divorced"> Divorced</option>
            </select></td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Number Of Children </td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><select name="noOfChildren" size="1">
        <option>Select Number Of Children</option>
        <option value="10">10</option>
        <option value="9">9</option>
        <option value="8">8</option>
        <option value="7">7</option>
        <option value="6">6</option>
        <option value="5">5</option>
        <option value="4">4</option>
        <option value="3">3</option>
        <option value="2">2</option>
        <option value="1">1</option>
        <option value="0">0</option>
        


        
      </select></td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Full Name OF Heir </td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><input name="heir" type="text" Placeholder="Heir" /></td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><br />
</td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><br />
</td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><br />
</td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><br />
</td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><br />
</td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><br />
</td>
      
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td><br />
</td>
      
    </tr>
     <tr>
      <td bordercolor="#0066FF"><div align="center"><br />
</div></td>
      <td><div align="center">
        <input name="Submit2" value="Cancel" type="submit" />
      </div></td>
      <td><div align="center">
        <input name="Continue" value="Continue" type="submit" />
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>&nbsp;</td>
      
    </tr>
  </tbody></table>
</form>
</div>
</body></html>