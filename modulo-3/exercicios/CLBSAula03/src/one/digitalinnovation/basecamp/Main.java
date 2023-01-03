package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 3 de Operadores Lógicos e Relacionais, Controle de Fluxo e Blocos.
 */

public class Main {

  public static void main(String[] args) {

    //ifFlecha();
    ifSemFlecha(); // É a minha primeira opção, não utilizo ifFlecha().
    //ifFerias();
    ifMenor();

    switchSemana();
    switchNumero();
    switchFerias();

  }

  private static void ifSemFlecha() {

    int mes = 9;
    if (mes == 1) {
      System.out.println("Janeiro");
    } else if (mes == 2) {
      System.out.println("Fevereiro");
    } else if (mes == 3) {
      System.out.println("Março");
    } else if (mes == 4) {
      System.out.println("Abril");
    } else if (mes == 5) {
      System.out.println("Maio");
    } else if (mes == 6) {
      System.out.println("Junho");
    } else if (mes == 7) {
      System.out.println("Julho");
    } else if (mes == 8) {
      System.out.println("Agosto");
    } else if (mes == 9) {
      System.out.println("Setembro");
    } else if (mes == 10) {
      System.out.println("Outubro");
    } else if (mes == 11) {
      System.out.println("Novembro");
    } else if (mes == 12) {
      System.out.println("Dezembro");
    } else {
      System.out.println("Mês inválido");
    }
  }

  //private static void ifFerias() {

   // String mes = "Julho";
   // if (mes == Julho || mes == Dezembro || mes == Janeiro) {
    //  System.out.println("Férias");
    //}
  //}

  private static void ifMenor() {

    double salarioMensal = 11893.58d;
    double mediaSalario = 10500d;

    int quantidadeDependententes = 4;
    int mediaDependentes = 2;

    //if ((salarioMensal < mediaSalario) && (quantidadeDependententes >= mediaDependentes)) {
    //  System.out.println("Funcionário deve receber auxílio.");
    //}

    boolean salarioBaixo = salarioMensal < mediaSalario;
    boolean muitosDependentes = quantidadeDependententes >= mediaDependentes;

    //if (salarioBaixo && muitosDependentes) {
    //  System.out.println("Funcionário deve receber auxílio.");
    //}

    boolean recebeAuxilio = salarioBaixo && muitosDependentes;
    if (recebeAuxilio) {
      System.out.println("Funcionário deve receber auxílio.");
    } else {
      System.out.println("Funcionário não deve receber auxílio.");
    }
  }

  private static void switchSemana() {

    String dia = "Terça";
    switch (dia) {
      case "Segunda":
        System.out.println(2);
        break;
      case "Terça":
        System.out.println(3);
        break;
      case "Quarta":
        System.out.println(4);
        break;
      case "Quinta":
        System.out.println(5);
        break;
      case "Sexta":
        System.out.println(6);
        break;
      case "Sábado":
        System.out.println(7);
        break;
      case "Domingo":
        System.out.println(1);
        break;
      default:
        System.out.println("Dia inválido");
        break;
    }
  }

  private static void switchNumero() {

    int numero = 4;
      switch (numero) {
        case 1, 2, 3 -> System.out.println("Certo");
        case 4 -> System.out.println("Errado");
        case 5 -> System.out.println("Talvez");
        default -> System.out.println("Valor indefinido");
      }
  }

  private static void switchFerias() {

    String mes = "Dezembro";
    switch (mes) {
      case "Julho", "Dezembro", "Janeiro" -> System.out.println("Férias");
      default -> System.out.println("Trabalhando");
    }
  }

}