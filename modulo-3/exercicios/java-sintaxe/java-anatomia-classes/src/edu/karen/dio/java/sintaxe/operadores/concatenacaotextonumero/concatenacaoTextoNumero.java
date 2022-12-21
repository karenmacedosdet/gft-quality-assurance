package edu.karen.dio.java.sintaxe.operadores.concatenacaotextonumero;

public class concatenacaoTextoNumero {

  public static void main(String[] args) {

    String concatenacao = "?";

    concatenacao = 1+1+1+"1";

    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;

    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";

    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;

    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);

    System.out.println(concatenacao);

  }

}
