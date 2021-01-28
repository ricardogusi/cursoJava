package OOHeranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        

        Fox fox = new Fox();

        fox.acelerar();
        fox.acelerar();
        fox.acelerar();
        fox.acelerar();
        fox.acelerar();

        System.out.println("A velocidade antes de frear do Fox é: " + fox.velocidadeAtual + "Km/h");


        fox.frear();
        fox.frear();
        fox.frear();
        fox.frear();
        fox.frear();
        fox.frear();
        fox.frear();

        System.out.println("A velocidade do Fox depois de frear é: " + fox.velocidadeAtual + "Km/h");

        Ferrari ferrari = new Ferrari();

        ferrari.ligarTurbo();
        ferrari.ligarAr();
        
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println("A velocidade da Ferrari antes de frear é: " + ferrari.velocidadeAtual + "Km/h");

        ferrari.frear();

        System.out.println("A velocidade da Ferrari depois de frear é: " + ferrari.velocidadeAtual + "Km/h");

    }
}
