package av3_poo;
public class Aluno implements Treinar {
    protected String nome;
    protected int idade;
    protected int idAluno;

    public Aluno(String nome, int idade, int idAluno) {
        this.nome = nome;
        this.idade = idade;
        this.idAluno = idAluno;
    }

    @Override
    public void treinar() {
        System.out.println("Pegando peso...");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome = " + nome + '\'' +
                ", idade = " + idade +
                ", idAluno = " + idAluno +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
}
