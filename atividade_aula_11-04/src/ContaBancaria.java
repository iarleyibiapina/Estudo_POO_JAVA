public class ContaBancaria {
    public String  nomeCliente;
    public Integer numConta;
    public float   saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }
    public Integer getNumConta() {
        return numConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    public boolean sacar(float valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public ContaBancaria(String nomeCliente, Integer numConta, float saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void mostrarDados() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Número da Conta: " + numConta);
        System.out.println("Saldo: " + saldo);
    }
}
