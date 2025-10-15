/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;


public class DemoFiguras {

    
    public static void main(String[] args) {
        Cuadrado cuad = new Cuadrado(10,"Rojo", "Blanco");
        System.out.println("Color linea: " + cuad.getColorLinea()); 
        System.out.println("Area: " + cuad.calcularArea()); 
        System.out.println("Representacion del cuadrado: " + cuad.toString()); 
       
        cuad.despintar();
        System.out.println("Colores: " + cuad.getColorLinea() + " " + cuad.getColorRelleno()); 
    }
    
    
    
}
