package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno príncipe");
        livros.push("Don Quixote");
        livros.push("O hobbit");

        System.out.println(livros.peek());  // Retorna O hobbit por ser o último da Pilha
        
        System.out.println(livros.pop()); // remove elemento
        
    }
}
