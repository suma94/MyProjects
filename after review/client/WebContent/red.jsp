<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sd"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles.css">
<script language="javascript" type="text/javascript">
function go()
{
	window.location="N.jsp";
	}
	
</script>	
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<%-- <%
String t=request.getParameter("serid");
%>  --%>
<form action="AddProducts">
<h1 align="center" class="vzh1">View Our Product</h1>
<table align="center"  class="vztable1">


<sd:forEach var="ser" items="${Lkey}">
<%-- <tr> <td><b>PRODUCT ID:</b></td><td><b>${ser.productID}</b></td> </tr> --%>
<tr><td>Product Name:</td> <td>${ser.productName}</td> </tr>
<tr><td>Product Description:</td> <td>${ser.productDesc}</td> </tr>
<tr> <td>Product Effective Date:</td><td>${ser.prodEffDate}</td> </tr>
<tr><td>Product End Date:</td> <td>${ser.prodEndDate}</td> </tr>
<tr><td>Product Rate:</td> <td>${ser.rate}</td> </tr>

</sd:forEach>

 </table><br>
 
 <table align="center" class="vztable1">
<!-- <tr><td>Customer id:</td><td><input type="hidden" name="V2" class="vztextarea" value="t"></td></tr> -->
<input type="hidden" value="${k} " name="Service_id"/>
<input type="hidden" value="${pid}"  name="Product_id"/>
</table>
<center>
<input type="submit" value="Add Product"  name="Add Product" class="vzbtn">
<input type="reset" value="Back"  name="Back" class="vzbtn" onclick="go();"><br>
</center>
</form>
</body>
</html>