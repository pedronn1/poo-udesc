package modelo;

public class Aluno extends Pessoa {
    private int     fase;
    private int     matricula;
    private String  curso;

    public Aluno(String nome, int cpf, String email, String curso, int matricula, int tempo) {
        super(nome, cpf, email, tempo);
        this.curso = curso;
        this.matricula = matricula;
        this.fase = 0;
    }
    public String toString() {
        return super.getNome();
    }
}
