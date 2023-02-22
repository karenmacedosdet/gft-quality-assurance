/*
DESAFIO
O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos.

ENTRADA
A entrada deverá ser feita por dois valores M e D, onde a primeira linha deverá receber o valor marcado do produto, e na segunda linha o valor do produto com o desconto já aplicado.

SAÍDA
A saída deverá retornar o percentual de desconto que foi aplicado no produto, conforme exemplo abaixo.

(40 30) O desconto foi de 25%
(500 195) O desconto foi de 61%
(100 50) O desconto foi de 50%
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();

        int percentual = (S * 100) / M;

        System.out.println("O desconto foi de " + (100-percentual) + "%");
    }

}