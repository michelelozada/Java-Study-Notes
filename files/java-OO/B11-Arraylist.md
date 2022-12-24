> **Classe ArrayList**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;    
 **ARRAYLIST**  
 - **Interface:** *List*    
 - **Pacote:** *java.util.ArrayList*    
 - Caracterizado por ser uma lista com ordenação de acordo com a inserção dos elementos, sendo permitida a repetição de elementos ali.   
 - Um array tradicional não pode ter seu tamanho alterado; já o ArrayList permite isso.    

&nbsp;
     
**Alguns métodos nativos**
| Método      | Função
| :---        | :---
| add()       | Adiciona um elemento a um ArrayList (se usado com 2 argumentos, o primeiro indica a posição onde será feita a adição do elemento)
| clear()     | Apaga um ArrayList
| contains()  | Examina se um elemento consta em um ArrayList
| get()       | Retorna um elemento, informada a posição em que ele se encontra
| indexOf()   | Exibe a posição/índice de um elemento dentro de um ArrayList 
| remove()    | Remove um elemento de um ArrayList (pode ser informada a posição ou o elemento)
| set()       | Susbtitui elementos em um ArrayList (o primeiro argumento é a posição onde será feita a substituição do elemento)
| size()      | Retorna a quantidade de elementos de um ArrayList

&nbsp;
     
**Métodos úteis da classe Collections**
| Método    | Função
| :---      | :---	
| max()     | Retorna o maior valor de uma List  
| min()     | Retorna o menor valor de uma List
| reverse() | Ordena todos os elementos de uma List em ordem reversa
| shuffle() | Ordena de forma aleatória os elementos de uma List
| sort()    | Ordena os elementos de uma List em ordem crescente/natural

&nbsp;

:arrow_forward: ***Exemplos***

&nbsp;  

**1 - Inicializando um ArrayList já com elementos**  
```java

List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 5, 9, 7, 12, 2, 2));
```
&nbsp; 	

**2 - Inicializando um ArrayList vazio**
```java

List<Integer> numeros = new ArrayList<>();
```
&nbsp; 	  

**3 - Adicionando elementos ao ArrayList acima**
```java

numeros.add(7);
numeros.add(8);
numeros.add(9);
numeros.add(5);
numeros.add(7);
System.out.println(numeros.toString());

// Retorna: [7, 8, 9, 5, 7]
```
&nbsp; 	  

**4 - Exibindo a quantidade de elementos do ArrayList**
```java
System.out.println(numeros.size());

// Retorna: 5
```
&nbsp; 	  

**5 - Exibindo a posição do número 5**
```java

System.out.println(numeros.indexOf(5));

// Retorna: 3
```
&nbsp; 	  

**6 - Conferindo se o número 12 está no ArrayList**
```java

System.out.println(numeros.contains(12));

// Retorna: false
```
&nbsp; 	  

**7 - Exibindo a 4ª nota que foi adicionada ao ArrayList**
```java

System.out.println(numeros.get(3));

// Retorna: 5
```
&nbsp; 	  

**8 - Exibindo o maior e o menor número do ArrayList**
```java

System.out.println(Collections.max(numeros));  // Retorna: 9
System.out.println(Collections.min(numeros));  // Retorna: 5
```
&nbsp; 	  

**9 - Adicionando o valor 2 na posição 4**
```java

System.out.println(numeros.toString());
// Retorna: [7, 8, 9, 5, 7]

numeros.add(2,4);
System.out.println(numeros.toString());
// Retorna: [7, 8, 4, 9, 5, 7]
```
&nbsp; 	  

**10 - Substituir o valor 8 pelo valor 3**
```java

System.out.println(numeros.toString());
// Retorna: [7, 8, 9, 5, 7]

numeros.set(numeros.indexOf(8),3);
System.out.println(numeros);
// Retorna: [7, 3, 9, 5, 7]
```
&nbsp; 	  

**11- Removendo o elemento da posição 1**
```java

System.out.println(numeros);
// Retorna: [7, 8, 9, 5, 7]

numeros.remove(1);
System.out.println(numeros);
// Retorna: [7, 9, 5, 7]
```
&nbsp; 	  

**12 - Apagando a lista**
```java

numeros.clear();
System.out.println(numeros);

// Retorna: []
```
&nbsp;  
     
&nbsp;   
**13 - Utilizando o método iterator**  
*Para somar todos os números de um ArrayList*
```java

System.out.println(numeros);
// Retorna: [7, 8, 9, 5, 7]

int soma = 0;
// Chamando o método iterator
Iterator<Integer> iterator = numeros.iterator();
while(iterator.hasNext()) {
	int next = iterator.next();
	soma += next;
}
System.out.println(soma);
// Retorna: 36
```
&nbsp;
     
&nbsp;    
**14 - Utilizando o método iterator**  
*Para remover os números menores que 8 do ArrayList*
```java

System.out.println(numeros);
// Retorna: [7, 8, 9, 5, 7]

Iterator<Integer> iterator = numeros.iterator();
	while(iterator.hasNext()) {
		int next = iterator.next();
		if(next < 8) {
			iterator.remove();
		}
	}
System.out.println(numeros.toString());

// Retorna: [8, 9]
```
&nbsp;
     
&nbsp;    
**15 - Percorrendo um array através da estrutura foreach**
```java

List<Integer> numeros = new ArrayList<>(Arrays.asList(7, 8, 9, 5, 7));
		
for(Integer num : numeros){
	System.out.print(num + " ");
}

// Retorna: 7 8 9 5 7 
```

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>