<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!--     to include directive tag we use -->
<%@ include file="/index.jsp" %>
 
 
<!--  for taglib directory;;to create our own jsp tags;;
 -->
<%-- <%@taglib uri="" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<h1>This is include jsp</h1>

<!-- for action tag -->
<jsp:include page="/index.jsp"></jsp:include>


</body>
</html>