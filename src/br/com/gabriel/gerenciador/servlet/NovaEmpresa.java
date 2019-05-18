package br.com.gabriel.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")

public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String nomeEmpresa = req.getParameter("nome");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println( nomeEmpresa); 
		out.println("</body>");
		out.println("<html>");
	}
}
