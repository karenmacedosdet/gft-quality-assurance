package one.digitalinnovation.basecamp;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício da Calculadora:");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("\nExercício da Mensagem:");
        Mensagem.obtermensagem(9);
        Mensagem.obtermensagem(14);
        Mensagem.obtermensagem(1);

        //Empréstimo
        System.out.println("\nExercício do Empréstimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}

