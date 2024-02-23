package Pessoa;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        setIdade(idade);
        setNome(nome);
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
