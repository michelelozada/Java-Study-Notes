package github.repositorio.estudo.java;

import java.util.Scanner;

/* Escreva um programa que calcule fatorial de um número a ser fornecido pelo usuário */

public class Main {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numeroLido, buscaFatorial = 1;
		
		System.out.print("Deseja calcular o fatorial de qual número? ");
		numeroLido = leitor.nextInt();
		
		System.out.println("\nComo é calculado o fatorial de um número?");
		System.out.println("- Primeiro, é feita a decomposição fatorial desse número (são considerados aqui apenas os números naturais)");
		System.out.println("- Depois, os números resultantes são multiplicados entre si");
		
		if (numeroLido == 0) {
			System.out.println("\nContudo, no caso específico do zero, seu fatorial - por definição - é igual a 1 (já que o produto da multiplicação de nenhum número é 1).");
		}
		else if (numeroLido < 0){
			System.out.println("O número informado para cálculo do fatorial deve ser maior do que zero");
		}
		else {
			System.out.print("\nDessa forma, decompondo o número " + numeroLido + " temos o(s) seguinte(s) número(s): ");
			for(int i = numeroLido; i >= 1; i--) {
				System.out.print("[" + i + "] ");
				buscaFatorial *= i;  
			}	
			
			if(numeroLido ==1) {
				System.out.println("\n\nLogo, como o número 1 não tem antecessor para ser multiplicado, pode-se dizer que seu fatorial é " + buscaFatorial + ".");
			} else {
				System.out.println("\n\nLogo, pode-se dizer que o fatorial de " + numeroLido + " é " + buscaFatorial + ".");
			}
		}
	}
}

/*
+-------------------------------------------------------------------------------------------------------------+
| Deseja calcular o fatorial de qual número? 5                                                                |
+-------------------------------------------------------------------------------------------------------------+
| Como é calculado o fatorial de um número?                                                                   |
| - Primeiro, é feita a decomposição fatorial desse número (são considerados aqui apenas os números naturais) |
| - Depois, os números resultantes são multiplicados entre si                                                 |
+-------------------------------------------------------------------------------------------------------------+
| Dessa forma, decompondo o número 5 temos o(s) seguinte(s) número(s): [5] [4] [3] [2] [1]                    |
| Logo, pode-se dizer que o fatorial de 5 é 120.                                                              |
+-------------------------------------------------------------------------------------------------------------+
*/