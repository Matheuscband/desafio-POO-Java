import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Desafio inicial de Java");
        curso1.setCargaHoraria(50);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Desafio inicial de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);*/
        /*System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Curso para se aprimorar em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos" + devMatheus.getConteudosConcluidos());
        System.out.println("XP" + devMatheus.calcularTotalXp());

        System.out.println("------------");

        Dev devAmilton = new Dev();
        devAmilton.setNome("Amilton");
        devAmilton.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devAmilton.getConteudosInscritos());
        devAmilton.progredir();
        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos" + devAmilton.getConteudosConcluidos());
        System.out.println("XP" + devAmilton.calcularTotalXp());



    }
}
