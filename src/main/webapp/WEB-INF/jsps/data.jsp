<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>showing Data</title>
</head>
<body>
<table border="1">
	<tr>
	<th> Id</th>
	<th>  First Name</th>
	<th> Last Name</th>
	<th>  Email </th>
	</tr>
	
<c:forEach var="findAll" items="${user}">
	<tr>
		<td>${findAll.id}</td>
		<td>${findAll.firstname}</td>
		<td>${findAll.lastname}</td>
		<td>${findAll.email}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>