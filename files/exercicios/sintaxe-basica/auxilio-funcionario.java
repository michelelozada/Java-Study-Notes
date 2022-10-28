package github.repositorio.estudo.java;

/* (Do Bootcamp Java Beginners da DIO) Recebidos o salário de um funcionário, seu número de dependentes e os critérios da empresa, informe se o funcionário tem direito ou não ao recebimento de auxílio*/

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// Entrada dos dados
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Qual o salário do funcionário (em R$)? ");
		double salarioFuncionario = keyboard.nextFloat();
		
		System.out.print("Quantos dependentes tem o funcionário? ");
		int dependentesFuncionario = keyboard.nextInt();
		
		// Critérios estipulados pela empresa para análise sobre concessão de auxilio 
		double valorSalario = 4500.00d;
		int numeroDependentes = 2;
		
		
		// Análise dos dados do funcinário
		boolean criterioSalario = salarioFuncionario < valorSalario;
		String statusCriterioSalario = (criterioSalario) ? "atendido":"não atendido"; 
		System.out.println("Critério de valor de salário: " + statusCriterioSalario); 
				
		boolean criterioDependentes = dependentesFuncionario >= numeroDependentes;
		String statusCriterioDependente = (criterioDependentes) ? "atendido":"não atendido"; 
		System.out.println("Critério de número de dependentes: " + statusCriterioDependente); // false
				
		boolean receberAuxilio = (criterioSalario) && (criterioDependentes);
				
		System.out.print("Resultado da análise: Este funcionário");
			if(receberAuxilio) {
				System.out.print(" ");
			} else {
				System.out.print(" não ");
			}	
			System.out.print("tem direito ao recebimento de auxílio.");
		}
}


/* Retorno: 
Qual o salário do funcionário (em R$)? 4000,00
Quantos dependentes tem o funcionário? 1

Critério de valor de salário: atendido
Critério de numero de dependentes: não atendido
Resultado da análise: Este funcionário não tem direito ao recebimento de auxílio.
*/