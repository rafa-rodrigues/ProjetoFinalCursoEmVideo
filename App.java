package ProjetoFinalCursoEmVideo;

public class App {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula 1 de POO ");
        video[1] = new Video("Aula 2 de HTML ");
        video[2] = new Video("Aula 3 de JAVASCRIPT ");

        Aluno aluno = new Aluno("Rafael",37, "M",95.5f);


        System.out.println(video[0].toString());
        System.out.println(video[1].toString());
        System.out.println(video[2].toString());
    }
}
