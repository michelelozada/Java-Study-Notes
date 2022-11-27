> **Estrutura de Repetição - Loop Foreach**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;     
**Loop Foreach**  

- É um tipo especializado de laço `for` que percorre cada elemento de um vetor ou coleção, sendo que sua variável de controle aponta para 
cada um de seus elementos.
&nbsp;
&nbsp;
```java

String[] names = {"Ana", "Bia", "Cida", "Dani"};

// Utilização da estrutura foreach para exibição dos nomes do array 
for(String name : names){
	System.out.println("Nome digitado: " + name);
}

/* Retorna: 
Nome digitado: Ana
Nome digitado: Bia
Nome digitado: Cida
Nome digitado: Dani
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

/*
Você digitou os números: 1 2 3 4 5 
A soma destes números é 15
*/
```		