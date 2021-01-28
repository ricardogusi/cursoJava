package Generics;

public class CaixaInt extends Caixa<Integer> {

	public static void main(String[] args) {
		
		Caixa<Integer> caixaA = new Caixa<>();
		
		caixaA.guardar(3);
		
		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		
		
		
	}
	
	
}
