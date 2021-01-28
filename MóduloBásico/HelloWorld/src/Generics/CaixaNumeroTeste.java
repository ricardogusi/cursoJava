package Generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		
		caixaA.guardar(1.2);
		
		System.out.println(caixaA.abrir());
		
	}
}
