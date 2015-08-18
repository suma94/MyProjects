<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String str=request.getParameter("login");
	if(str.equals("manager")){%>
		<jsp:forward page="Manager.jsp"></jsp:forward>
	<%}else if(str.equals("staff")){ %>
		<jsp:forward page="Staff.jsp"></jsp:forward>
	<%}else{ %>
		<h4>Invalid login</h4>
	<%} %>
	
</body>
</html>