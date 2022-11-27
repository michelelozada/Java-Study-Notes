package github.repositorio.estudo.java;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int numero1, numero2;
		String continuaLoop = "S"; 
		
		Scanner leitor = new Scanner(System.in); 
		
		int opcao = 0;
		while(opcao != 5) {
			System.out.println("\n-- Opções da Calculadora --");
			System.out.println("1 - Para somar");
			System.out.println("2 - Para subtrair");
			System.out.println("3 - Para multiplicar");
			System.out.println("4 - Para dividir");
			System.out.println("5 - Sair da calculadora");
			
			System.out.println("\nDigite a opção desejada: ");
			opcao = leitor.nextInt();
			
			if (opcao < 1 || opcao >= 5) {
				if (opcao == 5) {
					exibirMsgEncerramento();
					return;
				} else {
					System.out.println("Esta opção não é válida.");
				}
			}
			else {
				int resultado;
				System.out.println("Digite o primeiro número: ");
				numero1 = leitor.nextInt();
				
				System.out.println("Digite o segundo número: ");
				numero2 = leitor.nextInt();
				
				switch(opcao) {
					case 1:
						resultado = numero1 + numero2;
						System.out.println("O valor da soma de " + numero1 + " com " + numero2 + " é " + resultado);
						break;
						
					case 2:
						resultado = numero1 - numero2;
						System.out.println("O valor da subtração de " + numero1 + " menos " + numero2 + " é " + resultado);
						break;
						
					case 3:
						resultado = numero1 * numero2;
						System.out.println("O valor da multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
						break;
						
					case 4:
						resultado = numero1 / numero2;
						System.out.println("O valor da divisão de " + numero1 + " por " + numero2 + " é " + resultado);
						break;
						
					case 5:
						return;
				}		
			}
			System.out.print("\nDeseja fazer outra operação? (S/N)");
			continuaLoop = leitor.next();
			if(continuaLoop.equalsIgnoreCase("N")) {
				break;
			}
		}		
		exibirMsgEncerramento();
	}
	
	public static void exibirMsgEncerramento() {
		System.out.println("\nEncerrando o programa...");
		System.out.println("\nPrograma encerrado");
	}	
}

/*
+---------------------------------------------+
| -- Opções da Calculadora --                 |
+---------------------------------------------+
| 1 - Para somar                              |
| 2 - Para subtrair                           |
| 3 - Para multiplicar                        |
| 4 - Para dividir                            |
| 5 - Sair da calculadora                     |
| Digite a opção desejada: 1                  |
| Digite o primeiro número: 10                |
| Digite o segundo número: 20                 |
| O valor da soma de 10 com 20 é 30           |
| Deseja fazer outra operação? (S/N) S        |
+---------------------------------------------+
| -- Opções da Calculadora --                 |
+---------------------------------------------+
| 1 - Para somar                              |
| 2 - Para subtrair                           |
| 3 - Para multiplicar                        |
| 4 - Para dividir                            |
| 5 - Sair da calculadora                     |
| Digite a opção desejada: 2                  |
| Digite o primeiro número: 40                |
| Digite o segundo número: 25                 |
| O valor da subtração de 40 menos 25 é 15    |
| Deseja fazer outra operação? (S/N) s        |
+---------------------------------------------+
| -- Opções da Calculadora --                 |
+---------------------------------------------+
| 1 - Para somar                              |
| 2 - Para subtrair                           |
| 3 - Para multiplicar                        |
| 4 - Para dividir                            |
| 5 - Sair da calculadora                     |
| Digite a opção desejada: 3                  |
| Digite o primeiro número: 6                 |
| Digite o segundo número: 10                 |
| O valor da multiplicação de 6 vezes 10 é 60 |
| Deseja fazer outra operação? (S/N) s        |
+---------------------------------------------+
| -- Opções da Calculadora --                 |
+---------------------------------------------+
| 1 - Para somar                              |
| 2 - Para subtrair                           |
| 3 - Para multiplicar                        |
| 4 - Para dividir                            |
| 5 - Sair da calculadora                     |
| Digite a opção desejada: 4                  |
| Digite o primeiro número: 80                |
| Digite o segundo número: 4                  |
| O valor da diviséo de 80 por 4 é 20         |
| Deseja fazer outra operação? (S/N) n        |
+---------------------------------------------+
| Encerrando o programa...                    |
| Programa encerrado                          |
+---------------------------------------------+
*/