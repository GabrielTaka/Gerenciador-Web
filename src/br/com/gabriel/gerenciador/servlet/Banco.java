package br.com.gabriel.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		
		Empresa empresa = new Empresa();
		empresa.setId(Banco.chaveSequencial++);
		empresa.setNome("Empresa 01");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Empresa 02");
		empresa2.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if( emp.getId().equals(id)) {
				it.remove();
			}
		}
		
		/*for (Empresa empresa : lista)
			if( empresa.getId().equals(id)) {
				lista.remove(empresa);
			}
		} */
		
	}
}
	