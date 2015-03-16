<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Bugs</title>
</head>
<body>



<!-- id_account integer, -->
<!--   id_product integer, -->
<!--   id_statu integer, -->

<form action="${linkTo[BugsController].salvar}" method="post">
	<label>Status</label><br>
	<select name="bugs.status.id">
		<c:forEach items="${status }" var="st">
			<option value="${st.id}">${st.name}</option>
		</c:forEach>
	</select><br>
	<label>Produtos</label><br>
	<select name="bugs.products.id">
		<c:forEach items="${products }" var="p">
			<option value="${p.id}">${p.name}</option>
		</c:forEach>
	</select><br>
	<label>Contas</label><br>
	<select name="bugs.accounts.id">
		<c:forEach items="${accounts }" var="c">
			<option value="${c.id}">${c.name}</option>
		</c:forEach>
	</select><br>
	
	<label>Descricao</label><br>
	<input type="text" name="bugs.description"/><br>
	
	<input type="submit" value="Salvar"/>
	
</form>
</body>
</html>