package ProjetoFinalCursoEmVideo;

public class App {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula 1 de POO ");
        video[1] = new Video("Aula 2 de HTML ");
        video[2] = new Video("Aula 3 de JAVASCRIPT ");

        System.out.println(video[0].toString());
    }
}
