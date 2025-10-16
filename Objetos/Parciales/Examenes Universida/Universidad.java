/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial4;

/**
 *
 * @author ferra
 */
public class Universidad {
    private Alumno [] alumnos;
    private int cantidadAlumnos;
    private int cantidadMaximaAlumnos;

    public Universidad(int i) {
        this.alumnos = new Alumno[i];
        this.cantidadAlumnos = 0;
        this.cantidadMaximaAlumnos = i;
    }
    
    public void agregarAlumno (Alumno a){
        if (!this.estaLleno()){
            this.alumnos[cantidadAlumnos] = a;
            cantidadAlumnos++;
        }
    }
    
    public boolean estaLleno (){
        return (this.cantidadAlumnos == this.cantidadMaximaAlumnos);
    }
    
    public void agregarExamenAlAlumno (String legajo, Examenes e){
        boolean agregado = false;
        for (int i=0; i < this.cantidadAlumnos && !agregado ; i++ ){
            if (this.alumnos[i].getLegajo().equals(legajo)){
                this.alumnos[i].agregarExamen(e);
                agregado = true;
            }
        }
    }
    
    public int cantidadExamanesRendidos (int mes, int ano, String modalidad){
        int contador = 0;
        for (int j = 0; j < this.cantidadAlumnos; j++){
             for (int i=0; i < this.alumnos[j].getCantidadExamenes(); i++ ){
                if (this.alumnos[j].devolverExamen(i).getMes() == mes && this.alumnos[j].devolverExamen(i).getAno() == ano && this.alumnos[j].devolverExamen(i).getModalidad().equals(modalidad)){
                  contador++;               
                 }
            }
        }
        return contador;
    }
    
    public Alumno alumnoConMejorPromedio(){
        Alumno maxAlumno = null;
        double promedioMax = -1;
        for (int j = 0; j < this.cantidadAlumnos; j++){
            double promedioactual = this.alumnos[j].sacarPromedio();
            if ( promedioactual > promedioMax){
                promedioMax = promedioactual;
                maxAlumno = this.alumnos[j];
            }
        }
        return maxAlumno;
    }
    
}
