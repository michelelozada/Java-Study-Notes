package github.repositorio.estudo.java;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Por favor, digite o número que deseja saber se é primo: ");
		Scanner keyboard = new Scanner(System.in);
		int numeroLido = keyboard.nextInt();
		int multiplos = 0;
		 		
		// Identificação dos múltiplos do número lido
		System.out.print("Números múltiplos de " + numeroLido + ": ");
		for (int i = 1; i <= numeroLido; i++) {
			if(numeroLido % i == 0) { 
				System.out.print(i + " ");
				multiplos++;
		 	}
		 }
		System.out.println("\nQuantidade de múltiplos: " + multiplos);
		 		
		// Definição sobre se o número lido é ou não um número primo 
		System.out.print("Resultado: ");
		if(multiplos == 2) {
		 	System.out.println("O número " + numeroLido + " é primo, pois ele é divisível apenas por um e por ele mesmo.");
		 }
		 else if(multiplos == 1) {
		 	System.out.println("Um numero primo precisa ser maior ou igual a dois, portanto o numero 1 não é primo!");
		 	
		 }
		 else {
		 	System.out.println(numeroLido + " definitivamente não é um numero primo, pois tem mais que dois múltiplos.");
		 }	
	}
}

/*
+---------------------------------------------------------------------------------------+-------+
| Por favor, digite o número que deseja saber se é primo:                               |     4 |
| Números múltiplos de 4:                                                               | 1 2 4 |
| Quantidade de múltiplos:                                                              |     3 |
+-----------------------------------------------------------------------------------------------+ 
| Resultado: 4 definitivamente não é um numero primo, pois tem mais que dois múltiplos.         |
+-----------------------------------------------------------------------------------------------+
*/