package Classes.Desafio;

public class Pessoa {
    

    String nome;
    double peso;
    
    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    double comer (double peso) {
       return this.peso + peso;
    }


}
