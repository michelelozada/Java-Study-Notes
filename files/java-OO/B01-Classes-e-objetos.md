> **Classes, Objetos, Atributos e Métodos**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**Classe**  
 - É o projeto de um objeto.  
 - Define os atributos *(as propriedades)* e os métodos *(ações ou eventos)* comuns aos objetos que serão criados a partir dela.  
&nbsp;    	

**Objeto**     
 - É criado a partir da instanciação de uma classe.  
 - É uma entidade concreta ou abstrata do mundo real.  
 - É único, sendo que cada objeto criado a partir de uma mesma classe estará alocado em um espaço diferente da memória.    
&nbsp;    

**Atributo**
 - Variável que descreve o objeto e que está declarada dentro do corpo da classe.  
&nbsp;   

**Método**
 - "Função associada à classe que executa relativamente aos objetos aos quais está ligada".  
 &nbsp;    

**Estado**
 - Valores dos atributos de um objeto em um determinado momento do tempo.   
&nbsp;
     
&nbsp;  
**:arrow_forward: Exemplo:**  
&nbsp;

***Classe Principal***
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

***Classe Aluno***
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