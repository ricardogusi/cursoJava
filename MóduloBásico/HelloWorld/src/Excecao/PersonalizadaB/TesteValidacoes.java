package Excecao.PersonalizadaB;

import Excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		
		
		try {
			Aluno aluno = new Aluno("", -7);			
			try {
				Validar.aluno(aluno);
			} catch (NumeroForaIntervalo e) {
			
				e.printStackTrace();
			}
			
		} catch (StringVaziaException | NumberFormatException e) {			 
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
}
