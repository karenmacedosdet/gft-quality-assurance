import java.util.*;

public class NumeroFeliz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String[] string_n = String.valueOf(n).split("");

        int resultado_parcial = 0;
        int posicao_atual = 0;

        String resultado_parcial_string = new String();

        do{

            for (int i = 0; i<string_n.length; i++){

                posicao_atual = Integer.parseInt(String.valueOf(string_n[i]));
                resultado_parcial = (posicao_atual * posicao_atual) + resultado_parcial;

                resultado_parcial_string = String.valueOf(resultado_parcial);

            }

            if (resultado_parcial == 1){
                System.out.println(true);
                break;
            } else if (resultado_parcial_string.length() == 1){
                System.out.println(false);
                break;
            }
            string_n = String.valueOf(resultado_parcial_string).split("");
            resultado_parcial = 0;

        }while(true);

    }
}