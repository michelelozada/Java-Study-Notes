> **Herança**     
> Repositório: Java - Notas de estudo *(Java Orientado a Objetos)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;    
**HERANÇA**   
 - É um recurso que permite que classes derivadas tenham acesso às características (atributos e métodos) de uma classe base previamente criada.
&nbsp;  
- As classes derivadas são chamadas de subclasses ou classes filhas (são herdeiras).
&nbsp;  
- Já as classes que originaram as subclasses são chamadas de superclasses ou classes mães (são herdadas).  
&nbsp;  
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
     
&nbsp;  
**Herança Múltipla**  
 - Não existe no Java, ou seja, uma subclasse não pode ter mais de uma superclasse.
 &nbsp;  