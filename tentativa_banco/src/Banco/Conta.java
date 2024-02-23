package Banco;

public class Conta {
        private String nome;
        private String cpf;
        private int saldo;
    
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setSaldo(int saldo) {
            this.saldo = saldo;
        }
        public String getCpf() {
            return cpf;
        }
        public String getNome() {
            return nome;
        }
        public int getSaldo() {
            return saldo;
        }
    
        public Conta(String nome, String cpf, int saldo){
            setCpf(cpf);
            setNome(nome);
            setSaldo(saldo);
        }
    
        public void sacar(int valor){
            if(getSaldo() <= 0){
                System.out.println("Não é possivel sacar");
            } else {
                setSaldo(getSaldo() - valor); 
                System.out.println("Valor sacado com sucesso, saldo atual é: " + getSaldo());
            }
        }
        public void depositar(int valor){
            setSaldo(getSaldo() + valor);
            System.out.println("Valor depositado com sucesso, saldo atual é: " + getSaldo());
        }

        public String getDados()
        {
            return getNome();
        }
}
