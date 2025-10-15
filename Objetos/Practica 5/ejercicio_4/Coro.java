
package ej4_p5;


public abstract class Coro {
    private String nombre;
    private Director director;
    private int cantidadCoristas = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getCantidadCoristas() {
        return cantidadCoristas;
    }

    public void setCantidadCoristas(int cantidadCoristas) {
        this.cantidadCoristas = cantidadCoristas;
    }

    public void incrementarCoristas(){
        this.cantidadCoristas++;
    }

    public Coro(String nombre, Director director) {
        this.nombre = nombre;
        this.director = director;
    }
    
    public abstract void agregarCorista(Corista c);
    public abstract boolean coroLleno();
    public abstract boolean coroOrdenado();
}
