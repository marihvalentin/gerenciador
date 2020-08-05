<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List, br.com.jee.gerenciador.servlet.Company" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<ul>
		<% 
			List<Company> lista = (List<Company>)request.getAttribute("empresas");
			if( lista == null){
				%> Lista nula <% 
			} 
			else 
			{
				for (Company empresa : lista) 
				{ 
				%>
					<li><%= empresa.getNome() %></li>
				<%
				} 
			}
				%>
		
		</ul>
	</body>
</html>