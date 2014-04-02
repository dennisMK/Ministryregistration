<%-- 
    Document   : Step3
    Created on : Mar 29, 2014, 8:26:32 PM
    Author     : mushabe
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>


<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" /><title>Untitled Document</title>

<style type="text/css">
<!--
.style1 {color: #0000FF}
.style2 {
	font-size: 24px;
	font-weight: bold;
	color: #FFFFFF;
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
   String mStatus = request.getParameter( "maritualStatus" );
   String noChild = request.getParameter( "noOfChildren" );
   String heir = request.getParameter( "heir" );
   
   session.setAttribute( "maritualStatus", mStatus );
   session.setAttribute( "noOfChildren", noChild );
   session.setAttribute( "heir", heir );
%>
    
<div align="center">
    <form id="form1" name="form1" method="post" action="Register">
  <table bgcolor="#cccccc" border="0" height="600" width="667">
    <tbody><tr bordercolor="#0066FF">
      <td colspan="3" bgcolor="#0099cc"><div class="style2" align="center">Teacher Registration Step 3 of 3 </div></td>
    </tr>
    
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Academic Documents </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Primary Leaving Examinations </td>
      <td><div align="center">
        <input type="file" name="primary" size="50"/>
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Uganda Certificate Of Education </td>
      <td><div align="center">
        <input type="file" name="Olevel" size="50"/>
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>Uganda Advanced Certificate Of Eductaion</td>
      <td><label>
        </label><div align="center">
          <input type="file" name="Alevel" size="50"/>
          </div>
      </td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td><label>Teacher Qualification Testimonial </label></td>
      <td><div align="center">
        <input type="file" name="testimonial" size="50"/>
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF"><br />
</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>Other Certificate </td>
      <td><div align="center">
        <input type="file" name="other" size="50"/>
      </div></td>
    </tr>
    <tr>
      <td bordercolor="#0066FF">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
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
      <td>&nbsp;</td>
    </tr>
  </tbody></table>
    </form>
</div>
</body></html>
 
