<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>


<%
String id = "";
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}%>
<body>

<h4><%=msg %></h4>
<fieldset><legend>Login</legend>
<form action='./login' method='post' >

		<table >
			<tr>
				<td>Id:</td>
				<td><input type='text' name='id' value='<%=id%>'><br></td>
			</tr>
			<tr>
			<td>Password</td>
			<td><input type='password' name='password'></td>
			</tr>
			<tr>
			<td>Remember me</td>
			<td><input type='checkbox' name='rememberme' value='checked'></td>
			</tr>
			<tr>
			<td><input type='submit' value='Login'></td>
			<td><input type='reset' value='Reset'></td>
			</tr>
			<tr>
			<td></td>
			<td><a href='register.html'></a></td>
			</tr>
		</table>
		
	</form>
	</fieldset>
</body>
</html>