package av3_poo;
import java.io.File;

public class Academia {
    public static void main(String[] args) {


        //Recepcionista recepcionista = new Recepcionista("Maria", 1);
        //Professor professor1 = new Professor("Felipe", 2);
        //Funcionario professor2 = new Professor("Alberto", 3);
        //Aluno aluno1 = new Aluno("Lucas", 24, 1);

        //recepcionista.cadastrarAluno("Joao", 17, 3);
        //recepcionista.cadastrarAluno("Pedro", 22, 2);
        //recepcionista.listarAlunos();
        //recepcionista.listarAlunos();

        //professor1.ajudarAluno();
        //aluno1.treinar();

        Aulas boxe = new Boxe("Luta", "Terça/Quinta", 15);
        boxe.comecarAula();
        boxe.terminarAula();

        System.out.println("-------------------------------------------------------");

        Funcional funcional = new Funcional("Aerobico", "Segunda/Quarta", 10);
        funcional.comecarAula();
        funcional.terminarAula();

        System.out.println("-------------------------------------------------------");

        boxe.exibirInfo();
        System.out.println("-------------------------------------------------------");
        funcional.exibirInfo();


    }
    
}
