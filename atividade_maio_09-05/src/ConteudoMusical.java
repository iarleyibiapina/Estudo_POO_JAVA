public class ConteudoMusical implements Imprime{
    public String titulo;  // Representa o título da música ou álbum
    public String artista; // Representa o artista responsável pelo conteúdo.
    public Double duracao; // Representa a duração do conteúdo em minutos

     public String getArtista() {
         return artista;
     }
     public Double getDuracao() {
         return duracao;
     }
     public String getTitulo() {
         return titulo;
     }
     public void setArtista(String artista) {
         this.artista = artista;
     }
     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }
     public void setDuracao(Double duracao) {
         this.duracao = duracao;
     }

     public ConteudoMusical(String titulo, String artista, Double duracao)
     {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
     }
    @Override
    public void imprime() {
        System.out.println(getArtista() + getTitulo() + getDuracao());
        
    }     
}
