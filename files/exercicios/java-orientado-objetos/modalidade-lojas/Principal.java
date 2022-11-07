package github.repositorio.estudo.java;

/* Utilizando o conceito de herança, apresente as informações das duas lojas do mesmo grupo/empresa apresentada, de acordo com a sua modalidade (física e virtual) */

public class Principal {
	public static void main(String[] args) {
		LojaFisica lojafisica1 = new LojaFisica("Loja XPT0", "111.111.111/0001-00", new Gerente("Luis Amorim", "amorim@xpto.com.br", 
			                     "(41) 99999-999x"), "Rua das Flores, 1234", "Curitiba");
		lojafisica1.imprimirDadosLoja();
		
		LojaVirtual lojavirtual1 = new LojaVirtual("XPT0 Comércio Eletrônico", "222.222.222/0001-00", new Gerente("Marcos Bastos", 
			                       "bastos@xptovirtual.com.br", "(41) 98888-888x"), "www.xptovirtual.com.br");
		lojavirtual1.imprimirDadosLoja();
	}
}

/*
+---------------------------------------------+
| Nome: Loja XPT0                             |
| CNPJ: 111.111.111/0001-00                   |
| Nome do gerente: Luis Amorim                |
| Email: amorim@xpto.com.br                   |
| Telefone: (41) 99999-999x                   |
| Endereço: Rua das Flores, 1234              |
| Cidade: Curitiba                            |
+---------------------------------------------+
| Nome: XPT0 Comércio Eletrônico              |
| CNPJ: 222.222.222/0001-00                   |
| Nome do gerente: Marcos Bastos              |
| Email: bastos@xptovirtual.com.br            |
| Telefone: (41) 98888-888x                   |
| Endereço eletrônico: www.xptovirtual.com.br |
+---------------------------------------------+	
*/