package OOHeranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
    
    
    boolean ligarTurbo;
    boolean ligarAr;

    Ferrari() {
        this(300);  //valor padrão caso não seja informado.
    }

    Ferrari(int velocidadeMaxima) {    //pode-se escolher o valor dependendo do modelo.
        super(velocidadeMaxima);   
        setDelta(100); 
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
        
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;        
    }
    
    public int getDelta() {
        if(ligarTurbo && ligarAr){
            return 150;
        } else if (ligarTurbo && ligarAr){
            return 130;
        } else if (!ligarTurbo && !ligarAr){
            return 120;
        } else {
            return 100;
        }
    }

}
