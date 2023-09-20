> **Conceitos iniciais**  
> Repositório: Java - Notas de estudo *(Sintaxe Básica)*    
> GitHub: @michelelozada
&nbsp;
     
&nbsp;   
#### Java Virtual Machine (JVM) e o *'Write once, run anywhere'*  
\- JVM é a camada que fica entre o sistema operacional (seja ele qual for) e o código da aplicação desenvolvida.     
\- Para que haja apenas uma aplicação - ao invés de diferentes aplicações para rodar em cada S.O. específico -, essa aplicação Java rodará na JVM, que deverá estar previamente instalada no S.O.

&nbsp;  

#### Compilação 
\- É feita pelo ***javac***, o compilador do Java.  
\- A compilação é o o processo de transformação de um arquivo ***.java*** (alto nível) para um  arquivo ***.class*** (a.k.a. bytecode), sendo que este último é o arquivo que será de fato executado na JVM.  

&nbsp;  

#### JDK (Java Development Kit)  
Kit de ferramentas necesssário para a criação, compilação, execução e debugging de aplicações Java.  

&nbsp;  

#### Classificação da linguagem Java
\- Linguagem de programação compilada e interpretada  
\- Alto nível  

&nbsp;

#### Pacotes (a.k.a. package)
- Agrupam classes com características em comum  
- Trata-se de uma estrutura de diretório, sendo que as classes ficarão localizadas em uma destas pastas  
- Pacotes são criados a partir da pasta `src` e deverá constar na primeira linha do código-fonte  
- Convenção utilizada: domínio invertido + projeto + pasta. Exemplo: `com.nome-empresa.nome-projeto.nome-pasta` (nomes devem ser escritos inteiramente em letras minúsculas).  

&nbsp;

#### Comentários
- Em linha  
```java

// comentário de uma linha 
```

&nbsp;

- Multilinhas  
```java

/*
comentário de 
mais de uma 
linha 
*/
```

&nbsp;

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>