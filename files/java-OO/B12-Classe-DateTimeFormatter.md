> **Classe LocalDate e LocalDateTime**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;  
**Classe `LocalDate`**         
- Responsável por representar datas.    
&nbsp;   

**Classe `LocalDateTime`**         
- Responsável por representar horários.    
&nbsp;   

**Classe `DateTimeFormatter`**         
- Permite a formatação de datas para as classes LocalDate e LocalDateTime.       
&nbsp;  

**Método `now()`**    
- Utilizado para obter a data atual.  
&nbsp;  

:arrow_forward: **Exemplo**  
```java

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
    
        // Para saída da data sem formatação
        LocalDate dataConsulta = LocalDate.now();
        System.out.println("A data agendada para a consulta é " + dataConsulta + ".");
        
        // Para saída da data com formatação
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataConsultaFormatada = dataConsulta.format(formatter);
        System.out.println("A data agendada para a consulta é " + dataConsultaFormatada + ".");
    }
}

/* Retorna: 
A data agendada para a consulta é 2022-11-13.
A data agendada para a consulta é 13/11/2022.	
*/
```
&nbsp;  

**Método `plusDays()`**    
- Adiciona o número de dias - informado como argumento deste método - à data atual.
&nbsp;   

:arrow_forward: **Exemplo**  
```java
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
	
        // Para saída da data atual 
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);
               
        // Para saída da data futura
        LocalDate dataFutura = dataAtual.plusDays(7);
        System.out.println("Data futura: " + dataFutura);
	}
}

/* Retorna: 
Data atual: 2022-11-14
Data futura: 2022-11-21
/*
```