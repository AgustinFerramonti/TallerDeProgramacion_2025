
package tema1;

import PaqueteLectura.Lector;


public class Ej02Jugadores {

  
    public static void main(String[] args) {
        int DF = 5;
        double [] vectorJugadores = new double[DF];
        double promedio = 0;
        int i; int cantidadJugadoresMayorPromedio = 0;       
        for ( i=0; i<DF;i++){
            System.out.println("Ingrese altura del primer jugador");
            vectorJugadores[i] = Lector.leerDouble();
            promedio = promedio + vectorJugadores[i];
         }
        promedio = promedio / i;
        System.out.print(promedio);
        for (i=0; i< DF; i++){
            System.out.print(" ( " + i + " ) " + vectorJugadores[i] + " | ");
            if (vectorJugadores[i] > promedio)
                cantidadJugadoresMayorPromedio++;
        }
        System.out.println("Cantidad de jugadores mayores al promedio: " + cantidadJugadoresMayorPromedio);
     
        //Paso 9: Informar la cantidad.
    }
    
}
