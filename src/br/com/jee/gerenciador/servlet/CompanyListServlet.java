package br.com.jee.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/companyList")
public class CompanyListServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		Database banco = new Database();
		List<Company> lista = banco.getEmpresas();
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<ul>");
		for (Company empresa : lista) 
		{
			out.println("<li>" + empresa.getNome() + "</li>");
		}
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}

}