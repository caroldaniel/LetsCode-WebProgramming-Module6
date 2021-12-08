// Escreva um programa que converte temperaturas de Celsius para Farenheit.

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius: ");
        float celsius = scan.nextFloat();
        float fahrenheit = celsius * 1.8f + 32f;
        System.out.printf("%.1f°C equivale a %.1f°F\n", celsius, fahrenheit);
    }
}