public class App {
    public static void main(String[] args) throws Exception {
        ContaPoupanca contaPoupanca = new ContaPoupanca("João Silva", 12345, (float) 1000.0, 15);
        ContaEspecial contaEspecial = new ContaEspecial("Maria Oliveira", 67890, (float) 500.0);

        // Mostrar dados iniciais
        System.out.println("Dados iniciais da Conta Poupança:");
        contaPoupanca.mostrarDados();
        System.out.println("\nDados iniciais da Conta Especial:");
        contaEspecial.mostrarDados();

        // Sacar um valor das contas
        System.out.println("\nSacando R$ 200 da Conta Poupança:");
        if (contaPoupanca.sacar(200)) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente.");
        }
        
        System.out.println("\nSacando R$ 700 da Conta Especial:");
        if (contaEspecial.sacar(700)) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saque não realizado. Saldo e limite insuficientes.");
        }

        // Depositar
        System.out.println("\nDepositando R$ 300 na Conta Poupança:");
        contaPoupanca.depositar(300);
        System.out.println("Novo saldo: " + contaPoupanca.getSaldo());

        System.out.println("\nDepositando R$ 500 na Conta Especial:");
        contaEspecial.depositar(500);
        System.out.println("Novo saldo: " + contaEspecial.getSaldo());

        // Mostrar um novo saldo a partir de um rendimento
        System.out.println("\nCalculando novo saldo da Conta Poupança com taxa de rendimento de 2%:");
        contaPoupanca.calcularNovoSaldo(0.02);
        System.out.println("Novo saldo após rendimento: " + contaPoupanca.getSaldo());

        // Mostrar dados finais das contas
        System.out.println("\nDados finais da Conta Poupança:");
        contaPoupanca.mostrarDados();
        System.out.println("\nDados finais da Conta Especial:");
        contaEspecial.mostrarDados();
    }
}
