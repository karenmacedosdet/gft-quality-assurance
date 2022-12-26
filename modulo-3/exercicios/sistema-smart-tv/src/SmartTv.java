public class SmartTv {

  static boolean ligada = false ;
  static int canal = 1;
  static int volume = 25;

  public static void ligar() {
    ligada = true;
  }
  public static void desligar() {
    ligada = false;
  }

  public static void aumentarVolume() {
    volume ++;
    System.out.println("Aumentando o volume para: " + volume);
  }
  public static void diminuirVolume() {
    volume --;
    System.out.println("Diminuindo o volume para: " + volume);
  }

  public static void mudarCanal(int novoCanal)  {
    canal = novoCanal;
    System.out.println("Inserir o novo canal: " + novoCanal);
  }
  public static void aumentarCanal() {
    volume ++;
    System.out.println("Aumentando o canal para: " + canal);
  }
  public static void diminuirCanal() {
    volume --;
    System.out.println("Diminuindo o canal para: " + canal);
  }
}