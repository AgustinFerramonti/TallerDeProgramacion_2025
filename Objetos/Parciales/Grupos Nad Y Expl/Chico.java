
package parcial1;


public class Chico {
    private String nombre;
    private int telefono;
    private boolean sabeNadar;

    public Chico(String nombre, int telefono, boolean sabeNadar) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.sabeNadar = sabeNadar;
    }

    public boolean isSabeNadar() {
        return sabeNadar;
    }

    @Override
    public String toString() {
        return nombre + "," + telefono + ", " + sabeNadar;
    }
    
    
}
