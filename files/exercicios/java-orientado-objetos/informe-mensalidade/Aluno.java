package github.repositorio.estudo.java;

public class Aluno {
	String nome;
	int matricula;
	double taxaDesconto;
	Curso curso;
		
	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.taxaDesconto = desconto;
		this.curso = curso;
	}

	public void informarDadosParcela() {
		System.out.println("Informe de mensalidade de aluno:");
		System.out.println("Nome do(a) aluno(a): " + nome);
		System.out.println("Número da matrícula: " + matricula);
		curso.descreverCurso();
		System.out.println("Taxa de desconto concedida: " + taxaDesconto + "%");
		System.out.printf("Valor a pagar: R$ %.2f", calcularParcela());
	}
	
	public double calcularParcela() {
		double pagamento = curso.mensalidade - (taxaDesconto/100)*curso.mensalidade;
		return pagamento;
	}	
}
