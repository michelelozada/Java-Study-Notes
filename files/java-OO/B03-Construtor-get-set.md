> **Métodos Construtor, Get e Set**     
> Repositório: Java - Notas de estudo *(Java Orientado a Objetos)*    
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
 - Estabelece/define as propriedades de um atributo. 
 - O comando `this` abaixo faz referência à própria classe e evita ambiguidade quando um parâmetro tem o mesmo nome de um atributo.
 
```java
public void setValorMensalidade(float mensalidade){
	this.mensalidade = mensalidade;
}
```
&nbsp;

**:arrow_forward: Exemplo - Método Construtor**   
&nbsp;

***Classe Principal***
```java
/* Calcule a média aritmética e ponderada de um determinado aluno */

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Instanciando o objeto e passando os argumentos (notas das avaliações)
		Avaliacao aluno1 = new Avaliacao(7, 4, 10);
				
		// Chamando os métodos para cálculo da média
		System.out.printf("A média poderada do aluno é: %.2f\n", aluno1.mediaAritmetica());
		System.out.printf("A média ponderada do aluno é: %.2f", aluno1.mediaPonderada());
	}
}

/* Retorna: 
A média aritmética do aluno é: 7,00
A média ponderada do aluno é: 7,33
*/
```
&nbsp;

***Classe Avaliacao***
```java
public class Avaliacao {
	// Criação dos atributos
	double nota1, nota2, nota3;
		
	// Criação do método construtor
	Avaliacao(double nota1, double  nota2, double nota3){
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
		
	// Criação do método para cálculo da média aritmética
	public double mediaAritmetica(){
		return (nota1 + nota2 + nota3)/3;
	}
		
	// Criação do método para cálculo da média ponderada
	public double mediaPonderada(){
		return (nota1 * 2 + nota2 * 3 + nota3 *4) / 9;
	}
}
```