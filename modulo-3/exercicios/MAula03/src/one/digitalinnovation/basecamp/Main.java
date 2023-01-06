package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 2 de Métodos.
 */

public class Main {

    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercício Retornos Quadrilátero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("A área do quadrado é: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("A área do retângulo é: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("A área do trapézio é: " + areaTrapezio);

        float areaLosango = Quadrilatero.area(5f,5f);
        System.out.println("A área do losango é: " + areaLosango);

    }
}