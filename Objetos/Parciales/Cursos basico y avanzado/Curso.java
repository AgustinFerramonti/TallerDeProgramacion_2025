/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author ferra
 */
public abstract class Curso {
    private String nombre;
    private double costo;
    private Fecha fecha;
    private Alumno[] alumnos;
    private int cantAlumnos = 0;
    private int maxAlumnos;

    public Curso(String nombre, double costo, Fecha fecha,int DF) {
        this.nombre = nombre;
        this.costo = costo;
        this.fecha = fecha;
        this.alumnos = new Alumno[DF];
        this.maxAlumnos = DF;
    }
    
    public int agregarAlumno(Alumno a){
        this.alumnos[cantAlumnos]=a;
        cantAlumnos++;
        return this.cantAlumnos;
    }
    
    public Alumno obtenerAlumno (int x){
        return this.alumnos[x-1];
    }
    
    public void actualizarRendimiento(String nombre, int nota){
        for (int i = 0; i < this.cantAlumnos; i++){
            if (this.alumnos[i].getNombre().equals(nombre)){
                this.alumnos[i].sumarNota(nota);
                this.alumnos[i].sumarTarea();
                return;
            }   
        }
    }
    
    
    
    public String toString (){
        return nombre + ", " + costo + ", " + fecha.toString() + ", " + this.alumnoConMejorDesempeño(); 
    }
    
    public abstract Alumno alumnoConMejorDesempeño();

    public int getCantAlumnos() {
        return cantAlumnos;
    }
    
    public Alumno darAlumno (int i){
        return this.alumnos[i];
    }
    
}
