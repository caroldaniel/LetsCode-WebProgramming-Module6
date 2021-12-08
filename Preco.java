//Faça um programa que pergunte o preço de 3 produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre o produto mais barato(kk).

import java.util.Scanner;

public class Preco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        float[] precos = new float[3];
        int smallest = 0;
        while (counter < 3) {
            System.out.printf("Qual o preço do produto %d?\n", counter + 1);
            precos[counter] = scan.nextFloat();
            if (precos[counter] < precos[smallest]) {
                smallest = counter;
            }
            counter++;
        }
        System.out.printf("Você deve comprar o produto %d.\n", smallest + 1);
    }
}