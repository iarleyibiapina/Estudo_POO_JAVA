public class Construtores {
    // em java um construtor nao é um metodo especial
    // pode haver varios construtores 
    // cada um vai ter seu metodo de sobrecarga
    // com assinaturas diferentes

    public String um;
    public int dois;
    public boolean ativado;

    // construtores diferentes
    public Construtores(){
        this.um = "um";
    }
    public Construtores(String um){
        this.um = um;
    }
    public Construtores(int dois){
        this.dois = dois;
    }
    public Construtores(boolean ativado){
        this.ativado = ativado;
    }
    public Construtores(String um, int dois ,boolean ativado){
        this.um = um;
        this.dois = dois;
        this.ativado = ativado;
    }
}
