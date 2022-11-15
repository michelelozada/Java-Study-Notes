> **Métodos úteis**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**Método `equals()`**  
- "Tem por finalidade permitir a comparação com outro objeto e retornar verdadeiro caso sejam iguais e falso, caso contrário".    
- Observe no exemplo abaixo que, em se tratando de objetos, o comando `==` compara se os mesmos se são a mesma instância; já o método 
`equals()` faz a comparação do conteúdo dos objetos.  
```java
public class Principal{
	public static void main(String[] args) {		
		
		String str1 = new String("Hello World!"); 
		String str2 = new String("Hello World!");
		String str3 = str1;
		
		System.out.println(str1 == str2); 
		// retorna false, pois str1 e str2 são instâncias diferentes com o mesmo conteúdo
		
		System.out.println(str1.equals(str2)); 
		// retorna true, pois estão sendo comparados aqui os conteúdos das duas strings
		
		System.out.println(str1 == str3); 
		// retorna true, pois str1 e str3 são a mesma instância/apontam para a mesma região de memória
	}	
}
```
&nbsp;  

**Método `hashCode()`**    
- "Gera um código para tabela Hash, que serve principalmente para mapearmos dados na memória em posições únicas".     
&nbsp;  

**Método `toString()`**  
 - "Geralmente é sobrescrito com a finalidade de permitir que um objeto seja lido como String".    
 - "Bastante conveniente quando precisamos tratar a informação de um objeto como string, para impressão ou eventual comparação".          
&nbsp;  