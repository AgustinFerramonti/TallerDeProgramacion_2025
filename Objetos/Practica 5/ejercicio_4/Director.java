
package ej4_p5;


public class Director extends Persona{
    private int antiguedad;

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Director(int antiguedad, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        this.antiguedad = antiguedad;
    }

    public String toString() {
        String aux = super.toString() + " antiguedad : " + this.getAntiguedad();
        return aux;
    }
    
}
