package av3_poo;
public class Professor extends Funcionario{

    public Professor(String nome, int idFuncionario){
        super(nome, idFuncionario);
    }

    public void ajudarAluno(){
        System.out.println("Ajudando aluno...");
    }

}

