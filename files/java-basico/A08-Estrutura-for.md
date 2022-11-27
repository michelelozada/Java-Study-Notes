> **Estrutura de Repetição - Loop For**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;      
```java
int i, num = 5;
for(i = 0; i < 3; i++) { 
	num += i;
	System.out.print(i + " ");
}	

// Retorna: 0 1 2 
```
&nbsp;
&nbsp;       
Observação: Quando o bloco for possuir apenas uma instrução, podem ser suprimidas as chaves. *(Para mais de uma instrução, a utilização das chaves é mandatória!)*.   
```java

int i, num = 5;
for(i = 0; i < 3; i++)  
	num += i;
System.out.print(i);

// Retorna: 3
```
&nbsp;
&nbsp;   
**Iterando `for` com duas variáveis**
```java
int inicio = 1;
int fim = 5;
	
for (int i = inicio, j = fim; i <= fim; i++, j-- ) {
	System.out.print("Sequência crescente: " + i + "\n");
	System.out.print("Sequência decrescente: " + j + "\n");
}

/* Retorna: 
Sequência crescente: 1
Sequência decrescente: 5
Sequência crescente: 2
Sequência decrescente: 4
Sequência crescente: 3
Sequência decrescente: 3
Sequência crescente: 4
Sequência decrescente: 2
Sequência crescente: 5
Sequência decrescente: 1
*/
```				