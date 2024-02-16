import java.util.Random;

public class Aluno {
    private String matricula;
    public String nome;
    public String contato;
    public String email;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, String contato, String email){
        this.gerarMatricula();
        this.nome = nome;
        this.contato = contato;
        this.email = email;
    }

     /**
     * Gerar numero aleatorio
     * 
     * @return numero inteiro de 1 a 8 caracter
     */
    static int geraNumeroAleatorio(){
        Random rand = new Random();
        return rand.nextInt(100000000);
    }

    /**
     * Converte a matricula do tipo inteiro para tipo string
     * 
     * @param matricula int
     * @return matricula string
     */
    static String converteMatricula(int matricula){
        return Integer.toString(matricula);
    }

    /**
     *  Gera matricula
     * 
     * @return matricula nova gerada
     */
    public void gerarMatricula(){
        this.setMatricula(converteMatricula(geraNumeroAleatorio()));
    }

    public String dados(){
        return "Matricula: " + getMatricula() + " Nome: " + this.nome + " Contato: " + this.contato + " Email: " + this.email;
    }
}
