package Excecao.PersonalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception{

	private String nomeDoAtributo;
	
	public StringVaziaException(String nomedoAtributo) {
		this.nomeDoAtributo = nomedoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está vazio.", nomeDoAtributo);
	}
}
