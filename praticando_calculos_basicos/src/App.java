public class App {
    public static void main(String[] args) throws Exception {
        Retangulo retangulo = new Retangulo();
        retangulo.calcular(20, 15);
        retangulo.calcular(0, 0);
        System.out.println(retangulo.getPerimetro());
        System.out.println(retangulo.getArea());
    }
}
