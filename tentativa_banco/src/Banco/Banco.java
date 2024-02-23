package Banco;

import Interface.BancoInterface;
import Pessoa.Pessoa;

abstract class Banco implements BancoInterface 
{
    private Conta conta;
    private Pessoa pessoa;

    public Banco(
        Conta conta,
        Pessoa pessoa
    )
    {
        this.conta = conta;
        this.pessoa = pessoa;
    }

    public String getDadosConta()
    {
        return "Conta de: " + conta.getDados() + " criado por: " + pessoa.getNome();
    }

    public int getSaldo(){
        return conta.getSaldo();
    }

    public void depositar(int valor)
    {
        conta.depositar(valor);
    }
}