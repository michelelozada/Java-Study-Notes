> **Classe HashSet**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;    
**HASHSET**    
 - **Interface:** *List*       
 - **Pacote:** *java.util.Set*      
 - Caracterizado por ser uma lista com ordenação aleatória, sendo vedada a repetição de elementos ali.      
 - Em um HashSet não é possível trabalhar com índices/posições.    
  
&nbsp;  
     
**Alguns métodos nativos**
| Método     | Função
| :---       | :---	
| clear()    | Apaga um HashSet
| contains() | Examina se um elemento consta em um HashSet
| remove()   | Remove um elemento de um HashSet 
| size()     | Retorna a quantidade de elementos em um HashSet

&nbsp;  

**Métodos úteis da classe Collections**
| Método    | Função
| :---      | :---	
| max()     | Retorna o maior valor de um Set  
| min()     | Retorna o menor valor de um Set

&nbsp;

:arrow_forward: ***Exemplos***

&nbsp;  

**1 - Inicializando um HashSet já com elementos**    
```java

Set<Integer> numeros = new HashSet<>(Arrays.asList(1, 20, 9, 9, 15, 2, 2));
System.out.println(numeros.toString());

// Retorna: [1, 2, 20, 9, 15]
```
&nbsp; 	

**2 - Conferindo se o número 12 está no HashSet acima**
```java

System.out.println(numeros.contains(12));

// Retorna: false
```
&nbsp; 	

**3 - Exibindo o maior e o menor número do HashSet**
```java

System.out.println(Collections.max(numeros));  // Retorna: 20
System.out.println(Collections.min(numeros));  // Retorna: 1
```
&nbsp; 	  

**4 - Removendo um elemento do HashSet**
```java
numeros.remove(2);
System.out.println(numeros);

// Retorna: [1, 20, 9, 15]
```
&nbsp;

**5 - Utilizando o método iterator**  

&nbsp;

*5.1 - Obtendo a média dos números em um HashSet*
```java

System.out.println(numeros);
// Retorna: [1, 2, 20, 9, 15]

int soma = 0;
// Chamando o método iterator
Iterator<Integer> iterator = numeros.iterator();
while(iterator.hasNext()) {
	int next = iterator.next();
	soma += next;
}

// Resultado da soma 
System.out.println(soma);
// Retorna: 47 (Observação: considera apenas os números não repetidos)

// Resultado da média
System.out.println(soma/numeros.size());
// Retorna: 9 

```
&nbsp;
     
*5.2 - Removendo números menores que 10 do HashSet*
```java

System.out.println(numeros);
// Retorna: [1, 2, 20, 9, 15]

Iterator<Integer> iterator = numeros.iterator();
	while(iterator.hasNext()) {
		int next = iterator.next();
		if(next < 10) {
			iterator.remove();
		}
	}
System.out.println(numeros.toString());

// Retorna: [20, 15]
```
&nbsp; 	

**6 - Apagando o HashSet**
```java

numeros.clear();
System.out.println(numeros); // Retorna: []
System.out.println(numeros.isEmpty()); // Retorna: true
```

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>