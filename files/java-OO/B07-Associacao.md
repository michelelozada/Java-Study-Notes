> **Associação**     
> Repositório: Java - Notas de estudo *(Java Orientado a Objetos)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**ASSOCIAÇÃO** 
&nbsp;    
Em linhas gerais, é uma relação entre duas classes que é estabelecida por meio dos seus objetos.
&nbsp;
     
&nbsp;  
**Tipos de associação:**  
&nbsp;
    
**1 - Composição**   
&nbsp;    
*"A parte só existe com o todo"*
```java 
class Endereco {
	(...)
}
```
```java 
class Pessoa {
	Endereco endereco;	
}

// Se pessoa deixa de existir, endereço não tem mais razão para existir
```
&nbsp;
     
**2 - Agregação**  
&nbsp;    
*"Uma parte pode existir sem o todo"*
```java 
class Aluno {
	(...)	
}
````
```java 
class Disciplina {
	Aluno aluno;	
}

//Se disciplina não existir, aluno continua existindo
````
&nbsp;
     
**3 - Dependência**    
&nbsp;    
*"Dependência de algo"*
```java 
class Cupom {
	(...)	
}
````
 ```java 
class Compra {
	void finalizarCompra(Cupom cupom);
	
}

// O método aqui depende da entidade de outra classe
````