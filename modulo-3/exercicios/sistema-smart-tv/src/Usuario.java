public class Usuario {

  public static void main(String[] args) throws Exception {

    SmartTv smartTv = new SmartTv();

    SmartTv.diminuirVolume();
    SmartTv.diminuirVolume();
    SmartTv.diminuirVolume();
    SmartTv.aumentarVolume();
    System.out.println("Volume atual: " + SmartTv.volume);

    SmartTv.mudarCanal(13);
    System.out.println("Canal atual: " + SmartTv.canal);

    System.out.println("TV ligada: " + SmartTv.ligada);
    System.out.println("Canal atual: " + SmartTv.canal);
    System.out.println("Volume atual: " + SmartTv.volume);

    SmartTv.ligar();
    System.out.println("NOVO STATUS | TV ligada: " + SmartTv.ligada);
    System.out.println("NOVO STATUS | Canal atual: " + SmartTv.canal);
    System.out.println("NOVO STATUS | Volume atual: " + SmartTv.volume);
  }

}
