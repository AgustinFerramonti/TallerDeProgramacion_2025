
package ej2_p5;


public class Ej2_P5 {

    
    public static void main(String[] args) {
       Estacionamiento estacionamiento = new Estacionamiento ("Estacionamiento A", "Calle 23 entre 32 y 33", " 9:00", "22:00", 3, 3);
       Auto auto1 = new Auto("Juan Antonio","auto1");
       estacionamiento.agregarAuto(auto1, 1, 3);
       
       Auto auto2 = new Auto("pepe","auto2");
       estacionamiento.agregarAuto(auto2, 2, 3);
       
       Auto auto3 = new Auto("dsasd","auto3");
       estacionamiento.agregarAuto(auto3, 1, 1);
       
       Auto auto4 = new Auto("tomaas","auto4");
       estacionamiento.agregarAuto(auto4, 3, 1);
       
       Auto auto5 = new Auto("ferra","auto5");
       estacionamiento.agregarAuto(auto5, 3, 3);
       
       Auto auto6 = new Auto("naheul","auto6");
       estacionamiento.agregarAuto(auto6, 2, 2);
    
       System.out.println(estacionamiento.toString());
       
       System.out.println (estacionamiento.contarAutosEnPlaza(1));
       System.out.println(estacionamiento.buscarXPatente("auto4"));
    }
    
}
