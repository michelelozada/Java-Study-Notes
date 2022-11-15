> **Collections**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;       
**COLLECTIONS**    
 - "Conjunto de classes que implementam diferentes estruturas de dados".      
 - "Essas estruturas são encapsuladas respeitando uma mesmo acordo (interface)".   
 - Nestas estruturas de dados, "objetos são armazenados e podem ser iterados".   
 &nbsp; 

**java.util.Collection**   
 - É uma interface que possui as subinterfaces **`List`**, **`Set`** e **`Queue`** (note que não possui a subinterface **`Map`**).   
 &nbsp; 
  
:small_blue_diamond: **Características das interfaces:**   

| Nome  | Interface         | Definição geral
| :---  | :---              | :---
| List  | *java.util.List*  | Lista de elementos ordenada (de acordo com ordem em que foram adicionados) e que permite sua repetição 
| Set   | *java.util.Set*   | Lista de elementos únicos (pois não admite sua repetição)
| Map   | *java.util.Map*   | Lista com chave e valor, sendo que a chave deve ser única  
| Queue | *java.util.Queue* | Estrutura de dados linear que segue o princípio First-In, First-Out

&nbsp;   
***Observações***    
 - List possui índice; Set não possui índice.  
 - A busca em Set pode ser mais rápida que em List.  
&nbsp; 

&nbsp;      
:small_blue_diamond: **As interfaces possuem classes que as implementam, sendo elas:**  
&nbsp; 
 
**1- Da interface List**    	

| Classe     | Definição geral |
| :---       | :---            |
| ArrayList  | Implementa uma lista de elemetnos cujo tamanho pode variar | 
| LinkedList | Implementa uma lista de elementos sob a forma de uma lista ligada |
| Vector     |  | 

&nbsp; 

| Principais métodos para List |
| :---                         |
| add()                        |
| get()                        |
| indexOf()                    |
| remove()                     |
| set()                        |

&nbsp;   
***Observações:***    
 - Para quando a tônica for por operações de busca por elementos -> preferir ArrayList *(busca mais lenta com LinkedList)*  
 - Para quando a tônica for por operações de inserção e remoção -> preferir LinkedList *(operações mais lentas com ArrayList)*  
&nbsp; 
	
**2 - Da interface Set**

| Classe        | Definição geral |
| :---          | :---            |
| HashSet       | "Conjunto de elementos organizados por meio de uma função Hash"  
| LinkedHashSet | 
| TreeSet       | "Baseada em árvore binária de busca balanceada"   

&nbsp; 

| Principais métodos para Set |
| :---                        |
| add()                       |
| addAll()                    |
| contains()                  |
| remove()                    |
| removeAll()                 |
| retainsAll()                |

&nbsp; 	
	
**3 - Da interface Map** 

| Classe        | Definição geral |
| :---          | :---            |
| Hashtable     |   
| HashMap       | "Indexados por chaves. Possível mapear um ID de um tipo qualquer."  |
| LikedHashMap  | "Combinação de tabela de hashing e lista ligada" |
| TreeMap	    | "Baseada em árvore binária de busca balanceada"  |

&nbsp; 	   	
 
| Principais métodos para Map   | 
| :---                          |
| clear()                       |
| contains()                    |
| get()                         |
| isEmpty()                     |
| put()                         |
| putAll()                      |
| remove()                      |
| size()                        |

&nbsp; 		
	
:small_blue_diamond: **Interface Iterator**  
É um recurso que permite a navegação pelos dados, independentemente de qual Collection está sendo utilizada.   
&nbsp;

| Principais métodos | Função                                        |
| :---               | :---                                          |
| iterator()         |                                               |
| next()             | Faz com que o iterator vá para o próximo item | 
| hasNext()          | Verifica se existe um próximo item            |