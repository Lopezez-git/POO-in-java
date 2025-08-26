package Biblioteca;

import javax.swing.JOptionPane;

public class Autor {

	private String nome;

	private String nascionalidade;

	private String cidade;

	public Autor(String nome, String nascionalidade, String cidade) {

		this.nome = nome;

		this.nascionalidade = nascionalidade;

		this.cidade = cidade;
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public String showInfo() {
		
		String info = String.format("Nome do autor: %s\nNascionalidade: %s\nCidade: %s", nome, nascionalidade, cidade);
		
		return info;
		
	}
}
