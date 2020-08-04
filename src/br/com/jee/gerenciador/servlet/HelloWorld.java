package br.com.jee.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//hello
@WebServlet(urlPatterns = "/hello")
public class HelloWorld extends HttpServlet
{
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException
  {
	  PrintWriter out = resp.getWriter();
	  out.println("<html>");
	  out.println("<body>");
	  out.println("<h1>");
	  out.println("Congrats! You created the first Servlet.");
	  out.println("</h1>");
	  out.println("</body>");
	  out.println("</html>");
	  
	  System.out.println("o servlet foi chamado");
  }
}
