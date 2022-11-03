/* Crie uma calculadora que apresente o Índice de Massa Corpórea, de acordo com dados fornecidos pelo usuário e forneça a classificação correspondente a respeito */

package github.repositorio.estudo.java;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double peso, altura, imc;
				
		Scanner keyboard = new Scanner(System.in);
			
		System.out.println("Por favor, digite sua altura: ");
		altura = keyboard.nextDouble();
			
		System.out.println("Por favor, digite seu peso: ");
		peso = keyboard.nextDouble();
		
		imc = peso/(altura*altura);
			
		System.out.printf("Seu Índice de Massa Corpórea (IMC): %.2f", imc); 
		
		System.out.print("\nSua classificação: ");
		if(imc < 18.5) {
			System.out.println("Magreza");
		} else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Normal");
		} else if(imc >= 25.0 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		} else if(imc >= 30.0 && imc <= 39.9) {
			System.out.println("Obesidade");
		} else {
			System.out.println("Obesidade grave");
		}		
	}
}

/*
+-------------------------------------------+
| Por favor, digite sua altura: 1,56        |
| Por favor, digite seu peso: 48            |
| Seu Índice de Massa Corpórea (IMC): 19,72 |
| Sua classificação: Normal                 |
+-------------------------------------------+

+-------------------------------------------+
| Por favor, digite sua altura: 1,85        |
| Por favor, digite seu peso: 90            |
| Seu Índice de Massa Corpórea (IMC): 26,30 |
| Sua classificação: Sobrepeso              |
+-------------------------------------------+

*/
