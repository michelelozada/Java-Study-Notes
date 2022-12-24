> **Estrutura de Repetição - Loop While**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**Estrutura de Repetição Do-While**   

- Promove a repetição das instruções ali definidas e é controlada por expressões relacionais e/ou lógicas, sendo que este controle é realizado no ***final*** da estrutura.  
- Nesta estrutura, ao menos uma vez, seu conteúdo será executado.  
&nbsp;
&nbsp;  
```java
int num = 10, count = 1;
		
do {
	num += count;
	count++;
	System.out.print(num + " ");
} while (count <= 5);

// Retorna: 11 13 16 20 25 
```
&nbsp;
&nbsp;  
```java
// Ler 4 números, apresentando a média dos mesmos e o maior número lido 
	
int contador = 0; 
int maiorNumero = 0;
int soma = 0;

do {
	Scanner leitor = new Scanner(System.in);
	int numeroLido; 
	
	System.out.println("Digite o " + (contador + 1) + "º numero: ");
	numeroLido = leitor.nextInt();
	
	if(numeroLido > maiorNumero) { 
		maiorNumero = numeroLido;
	}
	
	soma += numeroLido;
	contador ++;
} while(contador <= 3);

System.out.println("\nA média dos números lidos é: " + (soma/5));
System.out.println("\nO maior número lido foi: " + maiorNumero);


/*
+---------------------------------+
| Digite o 1º numero: 56          |
| Digite o 2º numero: 41          |
| Digite o 3º numero: 89          |
| Digite o 4º numero: 65          |
+---------------------------------+
| A média dos numeros lidos é: 50 |
| O maior número lido foi: 89     |
+---------------------------------+
*/
```
&nbsp;
&nbsp;  
```java
// Ler alguns números (em quantidade a ser definida pelo usuário) e apresentar quais deles foram pares e ímpares 

int quantidadeLeituras, contador = 0, numero = 0;
int numerosPares = 0, numerosImpares = 0;

Scanner leitor = new Scanner(System.in);

System.out.print("Quantos números deseja ler? ");
quantidadeLeituras = leitor.nextInt();

do {
	System.out.print("Digite o " + (contador + 1) + "º número: ");
	numero = leitor.nextInt();
	
	if (numero % 2 == 0) {
		numerosPares++;
	} else {
		numerosImpares++;
	}
	
	contador++;
	
} while(contador < quantidadeLeituras);

System.out.println("\nResultado:");
System.out.print("Quantidade de números pares: " + numerosPares + "\n");
System.out.print("Quantidade de números ímpares: " + numerosImpares);

/*
+----------------------------------+
| Quantos números deseja ler? 6    |
| Digite o 1º número: 23           |
| Digite o 2º número: 56           |
| Digite o 3º número: 34           |
| Digite o 4º número: 18           |
| Digite o 5º número: 79           |
| Digite o 6º número: 88           |
+----------------------------------+
| Resultado:                       |
| Quantidade de números pares: 4   |
| Quantidade de números ímpares: 2 |
+----------------------------------+
*/
```

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>