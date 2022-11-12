> **Enumeradores (Enum)**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**ENUMERADORES (ENUM)**
- Maneira de representar um grupo de constantes.   
&nbsp; 

*Sintaxe básica*
```java

enum Estacao
{
    PRIMAVERA, 
    VERÃO, 
    OUTONO, 
    INVERNO;
}
  
public class Main {
    public static void main(String[] args) {
        Estacao e3 = Estacao.OUTONO;
        System.out.print("Nome da estação: " + e3);

    }
}

// Retorna => Nome da estação: OUTONO
```