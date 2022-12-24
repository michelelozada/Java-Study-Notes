> **Estrutura de Repetição - Loop Foreach**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;     
**Loop Foreach**  

É um tipo especializado de laço **`for`** que percorre cada elemento de um vetor ou coleção, sendo que sua variável de controle aponta para 
cada um de seus elementos.   
&nbsp;
&nbsp;

```java

String[] names = {"Ana", "Bia", "Cida", "Dani"};

for(String name : names){
	System.out.println("Nome no array: " + name);
}

/* Retorna: 

+---------------------+
| Nome no array: Ana  |
| Nome no array: Bia  |
| Nome no array: Cida |
| Nome no array: Dani |
+---------------------+
*/
```
&nbsp;
&nbsp;
```java

// Escreva um programa que leia 5 números e, ao final, apresente os antecessores e sucessores destes números

Scanner leitor = new Scanner(System.in);

public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);

int[] numeros = new int[5];
int numero, contador = 0;

do {
	System.out.print("Digite o " + (contador + 1) + "º número: ");
	numero = leitor.nextInt();
	numeros[contador] = numero;
	contador++;
} while(contador < numeros.length);
leitor.close();

for(int number : numeros) {
	System.out.print((number - 1) + " ");
	System.out.print(number + " ");
	System.out.print((number + 1) + " ");
	System.out.println(" ");
}
		
/* Retorna: 
+-------------------------+
| Digite o 1º número: 12  |
| Digite o 2º número: 56  |
| Digite o 3º número: 98  |
| Digite o 4º número: 47  |
| Digite o 5º nmero: 114  |
+-------------------------+
| 11 12 13                |
| 55 56 57                |
| 97 98 99                |
| 46 47 48                |
| 113 114 115             |
+-------------------------+
*/
```
&nbsp;
&nbsp;  
```java

int[] numbers = new int[5];
int sum = 0;
Scanner leitor = new Scanner(System.in);

for(int count = 0; count < numbers.length; count++){
    System.out.print("Por favor, digite o " + (count + 1) + "º número: ");
    numbers[count] = leitor.nextInt();
}

// Utilização da estrutura foreach para exibição dos números digitados  
System.out.print("Você digitou os números: ");
for(int number : numbers){
    System.out.print(number + " ");
}

// Utilização da estrutura foreach para exibição da soma daqueles números 
for(int count : numbers){
    sum += count;
}
System.out.println("\nA soma destes números é " + sum);

/* Retorna:
Você digitou os números: 1 2 3 4 5 
A soma destes números é 15
*/
```		

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>