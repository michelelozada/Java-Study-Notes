package github.repositorio.estudo.java;

public class Curso {
	public String nome;
	public double mensalidade;
		
	public Curso(String nome, double mensalidade) {
		this.nome = nome;
		this.mensalidade = mensalidade;
	}

	public void identificarCurso() {
		System.out.println("Nome do curso: " + nome);
		System.out.printf("Valor da mensalidade: R$ %.2f\n", mensalidade);
	}
}
