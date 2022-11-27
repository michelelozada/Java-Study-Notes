package github.repositorio.estudo.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);

	// Criação um ArrayList de strings para armazenar os nomes
	List<String> listaNomes = new ArrayList<>();

	// Leitura do tamanho desejado para o ArrayList
	System.out.print("Digite a quantidade de nomes que deseja armazenar: ");
	int qtdNomes = leitor.nextInt();

	// Captura dos nomes desejados
	String nome;
	for(int i = 0; i < qtdNomes; i++) {
		System.out.print("Digite o " + (i + 1) + "º nome: ");
		nome = leitor.next();
		listaNomes.add(nome);
	}
	
	// Impressão da lista de nomes, de acordo com a ordem natural 
	System.out.println("Ordem de inserção: " + listaNomes);
	
	// Aplicação dos demais métodos de ordenação da classe Collections
	System.out.print("Ordem de inserção reversa: ");
	Collections.reverse(listaNomes);
	System.out.println(listaNomes); 
	
	System.out.print("Ordem ascendente: ");
	Collections.sort(listaNomes);
	System.out.println(listaNomes); 

	System.out.print("Ordem aleatória: ");
	Collections.shuffle(listaNomes);
	System.out.println(listaNomes); 
	}
}

/* 
Digite a quantidade de nomes que deseja armazenar: 6

Digite o 1º nome: Cida
Digite o 2º nome: Ana
Digite o 3º nome: Eric
Digite o 4º nome: Flávia
Digite o 5º nome: Daniel
Digite o 6º nome: Bia

Retorna: 

Ordem de inserção: [Cida, Ana, Eric, Flávia, Daniel, Bia]
Ordem de inserção reversa: [Bia, Daniel, Flávia, Eric, Ana, Cida]
Ordem ascendente: [Ana, Bia, Cida, Daniel, Eric, Flávia]
Ordem aleatória: [Daniel, Ana, Flávia, Bia, Eric, Cida]
*/