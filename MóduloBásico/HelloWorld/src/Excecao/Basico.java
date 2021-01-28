package Excecao;

public class Basico {
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);		
		} catch (Exception e) {
			System.out.println("Ocorreu um erro");
		}
		
	}
		public static void imprimirNomeDoAluno(Aluno aluno) {
			System.out.println(aluno.nome);
		}
}
					