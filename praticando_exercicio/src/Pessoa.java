public abstract class Pessoa {
    protected String nome;
    protected String idade;
    protected char sexo;
    protected int experiencia;

    public Pessoa(String nome, String idade, char sexo){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setExperiencia(0);
    }

    public int getExperiencia() {
        return experiencia;
    }
    public String getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void ganharExp(){
        setExperiencia(experiencia++);
    }
}
