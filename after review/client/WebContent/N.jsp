<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles.css">

<script type="text/javascript">


</script>

</head>
<body>
<%-- <%
String t=request.getParameter("serid");
HttpSession s=request.getSession(true);
s.setAttribute("k", t);
%> --%>
<form action="Services" >
<h1 align="center" class="vzh1">SERVICES GUIDE</h1>
<center>
<table  class="vztable" >
<tr>
<td>Service ID</td><td>ServiceName</td></tr>
<tr>
<td>1</td><td>FIOS VOICE SERVICES</td></tr>
<tr>
<td>2</td><td>FIOS DATA SERVICES</td></tr>
<tr>
<td>3</td><td>FIOS T.V. SERVICES</td></tr>
<tr>
<td>4</td><td>BUNDLE SERVICES</td></tr>
<tr>
<td>5</td><td>WIRELESS SERVICES</td></tr>
<tr>
<td>6</td><td>ENTERPRISE SERVICES</td></tr>

</table>
</center>
<br>
<table align="center" class="vztable1">


<!-- <tr><td>Customer id:</td><td><input type="hidden" name="V2" class="vztextarea" value="t"></td></tr> -->
<tr><td>Enter Your ZipCode:</td><td><input type="text" name="zip" class="vztext"  required></td></tr>
<tr><td>Enter the ServiceId:</td><td><input type="text" name="serid" class="vztext" required></td></tr>

</table>
<center>
<input type="submit" class="vzbtn" name="view product" value="view product"  >

</center>



</form>
</body>
</html>