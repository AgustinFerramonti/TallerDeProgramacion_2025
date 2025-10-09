
package ejercicio_3_practica_4;


public class Trabajador extends Persona{
    private String tarea;

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public Trabajador(String tarea, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        this.tarea = tarea;
    }

    @Override
    public String toString() {
        String aux = super.toString() + ". Soy " + this.tarea;
        return aux;
    }
    
    
}
