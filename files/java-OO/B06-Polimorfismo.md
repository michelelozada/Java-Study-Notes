> **Polimorfismo**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**POLIMORFISMO**  
&nbsp;

**1 - A Instanciação e sua Relação com o Polimorfismo**  
 - A instanciação de uma classe é feita através do comando **`new`**, seguido pelo nome da classe e, se for o caso, dos parâmetros para o construtor.    
 - É importante lembrar que classes abstratas não podem ser instanciadas; contudo, quando se cria uma variável/um objeto de uma classe abstrata,
 este pode ser instanciado como subclasse.     
 - Isto é semelhante ao conceito de ponteiro de outras linguagens, pois a variável da classe abstrata passa a apontar para a posição de memória 
 do objeto da subclasse instanciado.    
&nbsp; 
  
:arrow_forward: **Exemplo**   
&nbsp;  
*Considerar a situação em que existe a classe abstrata Computador (classe-mãe). Esta classe tem duas classes-filhas: a classe Desktop e a classe Notebook. Na classe Main, a classe Computador poderia ser instanciada como uma subclasse da seguinte forma:*  
```java
public class Main {
	public static void main(String[] args) {
		Computador desktop1 = new Desktop();
		desktop1.atributo1;
		desktop1.atributo2;
		(...)
		 
		Computador notebook1 = new Notebook();
		notebook1.atributo1;
		notebook1.atributo2;
		(...)
	}
}	
``` 
<h1></h1>
&nbsp; 

**2 - Polimorfismo e Métodos**  
Em linhas gerais, um método tem a possibilidade de se comportar de formas diferentes. São elas:  
&nbsp;
     
**2.1 - Polimorfismo de Overloading (também chamado de sobrecarga)**   
Ocorre quando métodos de mesmo nome recebem diferentes parâmetros de entrada, fazendo com que códigos diferentes sejam executados.  
&nbsp; 
  
:arrow_forward: **Exemplo**   
&nbsp;  
*Aplicando o conceito de sobrecarga para calcular a área de diferentes paralelogramos (losangos, retângulos e quadrados).*	
&nbsp;

***Classe Principal***
```java 

public class Principal {
	public static void main(String[] args) {
	
		Paralelogramo.calcularArea(12f, 9f); // Referente ao losango
		Paralelogramo.calcularArea(12d, 5d); // Referente ao retângulo
		Paralelogramo.calcularArea(10d); // Referente ao quadrado
	}
}
```
&nbsp;

***Classe Paralelogramo***
```java 

public class Paralelogramo {
	
	public static void calcularArea(float diagonalMaior, float diagonalMenor){
		float calcularArea = (diagonalMaior * diagonalMenor)/2;
		System.out.println("Área do losango: " + calcularArea + " cm²");
	}
	
	public static void calcularArea(double base, double altura){
		double calcularArea = base * altura;
		System.out.println("Área do retângulo: " + calcularArea + " cm²");
	}
	
	public static void calcularArea(double lado){
		double calcularArea = lado * lado;
		System.out.println("Área do quadrado: " + calcularArea + " cm²");
	}
}
```
&nbsp;
     
**2.2 - Polimorfismo de Coerção**    
 Ocorre quando é feita a conversão de um tipo de dado para outro, sendo o *type casting* um tipo de coerção explícita.  
 &nbsp;  
   ```java 
   int exemplo = (int) 30.5;
   ```
&nbsp;
     
**2.3 - Polimorfismo de Subtipagem**   
 Ocorre quando uma classe-filha reimplementa o método da sua classe-mãe, porém com um outro comportamento.        
&nbsp;
     
**2.4 - Polimorfismo Paramétrico**  
 Ocorre quando um método é escrito de uma maneira genérica, que funciona da mesma forma para diferentes tipos de dados.  