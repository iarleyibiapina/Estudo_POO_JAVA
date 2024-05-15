public class Album extends ConteudoMusical {

    public Integer anoLancamento; // ano de lançamento do album
    
    public Album(String titulo, String artista, Double duracao, Integer anoLancamento) {
        super(titulo, artista, duracao);
        this.anoLancamento = anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    
}
