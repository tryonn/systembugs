<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Bugs</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Bug Description</th>
				<th>Account</th>
				<th>Produto</th>
				<th>Status</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${bugs}" var="b">
				<tr>
					<td>${b.description}</td>
					<td>${b.accounts.name}</td>
					<td>${b.products.name}</td>
					<td>${b.status.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	<a href="${linkTo[BugsController].form}">Cadastro de bugs</a>
</body>
</html>