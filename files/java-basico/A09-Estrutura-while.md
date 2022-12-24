> **Estrutura de Repetição - Loop While**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;    
**Estrutura de Repetição While**     

- Promove a repetição das instruções ali definidas e é  controlada por expressões relacionais e/ou lógicas, sendo que este controle é realizado no ***início*** da estrutura.  
- É necessário um contador para controle do loop (fases de inicialização, comparação e atualização).  
&nbsp;
&nbsp;
```java

/* Escreva um programa que, sendo fornecido um número, faça sua contagem regressiva, destacando os números múltiplos de 3 */

int numero = 25;

while(numero >=1) {
	if(numero % 3 == 0) {
		System.out.print("[" + numero + "] ");
	}
	else {
		System.out.print(numero + " ");
	}	
	numero--;
}	

// Retorna: 25 [24] 23 22 [21] 20 19 [18] 17 16 [15] 14 13 [12] 11 10 [9] 8 7 [6] 5 4 [3] 2 1 
```
&nbsp;
&nbsp;   
```java

/* Crie um programa que, fornecidos dois números e o incremento/decremento, imprima o intervalo de números entre eles. */

int num_inicio = 60;
int num_final = 40;
int passo = 3;

if (num_inicio != num_final) {
	if (num_inicio > num_final) {
		System.out.println("Impressao dos numeros compreendidos no intervalo de " + num_inicio + " ate " + num_final + " (com decremento de " + passo +")");
		while(num_inicio >= num_final) {
			System.out.print(num_inicio + " ");
			num_inicio -= passo;
		}	
	}
	else {
		System.out.println("Impressao dos numeros compreendidos no intervalo de " + num_inicio + " ate " + num_final + " (com incremento de " + passo +")");
		while(num_inicio <= num_final) {
			System.out.print(num_inicio + " ");
			num_inicio += passo;
		}	
	}
}	
else {
	System.out.println("Atencao: voce precisa escolher dois numeros distintos para a criacao de um intervalo a ser impresso aqui.");
}	
	
// Retorna: Impressao dos numeros compreendidos no intervalo de 60 ate 40 (com decremento de 3): 60 57 54 51 48 45 42 			
```
&nbsp;
&nbsp; 
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

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>