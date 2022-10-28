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
- Portanto, são executados sem estarem associados a nenhuma instância e podem acessar outros atributos que também sejam estáticos.  
&nbsp;
     
*Sintaxe básica - exemplo*  
```java
public static int nomeDoMetodo(){
	(...)
}
```
&nbsp;     

**:arrow_forward: Exemplo**  
&nbsp;

***Classe Principal***
```java
public class Principal {
	public static void main(String[] args) {
		float parcela = Parcela.calcularMulta(200.00f);
		System.out.printf("Valor da parcela corrigida: R$ %.2f", parcela);
		Parcela.imprimirTaxa();
	}
}

/* Retorna:
 Valor da parcela corrigida: R$ 212,00
 Taxa aplicada para calculo multa: 6.0%
*/
```

&nbsp;

***Classe Parcela***
```java
// Criação de um atributo estático
public static float taxa = 0.06f;

// Criação de um método estático
public static float calcularMulta(float parcela) {
	return parcela + parcela * taxa;
}

// Método para impressão da taxa da multa aplicada
public static void imprimirTaxa() {
	System.out.println("\nTaxa aplicada para calculo da multa: " + (taxa * 100) +"%");
}
```