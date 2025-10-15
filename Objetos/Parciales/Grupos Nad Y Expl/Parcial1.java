/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author ferra
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nadadores n = new Nadadores("Juan", 50000, "Profesor Armando", 40000,35000,10);

        
        Chico c = new Chico("Agus", 2213542,true);
        n.agregarChico(c);
        System.out.println(n.agregarChico(c));
        
        Chico c1 = new Chico("Tocci", 2312,false);
        n.agregarChico(c1);
        System.out.println(n.agregarChico(c1));
        
        Chico c2 = new Chico("Tomas", 2213542,true);
        n.agregarChico(c2);
        System.out.println(n.agregarChico(c2));
        
        
        System.out.println(n.esRentable());
        System.out.println(n.toString());
    }
    
}
