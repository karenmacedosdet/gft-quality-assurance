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