//Crie um programa que leia 3 notas e imprima a média delas.

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        float[] grades = new float[3];
        while (counter < 3) {
            System.out.printf("Insira Nota %d: ", counter + 1);
            grades[counter] = scan.nextFloat();
            counter++;
        }
        float average = (float)((grades[0] + grades[1] + grades[2]) / 3);
        System.out.printf("A média das notas é %.2f\n", average);
    }
}