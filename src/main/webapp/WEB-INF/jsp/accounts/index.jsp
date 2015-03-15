<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Accounts</title>
</head>
<body>
${mensagem}

<table>
	<thead>
		<tr>
			<th>Nome</th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach items="${accounts}" var="acc">
			<tr>
				<td>
					${acc.name}
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<a href="${linkTo[AccountsController].form}">Cadastro de Usuários</a>
</body>
</html>