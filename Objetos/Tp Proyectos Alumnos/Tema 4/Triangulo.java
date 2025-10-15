
package tema4;


public final class Triangulo extends Figura{
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3, String colorRelleno, String colorLinea) {
        super(colorRelleno,colorLinea);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
        
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    
    @Override
    public double calcularPerimetro (){
        return this.getLado1() + this.getLado2() + this.getLado3();
    }
    
    public double calcularArea (){
        return (this.getLado1() + 50) / 2;
    }
    
    public String toString (){
        String aux = super.toString() + " Lado 1 : " +this.getLado1() + " Lado 2 : " +this.getLado2() + " Lado 3 : " +this.getLado3();
        return aux;
    }
}
