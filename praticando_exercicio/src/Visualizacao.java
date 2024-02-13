public class Visualizacao {
    private Inscrito espectador;
    private Video video;

    public Visualizacao(Inscrito espectador, Video video){
        setEspectador(espectador);
        setVideo(video);
        this.video.setViews(1);
        this.espectador.setTotalVideoAssistido(1);
    }

    public void setEspectador(Inscrito espectador) {
        this.espectador = espectador;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }
    public Inscrito getEspectador() {
        return espectador;
    }
    // sobrepor @avaliar

    public String getVisualizacao(){
        return espectador.getInscrito() + video.statusVideo();
    }
}
