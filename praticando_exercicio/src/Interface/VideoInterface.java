package Interface;

/**
 * VideoInterface / Criando Encapsulamento
 */
public interface VideoInterface {

    /**
     * Da play no video
     * @return void Video Tocando
     */
    public void play();
    /**
     * Da pause no video
     *  
     * @return void Video Pausado
     */
    public void pause();

    /**
     * Da like no video e retorna novo numero de likes
     * 
     * @return String Retorna o numero de likes no video
     */
    public String like();

}