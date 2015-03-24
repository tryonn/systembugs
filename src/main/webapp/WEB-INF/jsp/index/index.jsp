<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page"%>

<c:set var="ctx">${pageContext.request.contextPath}</c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>@@@ SystemBugs @@@@</title>
<%@include file="/decorators/css.jsp"%>
<%@include file="/decorators/javascript.jsp"%>
</head>
<body>
<%@include file="/decorators/header.jsp"%>
</body>
</html>