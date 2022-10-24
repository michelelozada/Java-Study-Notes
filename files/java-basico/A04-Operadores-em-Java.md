> **Operadores em Java**  
> Repositório: Java - Notas de estudo (Sintaxe Básica)  
> GitHub: @michelelozada
&nbsp;
     
&nbsp;      
#### 1 - Operadores de atribuição
| Operador | Conceito                     |
| :---:    | :---                         |
| `=`      | Atribui valor a uma variável |

&nbsp;
&nbsp;    
#### 2 - Operadores aritméticos
| Operador | Conceito      |
| :---:     | :---         |
| `+`      | Soma          |
| `-`      | Subtração     |
| `x`      | Multiplicação |
| `\`      | Divisão       |
| `%`      | Módulo        |

&nbsp;
&nbsp;     
```java

int resultado;
resultado = 4/3; 
System.out.println(resultado);  // Retorna: 1 

float resultado2;
resultado2 = 4/3; 
System.out.println(resultado2); // Retorna: 1.0 
```
- *Para cálculo de potência e raiz quadrada, consultar Funções Matemáticas*

&nbsp;
&nbsp;    
#### 3 - Operadores unários
| Operador | Conceito                        |
| :---:    | :---                            |
| `+`      | Operador de valor positivo      |
| `-`      | Operador de valor negativo      |
| `++`     | Operador de incremento de valor |
| `--`     | Operador de decremento de valor |
| `!`      | Operador lógico de negação      |

&nbsp;
&nbsp;    
**Pós-incremento**
```java

int numero = 10;
System.out.println(numero ++); // Retorna: 10
System.out.println(numero); // Retorna: 11

numero = 5;
System.out.println(numero --); // Retorna: 5
System.out.println(numero); // Retorna: 4
```      
&nbsp;
&nbsp;    
**Pré-incremento**
```java

numero = 5;
System.out.println(++ numero); // Retorna: 6

numero = 2;
System.out.println(-- numero); // Retorna: 1
```
&nbsp;
&nbsp;    
**Uso do operador unário de negação vs. operador lógico de negação**
```java
boolean vacinado = true;

// Uso do operador unário de negação
System.out.println(!vacinado); // Retorna: false
System.out.println(vacinado); // Retorna: true

// Uso do operador lógico de negação
vacinado = !vacinado;
System.out.println(vacinado); // Retorna: false
```
&nbsp;
&nbsp;    
**Uso do operador unário de valor negativo**
```java

int numero = 10;

System.out.println(-numero); // Retorna: -10
System.out.println(numero); // Retorna: 10

// Transformando para um valor negativo de fato
numero *= -1;
System.out.println(numero); // Retorna: -10
```

&nbsp;
&nbsp;         
#### 4 - Operadores relacionais
| Operador | Conceito       |
| :---:    | :---           |
| `==`     | Igualdade      |
| `!=`     | Diferença      |
| `>`      | Maior          |
| `>=`     | Maior ou igual |
| `<`      | Menor          |
| `<=`     | Menor ou igual |

&nbsp;
&nbsp;    
**Notas:**
 - Valores dos tipos string apenas podem ser comparados entre si enquanto similares ou diferentes (demais 
operadores relacionais não se aplicam a eles). O mesmo acontece com valores do tipo boolean. 
 - Valores de diferentes tipos numéricos podem ser comparados entre si, como px. um int com um float.
 - Valores do tipo string não podem ser comparado com valores do tipo char (char é, na verdade, um arquivo numérico)

&nbsp;
&nbsp;   
#### 5 - Operadores lógicos
*Para operandos que são valores lógicos ou expressões que retornam valores lógicos*
&nbsp;
&nbsp;    
| Operador | Conceito                           |
| :---:    | :---                               |
| `&&`     | Operador and (conjunção)           | 
|  \|\|    | Operador or (disjunção)            | 
| `!`      | Operador not (negação)             |
| `^`      | Operador xor (disjunção exclusiva) | 

&nbsp;
&nbsp;   
#### 6 - Operador ternário
```java

String status;
int media = 75;

status = (media >= 70) ? "foi aprovado(a) no curso.": "ficou para recuperacao.";
System.out.println("Status: Aluno(a) " + status);

// Status: Aluno(a) foi aprovado(a) no curso.
```