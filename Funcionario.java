package av3_poo;
public abstract class Funcionario {
    private String nome;
    private int idFuncionario;

    public Funcionario(String nome, int idFuncionario){
        this.nome = nome;
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public String toString() {
        return "Fncionario{" +
                "nome = " + nome + '\'' +
                ", idFuncionario = " + idFuncionario +
                '}';
    }


}
