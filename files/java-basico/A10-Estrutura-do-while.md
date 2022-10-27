> **Estrutura de Repetição - Loop While**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
&nbsp;     

**-- EXEMPLO --**  
```java

/* Adivinhe o número */

public class Main {
	public static void main(String[] args) {
		int palpite, correto = 524;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite o seu palpite: ");
		palpite = keyboard.nextInt();
		
		while(palpite != correto) {
			String feedback = (palpite > correto ) ? "O numero correto é menor": "O numero correto é maior";
			System.out.println(feedback);
			
			System.out.println("\n\nDigite o seu palpite novamente: ");
			palpite = keyboard.nextInt();
		}
		System.out.println("Parabéns, você acertou o número!");
	}
}
```