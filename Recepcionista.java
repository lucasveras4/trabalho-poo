package av3_poo;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Recepcionista extends Funcionario {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>() ;

    public Recepcionista(String nome, int idFuncionario){
        super(nome, idFuncionario);
    }

    public Aluno cadastrarAluno(String nome, int idade, int idAluno){
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do aluno não pode ser vazio.");
        }
        if (idade <= 0) {
            throw new IllegalArgumentException("A idade do aluno deve ser maior que 0.");
        }
        if (idAluno <= 0) {
            throw new IllegalArgumentException("O ID do aluno deve ser positivo.");
        }

        Aluno novoAluno = new Aluno(nome, idade, idAluno);
        alunos.add(novoAluno);
        return novoAluno;
    }

    public void listarAlunos(){
        System.out.println("Lista de Alunos cadastrados: ");
        for (Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }


}


