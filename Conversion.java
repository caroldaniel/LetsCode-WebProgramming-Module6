//Crie um programa que receba um valor em real no input e converta para dólar e euro e imprima.

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor em reais para conversão: ");
        float real = scan.nextFloat();
        char type;
        System.out.println("Digite 'E' para Euro e 'D' para Dólar");
        type = scan.next().charAt(0);
        while (type != 'E' && type != 'D') {
            System.out.println("Tipo não existe.\nDigite 'E' para Euro e 'D' para Dólar");
            type = scan.next().charAt(0);
        }
        if (type == 'E') {
            System.out.printf("R$%.2f equivale a €%.2f\n", real, real / 6.33f);
        }
        else {
            System.out.printf("R$%.2f equivale a €%.2f\n", real, real / 5.61f);
        }
    }

    // Ou métodos simples para serem aplicados em outras funções

    public static float ConverterEuro(float real) {
        return real / 6.33f;
    }
    public static float ConverterDolar(float real) {
        return real / 5.61f;
    }
}