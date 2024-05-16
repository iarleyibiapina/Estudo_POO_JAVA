public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public ContaPoupanca(String cliente, int numero, Float saldoInicial, int diaRendimento) {
        super(cliente, numero, saldoInicial);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double d) {
        if (d > 0) {
            Float novoSaldo = (float) (getSaldo() + (getSaldo() * d));
            depositar(novoSaldo - getSaldo()); // Atualiza o saldo
        }
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    // @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Dia de Rendimento: " + diaRendimento);
    }

}
