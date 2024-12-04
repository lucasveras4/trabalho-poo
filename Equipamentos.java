package av3_poo;
public abstract class Equipamentos implements usarEquipamento, exibirInfo {
    private String marca;
    private int quantidade;
    
    public Equipamentos(String marca, int quantidade){
        this.marca = marca;
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    
}
