package github.repositorio.estudo.java;

/* Escreva um programa que, informadas as gorjetas recebidas, retorne qual o valor disponível na caixinha */

public class Principal {
	public static void main(String[] args) {
	
		// Criando a caixinha de gorjetas
		Caixinha caixinha = new Caixinha();
		
		// Adicionando gorjetas à caixinha
		caixinha.incluirGorjeta(new Gorjeta(20.00));
		caixinha.incluirGorjeta(new Gorjeta(5.00));
		caixinha.incluirGorjeta(new Gorjeta(50.00));
		caixinha.incluirGorjeta(new Gorjeta(10.00));
		caixinha.incluirGorjeta(new Gorjeta(25.00));
		
		// Informando o total de gorjetas da caixinha
		System.out.printf("Neste momento, a caixinha contém R$ %.2f", caixinha.totalizarGorjetas());
	}	
}