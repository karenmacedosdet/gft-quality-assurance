import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

        String nome1 = nome.nextLine();
        String nome2 = nome.nextLine();
        String nome3 = nome.nextLine();

        System.out.println(nome1 + " - esta na posicao: 1");
        System.out.println(nome2 + " - esta na posicao: 2");
        System.out.println(nome3 + " - esta na posicao: 3");
    }
}

