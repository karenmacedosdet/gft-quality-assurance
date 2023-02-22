/*
DESAFIO
Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou
V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

ENTRADA
A entrada consiste em um caractere(char) M , N ou V que informará o turno em que você estuda.

SAÍDA
A saída mostrará uma mensagem que informa conforme o seu turno. Veja o exemplo:
M 	Bom Dia!
N 	Boa Noite!
T 	Valor Inválido!
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);

        switch (turno) {
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
                break;
        }

    }

}