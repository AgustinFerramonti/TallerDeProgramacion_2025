
package tema2;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Persona [][] matriz = new Persona [5][8];
        
        int i = 0,j = 0;
        
        String nombre = Lector.leerString();
        
        while (i < 5 && !(nombre.equals("ZZZ"))){
            j=0;
            
            while (j < 8 && !nombre.equals("ZZZ")){
                matriz[i][j] = new Persona(nombre,GeneradorAleatorio.generarInt(5000),GeneradorAleatorio.generarInt(100));
                nombre = Lector.leerString();
                j++;
                
            }
            
            i++;
           
        }
        for(i=0;i<5;i++){
            for (j=0; j < 8; j++){
                if (matriz[i][j] != null)
                System.out.print(" | "+" ("+i+","+j+ ") "+  matriz[i][j].getNombre());
            }
            System.out.println(" ");
        }
    }
    
}
