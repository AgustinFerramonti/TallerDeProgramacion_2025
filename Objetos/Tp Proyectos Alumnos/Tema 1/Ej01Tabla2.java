
package tema1;

import PaqueteLectura.GeneradorAleatorio;

public class Ej01Tabla2 {

    /**
     * Carga un vector que representa la tabla del 2
     */
    public static void main(String[] args) {
        int numero;
        int DF=11; int dl=0;
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        GeneradorAleatorio.iniciar();
        numero = GeneradorAleatorio.generarInt(13);
        while (numero != 11){
            if (dl < DF){
                tabla2[dl]= numero;
                dl++;
            }
            numero = GeneradorAleatorio.generarInt(13);
            }
        for (i=0; i < dl; i++){
            System.out.print(tabla2[i]+ " | ");
        }
         System.out.println(dl);
        }
    }
    
