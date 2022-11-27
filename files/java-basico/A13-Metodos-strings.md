> **Métodos para Strings**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;           
**1 - Acrescentando uma string ao final de outra string: método `concat()`**  
```java

String nome = "Harry";
String sobrenome = "Potter";
String nomeCompleto = nome.concat(" ").concat(sobrenome);
System.out.println("O nome completo eh " + nomeCompleto);

// Retorna: O nome completo eh Harry Potter
```
&nbsp;
     
&nbsp; 
**2 - Verificando se uma string contém uma sequência de valores especificados: método `constains()`**    
```java
String nome1 = "Victoria";
String nome2 = "Victor";
System.out.println(nome1.contains(nome2)); // Retorna: true
```
&nbsp;
     
&nbsp;    
**3 - Comparando duas strings: método `equals()`**  
```java
String nome1= "Victoria";
String nome2= "Victor";
System.out.println(nome1.equals(nome2)); // Retorna: false
```
&nbsp;
     
&nbsp;    
**4 - Comparando se duas strings são iguais, ignorando diferenças entre maiúsculas e minúsculas: método `equalsIgnoreCase()`**  
```java
String fruta1 = "laranja";
    	
String fruta2 = "Laranja";
System.out.println(fruta1.equalsIgnoreCase(fruta2)); // Retorna: true 
System.out.println(fruta1.equals(fruta2)); // Retorna: false
```
&nbsp;
     
&nbsp;    
**5 - Obtendo o comprimento de uma string: método `length()`**  
```java
String nome = "Mariana";
int tamanhoString = nome.length();
System.out.println(tamanhoString);  // Retorna: 7
```
&nbsp;
     
&nbsp;       
**6 - Convertendo uma string para maiúsculas: método `toUpperCase()`**  
```java
String txt = "hello world";
System.out.println(txt.toUpperCase());  // Retorna: HELLO WORLD
```
&nbsp;
     
&nbsp;     
**7 - Convertendo uma string para minúsculas: método `toLowerCase()`**  
```java
String txt = "HELLO WORLD";
System.out.println(txt.toLowerCase());  // Retorna: hello world
```
&nbsp;
     
&nbsp;      
**8 - Retornando um caractere através do índice informado: método `charAt()`**  
```java

String fruta = "framboesa";

char caractere = fruta.charAt(4);
System.out.println(caractere); // Retorna: b

caractere = fruta.charAt(fruta.length() -1);
System.out.println(caractere); // Retorna: a
```
&nbsp;
     
&nbsp;    
**9 - Procurando pela primeira ocorrência de um caracter/caracteres em uma string: método `indexOf()`**  
```java
String txt = "Hello World";
System.out.println(txt.indexOf("o"));  // Retorna: 4
```
&nbsp;
     
&nbsp;     
**10 - Procurando pela última ocorrência de um caracter/caracteres em uma string: método `lastIndexOf()`**  
```java
String txt = "Hello World";
System.out.println(txt.lastIndexOf("l"));  // Retorna: 9
```
&nbsp;
     
&nbsp;     
**11 - Checando se uma string está vazia ou não: método `isEmpty()`**  
```java
String txt1 = "Hello World";
String txt2 = "";
System.out.println(txt1.isEmpty());  // Retorna: false
System.out.println(txt2.isEmpty());  // Retorna: true
```
&nbsp;
     
&nbsp;     
**12 - Dividindo uma string e armazenando seus caracteres num array: metodo `split();`**  
```java
String palavra = "Curitiba";
String[] arrayDeLetras = palavra.split("");
String teste1 = arrayDeLetras[0];
System.out.println(teste1); // Retorna: C
    	
String teste2 = arrayDeLetras[arrayDeLetras.length -1];
System.out.println(teste2); // Retorna: a
```