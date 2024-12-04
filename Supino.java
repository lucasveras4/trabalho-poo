package av3_poo;
public class Supino extends Equipamentos implements usarEquipamento, exibirInfo {
    private int pesoMaximo;
    private int pesoInicial = 0;
    
    public Supino(String marca, int quantidade, int pesoMaximo, int pesoInicial){
        super(marca, quantidade);
        this.pesoMaximo = pesoMaximo;
        this.pesoInicial = pesoInicial;
    }


    public void adicionarPeso(int peso){
        if ((pesoInicial + peso) > pesoMaximo ){
            System.out.println("Ultrapassou o peso maximo");
        }
        else{
            System.out.println((pesoInicial + peso));
        }
    }
    
    public void zerarPeso(){
        System.out.println("Tirando todos os pesos...");
        System.out.println("Peso atual: " + pesoInicial + "Kg");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Marca: " +this.getMarca());
        System.out.println("Quantidade: " + this.getQuantidade());
        System.out.println("");

    }

    @Override
    public void usarEquipamento() {
        System.out.println("Levantando peso...");
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }


}
