> **Arrays**  
> Repositório: Java - Notas de estudo (Sintaxe Básica)  
> GitHub: @michelelozada
&nbsp;
     
&nbsp;     
**Arrays**  
 - Armazenam sequencialmente dados do mesmo tipo  
 - Podem ser unidimensionais e multidimensionais  
 - Há duas formas para se criar um array  
&nbsp;
&nbsp;   
**Forma 1:** Atribuindo valores a uma array vazio
```java

// Criando um array 
String[] tamanhos = new String[3];

// Atribuindo valores
tamanhos[0] = "P";
tamanhos[1] = "M";
tamanhos[2] = "G";

// A impressão da forma abaixo retorna a posição de memória em que está salvo o array
System.out.println(tamanhos);

// As impressões abaixo retornam o conteúdo de cada posição
System.out.println(tamanhos[0]); // Retorna: P
System.out.println(tamanhos[1]); // Retorna: M
System.out.println(tamanhos[2]); // Retorna: G
```
&nbsp;
&nbsp;   
**Forma 2:** Criando um array já com os seus valores
```java

// Criando um array
int[] numero = {10,20,30};
		
// Modificando o valor de uma das posições do array
numero[0] = 15;
		
// Imprimindo os valores do array acima utilizando a estrutura foreach
System.out.print("Os valores do array sao: ");
for(int n: numero) {
	System.out.print(n + " ");			
}

// Retorna: Os valores do array sao: 15 20 30 
```