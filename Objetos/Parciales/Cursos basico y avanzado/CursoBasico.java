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
public class CursoBasico extends Curso{

    public CursoBasico(String nombre, double costo, Fecha fecha, int DF) {
        super(nombre, costo, fecha, DF);
    }

    @Override
    public Alumno alumnoConMejorDesempeño() {
        Alumno amax = null;
        int max = -1;
        for (int i = 0; i < this.getCantAlumnos(); i++){
            if (this.darAlumno(i).getCantTareasComp() > max){
                amax = this.darAlumno(i);
                max = this.darAlumno(i).getCantTareasComp();
            }
        }
        return amax;
    }

    
    
    
    
    
    
}
