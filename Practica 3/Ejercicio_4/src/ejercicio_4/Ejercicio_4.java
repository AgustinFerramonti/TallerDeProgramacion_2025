/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio_4 {
    

   
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int df,dniCliente,edadCliente,x;
        Cliente cliente; 
        String nombreCliente;
        Hotel hotel;
        
        System.out.println("Ingrese cantidad de habiaciones del hotel");
        df = Lector.leerInt();
        
        hotel= new Hotel(df);
    
        System.out.println("Ingrese nombre del cliente a agregar al hotel");
        nombreCliente = Lector.leerString();
        System.out.println("Ingrese DNI del cliente a agregar al hotel");
        dniCliente = Lector.leerInt();
        System.out.println("Ingrese edad del cliente a agregar al hotel");
        edadCliente = Lector.leerInt();
        
        cliente = new Cliente (nombreCliente,dniCliente,edadCliente);
        
        System.out.println("Ingrese habitacion donde se desea agregar, rango entre 1 y " + df);
        x = Lector.leerInt()-1;
        hotel.agregarPersona(cliente, x);
        
        System.out.println("Ingrese valor a aumentar todas las habitaciones");
        x = Lector.leerInt();
        hotel.subirPrecios(x);
        
        System.out.println(hotel.toString());
    }
    
}
