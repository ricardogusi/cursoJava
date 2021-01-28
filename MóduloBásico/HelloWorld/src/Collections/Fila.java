package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");  //gera erro se não conseguir adicionar
        fila.offer("Bia");  //gera False se não adicionar

        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");

        System.out.println(fila.peek());   //lista vazia retorna nulo
        System.out.println(fila.element()); // gera erro com lista vazia

        //fila.size();
        //fila.clear();
        //fila.isEmpty();

        System.out.println(fila.poll());  //remove o elemento e mostra ele (retorna null fila vazia)
        System.out.println(fila.remove()); // gera erro com fila vazia
    }
}
