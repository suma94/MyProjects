<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Connection conn;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		conn=DriverManager.getConnection(url, "scott","tiger");
	}catch(ClassNotFoundException | SQLException e ){
		e.printStackTrace();
	}
	PreparedStatement st=conn.preparedstatement("select * from cust_details where mobilenumber="+request.getParameter("mobilenumber"));
	ResultSet rs=st.executeQuery();
	%>
	<form>
		<table>
			<%while(rs.next()){
				out.println(rs.getString("name")+"\n"+rs.getString("mobilenumber")+"\n"+rs.getString("amountToPay"));
			}%>
			<tr><td>
				<select name="mode">
				<option value="select">select</option>
				<option value="1"> Credit Card </option>
				<option value="2">Debit Card </option>
				</select>
			</td></tr>
			
		</table>
	</form>
	
</body>
</html>