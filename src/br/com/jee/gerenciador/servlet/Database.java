package br.com.jee.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Database 
{
	private static List<Company> lista = new ArrayList<>();

	public void adiciona(Company empresa) 
	{	
		lista.add(empresa);
	}
	
	public List<Company> getEmpresas()
	{
		return Database.lista;
	}

}
