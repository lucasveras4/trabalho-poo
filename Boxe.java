package av3_poo;
public class Boxe extends Aulas implements Aula, exibirInfo {

    public Boxe(String modalidade, String dias, int qtdAlunos){
        super(modalidade, dias, qtdAlunos);
    }

    @Override
    public void comecarAula() throws RuntimeException {
        if (qtdAlunos < 1){
            throw new RuntimeException("Não é possivel começar a aula, nenhuma aluno esta presente");
        }
        System.out.println("Começando a aula... " +this.qtdAlunos+ " alunos presentes");
    }

    @Override
    public void terminarAula() {
        System.out.println("A aula de boxe terminou");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modalidade: " +this.modalidade);
        System.out.println("Dias da semana: " +this.dias);
        System.out.println("Alunos matriculados: " +this.qtdAlunos);

        }
}
