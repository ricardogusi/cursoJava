package Classes.Desafio;

public class Jantar {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Ricardo", 70);

        Comida c1 = new Comida("Arroz", 0.200);
        Comida c2 = new Comida("Carne", 0.500);

        
        double pesoFinal =  p1.comer(c1.peso + c2.peso);

        System.out.printf("%s%s%.2f%s\n", p1.nome, " ficou com ", pesoFinal, "kg" );
        System.out.printf("%s%.3f%s", "Engordou ", pesoFinal - p1.peso, " kg");
        
        


    }
}
