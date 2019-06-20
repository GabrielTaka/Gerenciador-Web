package br.com.gabriel.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gabriel.gerenciador.modelo.Banco;

@WebServlet(name = "removeEmpresa", urlPatterns = { "/removeEmpresa" })
public class RemoveEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		String req = request.getParameter("id");
		
		Integer id = Integer.valueOf(req);
		banco.removeEmpresa(id);
		
		response.sendRedirect("listaEmpresa");
	}

}
