package ProjetoFinalCursoEmVideo;

public class Aluno extends Pessoa{


    private String login;
    private int totAssistido;
    public Aluno(String nome, int idade, String sexo, float experiencia) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }
}
