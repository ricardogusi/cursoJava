package Excecao;



public class ChecadaVSNaoChecada {
	public static void main(String[] args) {
		geraErro1();
		
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	// Não checada ou não verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro");
	}
	
	// Exceção checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception ("Ocorreu um erro 2");
	}
}
