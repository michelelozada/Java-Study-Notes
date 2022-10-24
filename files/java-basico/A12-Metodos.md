> **Métodos**  
> Repositório: Java - Notas de estudo (Sintaxe Básica)  
> GitHub: @michelelozada
&nbsp;
     
&nbsp;     
**Declarando um método sem retorno**
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
**Declarando um método com retorno**
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