package one.digitalinnovation.oo;

/**
 * Classe de exemplo para o exercício da Aula 3 de Orientação a Objetos.
 */

class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Capacidade do tanque: " + carro1.getCapacidadeTanque());
        System.out.println("Valor total do tanque: " + carro1.totalValorTanque(4.50));

        Carro carro2 = new Carro("Preto", "Audi A4", 60);

        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Capacidade do tanque: " + carro2.getCapacidadeTanque());
        System.out.println("Valor total do tanque: " + carro2.totalValorTanque(4.50));
    }



}
