package github.repositorio.estudo.java;

/* Imprimir o status de aprovação (ou não) de alunos, de acordo com as notas e número de faltas informados */

public class Principal {
	
	public static void main(String[] args) {
		Nota aluno1 = new Nota("Enzo Marques", 8.5, 9, 5);
		aluno1.imprimirStatus();
		
		Nota aluno2 = new Nota("Laura Lemos", 7, 6.5, 8);
		aluno2.imprimirStatus();
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