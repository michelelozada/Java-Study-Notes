> **Herança**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;    
**HERANÇA**   
 - É um recurso que permite que classes derivadas recebam as características (atributos e métodos) de uma classe base previamente criada.
&nbsp;  
- As classes derivadas são chamadas de subclasses ou classes filhas *(são herdeiras)*.
&nbsp;  
- Já as classes que originaram as subclasses são chamadas de superclasses ou classes mães *(são herdadas)*.  
&nbsp;
     
&nbsp;  
**Comando `extends`**      
 - Representa a relação de herança, indicando qual é a superclasse de uma subclasse.
&nbsp;  
&nbsp;  

*Superclasse Funcionario*
```java
class Funcionario {
	(...)
}
```
&nbsp;  

*Subclasse Vendedor*  
```java
class Vendedor extends Funcionario {
	(...)
}
```
&nbsp;
     
**Herança Múltipla**  
 - Não existe no Java, ou seja, uma subclasse não pode ter mais de uma superclasse.  
&nbsp;
     
**Palavra-chave `super`**   
 - Utilizado com atributos ou métodos na classe-filha, faz referência a atributos e métodos de sua classe-mãe.  
&nbsp;
     
**Método construtor**   
 - Não é herdado.  
 - As classes-filhas invocam os métodos da classe-mãe e, se for o caso, incluem ali os atributos de sua própria classe.  
 - Representado pela inclusão de `super()` no corpo do método construtor da(s) classe(s)-filha(s).