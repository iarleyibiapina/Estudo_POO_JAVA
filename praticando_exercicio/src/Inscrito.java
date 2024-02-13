public class Inscrito extends Pessoa{
    private boolean login;
    private int totalVideoAssistido;

    public Inscrito(String nome, String idade, char sexo){
        // 'puxando' construtor da classe pai/super, no caso Pessoa
        super(nome, idade, sexo);
        setLogin(true);
        setTotalVideoAssistido(0);
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
    public void setTotalVideoAssistido(int totalVideoAssistido) {
        this.totalVideoAssistido = totalVideoAssistido;
    }
    public int getTotalVideoAssistido() {
        return totalVideoAssistido;
    }
    public boolean getLogin()
    {
        return login;
    }

    public void viuMaisUmVideo(){
        if(getLogin()){
            totalVideoAssistido++;
        }
    }

    // Pegando metodos da classe pai
    public String getInscrito()
    {
        return super.getNome() + " " + super.getIdade() + " " + getSexo() + "\n" + getLogin() + " " + getTotalVideoAssistido();
    }
}
