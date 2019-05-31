<%@page import="java.util.List, br.com.gabriel.gerenciador.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>
				${empresa.nome} 
				 <a href="removeEmpresa?id=${empresa.id}"> remover </a>
			</li>	
		</c:forEach>
	</ul>	


		
</body>
</html>