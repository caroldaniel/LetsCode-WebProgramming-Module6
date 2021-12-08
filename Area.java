//Crie um programa que imprima a área do quadrado e do triângulo.

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char type;
        System.out.println("Digite 'Q' para Quadrado e 'T' para Triângulo");
        type = scan.next().charAt(0);
        while (type != 'Q' && type != 'T') {
            System.out.println("Tipo não existe.\nDigite 'Q' para Quadrado e 'T' para Triângulo");
            type = scan.next().charAt(0);
        }
        System.out.println("Digite o lado da figura (em cm):");
        float side = scan.nextFloat();
        if (type == 'Q') {
            System.out.printf("Área do quadrado é %.2f cm²\n", side * side);
        }
        else {
            System.out.printf("Área do triângulo é %.2f cm²\n", (side * side) / 2);
        }
    }

    // Ou métodos simples para serem aplicados em outras funções

    public static float AreaQuadrado(float side) {
        return side * side;
    }
    public static float AreaTriangulo(float side) {
        return side * side / 2;
    }
}