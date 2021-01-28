package Collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Bia"));

        boolean resultado = usuarios.contains(new Usuario("Bia"));

        System.out.println(resultado);
    }
}
