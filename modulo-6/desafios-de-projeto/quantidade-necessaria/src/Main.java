import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner listener = new Scanner(System.in);
        int pieces, T = listener.nextInt();
        while (T-- > 0) {
            pieces = listener.nextInt() * listener.nextInt();
            System.out.println( pieces/SLICE + (pieces%SLICE == 0 ? 0 : 1) );
        }
        listener.close();
    }
}