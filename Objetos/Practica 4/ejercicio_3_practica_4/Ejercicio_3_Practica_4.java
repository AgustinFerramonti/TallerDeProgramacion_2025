
package ejercicio_3_practica_4;


public class Ejercicio_3_Practica_4 {

    public static void main(String[] args) {
        Persona p = new Persona("Mauro",11203737,70) ;
        Trabajador t = new Trabajador("Jardinero", "Mauro", 11203743,69); 
    
        System.out.println(p.toString());
        System.out.println(t.toString());
    }
    
}
