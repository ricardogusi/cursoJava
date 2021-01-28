package Classes;

public class Equals {
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.nome = "João Silva";
        u1.email = "joao@email.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Maria Silva";
        u2.email = "maria@email.com.br";

        System.out.println(u1.equals(u2));


    }
}
