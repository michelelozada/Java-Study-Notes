package github.repositorio.estudo.java;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("SIMULADOR DE PARCELAS\n"); 
		
		System.out.println("Por favor, digite o valor do produto (em R$): ");
		double valorProduto = leitor.nextDouble();
		
		System.out.println("Deseja parcelá-lo em quantas vezes? ");
		int qtdadeParcelas = leitor.nextInt();
		
		Parcelamento.simularValor(valorProduto, qtdadeParcelas);
	}
}