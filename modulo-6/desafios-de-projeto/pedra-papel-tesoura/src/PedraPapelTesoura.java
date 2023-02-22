/*
DESAFIO
Você e seus amigos estão em uma aula de criação de jogos. Para inspirar os alunos e treinar, o
professor pediu para que vocês fizessem um jogo que já existe com alguma modificação. A escolha
de vocês foi "Pedra, Papel e Tesoura" e a modificação foi mudar Pedra para Flecha, Papel para
Escudo e Tesoura para Espada.

Então, vocês escolheram um número para representar cada um dos parâmetros. Sendo:

1 - Flecha
2 - Escudo
3 - Espada

ENTRADA
A entrada vão ser dois números representando cada um dos parâmetros. Sendo a primeira entrada o jogador e a segunda o inimigo.

SAÍDA
A saída deve ser se o jogador ganhou, empatou ou perdeu após a análise das duas entradas. A saída deve ser sem as aspas.

1   "Empatou"
1

1   "Perdeu"
2

3   "Ganhou"
2
*/

import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();

        if (jogadaJogador == 1 && jogadaInimigo == 1 || jogadaJogador == 2 && jogadaInimigo == 2
            || jogadaJogador == 3 && jogadaInimigo == 3) {
            System.out.println("Empatou");
        } else if (jogadaJogador == 1 && jogadaInimigo == 2
            || jogadaJogador == 2 && jogadaInimigo == 3) {
            System.out.println("Perdeu");
        } else
            System.out.println("Ganhou");
    }
}
