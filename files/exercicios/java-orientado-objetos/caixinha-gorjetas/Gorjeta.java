package github.repositorio.estudo.java;

public class Gorjeta {
	private double valor;
	
	// Método construtor
	public Gorjeta(double valor) {
		setValorGorjeta(valor);
	}
	
	// Métodos get e set 
	public void setValorGorjeta(double valor) {
		this.valor = valor;
	}	
	
	public double getValorGorjeta() {
		return valor;
	}
}
