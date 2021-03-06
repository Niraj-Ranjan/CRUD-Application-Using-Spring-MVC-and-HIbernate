<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">List Students</h1>
	


	<center>
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Gender</th>
				<th>Hobbies</th>
				<th>City</th>
				<th>Address</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${thestudent}" var="s">
			
			<c:url var="updateLink" value="updateRecord">
					<c:param name="studentId" value="${s.id}" />
				</c:url>
 
				<c:url var="deleteLink" value="deleteRecord">
					<c:param name="studentId" value="${s.id}" />
				</c:url>
				
				<tr>
					<td>${s.name}</td>
					<td>${s.email}</td>
					<td>${s.gender}</td>
					<td>${s.hobbies}</td>
					<td>${s.city}</td>
					<td>${s.address}</td>
					<td>
					<a href ="${updateLink}">Update</a> | <a onclick="if(!(confirm('Are you sure want to delete'))) return false" href ="${deleteLink}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>