/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialalumnosexamen;

/**
 *
 * @author ferra
 */
public abstract class Evaluacion {
    private Fecha fecha;
    private String docente;

    public Evaluacion(Fecha fecha, String docente) {
        this.fecha = fecha;
        this.docente = docente;
    }
    
    
    
    
    public abstract double notaFinal();
        
    public boolean evaluacionAprobada(){
        return (this.notaFinal() >= 4);
    }
}
