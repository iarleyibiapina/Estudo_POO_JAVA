public class ContaEspecial extends ContaBancaria {
    private Float limite;
    
    public ContaEspecial(String nomeCliente, Integer numConta, float saldo) {
        super(nomeCliente, numConta, saldo);
        this.limite = (float) 100;
    }

    // @Override
    public boolean sacar(Float valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            Float saldoAtual = getSaldo();
            if (saldoAtual >= valor) {
                return super.sacar(valor);
            } else {
                Float restante = valor - saldoAtual;
                super.sacar(saldoAtual); // Zera o saldo
                limite -= restante; // Deduz do limite
                return true;
            }
        }
        return false;
    }

    public Float getLimite() {
        return limite;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Limite: " + limite);
    }
}
