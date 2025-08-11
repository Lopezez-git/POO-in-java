package biblioteca;

public class Usuario {

	private int id;
	
	private String nome;
	
	private String email;
	
	public Usuario(int id, String nome, String email) {
		
		this.nome = nome;
		
		this.id = id;
		
		this.email = email;
	}
	
	public int getId() {
		
		return id;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public String showInfo() {
		
		String info = String.format("id: %d\nNome do cliente: %s\nEmail: %s", id, nome, email);
		
		return info;
	}

}
