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

    // Metodos de sobreposicao com mesma assinatura
    public void avaliar(){
        // por padrao a avaliaçao é 5
        getVideo().setAvaliacao(getVideo().getAvaliacao() + 5);
    }
    public void avaliar(int nota){
        getVideo().setAvaliacao(getVideo().getAvaliacao() + nota);
    }
    public void avaliar(float porcentagem){
        int pontuacao = 0;
        if(porcentagem <= 25){
            pontuacao = 3;
        } else if (porcentagem >= 20 && porcentagem <=50){
            pontuacao = 6;
        } else if (porcentagem >=50 && porcentagem <= 75) {
            pontuacao = 8;
        } else if (porcentagem >=75 && porcentagem <=100) {
            pontuacao = 10;
        }
        // getVideo().setAvaliacao(pontuacao);
        this.video.setAvaliacao(pontuacao); 
    }

}
