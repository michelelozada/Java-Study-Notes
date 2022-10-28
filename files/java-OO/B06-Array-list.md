> **Classe ArrayList**     
> Repositório: Java - Notas de estudo *(Java Orientado a Objetos)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;   
**Criação de um ArrayList** 
```java
ArrayList<String> listaNomes = new ArrayList<String>();

ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
```
&nbsp;
&nbsp;    
**Observações:**
 - A notação *`<>`* se chama operador diamante e contém a classe.  
 - Para utilizar um ArrayList é necessário importar a classe `java.util.ArrayList`.  
&nbsp;
     
&nbsp;   
**:arrow_forward: Exemplo - ArrayList**   
&nbsp;

```java
/* Crie um aray de nomes e imprima-o na ordem normal e reversa */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Criando um ArrayList de Strings
		ArrayList<String> listaNomes = new ArrayList<String>();
			
		System.out.print("Digite a quantidade de nomes que deseja armazenar: ");
		int qtdNomes = keyboard.nextInt();
		
		// Capturando os nomes
		String nome;
		for(int i=0; i < qtdNomes; i++) {
			System.out.print("Digite um nome: ");
			nome = keyboard.next();
			listaNomes.add(nome);
		}
		
		// Utilização da classe Collections
		System.out.print("Ordem normal: ");
		System.out.println(listaNomes); 
		Collections.reverse(listaNomes);
		System.out.print("Ordem reversa: ");
		System.out.println(listaNomes); 
	}
}

/*
Digite a quantidade de nomes que deseja armazenar: 5
Digite um nome: Ana
Digite um nome: Bia
Digite um nome: Cida
Digite um nome: Daniel
Digite um nome: Eric

Ordem normal: [Ana, Bia, Cida, Daniel, Eric]
Ordem reversa: [Eric, Daniel, Cida, Bia, Ana] 
*/
```