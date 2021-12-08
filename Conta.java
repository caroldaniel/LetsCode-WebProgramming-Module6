//Faça um programa que some o total de uma conta. O usuário deverá informar a quantidade de produtos que serão informados.

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um total de números a serem digitados:");
        int total = scan.nextInt();
        float sum = 0f;
        int counter = 0;
        while (counter < total) {
            System.out.println("Digite um número:");
            sum += scan.nextFloat();
            counter++;
        }
        System.out.printf("O soma de todos os números é %.2f\n", sum);
    }
}