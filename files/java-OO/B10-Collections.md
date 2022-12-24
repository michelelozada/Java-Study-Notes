> **Collections**     
> Repositório: Java - Notas de estudo *(Classes)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;       
:small_blue_diamond: **Coleção *(Collection)***    

 Em Java, uma coleção é uma estrutura de dados que permite armazenar vários objetos nesta única unidade, sendo a coleção também considerada um objeto.  
 
<h1></h1>
&nbsp; 

:small_blue_diamond: **java.util.Collection**   

 É uma interface que possui as subinterfaces **`List`**, **`Set`** e **`Queue`** (note, porém, que não possui a subinterface **`Map`**).   
 
 <h1></h1>
 &nbsp; 
 
:small_blue_diamond: **Características das interfaces:**   

| Nome  | Interface         | Definição geral
| :---  | :---              | :---
| List  | *java.util.List*  | Lista de elementos armazenada de acordo com ordem em que estes foram adicionados e que permite repetição de elementos
| Set   | *java.util.Set*   | Lista de elementos únicos (pois não admite sua repetição)
| Map   | *java.util.Map*   | Lista com chave e valor, sendo que a chave deve ser única  
| Queue | *java.util.Queue* | Estrutura de dados linear que segue o princípio First-In, First-Out

&nbsp;   
***Observações:***    
 - List possui índice; Set não possui índice.  
 - A busca em Set pode ser mais rápida que em List.  
 
 <h1></h1>
 &nbsp;    
 
:one: **Classes que implementam a interface List**    	
&nbsp; 

| Classe     | Definição geral |
| :---       | :---            |
| ArrayList  | Implementa uma List de elemetnos cujo tamanho pode variar | 
| LinkedList | Implementa uma List de elementos sob a forma de uma lista ligada |
| Vector     |  | 

&nbsp;  

***Observações:***    
 - Para quando a tônica for por operações de busca por elementos -> preferir ArrayList *(a busca é mais lenta com LinkedList)*  
 - Para quando a tônica for por operações de inserção e remoção -> preferir LinkedList *(operações são mais lentas com ArrayList)*  

<h1></h1>
&nbsp;    
 
:two: **Classes que implementam a interface Set**
&nbsp; 

| Classe        | Definição geral |
| :---          | :---            |
| HashSet       | Este tipo de Set não mantém nenhuma ordem de elementos (obs: não há repetição de elementos)  
| LinkedHashSet | Este tipo de Set respeita a ordem de inserção dos elementos (obs: não há repetição de elementos)    
| TreeSet       | Este tipo de Set ordena os elementos de acordo com o `Compartator` fornecido. Caso contrário, elementos deste Set respeitarão a ordem ascendente/natural (obs: não há repetição de elementos).      

&nbsp; 
   
***Observação:***    
 - HashSet oferece melhor desempenho, seguido pelo LinkedHashSet e depois pelo TreeSet.  
 
<h1></h1>
&nbsp;    

:three: **Classes que implementam a interface Map** 
&nbsp; 

| Classe        | Definição geral |
| :---          | :---            |
| Hashtable     |   
| HashMap       | Este tipo de Map não mantém nenhuma ordem de elementos 
| LikedHashMap  | Este tipo de Map respeita a ordem de inserção dos elementos
| TreeMap	    | Este tipo de Map respeita a ordem ascendente/natural, que é dada pela chave  

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>