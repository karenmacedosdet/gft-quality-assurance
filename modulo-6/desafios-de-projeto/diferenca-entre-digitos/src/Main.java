/*
DESAFIO
O desafio consiste em um número inteiro n, onde será necessário calcular a diferença entre o produto e a soma dos seus digitos.

ENTRADA
• Para encontrar o produto do valor, os dígitos deverão ser multiplicados.
• A soma, basta realizar uma adição entre os dígitos.
• A diferença, é necessário subtrair o resultado final dos dois valores.

SAÍDA
A saída deverá retornar o valor final da diferença entre o produto e a soma dos digitos.
243 15
Explicação:
Produto de dígitos = 2 * 3 * 4 = 24
Soma dos dígitos = 2 + 3 + 4 = 9
Resultado = 24 - 9 = 15
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int numero = scan.nextInt();
            String[] numeros = String.valueOf(numero).split("");

            int soma = 0;
            int produto = 1;
            for (int i = 0; i < numeros.length; i++) {
                soma += Integer.parseInt(numeros[i]);
                produto *= Integer.parseInt(numeros[i]);
            }

            System.out.println(produto - soma);
        }
    }
