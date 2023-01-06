package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 2 de Métodos.
 */

public class Quadrilatero {

    public static void area (double lado) {
        System.out.println("A área do quadrado é: " + (lado * lado));
    }

    public static void area (double base, double altura) {
        System.out.println("A área do retângulo é: " + (base * altura));
    }

    public static void area (double baseMaior, double baseMenor, double altura) {
        System.out.println("A área do trapézio é: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area (float diagonal1, float diagonal2) {
        System.out.println("A área do losango é: " + (diagonal1 * diagonal2) / 2);
    }

}
