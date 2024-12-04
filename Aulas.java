package av3_poo;
public abstract class Aulas implements Aula, exibirInfo {
   protected String modalidade;
   protected String dias;
   protected int qtdAlunos;


    public Aulas(String modalidade, String dias, int qtdAlunos){
        this.modalidade = modalidade;
        this.dias = dias;
        this.qtdAlunos = qtdAlunos;
    }


    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
}
