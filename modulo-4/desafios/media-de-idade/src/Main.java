/*
DESAFIO
Faça um programa que peça para 3 pessoas a sua idade, ao final o programa deverá
verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então
dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

ENTRADA
A entrada consiste em três números inteiros que representam a idade das pessoas.

SAÍDA
A saída imprimirá a média de idade da turma, conforme o exemplo abaixo:
70 = Idosa!
40 = Adulta!
20 = Jovem!
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

        double mediaIdade = (idade1 + idade2 + idade3) / 3;

        if (mediaIdade <= 25) {
            System.out.println("Jovem!");
        } else if (mediaIdade <= 60) {
            System.out.println("Adulta!");
        } else   {
            System.out.println("Idosa!");

        }

    }

}

//public class Main {

//public static void main(String[] args) {

//Scanner leitor = new Scanner(System.in);

//int[] idade = new int[3];

//int count =0;

//do {
//System.out.println("Digite a idade: ");
//idade[count] = leitor.nextInt();
//count++;
// } while (count < 3);

//int mediaIdade = (idade[0] + idade[1] + idade[2]) / 3;
//System.out.println("A média das idades da turma é de: " + mediaIdade + " anos.");

//if (mediaIdade >= 0 && mediaIdade <= 25) {
//System.out.println("A turma é predominantemente JOVEM.");

//} else if (mediaIdade >= 26 && mediaIdade <= 60) {
//System.out.println("A turma é predominantemente ADULTA.");

//} else if (mediaIdade > 60) {
//System.out.println("A turma é predominantemente IDOSA.");
//}

//}

//}