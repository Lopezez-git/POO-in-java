package biblioteca;

public class Livro {

	private String isbn;

	private String titulo;

	private String autor;

	private int ano;

	private int totalCopias;

	private int copiasDisponiveis;

	public Livro(String isbn, String titulo, String autor, int ano, int totalCopias, int copiasDisponiveis) {

		this.isbn = isbn;

		this.titulo = titulo;

		this.autor = autor;

		this.ano = ano;

		this.totalCopias = totalCopias;

		this.copiasDisponiveis = copiasDisponiveis;

	}

	public boolean emprestar() {

		if (copiasDisponiveis > 0) {

			copiasDisponiveis--;

			return true;
		} else {

			return false;
		}

	}

	public void devolver() {

		copiasDisponiveis++;
	}

	public void adicionarCopias(int quantidade) {

		totalCopias += quantidade;

		copiasDisponiveis += quantidade;
	}

	public String getTitulo() {

		return this.titulo;
	}

	public String getIsbn() {

		return this.isbn;
	}

	public String getAutor() {
		return this.autor;
	}
	
	public int getAno() {
		
		return this.ano;
	}
	
	public int getTotalCopias() {
		
		return this.totalCopias;
	}
	
	public int getCopiasDisponiveis() {
		
		return copiasDisponiveis;
	}
	
	public String showInfo() {
		
		String info = String.format("ISBN do livro %s\n"
				+ "Titulo do livro: %s\n"
				+ "Autor do livro: %s\n"
				+ "Ano de lançamento: %d\n"
				+ "Total de copias: %d\n"
				+ "Copias Disponiveis %d", isbn, titulo, autor, ano, totalCopias, copiasDisponiveis);
		
		return info;
	}

	// emprestar()
	// devolver()
	// adicionarCopias()
	// geters()
	// seters()
	// showInfo()

}
