
public class App {
    public static void main(String[] args) throws Exception {
        // Criando varios videos em um array
        Video v[] = new Video[3];
        v[0] = new Video("Video Um");
        v[1] = new Video("Video Dois");
        v[2] = new Video("Video Tres");

        System.out.println(v[0].statusVideo());
        System.out.println(v[1].statusVideo());
        System.out.println(v[2].statusVideo());

        Inscrito i[] = new Inscrito[3];
        i[0] = new Inscrito("Abelio", "20", 'M');
        i[1] = new Inscrito("Damasca", "21", 'F');
        i[2] = new Inscrito("Kaum", "22", 'M');

        System.out.println(i[0].getInscrito());
        System.out.println(i[1].getInscrito());
        System.out.println(i[2].getInscrito());
    }
}
