package github.repositorio.estudo.java;

/* Imprimir o status de aprovação (ou não) de alunos, de acordo com as notas e número de faltas informados */

public class Principal {
	
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Enzo Marques", 5, new Nota(8.5, 9));
		aluno1.imprimirStatusAluno();
		
		Aluno aluno2 = new Aluno("Laura Lemos", 8, new Nota(7, 6.5));
		aluno2.imprimirStatusAluno();
	}
}

/*
+------------------------------------------------------------------+
| Aluno(a): Enzo Marques                                           |
| Notas obtidas: 8.5 e 9.0                                         |
| Média final: 8.75                                                |
| Número de faltas: 5                                              |
| Status: Aluno(a) aprovado(a)                                     |
+------------------------------------------------------------------+
| Aluno(a): Laura Lemos                                            |
| Notas obtidas: 7.0 e 6.5                                         |
| Média final: 6.75                                                |
| Número de faltas: 8                                              |
| Status: Aluno(a) reprovado(a) por número de faltas (maior que 7) |
+------------------------------------------------------------------+	
*/