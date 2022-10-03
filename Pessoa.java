package modelo;

public class Pessoa {
    private String  nome;
    private int     cpf;
    private String  email;
    private int     tempo;

    public Pessoa(String nome, int cpf, String email, int tempo) {
        this.nome  = nome;
        this.cpf   = cpf;
        this.email = email;
        this.tempo = tempo;
    }

    protected String getNome() {
        return nome;
    }
}
