/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;
import PaqueteLectura.GeneradorAleatorio;

public class Hotel {
    
    
    private Habitacion[] habitaciones;
    private int x;
    
    public Hotel (int x){
        this.x = x;
        habitaciones = new Habitacion[x];
        for (int i=0; i< x;i++){
            habitaciones[i]= new Habitacion(GeneradorAleatorio.generarInt((8000-2000)+2000));
        }
    }
    
    public void agregarPersona(Cliente cliente,int habitacion){
        habitaciones[habitacion-1].setCliente(cliente);
        habitaciones[habitacion - 1].setOcupada(true);
    }
    
    public void subirPrecios (int precioAsubir){
        for (int i = 0; i< x; i++){
            habitaciones[i].setCosto(habitaciones[i].getCosto() + precioAsubir);
        }
    }
    
    public String toString() {
        String aux = "";
        for (int i = 0; i < x; i++) {
            aux += "\nHabitación " + (i + 1) + ": " + habitaciones[i].toString();
        }
        return aux;
    }

}
