// Escreva um programa que informa a tabuada de um número informado (entre 1-10).

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int number = scan.nextInt();
        int counter = 1;

        while (counter <= 10) {
            System.out.printf("%d x %d = %d\n", number, counter, number * counter);
            counter++;
        }
    }
}