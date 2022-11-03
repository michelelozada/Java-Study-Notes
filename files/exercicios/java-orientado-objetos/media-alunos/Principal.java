package github.repositorio.estudo.java;

/* Criar as classes Aluno, Avaliaçõe e Notas e apresentar a média final de alunos a serem informados */

public class Principal {
	
	public static void main(String[] args) {
		Avaliacao avaliacaoA1 = new Avaliacao(9,10,3);
		Aluno a1 = new Aluno("Marcos Reis","Odontologia", avaliacaoA1);
	
		Aluno a2 = new Aluno("Luana Lemos", "Medicina", new Avaliacao(8,9.5,9.8));

		a1.imprimirStatus();
		a2.imprimirStatus();	
	}
}
/* Retorna:
Aluno(a): Marcos Lemos
Curso: Odontologia
Média final: 7,33
 
Aluno(a): Luana Borba
Curso: Medicina
Média final: 9,10 
*/