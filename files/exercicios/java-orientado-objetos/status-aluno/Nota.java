package github.repositorio.estudo.java;

public class Nota {
	private String nome; 
	private double nota1;
	private double nota2;
	private int faltas;
	
	public Nota(){}
	
	public Nota(String nome, double nota1, double nota2, int faltas) {
		setNome(nome);
		setNota1(nota1);
		setNota2(nota2);
		setFaltas(faltas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		if(faltas < 0 || faltas > 30) {
			System.out.println("Entrada para número de faltas é inválido");
			return;
		}
		this.faltas = faltas;
	}

	void imprimirStatus() {
		System.out.println("Aluno(a): " + getNome());
		System.out.println("Notas obtidas: " + getNota1() + " e " + getNota2());
		double media = (nota1 + nota2)/ 2;
		System.out.println("Média final: " + media);
		System.out.println("Número de faltas: " + getFaltas());
		System.out.print("Status: ");
		if(faltas > 7) {
			System.out.println("Aluno(a) reprovado(a) por número de faltas (maior que 7)");	
		} else if(media < 4) {
			System.out.println("Aluno(a) reprovado(a) por nota");			
		} else if (media < 7) {
			System.out.println("Aluno(a) em recuperação");
		} else {
			System.out.println("Aluno(a) aprovado(a)");
		}	
	}	
}
