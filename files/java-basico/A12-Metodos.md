> **Métodos**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;       
**1 - Anatomia básica de um método**
```java
public void imprimirMensagem(){
	System.out.println("Isto é um teste...");
};

public int somarValores(int valor1, int valor2){
	return valor 1 + valor 2;
};
```
- **Modificador de acesso:**      
      `public`, `protected` ou `private`
&nbsp;     
&nbsp;     
 - **Tipo do retorno esperado:**         
      `int`, `String`, `float`, etc. ou `void` para quando não possui valor de retorno
 &nbsp;     
 &nbsp;     
 - **Nome do método:**         
      Usar padrão camelCase  
 &nbsp;
 &nbsp;      
 - **(No caso de receber parâmetros)**  
      O tipo da variável seguido pela variável
 &nbsp;     
 &nbsp;     
 - **Sempre que for retornado um valor a quem chamou o método:**      
     Usar o comando `return`  
&nbsp;

&nbsp;    
**2 - Declarando um método sem retorno**
```java

public class Principal {
	public static void hello() {
		System.out.println("Hello Java!"); 
	}
	
	public static void main(String[] args) {
		Principal.hello();
	}
}

// Retorna: Hello Java!
```
&nbsp;

&nbsp;      
**3 - Declarando um método com retorno**
```java

public class Principal {
	public static double media(float a, float b, float c) {
		double resultado = (a + b + c)/3;
		return resultado;
	}
	
	public static void main(String[] args) {
		System.out.println(Principal.media(4,5,9)); 
		// Retorna: 6.0
		
		System.out.println(Principal.media(4.5f,5.5f,9.5f));
		//Retorna: 6.5		
	}				
}
```