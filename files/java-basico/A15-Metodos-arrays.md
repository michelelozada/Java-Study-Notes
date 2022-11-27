> **Métodos de Arrays**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;   
**1 - Retornando uma lista de tamanho fixo a partir de um array: método `Arrays.asList()`**
```java

String[] frutas = {"maçã", "pêra", "uva", "amora"};
System.out.println("Lista de frutas: " + Arrays.asList(frutas));

// Retorna => Lista de frutas: [maçã, pêra, uva, amora]
```		
```java

Integer[] multiplos5 = {5, 10, 15, 20, 25};
System.out.println("Lista de múltiplos de 5: " + Arrays.asList(multiplos5));

// Retorna => Lista de múltiplos de 5: [5, 10, 15, 20, 25]
```
&nbsp;
&nbsp;    
**2 - Retornando o tamanho de um array com o atributo *(e não método!)* `length`**
```java

int[] arrayNumeros = {20, 96, 4, 78, 9, 41};
// Exibindo o tamanho do array
int tamanhoArray = arrayNumeros.length;
System.out.println(tamanhoArray); 
// Retorna: 6


// Impressão dos elementos do array
int count = 0;

while(count < arrayNumeros.length) {
	System.out.print(arrayNumeros[count] + " "); 
	count++;
}	
System.out.println(" ");
// Retorna: 20 96 4 78 9 41  


// Impressão dos elementos do array em ordem reversa 
for(int i = (arrayNumeros.length - 1); i >= 0; i--) {
	System.out.print(arrayNumeros[i] + " ");
}	
// Retorna: 41 9 78 4 96 20 
```