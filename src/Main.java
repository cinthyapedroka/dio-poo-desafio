import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 =new Curso();
        curso1.setTitulo("curso");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setDate(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devcinthya = new Dev();
        devcinthya.setNome("cinthya");
        devcinthya.inscreveBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos cinthya"
        + devcinthya.getConteudosInscritos());
        devcinthya.progredir();
        devcinthya.progredir();
        devcinthya.progredir();
        System.out.println("..");

        System.out.println("Conteudos Concluido cinthya"
        + devcinthya.getConteudosInscritos());
        System.out.println("XP:" + devcinthya.calculaTotalxp());

        System.out.println("........");

        Dev devjulio = new Dev();
        devjulio.setNome("julio");
        devjulio.inscreveBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos julio"
        + devjulio.getConteudosInscritos());
        devjulio.progredir();
        devjulio.progredir();
        devjulio.progredir();
        System.out.println("..");
        System.out.println("Conteudos Concluido julio"
        + devjulio.getConteudosInscritos());
        System.out.println("XP:" + devjulio.calculaTotalxp());

    }



}
