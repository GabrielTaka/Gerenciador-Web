package br.com.gabriel.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		
		Empresa empresa = new Empresa();
		empresa.setNome("Empresa 01");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Empresa 02");
		
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}
	