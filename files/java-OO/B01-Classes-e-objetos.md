> **Classes, Objetos, Atributos e Métodos**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
:small_blue_diamond: **Classe**  
 É o projeto de um objeto.  
 Define os atributos *(as propriedades)* e os métodos *(ações ou eventos)* comuns aos objetos que serão criados a partir dela.  

<h1></h1>
&nbsp; 

:small_blue_diamond: **Objeto**     
 É criado a partir da instanciação de uma classe.  
 É uma entidade concreta ou abstrata do mundo real.  
 É único, sendo que cada objeto criado a partir de uma mesma classe estará alocado em um espaço diferente da memória.    
&nbsp;
&nbsp;     
***Exemplo:***
&nbsp;

```java
public class Principal {
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
	}
}	
```

**`Aluno aluno1`**  
 . É a declaração do objeto.         
 . A variável `aluno1` é a referência ao objeto instanciado da classe Aluno.          
&nbsp;  

**`new Aluno();`**    
 . É a criação do objeto.        
 . Esta instrução cria em memória um novo objeto da classe Aluno que passa a ser referenciado pela variável `aluno1`.      
&nbsp;  

*Portanto, o objeto é a instância de uma classe, ou seja, é a região da memória que foi alocada quando houve a sua criação.*  

<h1></h1>
&nbsp; 

:small_blue_diamond: **Atributo**  
Variável que descreve características de um objeto.  
   
<h1></h1>
&nbsp; 

:small_blue_diamond: **Método**  
Ações ou serviços que um objeto pode realizar.     

<h1></h1>
&nbsp; 

:small_blue_diamond: **Estado**  
Valores dos atributos de um objeto em um determinado momento do tempo.   
&nbsp;
&nbsp;  
**Exemplo:**  
&nbsp;

*Classe Principal*
```java
public class Principal {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.matricula= 1001;
		a.nome= "Ana";
		a.cpf= "222.222.222-22";
		a.imprimirInfoAluno();
		
		Aluno b = new Aluno();
		b.matricula = 1002;
		b.nome= "Bob";
		b.cpf= "444.444.444-44";
		b.imprimirInfoAluno();
	}
}
```
&nbsp;

*Classe Aluno*
```java
public class Aluno {
	// Definindo os atributos
	public int matricula;
	public String nome;
	public String cpf;
	
	// Definindo um método
	public void imprimirInfoAluno() {
		System.out.println("Codigo de matricula: "+ matricula); 
		System.out.println("Nome: " + nome);
		System.out.println("CPF: "+ cpf + "\n");
	}
}

/* Retorno do estado dos objetos: 

Codigo de matricula: 1001
Nome: Ana
CPF: 122.222.222-22

Codigo de matricula: 1002
Nome: Bob
CPF: 144.444.444-44
*/
```