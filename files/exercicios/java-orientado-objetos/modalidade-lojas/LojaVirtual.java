package github.repositorio.estudo.java;

public class LojaVirtual extends Loja {
	private String enderecoEletronico;
		
	// Método construtor
	public LojaVirtual(String nome, String cnpj, Gerente gerente, String enderecoEletronico) {
		super(nome, cnpj, gerente);
		setEnderecoEletronico(enderecoEletronico);
	}
	
	// Métodos get e set 
	public String getEnderecoEletronico() {
		return enderecoEletronico;
	}

	public void setEnderecoEletronico(String enderecoEletronico) {
		this.enderecoEletronico = enderecoEletronico;
	}
	
	// Método para impressão das informações da loja
	@Override
	public void imprimirDadosLoja() {
		super.imprimirDadosLoja();
		System.out.println("Endereço eletrônico: " + enderecoEletronico);
	}
}