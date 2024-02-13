public class Inscrito {
    private boolean login;
    private int totalVideoAssistido;

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
}
