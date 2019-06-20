package br.com.gabriel.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gabriel.gerenciador.modelo.Banco;
import br.com.gabriel.gerenciador.modelo.Empresa;

@WebServlet("/listaEmpresa")

public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> empresas = banco.getEmpresas();
		
		//call JSP
		
		request.setAttribute("empresas", empresas);
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresa.jsp");
		rd.forward(request, response);
		
	}

}


