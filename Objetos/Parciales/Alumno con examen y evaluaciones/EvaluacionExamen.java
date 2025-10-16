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
public class EvaluacionExamen extends Evaluacion{
    private double notaTeoria;
    private double notaPractica;

    public EvaluacionExamen(double notaTeoria, double notaPractica, Fecha fecha, String docente) {
        super(fecha, docente);
        this.notaTeoria = notaTeoria;
        this.notaPractica = notaPractica;
    }

 
    
    
    
    @Override
    public double notaFinal() {
        return this.notaTeoria * 0.4 + this.notaPractica * 0.6;
    }


    
    
}
