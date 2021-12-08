//Faça um programa que pergunte em que turno você estuda. Peça para digitar M [ MATUTINO ], V [VESPERTINO], N [NOTURNO] e imprima a mensagem “Bom dia!”, “Boa tarde!”, “Boa noite!” ou “Valor Inválido”

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char turno;
        System.out.println("Digite 'M' para Matutino, 'V' para Vespertino e 'N' para Noturno");
        turno = scan.next().charAt(0);
        while (turno != 'M' && turno != 'D' && turno != 'N') {
            System.out.println("Turno não existe.\nDigite 'M' para Matutino, 'V' para Vespertino e 'N' para Noturno");
            turno = scan.next().charAt(0);
        }
        if (turno == 'M') {
            System.out.println("Bom dia!");
        } else if (turno == 'V') {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}