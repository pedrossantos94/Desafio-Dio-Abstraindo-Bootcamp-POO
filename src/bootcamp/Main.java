package bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo POO com Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Lógica de programação essencial");
        curso2.setDescricao("Apreda lógica de programação");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Como resolver desafios de código.");
        mentoria.setDescricao("Aprenda como desenvolver e entregar os desafios do bootcamp");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT Start #4 Java");
        bootcamp.setDescricao("4a edição do bootcamp Java da GFT.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("José Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de José Pedro"+ devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-------------------------------");
        System.out.println("Conteúdos inscritos de José Pedro"+ devPedro.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de José Pedro"+ devPedro.getConteudosConcluidos());

        System.out.println("\n\n");

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel Rocha");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Daniel Rocha"+ devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        System.out.println("-------------------------------");
        System.out.println("Conteúdos inscritos de Daniel Rocha"+ devDaniel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Daniel Rocha"+ devDaniel.getConteudosConcluidos());




    }
}
