import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Conteudo;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do Curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(conteudo);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKaren = new Dev();
        devKaren.setNome("Karen");
        devKaren.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Karen: " + devKaren.getConteudosInscritos());
        devKaren.progredir();
        devKaren.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Karen: " + devKaren.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Karen: " + devKaren.getConteudosConcluidos());
        System.out.println("XP: " + devKaren.calcularTotalXP());

        System.out.println("---------------");

        Dev devTiago = new Dev();
        devTiago.setNome("Tiago");
        devTiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tiago: " + devTiago.getConteudosInscritos());
        devTiago.progredir();
        devTiago.progredir();
        devTiago.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Tiago: " + devTiago.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Tiago: " + devTiago.getConteudosConcluidos());
        System.out.println("XP: " + devTiago.calcularTotalXP());






    }

}

