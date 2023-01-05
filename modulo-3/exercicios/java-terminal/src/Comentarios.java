public class Comentarios {

    public static void main(String[] args) {

    }

    public int somaMultiplica (int n, int x, String multiplicacao) {
        int resultado = 0;
        if (multiplicacao == "M") {
            resultado = n * x;
        } else {
            resultado = n + x;
        }
        return resultado;
    }
}