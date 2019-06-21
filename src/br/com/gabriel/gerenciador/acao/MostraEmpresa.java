package br.com.gabriel.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gabriel.gerenciador.modelo.Banco;
import br.com.gabriel.gerenciador.modelo.Empresa;

public class MostraEmpresa {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		String req = request.getParameter("id");
		
		Integer id = Integer.valueOf(req);
		Empresa empresa = banco.mostraEmpresa(id);
		

		request.setAttribute("empresa", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/mostraEmpresa.jsp");
		rd.forward(request, response);
	}
}
