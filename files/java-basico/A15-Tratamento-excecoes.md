> **Tratamento de Exceções**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*     
> GitHub: @michelelozada
&nbsp;
     
&nbsp;      
Evita que - ao ocorrerem eventos ou comportamentos inesperados durante a execução do
programa - o mesmo seja encerrado abruptamente e sem maiores informações sobre a exceção em questão.
&nbsp;
     
&nbsp;   
**1 - Os blocos `try`, `catch` e `finally`**
```java
public class Main {
	public static void main(String[] args) {
		int[] numeros = {10,15,20,25,30};
			
		// Trecho no qual uma exceção é esperada
		try {
			numeros[5] = 35;
			System.out.println(numeros[5]);
		} 
		
		// Prevenção de um erro específico
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: Posição inexistente no array declarado");
		} 
		
		// Prevenção de erros genéricos
		catch (Exception e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
		
		// Definição de um bloco que sempre será executado
		finally {
			System.out.println("Programa finalizado");
		}
	}
}

+----------------------------------------------+
| Erro: Posição inexistente no array declarado |
| Programa finalizado                          |
+----------------------------------------------+

```
&nbsp;
     
&nbsp;   
**2 - Criação de exceções através do comando `throw`**
```java 
public class Main {
	public static void main(String[] args) {
		System.out.println("Digite um valor entre 0 e 5: ");
		Scanner leitor = new Scanner(System.in);
		int valor = leitor.nextInt();
		
		try {
			if(valor > 5 || valor < 0){
				// Aqui é lançada uma exceção 
				throw new Exception("valor inválido");
			}
			System.out.println("O número digitado é: " + valor);
		} catch (Exception e) {
			System.out.println("Houve um erro: " + e.getMessage());
		}
	}
}

+---------+-------------------------------+
| Entrada |             Saída             |
+---------+-------------------------------+
|       3 | O número digitado é 3         |
|       7 | Houve um erro: valor inválido |
+---------+-------------------------------+
```