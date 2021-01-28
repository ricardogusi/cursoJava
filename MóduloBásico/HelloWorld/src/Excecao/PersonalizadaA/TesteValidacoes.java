package Excecao.PersonalizadaA;

import Excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		
		
		try {
			Aluno aluno = new Aluno("", -7);			
			Validar.aluno(aluno);
			
		} catch (StringVaziaException | NumberFormatException e) {			 
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
}
