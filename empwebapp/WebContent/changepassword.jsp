<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<body>
<a href="./home" style="text-align:left">Home</a>
<h4><%=msg%></h4>
<a href="./logout" style="text-align:right">Logout</a>

<form action="./changepassword" style="text-align:center" method="post"align-left">
	<tr>
	<td>New Password</td>
	<td><input type="password" name="password"></td>
	</tr>
	<tr>
	<td>Confirm Password</td>
	<td><input type="password" name="confirmpassword"></td>
	</tr>
	<tr>
	<td><input type="reset" value="Reset"></td>
	<td><input type="submit" value="Change Password">
	
	</table>
</form>
</body>
</html>