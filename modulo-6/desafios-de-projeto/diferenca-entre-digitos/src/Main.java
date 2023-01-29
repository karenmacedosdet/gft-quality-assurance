import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int numero = scan.nextInt();
            String[] numeros = String.valueOf(numero).split("");

            int soma = 0;
            int produto = 1;
            for (int i = 0; i < numeros.length; i++) {
                soma += Integer.parseInt(numeros[i]);
                produto *= Integer.parseInt(numeros[i]);
            }

            System.out.println(produto - soma);
        }
    }
