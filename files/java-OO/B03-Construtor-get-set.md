> **Métodos Construtor, Get e Set**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**1 - Método Construtor**
 - Deve ter o mesmo nome da classe.  
 - É executado apenas uma vez, no momento da instanciação de uma classe/criação de um objeto.  
 - É possível a existência de mais de um método construtor em uma classe, porém sempre com parâmetros diferentes.  
 - Ainda que não tenha sido declarado um método construtor para a classe, existirá um construtor vazio implícito ali.    
&nbsp;     
         
**2 - Métodos Get e Set**
 - Servem para acessar atributos encapsulados/privados.      
&nbsp;       
         
**2.1 - Método Get**
 - Obtém as propriedades de um atributo.  
 - Portanto, seu tipo de retorno deve ser igual ao tipo do atributo.  

```java
public double getValorMensalidade(){
	return mensalidade; 
}
```
&nbsp;  

**2.2 - Método Set** 
 - Estabelece as propriedades de um atributo. 
 - O comando `this`, abaixo, faz referência à própria classe e evita assim ambiguidade quando um parâmetro tem o mesmo nome de um atributo.
 
```java
public void setValorMensalidade(float mensalidade){
	this.mensalidade = mensalidade;
}
```
&nbsp;

**:arrow_forward: Exemplo 1 - Método Construtor**   
&nbsp;

***Classe Principal***
```java
/* Calcule a média aritmética e ponderada de um determinado aluno */

import java.util.Scanner;

public class Principal {
		// Utilizando o método construtor default
		Avaliacao aluno1 = new Avaliacao();
		aluno1.nota1 = 6.8;
		aluno1.nota2 = 5.7;
		aluno1.nota3 = 7.6;
					
		System.out.printf("A média aritmética do aluno é: %.2f\n", aluno1.mediaAritmetica());
		System.out.printf("A média ponderada do aluno é: %.2f\n", aluno1.mediaPonderada());
		
		/* Retorna: 
		A média ponderada do aluno é: 6,70
		A média ponderada do aluno é: 6,79
		*/
		
		// Utilizando o segundo método construtor 
		Avaliacao aluno2 = new Avaliacao(9.5,8.5,7.9);
		System.out.printf("A média aritmética do aluno é: %.2f\n", aluno2.mediaAritmetica());
		System.out.printf("A média ponderada do aluno é: %.2f", aluno2.mediaPonderada());
		
		/* Retorna: 
		A média aritmética do aluno é: 8,63
		A média ponderada do aluno é: 8,46
		*/
```
&nbsp;

***Classe Avaliacao***
```java
public class Avaliacao {
	// Declaração dos atributos
	double nota1, nota2, nota3;
		
	// Criação do primeiro método construtor (default)
	Avaliacao(){
	
	}
	
	// Criação do segundo método construtor
	Avaliacao(double nota1, double nota2, double nota3){
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
		
	// Método para cálculo da média aritmética
	public double mediaAritmetica(){
		return (nota1 + nota2 + nota3)/3;
	}
		
	// Método para cálculo da média ponderada
	public double mediaPonderada(){
		return (nota1 * 2 + nota2 * 3 + nota3 * 4) / 9;
	}
}
```
&nbsp;
     
&nbsp;    
**:arrow_forward: Exemplo 2 - Métodos Get e Set**   
&nbsp;

***Classe Principal***
```java

public class Principal {
	public static void main(String[] args){ 
		Produto produto1 = new Produto();
		
		produto1.nome = "Limpador XPTO";
		produto1.quantidade = 15;
		produto1.preco = 20.00f;
		
		System.out.println("Nome do produto: " + produto1.getNome());
		System.out.println("Quantidade pedida: " + produto1.getQuantidade() + " unidades");
		System.out.printf("Preco unitário: R$ %.2f\n", produto1.getPreco());
		System.out.printf("Valor total do pedido: R$ %.2f\n",produto1.calcularValorComFrete(15.00f));
	} 
}

/* Retorna:
Nome do produto: Limpador XPTO
Quantidade pedida: 15 unidades
Preco unitário: R$ 20,00
Valor total do pedido: R$ 315,00
*/
```
&nbsp;

***Classe Produto***
```java

public class Produto {
	private String nome;
	private int quantidade;
	private float preco;
	
	// Métodos get e set
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public String getNome(){
		return nome;
	} 
	
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}	
		
	public int getQuantidade(){
		return quantidade;
	}		
	
	public void setPreco(float preco){
		this.preco = preco;
	}	
	
	public float getPreco(){
		return preco;
	}	
	
	// Método para calcular venda com taxa de entrega
	public float calcularValorComFrete(float taxaEntrega) {
		return getQuantidade() * getPreco() + taxaEntrega;
	}
}
```