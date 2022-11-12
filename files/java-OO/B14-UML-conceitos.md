> ***(Extra)* Alguns Conceitos de UML**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**Principais tipos de relacionamentos no Diagrama de Classes:**  
&nbsp;

- **Associação**  
  - Referente ao vínculo entre duas classes.    
  - A multiplicidade (ex: 0..1, 1..1, 0..*)  indica quantos objetos de cada classe podem existir no relacionamento entre elas.  
  - No diagrama de classes, este tipo de relacionamento é representado por uma linha direcionada de uma classe a outra.   
&nbsp;

- **Agregação**  
  - Quando uma classe representa o 'todo' e outra classe que representa a 'parte'.   
  - No diagrama de classes, este tipo de relacionamento é representado por uma linha com um losango 'vazio' numa das extremidades (conectado à classe que representa o 'todo').  
&nbsp;

- **Composição**   
  - Quando uma classe representa o 'todo' e outra classe que representa a 'parte', sendo que a parte não existe sem o todo.  
  - No diagrama de classes, este tipo de relacionamento é representado por uma linha com um losango 'preenchido' numa das extremidades (conectado numa das extremidades (conectado à classe que representa o 'todo').  
&nbsp;

- **Herança**   
  - Quando os métodos e atributos de uma classe se baseiam (são herdados) de outra classe.	
  - No diagrama de classes, este tipo de relacionamento é representado por linhas com um triângulo 'vazio' numa das extremidades (conectado com a classe-mãe).  
&nbsp;

- **Dependência**  
  - Quando há o relacionamento fraco entre duas classes.  
  - No diagrama de classes este tipo de relacionamento é representado por uma linha tracejada com uma seta na ponta numa das extremidades (conectado com a classe dependente).  