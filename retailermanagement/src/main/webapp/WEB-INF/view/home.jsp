<%@page import="com.tyss.retailermanagement.dto.RetailerBean"%>
<%@page import="com.tyss.retailermanagement.dto.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Update Password</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h2>
		Welcome
		<%=bean.getName()%></h2>

	<fieldset>
		<legend>Search Product</legend>
		<form action="./search" method="post" >
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>

<fieldset>
<legend>Product</legend>
	<%
		ProductBean productbean = (ProductBean) request.getAttribute("bean");
	%>

	<%
		if (productbean != null) {
	%>

	<table>
		<tr>
			<th>ProductID</th>
			<th>PPU</th>
			<th>ProductName</th>
		</tr>


		<tr>
			<td><%=productbean.getProductid()%></td>
			<td><%=productbean.getPpu()%></td>
			<td><%=productbean.getProductname()%></td>
			<td><a href="./order">Order Now</a></td>
		</tr>
	</table>
	</fieldset>
	<%
		}
	%>
	<h2>${msg}</h2>
	
	
</body>
</html>