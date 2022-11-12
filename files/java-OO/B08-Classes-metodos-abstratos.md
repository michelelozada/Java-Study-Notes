> **Classes e Métodos Abstratos**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada 
&nbsp;
     
&nbsp;      
**1 - Classe abstrata**     
 - Classe genérica que serve de 'base' para a criação de classes mais específicas.  
 - Não pode ser instanciada.    
 - Permite a criação de métodos que não serão implementados ali, mas sim *obrigatoriamente* nas suas classes filhas.    
&nbsp;    

:arrow_forward: ***Declarando uma classe abstrata - exemplo***   
```java

public abstract class NomeDaClasse {
  (...)
}
```
&nbsp;
     
&nbsp;    
**2 - Método abstrato**  
 - Só pode ser declarado dentro de classes abstratas, sendo que só pode ser realmente implementado em classes filhas.  
 - Dessa forma, um método abstrato é composto pela assinatura do método e não tem parâmetros de entrada.  
&nbsp;    

:arrow_forward: ***Declarando um método abstrato - exemplos***  
&nbsp;

Classe abstrata
```java

public abstract void nomeDoMetodo1();
```
```java

public abstract double nomeDoMetodo2();
```
&nbsp; 
&nbsp;    
Classes filhas
```java

@Override
public abstract void nomeDoMetodo1(){
	(...)
}
```
```java

@Override
public abstract double nomeDoMetodo2(){
	(...)
}
```