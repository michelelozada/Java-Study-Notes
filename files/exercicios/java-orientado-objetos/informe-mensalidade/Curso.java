package github.repositorio.estudo.java;

public class Curso {
	String nome;
	double mensalidade;
		
	public Curso(String nome, double mensalidade) {
		this.nome = nome;
		this.mensalidade = mensalidade;
	}

	public void descreverCurso() {
		System.out.println("Nome do curso: " + nome);
		System.out.printf("Valor da mensalidade: R$ %.2f\n", mensalidade);
	}
}
