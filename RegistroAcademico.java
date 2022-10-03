package modelo;

public class RegistroAcademico {
    private Pessoa [] listaDePessoas;
    private static final int totalDePessoas = 30; //constante


    private int quantidadeAtualDePessoas;

    public RegistroAcademico() {
        listaDePessoas = new Pessoa[totalDePessoas];
        quantidadeAtualDePessoas = 0;
    }
    public void addAluno(Aluno novoAluno) {
        if(quantidadeAtualDePessoas < totalDePessoas) {
            listaDePessoas[quantidadeAtualDePessoas] = novoAluno;
            quantidadeAtualDePessoas++;
        }
    }
    public Pessoa getAluno(int indice) {
        if(indice < totalDePessoas) {
            return listaDePessoas[indice];
        }
        return null;
    }
    public int getQuantidadeAtualDePessoas() {
        return quantidadeAtualDePessoas;
    }
}
