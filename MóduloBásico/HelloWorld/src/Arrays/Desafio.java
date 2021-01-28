package Arrays;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de notas que você deseja informar: ");

        int quantidadeNotas = scanner.nextInt();

        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

        }

        double total = 0;

        for (double d : notas) {

            total += d;

        }

        double media = total / notas.length;

        System.out.println("Sua média é: " + media);
        if (media >= 7) {
            System.out.println("Você está aprovado.");
        } else {
            System.out.println("Você está reprovado.");
        }
        scanner.close();
    }

}
