/*
DESAFIO
Dado um inteiro positivo n , retorne o menor inteiro positivo que é um múltiplo 2 de en .

ENTRADA
A entrada consiste em um int, do qual podemos calcular seu menor multiplo.

SAÍDA
A entrada consiste em um retorno, que será o menor multiplo digitado e 2.

(5) O resultado eh:10
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        int minimoMultiplo = 0;
        if (numero % 2 == 0) {
            minimoMultiplo = numero;
        } else {
            minimoMultiplo = numero * 2;
        }

        System.out.println("O resultado eh:" + minimoMultiplo);
    }

}