<%@page import="java.util.List, br.com.gabriel.gerenciador.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServer"/>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="/gerenciador/novaEmpresa" method="post">
		nome: 
		<input type="text" name="nome"/>
		<input type="submit" />
	</form>
</body>
</html>