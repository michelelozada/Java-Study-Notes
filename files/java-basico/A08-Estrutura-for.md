> **Estrutura de Repetição - Loop For**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;      
```java
Scanner leitor = new Scanner(System.in);
int multiplicador;
	
System.out.print("Deseja imprimir a tabuada de qual número? ");
multiplicador = leitor.nextInt();
leitor.close();
	
System.out.println("Tabuada do " + multiplicador);
for (int i = 1; i <= 10; i++) {
	System.out.println(multiplicador + " x " +  i + " = " + (multiplicador * i));
}
		
/* Retorna: 
Deseja imprimir a tabuada de qual número? 5
Tabuada do 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
*/
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

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>