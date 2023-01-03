package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números parres
e a quantidade de números ímpares.
 */

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadePar = 0, quantidadeImpar = 0;

        System.out.println("Quantidade de números: ");
        int quantidadeNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();

            if (numero % 2 == 0) {
                quantidadePar++;
            } else {
                quantidadeImpar++;
            }

            count++;
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade de números pares: " + quantidadePar);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpar);

        }

    }

