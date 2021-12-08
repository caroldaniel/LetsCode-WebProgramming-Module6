// Escreva um programa que recebe a cotação do dólar do dia e, seguida recebe um valor em reais. A saída é a quantia em dólares. Use formatação de saída para exibir os valores de acordo com cada representação de moeda.

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a cotação do dólar: ");
        float exchangeRate = scan.nextFloat();
        System.out.println("Informe a quantia em reais: ");
        float real = scan.nextFloat();
        System.out.printf("R$%.2f equivale a $%.2f\n", real, real / exchangeRate);
    }
}