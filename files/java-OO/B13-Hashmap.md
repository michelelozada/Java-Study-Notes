> **Classe HashMap**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;    
 **HASHMAP**  
 - **Interface:** *List*    
 - **Pacote:** *java.util.HashMap*  
 - Caracterizado por ser uma lista de elemenetos - com chave e valor - ordenados de forma aleatória.     
 - As chaves devem ter valor único; já os valores podem ser repetidos. As chaves não podem ser alteradas; já os valores sim.     

&nbsp;

**Alguns métodos nativos**
| Método           | Observações
| :---             | :---
| clear()          | Apaga um HashMap
| containsKey()    | 
| entrySet()       | Retorno: um Set de elementos do tipo entry
| get()            | Retorna um valor, tendo sido informada a sua chave
| keySet()         | Retorno: um Set
| put(*key,value*) | Adiciona ou atualiza um elemento em um Map  
| values()         | Retorno: uma Collection

&nbsp;

**Métodos úteis da classe Collections**
| Método    | Observações
| :---      | :---	
| max()     | Retorna o maior valor de um Map  
| min()     | Retorna o menor valor de um Map
 
&nbsp;

:arrow_forward: ***Exemplos***

&nbsp;  

**1 - Inicializando um HashMap vazio**
```java

Map<String, Double> catalogoProdutos = new HashMap<>();
```
&nbsp; 	
 
**2 - Criando e adicionando elementos a um HashMap**
```java

Map<String, Double> catalogoProdutos = new HashMap<>(){{
	put("Produto 1", 14.4);
	put("Produto 2", 8.8);
	put("Produto 3", 9d);
}};	

System.out.println(catalogoProdutos.toString());

// Retorna: {Produto 1=14.4, Produto 2=8.8, Produto 3=9.0}
```
&nbsp; 	
 
**3 - Substituindo o preço do Produto 3 para R$ 15.50**
```java

catalogoProdutos.put("Produto 3", 15.50);
System.out.println(catalogoProdutos.toString());

// Retorna: {Produto 1=14.4, Produto 2=8.8, Produto 3=15.5}
```
&nbsp; 	

**4 - Conferindo se o Produto 4 *(key)* está no HashMap**
```java

System.out.println(catalogoProdutos.containsKey("Produto 4"));

// Retorna: false
```
&nbsp; 	

**5 - Exibindo o preço *(value)* do Produto 2 do HashMap**
```java
 
System.out.println(catalogoProdutos.get("Produto 2")); 

// Retorna: 8.8
```
&nbsp; 	

**6 - Exibindo todos os produtos *(keys)* existentes no HashMap**
```java

Set<String> itensProdutos = catalogoProdutos.keySet(); 
System.out.println(itensProdutos);

// Retorna: [Produto 1, Produto 2, Produto 3]
```
&nbsp; 	

**7 - Exibindo todos os preços *(values)* existentes no HashMap** 
```java

Collection<Double> valoresProdutos = catalogoProdutos.values(); 
System.out.println(valoresProdutos);
		
// Retorna: [14.4, 8.8, 9.0]
```
&nbsp; 	

**8 - Exibindo o maior e o menor preço *(value)* do HashMap**
```java

Collection<Double> valoresProdutos = catalogoProdutos.values(); 
System.out.println(valoresProdutos);
		
System.out.println(Collections.max(catalogoProdutos.values()));  // Retorna: 14.4
System.out.println(Collections.min(catalogoProdutos.values()));  // Retorna: 8.8
```
&nbsp; 	

**9 - Sabendo do maior preço *(value)* de um produto de um HashMap, retornar qual a chave do mesmo**
```java

Double maiorPreco = Collections.max(produtos.values());
Set<Map.Entry<String, Double>> entries = catalogoProdutos.entrySet();
String produtoMaiorPreco = "" ;

for(Map.Entry<String, Double> entry: entries) {
	if(entry.getValue().equals(maiorPreco)) { 
		produtoMaiorPreco = entry.getKey();
	}	
}	
System.out.printf("Menor preço: R$ %.2f\n", maiorPreco);
System.out.println("Nome produto: " + produtoMaiorPreco);

/* Retorna:
Menor preço: R$ 14,40
Nome produto: Produto 1
*/
```
&nbsp; 	

**10 - Sabendo do menor preço *(value)* de um produto de um HashMap, retornar qual a chave do mesmo**
```java

Double menorPreco = Collections.min(catalogoProdutos.values());
String produtoMenorPreco = "";

for(Map.Entry<String, Double> entry: catalogoProdutos.entrySet()) {
	if(entry.getValue().equals(menorPreco)) { 
		produtoMenorPreco = entry.getKey();
		System.out.printf("Menor preço: R$ %.2f\n", menorPreco);
		System.out.println("Nome produto: " + produtoMenorPreco);
	}
}	

/* Retorna:
Menor preço: R$ 8,80
Nome produto: Produto 2
*/

``` 
&nbsp; 	

**11 - Exibindo o valor total e o valor médio dos produtos *(values)* do HashMap**
```java
Iterator<Double> iterator = catalogoProdutos.values().iterator();
Double soma = 0d;
while(iterator.hasNext()) {
	soma += iterator.next();
}

System.out.printf("Soma: R$ %.2f", soma);
// Retorna: R$ 32,20

System.out.printf("Média: R$ %.2f", soma/catalogoProdutos.size());
// Retorna: Média: R$ 10,73
```
&nbsp; 	

**12 - Removendo um produto de preço R$ 9,00 do HashMap**
```java
Iterator<Double> iterator = catalogoProdutos.values().iterator();
while(iterator.hasNext()) {
	if(iterator.next().equals(9d)) {
		iterator.remove();
	}
}
System.out.println(catalogoProdutos);

// Retorna:  {Produto 1=14.4, Produto 2=8.8}
```
&nbsp; 	

**13 - Apagando o HashMap**
```java
produtos.clear();
System.out.println(produtos.isEmpty()); // Retorna: true
```	