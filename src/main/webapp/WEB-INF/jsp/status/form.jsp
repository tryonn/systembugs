<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Novo Status</title>
</head>
<body>


<p>${sucesso}</p>

<form action="${linkTo[StatusController].salvar}" method="post">
	<label>Nome</label><br/>
	<input type="text" name="status.name"/>
	<input type="submit" value="salvar"/>
</form>
</body>
</html>