package br.com.jee.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Database 
{
	private static List<Company> lista = new ArrayList<>();
	
	static 
	{
		Company empresa1 = new Company();
		empresa1.setNome("Tracta");
		Company empresa2 = new Company();
		empresa2.setNome("Vizzela");
		lista.add(empresa1);
		lista.add(empresa2);
	}

	public void adiciona(Company empresa) 
	{	
		lista.add(empresa);
	}
	
	public List<Company> getEmpresas()
	{
		return Database.lista;
	}

}
