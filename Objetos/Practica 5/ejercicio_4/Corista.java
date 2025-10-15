
package ej4_p5;

public class Corista extends Persona{
    private int tono;

    public int getTono() {
        return tono;
    }

    public Corista(int tono, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        this.tono = tono;
    }

    @Override
    public String toString() {
        String aux = super.toString() + " tono : " + this.getTono();
        return aux;
    }

    
    
}
