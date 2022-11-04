package github.repositorio.estudo.java;

public class Aluno {
	private String nome; 
	private int faltas;
	private Nota nota;
	
	public Aluno(String nome, int faltas, Nota nota) {
		setNome(nome);
		setFaltas(faltas);
		this.nota = nota;
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	void imprimirStatusAluno() {
		System.out.println("Aluno(a): " + getNome());
		System.out.println("Notas obtidas: " + nota.getNota1() + " e " + nota.getNota2());
		double media = (nota.getNota1() + nota.getNota2())/ 2;
		System.out.println("Média final: " + media);
		System.out.println("Número de faltas: " + getFaltas());
		System.out.print("Status: ");
		if(getFaltas() > 7) {
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