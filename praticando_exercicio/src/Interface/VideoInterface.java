package Interface;

/**
 * VideoInterface / Criando Encapsulamento
 */
public interface VideoInterface {

    /**
     * Da play no video
     * @return String Video Tocando
     */
    public String play();
    /**
     * Da pause no video
     *  
     * @return String Video Pausado
     */
    public String pause();

    /**
     * Da like no video e retorna novo numero de likes
     * 
     * @return String Retorna o numero de likes no video
     */
    public String like();

}