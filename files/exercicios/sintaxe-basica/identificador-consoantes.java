package github.repositorio.estudo.java;

/* (Do Bootcamp Java Beginners da DIO) Escreva um programa que leia caracteres e identifique quais deles são consoantes */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		System.out.println("Identificador de consoantes");
		
		// Criação do objeto Scanner
		Scanner leitor = new Scanner(System.in);
			
		// Declaração/inicialização das variáveis
		String caractereDigitado;
		int quantidadeConsoantes = 0;
		int contador = 0;
		
		// Criação do array de 6 posições 
		String[] consoantes = new String[6];
		
		// Criação da estrutura do...whil para leitura dos carcteres
		System.out.println("\nVocê precisa digitar seis letras aleatórias e eu identificarei as consoantes!");
		do{
			System.out.print("\nDigite a " + (contador + 1) + "ª letra: ");
			caractereDigitado = leitor.next();
			if(!(caractereDigitado.equalsIgnoreCase("a") ||
				caractereDigitado.equalsIgnoreCase("e") ||
				caractereDigitado.equalsIgnoreCase("i") ||
				caractereDigitado.equalsIgnoreCase("o") ||
				caractereDigitado.equalsIgnoreCase("u"))) {
				consoantes[contador] = caractereDigitado;
				quantidadeConsoantes++;
			} 
			contador++;
		} while(contador < consoantes.length);	
		leitor.close();
		
		// Estrutura for para identificação das consoantes digitadas
		System.out.print("\nConsoantes digitadas por você: ");
		for(String consoante: consoantes) {
			if(consoante != null)
				System.out.print(consoante + " ");
		}	
		System.out.println("\nQuantidade: " + quantidadeConsoantes + " consoantes");
	}
}

/*
+-------------------------------------------------------------------------------+
|                              Identificador de consoantes                      |
| Você precisa digitar seis letras aleatórias e eu identificarei as consoantes! |
+-------------------------------------------------------------------------------+
| Digite a 1ª letra: s                                                          |
+-------------------------------------------------------------------------------+
| Digite a 2ª letra: a                                                          |
+-------------------------------------------------------------------------------+
| Digite a 3ª letra: q                                                          |
+-------------------------------------------------------------------------------+
| Digite a 4ª letra: y                                                          |
+-------------------------------------------------------------------------------+
| Digite a 5ª letra: g                                                          |
+-------------------------------------------------------------------------------+
| Digite a 6ª letra: e                                                          |
+-------------------------------------------------------------------------------+
| Consoantes digitadas por você: s q y g                                        |
| Quantidade: 4 consoantes                                                      |
+-------------------------------------------------------------------------------+
*/