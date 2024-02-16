// Exercicio 1 Slide 2 
public class Lampada {
 
public String marca;
public int voltagem;
public String tipo;
public String modelo;
public String Cor;
public Float Preço;
public String Garantia;
public Boolean isLigada = true;

public void ligar(){
    this.isLigada = true;
} 

public void desligar(){
    this.isLigada = false;
}
}
