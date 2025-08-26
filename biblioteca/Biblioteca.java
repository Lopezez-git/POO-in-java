package Biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Biblioteca {

	private ArrayList<Autor> autorList = new ArrayList<Autor>();
	
	private ArrayList<Livro> livroList = new ArrayList<Livro>();
	
	

	public Biblioteca() {

	}

	public void addAutor(Autor novoAutor) {

		this.autorList.add(novoAutor);

	}

	public void showAllAutor() {

		for(int i = 0; i < autorList.size(); i ++) {
			
			JOptionPane.showMessageDialog(null, autorList.get(i).showInfo());
		}
		
	}
	
	public Autor verificaAutor(String nome) {
		
		for(int i = 0; i < autorList.size(); i ++) {
			
			if(nome.equalsIgnoreCase(autorList.get(i).getNome())){
				
				return autorList.get(i);
			}
			
		}
		
		return null;
		
	}
	
	public void addLivro(Livro livro) {
		
		livroList.add(livro);
		
	}
	
	public void showAllLivro() {
		
		for(int i = 0; i < livroList.size(); i++) {
			
			JOptionPane.showMessageDialog(null, livroList.get(i).showInfo());
			
		}
	}
	
	public String buscaLivro(String nome) {
		
		String livro = "";
		
		for(int i = 0; i < livroList.size(); i ++) {
			
			if(nome.equalsIgnoreCase(livroList.get(i).getNome())) {
				
				livro =  livroList.get(i).showInfo();
				
				break;
				
			}
			else {
				
				livro = "Livro não encontrado";
				
			}
			
		}
		
		return livro;
		
		
		
	}
}
