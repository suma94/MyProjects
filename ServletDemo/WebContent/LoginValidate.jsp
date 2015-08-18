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
		String name=request.getParameter("userid");
		String pwd=request.getParameter("password");
		if(name.equals("admin")&& pwd.equals("admin")){
			session.setAttribute("submit", "yes");%>
			<jsp:forward page="Admin.jsp"></jsp:forward>
		<%}else if(name.equals("suma")&& pwd.equals("suma")){%>
			<jsp:forward page="User.jsp"></jsp:forward>
		<%}else if(name.equals("")&& pwd.equals("")){ %>
			<h3><font color="red">Userid, password cannot be empty<br> Please re-login</font></h3>
			<jsp:include page="Login.jsp"></jsp:include>
		<%}else{ %>
			<h3><font color="red">Invalid User<br> Please re-login</font></h3>
			<jsp:include page="Login.jsp"></jsp:include>
		<%} %>
</body>
</html>