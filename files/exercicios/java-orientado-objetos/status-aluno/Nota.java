package github.repositorio.estudo.java;

public class Nota {
	private double nota1;
	private double nota2;
	
	public Nota(double nota1, double nota2) {
		setNota1(nota1);
		setNota2(nota2);
	}

	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		if(nota1 < 0 || nota1 > 10) {
			System.out.println("Entrada para nota 1 é inválida");
			return;
		} 
		this.nota1 = nota1;
	}
	
	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		if(nota2 < 0 || nota2 > 10) {
			System.out.println("Entrada para nota 2 é inválida");
			return;
		}
		this.nota2 = nota2;
	}
}