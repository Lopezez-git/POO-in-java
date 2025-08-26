package Biblioteca;

public class Livro {

	private String nome;
	
	private Autor autor;
	
	private String genero;
	
	public Livro(String nome, Autor autor, String genero) {
		
		this.nome = nome;
		
		this.autor = autor;
		
		this.genero = genero;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String showInfo() {
		
		String info = String.format("Nome: %s\nAutor: %s\nGenero: %s", nome, autor.getNome(), genero); 
		
		return info;
		
	}
}
