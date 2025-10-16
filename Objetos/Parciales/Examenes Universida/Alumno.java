
package parcial4;


public class Alumno {
    private String nombre;
    private String apellido;
    private String legajo;
    private Examenes[] examenes; 
    private int cantidadExamenes;
    private int cantidadMaximaExamenes;

    public Alumno(String nombre, String apellido, String legajo, int i) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.examenes = new Examenes [i];
        this.cantidadExamenes = 0;
        this.cantidadMaximaExamenes = i;
    }    
   
    public boolean estaLleno (){
        return (this.cantidadExamenes == this.cantidadMaximaExamenes);
    }
    
    public void agregarExamen (Examenes e){
        if (!this.estaLleno()){
            this.examenes[cantidadExamenes] = e;
            this.cantidadExamenes++;
        }
    }

    public String getLegajo() {
        return legajo;
    }
    
    public Examenes devolverExamen (int i){
        return this.examenes[i];
    }

    public int getCantidadExamenes() {
        return cantidadExamenes;
    }
    
    public double sacarPromedio (){
        double total = 0;
        for (int i = 0; i< this.cantidadExamenes; i++){
            total += this.examenes[i].getNota();
        }
        return total / this.cantidadExamenes;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
