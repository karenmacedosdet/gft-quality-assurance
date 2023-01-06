package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 3 de Métodos.
 */

public class Quadrilatero {

    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double base, double altura) {
        return base * altura;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static float area(float diagonal1, float diagonal2) {
       return (diagonal1 * diagonal2) / 2;
    }

}
