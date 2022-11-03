> **ArrayList**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;    
 **ARRAYLIST**
 - Interface: List (elementos armazenados de acordo com a sua ordem de inserção e com possibilidade de elementos duplicados).  
 - Pacote: java.util.ArrayList
 - Um array tradicional não pode ter seu tamanho alterado; já o ArrayList permite isso.  
&nbsp;
     
&nbsp;   
**Alguns métodos nativos**
| Método      | Função
| :---        | :---
| add()       | Adiciona um elemento a um list (se usado com 2 argumentos, o primeiro indica a posição onde será feita a adição do elemento)
| clear()     | Apaga uma list
| constains() | Examina se um elemento consta em uma list
| get()       | Retorna um elemento, informada a posição em que ele se encontra
| indexOf()   | Exibe a posição de um elemento dentro de uma list 
| remove()    | Remove um elemento de uma list (pode ser informada a posição ou o elemento)
| set()       | Susbtitui elementos em uma list (o primeiro argumento é a posição onde será feita a substituição do elemento)
| size()      | Retorna a quantidade de elementos de uma list

&nbsp;
     
&nbsp; 	  
**Métodos úteis da classe Collections**
| Método            | Função
| :---              | :---	
| Collections.min() | Retorna o menor valor de uma list
| Collections.max() | Retorna o maior valor de uma list  

&nbsp;
     
&nbsp; 	  
**1 - Inicializando um ArrayList já com elementos**  
```java

List<Integer> numeros = new ArrayList<>(Arrays.asList(1,5,9,7,12,2,2));
```
&nbsp; 	

**2 - Inicializando um ArrayList vazio**
```java

List<Integer> numeros = new ArrayList<>();
```
&nbsp; 	  

**3 - Adicionando elementos à ArrayList acima**
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
*Somando todos os números de um ArrayList*
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
*Removendo números menores que 8 da ArrayList*
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
**15 - Percorrendo um array atarvés da estrutura foreach**
```java

List<Integer> numeros = new ArrayList<>(Arrays.asList(7, 8, 9, 5, 7));
		
for(Integer num : numeros){
	System.out.print(num + " ");
}
```