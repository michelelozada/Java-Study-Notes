package github.repositorio.estudo.java;

public class Parcelamento {
	
	public static double getTaxaJuros(){
		return 0.06;
	}
	
	public static void simularValor(double valorProduto, int qtdadeparcelas) {
		System.out.println("\n-- Dados iniciais --");
		if (qtdadeparcelas < 0 ||  qtdadeparcelas  > 12) {
			System.out.printf("> Atenção: Essa quantidade de parcelas não é válida (parcelamento permitido: de 2 a 12 parcelas).\n");
		}
		
		else {
			System.out.printf("Valor do produto: R$ %.2f\n", valorProduto);
			System.out.println("Quantidade de parcelas pretendida: " + qtdadeparcelas);
			System.out.println("Taxa de juros para compras a prazo: " + (getTaxaJuros() * 100) + "%");
			
			System.out.println("\n-- Resultado da simulação para compra a prazo --");
			
			double acrescimo = getTaxaJuros() * (valorProduto/qtdadeparcelas);
			System.out.printf("Valor do acréscimo mensal: R$ %.2f", acrescimo);
			
			double valorPrestacao = (valorProduto/qtdadeparcelas) + acrescimo;
			System.out.printf("\nValor da prestação mensal: R$ %.2f", valorPrestacao);
			
			double valorJuros = acrescimo * qtdadeparcelas;
			System.out.printf("\nValor total dos acréscimos: R$ %.2f", valorJuros);
						
			double valorFinal = valorProduto + valorJuros;
			System.out.printf("\nValor do produto à prazo: R$ %.2f", valorFinal);
		} 
	}	
}	

+--------------------------------------------------+
|              SIMULADOR DE PARCELAS               |
+--------------------------------------------------+
| Por favor, digite o valor do produto (em R$):    |
| 1000                                             |
| Deseja parcelá-lo em quantas vezes?              |
| 5                                                |
+--------------------------------------------------+
| -- Dados iniciais --                             |
| Valor do produto: R$ 1000,00                     |
| Quantidade de parcelas pretendida: 5             |
| Taxa de juros para compras a prazo: 6.0%         |
+--------------------------------------------------+
| -- Resultado da simulação para compra a prazo -- |
| Valor do acréscimo mensal: R$ 12,00              |
| Valor da prestação mensal: R$ 212,00             |
| Valor total dos acréscimos: R$ 60,00             |
| Valor do produto à prazo: R$ 1060,00             |
+--------------------------------------------------+