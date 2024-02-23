/**
 * Retangulo
 */
public class Retangulo {

    protected float area, perimetro;

    private void perimetro(float comprimento, float largura)
    {
        this.perimetro = 2 * (comprimento + largura);
    }

    private void area(float comprimento, float largura)
    {
        this.area = comprimento * largura;
    }

    public void calcular(float comprimento, float largura)
    {
        if(comprimento > 0 && largura > 0){
            this.perimetro(comprimento, largura);
            this.area(comprimento, largura);
        } else {
            System.out.println("Valores inesperado");
        }
    }

    public float getArea()
    {
        return this.area;
    }
    public float getPerimetro()
    {
        return this.perimetro;
    }
}