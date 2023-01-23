package edu.karen.dio.java.sintaxe.operadores.operadorrelacional.operadorlogico;

public class OperadorLogico {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras.");
        } else if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira.");
        } else {
            System.out.println("Nenhuma das condições é verdadeira.");
        }

    }

}
