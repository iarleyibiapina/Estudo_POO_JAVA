public class App {
    public static void main(String[] args) throws Exception { 
        ConteudoMusical conteudoMusical = new ConteudoMusical("titulo", "artista", 20.1);
        Musica musica = new Musica("musiquinha", "louis", 10.0, "rock");
        Album album = new Album("um autarquia", "aquele", 3999.0, 2000);
        // 
        conteudoMusical.getArtista();
        conteudoMusical.getDuracao();
        conteudoMusical.getTitulo();
        // 
        musica.getArtista();
        musica.getDuracao();
        musica.getGenero();
        musica.getTitulo();
        // 
        album.getAnoLancamento();
        album.getArtista();
        album.getDuracao();
        album.getTitulo();
    }
}
