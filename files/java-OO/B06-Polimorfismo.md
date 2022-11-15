> **Polimorfismo**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**POLIMORFISMO**  
&nbsp;

**1 - A instaciação e sua relação com o polimorfismo**  
 - A instanciação de uma classe é feita através do comando `**new**`, seguido pelo nome da classe e, se for o caso, dos parâmetros para o construtor.  
 - É importante lembrar que classes abstratas não podem ser instanciadas; contudo, quando se cria uma variável/um objeto de uma classe abstrata,
 este pode ser instanciado como subclasse.   
 - Isto é semelhante ao conceito de ponteiro de outras linguagens, pois a variável da classe abstrata passa a apontar para a posição de memória 
 do objeto da subclasse instanciado.  
&nbsp; 
  
:arrow_forward: **Exemplo**   
&nbsp;  
*Imaginar a situação em que existe a classe abstrata Computador (classe-mãe). Esta classe tem duas classes-filhas: a classe Desktop e a classe Notebook. Na classe Main, a classe Computador poderia ser instanciada como subclasse da seguinte forma:*  
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

&nbsp;
     
&nbsp;   
**2 - Polimorfismo e métodos**  
- **Em linhas gerais, um método tem a possibilidade de se comportar de formas diferentes. São elas:**  
&nbsp;
     
- **1 - Polimorfismo de Overloading (também chamado de sobrecarga)**   
 Ocorre quando métodos de mesmo nome recebem diferentes parâmetros de entrada, o que faz com que códigos diferentes sejam executados.  
  ```java 
  int calcularArea(int lado1, int lado2); 
  int calcularArea(int lado1, int lado2, int lado3);
  ```
&nbsp;
     
- **2 - Polimorfismo de Coerção**    
 Ocorre quando é feita a conversão de um tipo de dado para outro, sendo o *type casting* um tipo de coerção explícita.  
 &nbsp;  
   ```java 
   int exemplo = (int) 30.5;
   ```
&nbsp;
     
- **3 - Polimorfismo de Subtipagem**   
 Ocorre quando uma classe-filha reimplementa o método da sua classe-mãe, porém com um outro comportamento.      
&nbsp;
     
- **4 - Polimorfismo Paramétrico**  
 Ocorre quando um método é escrito de uma maneira genérica, que funciona da mesma forma para diferentes tipos de dados.  