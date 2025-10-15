/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;


public class Estante {
    private Libro[] vector;
    private int maxLibros;
    private int cantidadLibros;
    
    public Estante(int x) {
        maxLibros=x;
        this.vector = new Libro[maxLibros];
        cantidadLibros =0;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }
    
    public boolean estanteLleno(){
        return (cantidadLibros == maxLibros);
        }
    
    public void agregarLibro (Libro x){
        if (!estanteLleno()){     
            vector[cantidadLibros]= x;
            cantidadLibros++;
        }
    }
    
    public Libro buscarLibro(String titulo){
        for (int i=0; i < cantidadLibros; i++){
            if (vector[i].getTitulo().equals(titulo))
                return vector[i];
    }
        return null;
    }
}
    

