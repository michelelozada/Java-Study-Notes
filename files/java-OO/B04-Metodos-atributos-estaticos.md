> **Métodos e Atributos Estáticos**     
> Repositório: Java - Notas de estudo *(Java Orientado a Objetos)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**1 - Atributos estáticos**  
- Valem para a classe como um todo e não apenas para cada instância.
- Portanto, sempre que um novo objeto for criado nesta classe, ele possuirá tais valores em seus atributos.  
&nbsp;
     
*Sintaxe básica - exemplo*  
```java
public static int nome-do-atributo;
```
&nbsp;
     
&nbsp; 
**2 - Métodos estáticos**  
- Também vigoram para a classe como um todo e não apenas para cada instância.
- Portanto, são acessados independentemente da instanciação e podem acessar outros atributos que também sejam estáticos.  
&nbsp;
     
*Sintaxe básica - exemplo*  
```java
public static int NomeDoMetodo(){
	(...)
}
```