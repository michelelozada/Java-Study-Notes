> **Polimorfismo**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**POLIMORFISMO** 
&nbsp;    
Em linhas gerais, é a possibilidade que um método tem de se comportar de formas diferentes.
&nbsp;
     
&nbsp;  
**Tipos de polimorfismo:**  
&nbsp;
     
**- Polimorfismo de Overloading (também chamado de sobrecarga)**   
 Ocorre quando métodos de mesmo nome recebem diferentes parâmetros de entrada, o que faz com que códigos diferentes sejam executados.  
  ```java 
  int calcularArea(int lado1, int lado2); 
  int calcularArea(int lado1, int lado2, int lado3);
  ```
&nbsp;
     
**- Polimorfismo de Coerção**    
 Ocorre quando é feita a conversão de um tipo de dado para outro, sendo o *type casting* um tipo de coerção explícita.
   ```java 
   int exemplo = (int) 30.5;
   ```
&nbsp;
     
**- Polimorfismo de Subtipagem**   
 Ocorre quando uma classe-filha reimplementa o método da sua classe-mãe, porém com um outro comportamento.
&nbsp;
     
&nbsp;  
**- Polimorfismo Paramétrico**  
 Ocorre quando um método é escrito de uma maneira genérica, que funciona da mesma forma para diferentes tipos de dados. 