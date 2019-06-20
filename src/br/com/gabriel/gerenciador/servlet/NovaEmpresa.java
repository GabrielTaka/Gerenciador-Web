package br.com.gabriel.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gabriel.gerenciador.modelo.Banco;
import br.com.gabriel.gerenciador.modelo.Empresa;

@WebServlet("/novaEmpresa")

public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		String nomeEmpresa = req.getParameter("nome");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		// Server side request  
		// chamar JSP	
		//req.setAttribute("empresa", empresa.getNome());
		//RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresa");
		//rd.forward(req, resp);
		
		resp.sendRedirect("listaEmpresa");
		
		
	}
}
