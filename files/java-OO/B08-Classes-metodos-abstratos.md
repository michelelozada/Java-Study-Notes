> **Classes e Métodos Abstratos**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;      
**1 - Classes abstratas**  
 - Não podem ser instanciadas.  
 - "Permitem criarmos métodos desprovidos de implementação, mas que obrigatoriamente devem ser implementados por suas subclasses".  
 - "Podem referenciar objetos de subclasses graças ao polimorfismo."  
&nbsp;    

*Declarando uma classe abstrata - exemplo*
```java

public abstract class NomeDaClasse {
  (...)
}
```
&nbsp;
     
&nbsp;    
**2 - Métodos abstratos**  
 - Só podem ser declarados dentro de classes abstratas.  
&nbsp;    

*Declarando um método abstrato - exemplo*
```java

public abstract void nomeDoMetodo();
```