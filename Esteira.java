package av3_poo;
public class Esteira extends Equipamentos implements usarEquipamento, exibirInfo {
   private int velMaxima;
   private int velInicial = 0;
   private boolean ligada = false;
    
   public Esteira(String marca, int quantidade, int velMaxima, int velInicial, boolean ligada){
       super(marca, quantidade);
       this.velMaxima = velMaxima;
       this.velInicial = velInicial;
       this.ligada = ligada;
   }

    public void aumentarVel(int vel){
        if (((velInicial + vel) > velMaxima ) && ligada == true){
            System.out.println("Ultrapassou o peso maximo");
        }
        else{
            System.out.println((velInicial + vel));
        }
    }

    public void ligar(){
        System.out.println("Ligando...");
        ligada = true;
    }
    
    public void desligar(){
        System.out.println("Desligando...");
        ligada = false;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Marca: " +this.getMarca());
        System.out.println("Quantidade: " + this.getQuantidade());
        System.out.println("Velocidade maxima: " +this.velMaxima);

    }

    @Override
    public void usarEquipamento() throws IllegalStateException {
        if(!ligada){
            throw new IllegalStateException("A Esteira deve estar ligada antes de ser usada");
        }

        System.out.println("Correndo...correndo...");
    }

    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }



}
