> **Estrutura de Controle - If Else**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;      
```java

String status;
int media = 65;

if(media >= 70){
    status = "Aluno(a) foi aprovado(a) no curso.";
} else {
	status = "Aluno(a) ficou para recuperacao.";
}
System.out.println("Status: " + status);	

// Status: Aluno(a) ficou para recuperacao.
```		
&nbsp;
     
&nbsp;         
**Utilizando alternativamente o operador ternário para o mesmo exemplo**
```java

String status;
int media = 75;

status = (media >= 70) ? "foi aprovado(a) no curso.": "ficou para recuperacao.";
System.out.println("Status: Aluno(a) " + status);

// Status: Aluno(a) foi aprovado(a) no curso.
```
&nbsp;
     
&nbsp;  
**Estrutura else if**
```java

/* Consulta sobre alistamento eleitorial e voto */

int idade = 48;
boolean alfabetizado = true;

if(alfabetizado == true) {
	if (idade < 16) {
		System.out.println("Nao, voce ainda nao alcancou a idade minima (16 anos) para se alistar e votar.");
	} else if(idade >= 16 && idade < 18 ) {
		System.out.println("Sim, voce pode se alistar para votar (lembrando que o voto eh facultativo para sua faixa de idade).");
	} else if(idade >= 18 && idade < 70) {
		System.out.println("Sim, o voto eh obrigatorio para a sua faixa de idade.");
	} else {
		System.out.println("Sim, voce pode votar (lembrando que o voto eh facultativo para pessoas com 70 anos ou mais).");
	}
}
else {
	System.out.println("Voce declarou ser analfabeto(a) e, portanto, seu alistamento eleitoral e voto sao facultativos");
}	

// Retorna: Sim, o voto é obrigatório para a sua faixa de idade.
```