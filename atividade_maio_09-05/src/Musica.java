public class Musica extends ConteudoMusical {
    public String genero; // representa o gênero da música.
    //
    public Musica(String titulo, String artista, Double duracao, String genero) {
        super(titulo, artista, duracao);
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
