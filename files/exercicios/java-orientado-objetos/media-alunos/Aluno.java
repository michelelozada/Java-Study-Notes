package github.repositorio.estudo.java;

public class Aluno {
	public String nome;
	public String curso;
	Avaliacao notas;	
	
	Aluno(String nome, String curso, Avaliacao notas) {
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}	
		
	public void imprimirStatus() {
		System.out.println("Aluno(a): " + nome);
		System.out.println("Curso: " + curso);
		System.out.printf("Média final: %.2f\n",notas.mediaNotas()); 
	}
}