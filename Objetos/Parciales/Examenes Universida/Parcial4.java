/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial4;

import PaqueteLectura.Lector;

public class Parcial4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad informatica = new Universidad(1000);
        
        Alumno a1 = new Alumno ("Panchito", "Milei", "2400/4",10);
        Alumno a2 = new Alumno ("Agusto", "Tocci", "31214",10);
        
        informatica.agregarAlumno(a1);
        informatica.agregarAlumno(a2);
        
        Examenes e = new Examenes(5,2019,90.0, "Presencial");
        Examenes e1 = new Examenes(5,2019,9.0, "Escrito");
        Examenes e2 = new Examenes(5,2019,9.0, "Virtual");
        Examenes e3 = new Examenes(5,2019,10.0, "Presencial");
        
        
        informatica.agregarExamenAlAlumno("2400/4", e);
        informatica.agregarExamenAlAlumno("asfaf/4", e1);
        informatica.agregarExamenAlAlumno("2400/4", e2);
        informatica.agregarExamenAlAlumno("31214", e3);
        
        System.out.println(informatica.alumnoConMejorPromedio().toString());
    }
    
}
