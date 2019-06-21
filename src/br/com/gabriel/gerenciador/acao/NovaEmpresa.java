package br.com.gabriel.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gabriel.gerenciador.modelo.Banco;
import br.com.gabriel.gerenciador.modelo.Empresa;

public class NovaEmpresa {
	public void executa (HttpServletRequest request, HttpServletResponse response) throws IOException {
		String nomeEmpresa = request.getParameter("nome");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
	}
}
