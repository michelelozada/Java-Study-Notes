package github.repositorio.estudo.java;

public class LojaFisica extends Loja {
	private String endereco;
	private String cidade;
	
	// Método construtor
	public LojaFisica(String nome, String cnpj, Gerente gerente, String endereco, String cidade) {
		super(nome, cnpj, gerente);
		setEndereco(endereco);
		setCidade(cidade);
	}
	
	// Métodos get e set 
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}	
	
	// Método para impressão das informações da loja
	@Override
	public void imprimirDadosLoja() {
		super.imprimirDadosLoja();
		System.out.println("Endereço: " + endereco);
		System.out.println("Cidade: " + cidade);
	}
}