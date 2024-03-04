public class ApoliceTeste {

    public void executa(){
        Apolice apolice = new Apolice();
        // =================================================================
        apolice.setIdadeSegurado(20);
        apolice.setNomeSegurado("Rodnei");
        apolice.setValorPremioApolice(1000);
        // =================================================================
        apolice.imprimir();
        // =================================================================
        apolice.calcularPremioApolice();
        apolice.imprimir();
        // ================================================================= 
        apolice.oferecerDesconto("curitiba");
        apolice.imprimir();
    }
}
