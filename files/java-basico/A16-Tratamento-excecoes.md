> **Tratamento de Exceções**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*     
> GitHub: @michelelozada
&nbsp;
     
&nbsp;      
**Error**    
 - Referente à plataforma.        
 - Geralmente não tem tratamento.    
&nbsp;

**Exception**    
 - É um evento não esperado que ocorre no sistema durante o tempo de execução.        
 - Caso não tenha sido realizado o tratamento, a execução do programa será interrompida com a exibição da mensagem do tipo e do ponto em que ocorreu a exceção.      
 &nbsp;

**Tratamento de exceções**      
 - Propicia que - ainda que ocorram eventos ou comportamentos inesperados durante a execução do programa - o mesmo continue executando.    
&nbsp;

**Unchecked exceptions**  
 - *Classe RunTimeException*   
 - Tipo de exceção em que não é obrigatório o tratamento, sendo que o programa irá rodar até o ‘estouro’ da exceção (normalmente referentes a erros de lógica, como divisão por zero, acesso a elementos fora do array, etc.).      
&nbsp;

**Checked exceptions**    
 - *Classe Exception*    
 - Tipo de exceção em que é mandatório o tratamento, pois sem isso o programa não consegue sequer executar.    
&nbsp;
   
**Os blocos `try`, `catch` e `finally`**  
 - **Try:** Bloco do código no qual uma ou mais exceções podem vir a acontecer.   
 - **Catch:**  Bloco no qual haverá o tratamento das exceções – específicas ou genéricas - que possam vir a acontecer.  
 - **Finally:** Bloco cujas instruções serão sempre executadas, havendo ou não exceções.  

:arrow_forward: ***Exemplo***
&nbsp;    
    
```java

public class Main {
	public static void main(String[] args) {
		int[] numeros = {10,15,20,25,30};
			
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

```java

/* Tratando uma possível inclusão de zero como divisor */

public class Main {
	public static void main(String[] args) {
		boolean continuarLoop = true;
        Scanner keyboard = new Scanner(System.in);
        do {
            // Trecho no qual a exceção pode acontecer
	        try{
				System.out.print("Digite o dividendo: ");
				int numero1 = keyboard.nextInt();
				System.out.print("Digite o divisor: ");
				int numero2 = keyboard.nextInt();
				int divisao = numero1 / numero2;
				System.out.println("Resultado da divisão: " + divisao);
				continuarLoop = false;
	        } 	        
	        // Lidando com a entrada de 0 como um divisor da operação
	        catch (ArithmeticException e) {
				System.out.println("ERRO: o divisor deve ser diferente de zero. Por favor, tente novamente.\n");
			}
        } while(continuarLoop);      	
    }
}  

+-------------------------------------------------------------------------+
| Digite o dividendo: 10                                                  |
| Digite o divisor: 0                                                     |
| ERRO: o divisor deve ser diferente de zero. Por favor, tente novamente. |
+-------------------------------------------------------------------------+
| Digite o dividendo: 10                                                  |
| Digite o divisor: 2                                                     |
| Resultado da divisão: 5                                                 |
+-------------------------------------------------------------------------+
```
&nbsp;
     
**O Comando `throw`**      
 - Comando que lança explicitamente uma exceção.  

:arrow_forward: ***Exemplo***
&nbsp;    

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

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>