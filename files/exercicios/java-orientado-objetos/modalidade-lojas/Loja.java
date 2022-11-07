package github.repositorio.estudo.java;

public class Loja {
	private String nome;
	private String cnpj;
	private Gerente gerente;
		
	// Método construtor
	public Loja(String nome, String cnpj, Gerente gerente){
		setNome(nome);
		setCnpj(cnpj);
		setGerente(gerente);
	}
	
	// Métodos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}	
	
	// Método para impressão das informações da loja
	public void imprimirDadosLoja() {
		System.out.println("Nome: " + getNome());
		System.out.println("CNPJ: " + getCnpj());
		gerente.imprimirDadosGerente();
	}
}