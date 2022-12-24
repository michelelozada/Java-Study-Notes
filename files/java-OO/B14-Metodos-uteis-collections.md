> **Métodos e Padrões para Collections**  
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;          
**1 - Retornando uma lista de tamanho fixo a partir de um array: método `Arrays.asList()`**
```java

String[] legumes = new String[]{"abóbora", "beterraba", "cenoura", "ervilha"};
List<String> listaLegumes = Arrays.asList(legumes);
System.out.println("Lista de legumes: " + listaLegumes);

// Retorna => Lista de legumes: [abóbora, beterraba, cenoura, ervilha]
```
&nbsp;
&nbsp;        
**2 - Criando lists e sets imutáveis (vazios ou não): metodo `of()`**

*2.1 - Criando um List vazio*  
```java

List<String> listaFrutas = List.of();
System.out.println("Lista de frutas: " + listaFrutas);

// Retorna => Lista de frutas: []
```
&nbsp;
&nbsp;    
*2.2 - Criando um Set populado*
```java

Set<String> listaLegumes = Set.of("abóbora", "beterraba", "cenoura", "ervilha");
System.out.println("Lista de legumes: " + listaLegumes);

// Retorna => Lista de legumes: [abóbora, beterraba, cenoura, ervilha]
```
&nbsp;
&nbsp;    
**3 - Iterator**  
É um padrão que permite a navegação pelos dados, independentemente de qual Collection está sendo utilizada.   
&nbsp;

| Principais métodos | Função                                        |
| :---               | :---                                          |
| iterator()         |                                               |
| next()             | Faz com que o iterator vá para o próximo item | 
| hasNext()          | Verifica se existe um próximo item            |

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>