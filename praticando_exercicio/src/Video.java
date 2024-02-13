import Interface.VideoInterface;

/**
 * Video
 */
public class Video implements VideoInterface{

    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // Construtor é o nome da propria classe
    public Video(String titulo){
        setTitulo(titulo);
        setAvaliacao(0);
        setViews(0);
        setReproduzindo(false);
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public float getAvaliacao() {
        return avaliacao;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getViews() {
        return views;
    }
    public boolean getReproduzindo(){
        return reproduzindo;
    }

    // sobrepondo metodos
    @Override
    public void play(){
        setReproduzindo(true);
    }

    @Override
    public void pause(){
        setReproduzindo(false);
    }

    @Override
    public String like(){
        this.curtidas++;
        return "total de curtidas agora é " + this.curtidas;
    }

    // Outras funçoes da class

    public String statusVideo(){
        return "Video = titulo:" + getTitulo() + ", avaliacao: " + getAvaliacao() + ", views: " + getViews() + ", curtidas: " + getCurtidas();
    }
}