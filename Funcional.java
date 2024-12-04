package av3_poo;
public class Funcional extends Aulas implements Aula, exibirInfo {

    public Funcional(String modalidade, String dias, int qtdAlunos){
        super(modalidade, dias, qtdAlunos );
    }

    @Override
    public void comecarAula() {
        System.out.println("A aula de funcional esta comçando");



    }

    @Override
    public void terminarAula() {
        System.out.println("A aula de funcional terminou");
    }

    @Override
    public void exibirInfo(){
        System.out.println("Modalidade: " +this.modalidade);
        System.out.println("Dias da semana: " +this.dias);
        System.out.println("Alunos matriculados: " +this.qtdAlunos);

    }
}
