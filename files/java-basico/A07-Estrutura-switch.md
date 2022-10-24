> **Estrutura de Controle - Switch**  
> Repositório: Java - Notas de estudo (Sintaxe Básica)  
> GitHub: @michelelozada
&nbsp;
     
&nbsp;     
Ideal para casos em que apenas uma variável está sendo analisada
```java

int numero = 3;
	
switch(numero) {
case 1:
case 2:
case 3:
	System.out.println("Um dos 3 primeiros numeros");
	break; 		
case 4:
	System.out.println("Numero 4");
	break; 		
case 5:
	System.out.println("Numero 5");
	break; 		
default:
	System.out.println("Este valor eh inválido");
	break; 		
}
```
&nbsp;
&nbsp;   
```java 
	
int mes = 4;
	
switch(mes){
case(1):	
case(7):
case(12):
	System.out.println("Escola em ferias");
	break;
default:
	System.out.println("Escola funciona normalmente");
	break;	
}	

// Retorna: Escola funciona normalmente
```