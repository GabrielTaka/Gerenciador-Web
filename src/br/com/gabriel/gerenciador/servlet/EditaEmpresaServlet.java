package br.com.gabriel.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gabriel.gerenciador.modelo.Banco;
import br.com.gabriel.gerenciador.modelo.Empresa;

@WebServlet(name = "editaEmpresa", urlPatterns = { "/editaEmpresa" })
public class EditaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String req = request.getParameter("id");
		String reqName = request.getParameter("nomeEmpresa");
		Integer id = Integer.valueOf(req);
		
		Banco banco = new Banco();
		Empresa empresa = banco.mostraEmpresa(id);	
		empresa.setNome(reqName);
	
		response.sendRedirect("listaEmpresa");
		
	}

}
