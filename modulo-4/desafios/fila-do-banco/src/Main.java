/*
DESAFIO
Elabore um programa que simule uma fila de atendimento bancário. O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.

ENTRADA
A entrada será o nome de três pessoas (clientes do banco).

SAÍDA
O programa deve imprimir como saída na tela o nome da pessoa e sua posição na fila.

Ana - esta na posicao: 1
Sofia - esta na posicao: 2
Lucas - esta na posicao: 3
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

        String nome1 = nome.nextLine();
        String nome2 = nome.nextLine();
        String nome3 = nome.nextLine();

        System.out.println(nome1 + " - esta na posicao: 1");
        System.out.println(nome2 + " - esta na posicao: 2");
        System.out.println(nome3 + " - esta na posicao: 3");
    }
}

