<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuários</title>
</head>
<body>
<form action="${linkTo[AccountsController].salvar}" method="post">
	<label>Nome:</label><br>
	<input type="text" name="accounts.name"/><br>
	<label>Senha:</label><br>
	<input type="password" name="accounts.password"/><br>
	<input type="submit" value="Salvar"/>
</form>
</body>
</html>