<%
	//scriplet
	String nomeEmpresa = (String) request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
%>

<!DOCTYPE html>
<html>
	<body>
		<h3>Company <%= nomeEmpresa %> successfully registered!</h3>
	</body>
</html>