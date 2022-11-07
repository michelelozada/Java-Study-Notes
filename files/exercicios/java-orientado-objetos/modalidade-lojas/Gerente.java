package github.repositorio.estudo.java;

public class Gerente {
	private String nome;
	private String email;
	private String telefone;
	
	// Método construtor
	public Gerente(String nome, String email, String telefone){
		setNome(nome);
		setEmail(email);
		setTelefone(telefone);
	}	
	
	// Métodos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 
	
	// Método para impressão das informações do autor
	public void imprimirDadosGerente() {
		System.out.println("Nome do gerente: " + getNome());
		System.out.println("Email: " + getEmail());
		System.out.println("Telefone: " + getTelefone());
	}	
}