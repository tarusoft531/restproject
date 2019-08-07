<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List</title>
</head>
<body>
	<h1>List of Students</h1>
	<table border="1">
		<tr>
			<th>id</th>
			<th>firstname</th>
			<th>lastname</th>
			<th>email</th>
		</tr>
		<c:forEach items="${list}" var="e">
			<tr>
				<td>${e.id}</td>
				<td>${e.firstname}</td>
				<td>${e.lastname}</td>
				<td>${e.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>