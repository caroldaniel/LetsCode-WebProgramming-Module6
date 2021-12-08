// Escreva um programa que realiza conversão de medidas de polegadas em centímetros.

import java.util.Scanner;

public class Measure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a a medida em polegadas: ");
        float pol = scan.nextFloat();
        float conversionRate = 2.54f;
        System.out.printf("%.2f pol equivale a %.2f cm\n", pol, pol * conversionRate);
    }
}