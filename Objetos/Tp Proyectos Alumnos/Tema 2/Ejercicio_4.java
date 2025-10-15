package tema2;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
public class Ejercicio_4 {


    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        String nombre; int j,diaElegido,edad,dni,cupos = 0,maxcupos = 40; boolean asignado;
                       
        Persona p;
        Persona [][] matriz = new Persona [5][8];
        
        System.out.println("Ingrese nombre de la persona: ");
        nombre = Lector.leerString();
        
        while (!nombre.equals("ZZZ") && cupos < maxcupos){
            //System.out.println("Ingrese dni de la persona: ");
            //dni = Lector.leerInt();
            //System.out.println("Ingrese edad de la persona: ");
            //edad = Lector.leerInt();
            dni = GeneradorAleatorio.generarInt(300000);
            edad = GeneradorAleatorio.generarInt(100) + 1;
            System.out.println("Ingrese el dia que quiere concurrir al casting (entre 1 y 5)");
            diaElegido = Lector.leerInt() - 1;
            j = 0;
            asignado = false;
            
            
            while (j < 8 && !asignado){
                if(matriz [diaElegido][j] == null){
                    matriz [diaElegido][j] = new Persona(nombre,dni,edad);
                    asignado = true;
                    System.out.println("Asignado correctamente!");
                    cupos++;
                } 
                j++;   
            }
        
            if (!asignado){
                System.out.println("No hay lugares disponibles ese dia, intentelo denuevo");
            }
            
            System.out.println("Ingrese nombre de la persona: ");
            nombre = Lector.leerString();
        }
        
        for (int i = 0; i < 5; i++){
            int cantidad = 0;
            System.out.println(" ");
            for (j=0; j< 8; j++){
                if (matriz[i][j] != null){
                    System.out.print(" | "+ "(" + i + "," + j + ")" +  matriz[i][j].getNombre());
                    cantidad++;
                }
                System.out.print("Para el dia "+ i + " hay un total de " + cantidad + " turnos ");
            } 
        }
            
    }
}
