/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio_2 {

   
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Persona [] Vector = new Persona [15];
        int dnimenor=99999999,cant=0,i,dl = 0;
        Persona personaMenor = null;
        
        i= GeneradorAleatorio.generarInt(100);
       
        while (dl<15 && i != 0){
            Vector[dl]= new Persona(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(999999),i); 
            dl++;
            i = GeneradorAleatorio.generarInt(100);
        }
        for (i=0; i<dl;i++){
            if (Vector[i].getEdad()> 65){
                cant++;
            }
            if (Vector[i].getDNI() < dnimenor || personaMenor == null){
                dnimenor = Vector[i].getDNI();
                personaMenor = Vector[i];
            }
            System.out.println(Vector[i].toString());
         
        }
       
        System.out.println("Hay un total de "+cant+" personas mayores a 65 años");
        System.out.println (personaMenor.toString());
    }
}

