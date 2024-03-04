public class Apolice {
    
    protected String nomeSegurado;
    protected int idadeSegurado;
    protected int valorPremioApolice;

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }
    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }
    public void setValorPremioApolice(int valorPremioApolice) {
        this.valorPremioApolice = valorPremioApolice;
    }
    public int getIdadeSegurado() {
        return idadeSegurado;
    }
    public String getNomeSegurado() {
        return nomeSegurado;
    }
    public int getValorPremioApolice() {
        return valorPremioApolice;
    }

    /**
     * Imprime dados do assegurado
     * 
     * @return idade nome valor do premio
     */
    public void imprimir()
    {   
        System.out.println(idadeSegurado + " " + nomeSegurado + " " + valorPremioApolice);
    }


    /**
     * Calcula valor do premio
     */
    public void calcularPremioApolice()
    {
        if(getIdadeSegurado() >= 18 && getIdadeSegurado() <=25){
            valorPremioApolice += (valorPremioApolice * 20) / 100;
        } else if (getIdadeSegurado() > 25 && getIdadeSegurado() <=26){
            valorPremioApolice += (valorPremioApolice * 15) / 100;
        } else if (getIdadeSegurado() > 36){
            valorPremioApolice += (valorPremioApolice * 10) / 100;
        }
    }


    /**
     * Oferece desconto com base na cidade
     * 
     * @param cidade string
     */

    public void oferecerDesconto(String cidade)
    {
        switch (cidade) {
            case "curitiba":
                valorPremioApolice -= (valorPremioApolice * 20) / 100; 
                break;
            case "rio de janeiro":
                valorPremioApolice -= (valorPremioApolice * 15) / 100;
                break;
            case "sao paulo":
            valorPremioApolice -= (valorPremioApolice * 10) / 100;
                break;
            default:
                break;
        }
    }
}
