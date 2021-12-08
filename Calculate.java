// Escreva um programa que recebe dois números inteiros e informa o resultado das operações soma, subtração, multiplicação e divisão. Considere sempre a ordem em que foram informados.

public class Calculate {
    public static void main (String[] args) {
        int numberOne = Integer.parseInt(args[0]);
        int numberTwo = Integer.parseInt(args[1]);

        System.out.printf("Soma: %d\n", numberOne + numberTwo);
        System.out.printf("Subtração: %d\n", numberOne - numberTwo);
        System.out.printf("Multiplicação: %d\n", numberOne * numberTwo);
        System.out.printf("Divisão: %.2f\n", (float)numberOne / numberTwo);
    }
}