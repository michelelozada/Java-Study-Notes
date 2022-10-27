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
**2 - Comparando duas strings: método `equals()`**  
```java
String nome1= "Victoria";
String nome2= "Victor";
System.out.println(nome1.equals(nome2)); // Retorna: false
```
&nbsp;
     
&nbsp;    
**3 - Obtendo o comprimento de uma string: método `length()`**
```java
String nome = "Mariana";
int tamanhoString = nome.length();
System.out.println(tamanhoString);  // Retorna: 7
```
&nbsp;
     
&nbsp;     
**4 - Convertendo uma string para maiúsculas: método `toUpperCase()`**
```java
String txt = "hello world";
System.out.println(txt.toUpperCase());  // Retorna: HELLO WORLD
```
&nbsp;
     
&nbsp;     
**5 - Convertendo uma string para minúsculas: método `toLowerCase()`**
```java
String txt = "HELLO WORLD";
System.out.println(txt.toLowerCase());  // Retorna: hello world
```
&nbsp;
     
&nbsp;    
**6 - Procurando pela primeira ocorrência de um caracter/caracteres em uma string: método `indexOf()`**    
```java
String txt = "Hello World";
System.out.println(txt.indexOf("o"));  // Retorna: 4
```
&nbsp;
     
&nbsp;    
**7 - Procurando pela última ocorrência de um caracter/caracteres em uma string: método `lastIndexOf()`**    
```java
String txt = "Hello World";
System.out.println(txt.lastIndexOf("l"));  // Retorna: 9
```