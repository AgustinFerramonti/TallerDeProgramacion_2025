/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector; 
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio_5 {


    public static void main(String[] args) {
       Partido [] vector = new Partido [20];
       int dl=0,i=0,cantGolesLocal,cantGolesVisit,cantidadPartidosGanadosRiver=0,cantidadGolesBocaLocal=0;
       String visitante,local;
       
       
       System.out.println("Ingrese nombre equipo visitante");
       visitante = Lector.leerString();
       while (i<20 && !visitante.equals("ZZZ")){
           System.out.println("Ingrese nombre equipo local");
           local = Lector.leerString();
           cantGolesLocal = GeneradorAleatorio.generarInt(6);
           cantGolesVisit = GeneradorAleatorio.generarInt(6);
           vector[i]= new Partido(local,visitante,cantGolesLocal,cantGolesVisit);
           i++;
           dl++;
           System.out.println("Ingrese nombre equipo visitante");
           visitante = Lector.leerString();
       }
       for (i=0; i< dl; i++){
           System.out.println(" ");
           
           if (vector[i] !=null){
               System.out.println("{"+vector[i].getLocal()+" - " + vector[i].getGolesLocal() + " VS " + vector[i].getGolesVisitante()+ " - " + vector[i].getVisitante());
               
               if (vector[i].hayGanador()){    
                    
                   if (vector[i].getGanador().equals("RIVER")){
                        cantidadPartidosGanadosRiver++;
                    }
               }
               if (vector[i].getLocal().equals("BOCA")){
                cantidadGolesBocaLocal= cantidadGolesBocaLocal + vector[i].getGolesLocal();
                   
               }
               }
           
           }
       System.out.println("Goles de boca jugando de local:" + cantidadGolesBocaLocal + " Partidos ganados de river: "+ cantidadPartidosGanadosRiver);
       }
    }
    

