> **Classe Random**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**Classe Random**  
Gera números pseudo-aleatórios em Java   
&nbsp;  

```java

// Escreva um programa que escolha 5 números aleatórios e, ao fim, apresente os antecessores e sucessores destes números 

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Instanciando um objeto da classe Random
		Random random = new Random();
		int[] numeros = new int[5];
		int numero = 0;

		for(int i = 0; i < numeros.length; i++) {
			// Gerando o valor aletório
			numero = random.nextInt(80);  // range vai até 80  
			numeros[i] = numero;
		}

		for(int number : numeros) {
			System.out.print((number - 1) + " " + number + " " + (number + 1) + "\n");
		}
	}
}

/* Retorna: 
+----------+
| 63 64 65 |
| 65 66 67 |
| 50 51 52 |
| 62 63 64 |
| 28 29 30 |
+----------+
*/
```
&nbsp;
&nbsp;    
```java

// Escreva um programa que escolha números aleatórios, preencha uma matriz 3x3 e, ao final, apresente tais números 

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		int [][] arrayDeNumeros = new int[3][3];
		int numero;
		
		// Linhas
		for(int i = 0; i < arrayDeNumeros.length; i++) { 
			// Colunas
			for(int j = 0; j < arrayDeNumeros.length; j++) { 
			numero = random.nextInt(9); // Limite do range dos números
			arrayDeNumeros[i][j] = numero;
			}
		}
		
		for(int[] linha : arrayDeNumeros) {
			for(int elementoDaColuna : linha) {
				System.out.print(elementoDaColuna + " ");
			}
			System.out.println();
		}
	}
}

/* Retorna: 
+-------+
| 2 3 1 |
| 4 6 0 |
| 0 3 4 |
+-------+
*/
```

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>