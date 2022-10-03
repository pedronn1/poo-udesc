package modelo;

import java.util.Scanner;

public class Secretaria {

    private RegistroAcademico registro = new RegistroAcademico();

    public Secretaria() {

    }

    public void realizeOperacao(int opcao) {
        switch(opcao) {
            case 1:
                addAluno();
                break;
            case 2:
                listarAlunos();
                break;
            default:
                break;
        }
    }

    private void listarAlunos() {
        int total = registro.getQuantidadeAtualDePessoas();
        for(int i = 0; i < total; i++) {
            System.out.println(registro.getAluno(i));
        }
    }

    private void addAluno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome   = scanner.nextLine();
        System.out.println("Digite o CPF do aluno");
        int cpf       = scanner.nextInt();
        System.out.println("Digite o EMAIL do aluno");
        String email  = scanner.nextLine();
        System.out.println("Digite o CURSO do aluno");
        String curso  = scanner.nextLine();
        System.out.println("Digite a MATRICULA do aluno");
        int matricula = scanner.nextInt();
        System.out.println("Digite o TEMPO de emprestimo");
        int tempo     = scanner.nextInt();
        //
        Aluno novoAluno = new Aluno(nome, cpf, email, curso, matricula, tempo);
        registro.addAluno(novoAluno);
    }
}
