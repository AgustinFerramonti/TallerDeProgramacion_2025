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
public class Parcialalumnosexamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f = new Fecha(12,3,2025);
        EvaluacionExamen examen = new EvaluacionExamen (6.0,8.5,f,"Profesor Anajuanjo");
        Alumno a = new Alumno("Agustin","23146/5",examen);
    }
    
}
