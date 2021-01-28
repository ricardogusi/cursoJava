package Excecao.PersonalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervalo extends Exception{

	private String nomeDoAtributo;
	
	public NumeroForaIntervalo(String nomedoAtributo) {
		this.nomeDoAtributo = nomedoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está negativo.", nomeDoAtributo);
	}
}
