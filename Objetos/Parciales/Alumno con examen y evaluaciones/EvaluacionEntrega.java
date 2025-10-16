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
public class EvaluacionEntrega extends Evaluacion{
    private double notaPresentacion;
    private double notaContenido;
    private double notaOriginalidad;

    public EvaluacionEntrega(double notaPresentacion, double notaContenido, double notaOriginalidad, Fecha fecha, String docente) {
        super(fecha, docente);
        this.notaPresentacion = notaPresentacion;
        this.notaContenido = notaContenido;
        this.notaOriginalidad = notaOriginalidad;
    }

    
    
    @Override
    public double notaFinal() {
        return (this.notaContenido + this.notaOriginalidad + this.notaPresentacion) / 3;
    }
    
    
}
