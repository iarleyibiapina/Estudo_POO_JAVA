

import Banco.Bradesco;
import Banco.Conta;
import Pessoa.Pessoa;

public class App {
    

    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Carlos", 20);
        Conta conta = new Conta(pessoa.getNome(), "1234", 0);
        // 
        Bradesco clienteBradesco = new Bradesco(conta, pessoa);
        
        System.out.println(clienteBradesco.getDadosConta());
        System.out.println(clienteBradesco.getSaldo());
        clienteBradesco.depositar(2000);
        System.out.println(clienteBradesco.getSaldo());
    }
}
