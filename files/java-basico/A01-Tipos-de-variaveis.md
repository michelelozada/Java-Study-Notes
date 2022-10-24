> **Tipos de Variáveis**     
> Repositório: Java - Notas de estudo (Sintaxe Básica)  
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
O Java possui dois tipos de dados: **tipos primitivos** e **tipos por referência**
&nbsp;
     
&nbsp;  
**Tipos primitivos (primitive types):**
 - int 
 - float
 - double
 - char
 - boolean
 - byte 
 - short 
 - long
&nbsp;
     
&nbsp;  
**Tipos por referência:**
 - Strings
 - Arrays Primitivos
 - Objetos
&nbsp;
     
&nbsp;  
**Declarando variáveis:**
```java
String nome; 
int idade; 
float peso;
char sexo;
boolean vacinado;
```
```java
String nome = "Enzo";
int idade = 10;
float peso = 31.5f;
char sexo = 'M'; 
boolean vacinado = true;
```

&nbsp;
&nbsp;  
**Notas:**  
 - Aspas simples não são utilizadas para Strings; apenas para dados do tipo char.  
 - Tipo double é mais preciso, porém ocupa mais espaço na memória (8 bytes).  
 - Tipo float é mais econômico (4 bytes). Deve-se colocar `f` no fim da variável para indicar tipo float.  