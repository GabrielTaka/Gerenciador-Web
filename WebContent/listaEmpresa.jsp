<%@page import="java.util.List, br.com.gabriel.gerenciador.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	
	    
    
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<% 
			List<Empresa> empresas = (List<Empresa>)request.getAttribute("empresas");
			for (Empresa empresa : empresas) {
		%>
				<li><%= empresa.getNome() %></li>
		<%
			}
		%>	
		 
	</ul>

		
</body>
</html>