import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");

        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("cursojs");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());

        Dev devJoao = new Dev();
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.setNome("João");
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());


    }
}