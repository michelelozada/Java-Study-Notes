> **Entrada e Saída de Dados**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;    
**1 - ENTRADA DE DADOS**  
*Para leitura de dados em Java, é necessária criação de um objeto da classe `Scanner`.*
```java		

// Criação do objeto keyboard que irá interagir com a entrada do sistema (no caso, o teclado)  
Scanner keyboard = new Scanner(System.in);	
		
System.out.println("Digite seu nome:");
String nome  = keyboard.next();
		
System.out.println("Digite sua idade:");
int idade = keyboard.nextInt();
		
System.out.println("Digite seu peso:");
float peso  = keyboard.nextFloat();
		
System.out.println("Digite sua altura:");
double altura  = keyboard.nextDouble();
```
     
&nbsp;    

**2 - SAÍDA DE DADOS**   

**Impressão sem quebra de linha**
```java

System.out.print("Teste 1");
```

&nbsp;   

**Impressão com quebra de linha**   
```java

System.out.println("Teste 2");
```

&nbsp;    

**Formatação de mensagens com o método `printf()`**
```java

// Número inteiro
System.out.printf("Idade: %d anos\n", idade);

// Números float - indicando 2 casas decimais
System.out.printf("Preço: R$ %.2f", valor);

// Número double - indicando 2 casas decimais
System.out.printf("Peso: %.2f quilos | Altura: %.2f metros", peso, altura);
```

&nbsp;   

**Concatenação de strings e variáveis**
```java

System.out.println("Nome do aluno: " + nome);
System.out.println("Idade: " + idade);
```  

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>