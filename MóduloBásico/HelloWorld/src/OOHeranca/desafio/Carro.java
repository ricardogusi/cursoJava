package OOHeranca.desafio;

public class Carro {

    double velocidadeAtual;
    final int VELOCIDADE_MAXIMA;
    private int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }
    }

    void frear() {

        if (velocidadeAtual >= getDelta()) {
            velocidadeAtual -= getDelta();
        }

    }

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

    
}
