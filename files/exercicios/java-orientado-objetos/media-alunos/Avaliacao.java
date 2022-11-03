package github.repositorio.estudo.java;

public class Avaliacao {
	double nota1, nota2, nota3;
	
	Avaliacao(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double mediaNotas() {
		return (nota1 + nota2 + nota3)/3;
	}
}