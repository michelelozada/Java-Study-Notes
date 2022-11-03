package github.repositorio.estudo.java;

/* Criar as classes Aluno e Curso e informar os dados da parcela a pagar, informados o curso, mensalidade e taxa de desconto */

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana Lopes", 1234, 8, new Curso("Enfermagem", 850));
		aluno1.informarDadosParcela();
	}

}
/*
+----------------------------------+
| Informe de mensalidade de aluno: |
+----------------------------------+
| Nome do(a) aluno(a): Ana Lopes   |
| Número da matrícula: 1234        |
| Nome do curso: Enfermagem        |
| Valor da mensalidade: R$ 850,00  |
| Taxa de desconto concedida: 8.0% |
| Valor a pagar: R$ 782,00         |
+----------------------------------+
 */