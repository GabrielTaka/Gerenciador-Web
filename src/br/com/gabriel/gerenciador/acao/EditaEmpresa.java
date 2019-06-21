package br.com.gabriel.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gabriel.gerenciador.modelo.Banco;
import br.com.gabriel.gerenciador.modelo.Empresa;

public class EditaEmpresa {

	public void executa (HttpServletRequest request, HttpServletResponse response) throws IOException {
		String req = request.getParameter("id");
		String reqName = request.getParameter("nomeEmpresa");
		Integer id = Integer.valueOf(req);
		
		Banco banco = new Banco();
		Empresa empresa = banco.mostraEmpresa(id);	
		empresa.setNome(reqName);
	
		response.sendRedirect("entrada?acao=ListaEmpresas");
	}
}
