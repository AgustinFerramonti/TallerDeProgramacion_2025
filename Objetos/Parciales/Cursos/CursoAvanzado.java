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
public class CursoAvanzado extends Curso{
    private String descripcion;

    public CursoAvanzado(String descripcion, String nombre, double costo, Fecha fecha, int DF) {
        super(nombre, costo, fecha, DF);
        this.descripcion = descripcion;
    }
    
    
    public Alumno alumnoConMejorDesempeño(){
        Alumno amax = null;
        double max = -1;
        double promedio;
        for (int i = 0; i < this.getCantAlumnos(); i++){
            promedio = this.darAlumno(i).promedio();
            if (promedio > max){
                amax = this.darAlumno(i);
                max = this.darAlumno(i).getCantTareasComp();
            }
        }
        return amax;
    }
    
//   
}
