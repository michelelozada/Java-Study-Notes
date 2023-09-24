> ***(Extra)* Introdução ao Maven**  
> Repositório: Java - Notas de estudo *(Assuntos Diversos)*  
> GitHub: @michelelozada

&nbsp;
#### O Apache Maven  
Ferramenta de automação de construção (build) e de gerenciamento de dependências em um projeto desenvolvido em Java (* trabalha com outras linguagens também).  

&nbsp;  

#### O que são dependências?  
\- São bibliotecas nativas ou de terceiros usadas no projeto.  
\- Tipos de dependência:  
  - **Dependências diretas:** As dependências que são declaradas no arquivo pom.xml  
  - **Dependências transitivas:** Dependências das dependências declaradas em pom.xml  

&nbsp;  

#### Criando um projeto Maven
\- **groupId**: agrupa e identifica diferentes artefatos Maven (normalmente é o nome da organização, escrito de forma similar à convenção da nomenclatura de pacotes do Java).  
\- **artifactId**: nome do artefato/projeto em si.  
\- **version**: versão do artefato no repositório. Tirar SNAPASHOT, quando se tratar da versão final.  
\- **packaging**: pode ser jar ou war  
\- **name** :  normalmente definido de acordo com o definido no artifactId.  
\- **description**: descrição do projeto em um texto curto.  

&nbsp;  

####  O arquivo pom.xml  
\- POM = *Project Object Model*  
\- Arquivo na raiz do projeto que contém informações sobre as configurações do projeto e sobre as dependências que estão sendo utilizadas nele.    
\- O Maven sempre procura pelo pom.xml para realizar a sua execução.  
\- É composto por tags, sendo que as tags que devem constam obrigatoriamente em POM.xml são:  
```xml

<project>
  <modelVersion>...<modelVersion>
  <groupId>...<groupId>
  <artifactId>...<artifactId>
  <version>...<version>
</project>	
```	
\- `groupId`, `artifactId` e `version` são chamados de *Maven coordinates*, pois fornecem a identidade de um projeto ou dependência.  
\- Package: é o `groupId` + `artfactId`  

&nbsp;  

#### Estrutura de diretórios criada pelo Maven
```
├── nome-do-artefato-aqui : diretório  
	└── pom.xml : arquivo de configuração do Maven  
	└── src : diretório que abriga o código-fonte do projeto  
		└── main   
			└── java : diretório com as classes Java  
			└── resources : diretório com arquivos estáticos diversos  
			└── webapp : diretório com arquivos HTML, diretório asssets,etc.  
			  └── WEB-INF : diretório  
				  └── web.xml : arquivo com configurações do projeto  
					└── index.jsp : arquivo com conteúdo HTML  
		└── test : diretório que abriga o código-fonte relativo aos testes unitários  
	└── target : diretório contendo os arquivos gerados no build do projeto (.jar ou .war)  
```

&nbsp;  

#### O que são repositórios?  
\- Locais em que são buscadas as dependências providas pelo Maven.  
\- Os repositórios podem ser locais ou remotos.  

&nbsp;  

#### O que são arquétipos *(Maven archetypes)*?  
São templates/estruturas que podem ser usadas como estrutura inicial para começar a desenvolver um projeto.  

&nbsp;  

#### Como adicionar dependências a um projeto?
Copiar o conteúdo das tags `<dependency>..</dependency>` da dependência desejada e colar entre as tags `<dependencies>..</dependencies>` do arquivo pom.xml do projeto em questão.  

&nbsp; 

```xml


<dependencies>
	<dependency>
		<groupId>junit</groupId>
		<artifactId>junit</artifactId>
		<version>3.8.1</version>
		<scope>test</scope>
	</dependency>
<dependencies>
```	
&nbsp; 

\- A tag `<scope>` é o escopo da dependência. Valores possíveis: compile (default), provided, runtime, test, system e import.  

&nbsp;  

#### Links consultados  
[Apache Commons](https://commons.apache.org/proper/commons-lang/)  
[Conhecendo melhor o Maven - artigo da Alura](https://www.alura.com.br/artigos/conhecendo-melhor-maven)  
[Documentação do Maven](https://maven.apache.org/guides/)  
[Introdução ao Maven - artigo da DevMedia](https://www.devmedia.com.br/introducao-ao-maven/25128)  
[Maven Repository](https://mvnrepository.com/)  
[Maven - Site oficial](https://maven.apache.org/)  

&nbsp;  

<div align="center">
<a href="https://github.com/michelelozada/Java-Study-Notes">[Voltar à tela inicial do repositório]</a>
</div>