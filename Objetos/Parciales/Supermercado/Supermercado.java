/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

/**
 *
 * @author ferra
 */
public class Supermercado {
    private String nombre;
    private String direccion;
    private Producto [][] gondola;
    private int gondolas;
    private int estantesXGondola;

    public Supermercado(String nombre, String direccion, int gondolas, int estantesXGondola) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.gondolas = gondolas;
        this.estantesXGondola = estantesXGondola;
        this.gondola = new Producto [gondolas][estantesXGondola];
    }
    

    public void registrarProducto(Producto p){
        boolean agregado = false;
        for (int i=0; i < this.gondolas && !agregado; i++){
            for (int j = 0; j < this.estantesXGondola && !agregado; j++){
                if (this.gondola[i][j] == null){
                    this.gondola[i][j] = p;
                    agregado = true;
                }
            }
        }
        if (!agregado){
            System.out.println("Producto no agregado");
        }
    }
    
    
    public String listarProductosPorMarcaEnGondola (String marca, int gondolaABuscar){
        String aux = "\n";
        for (int i=0; i < this.estantesXGondola; i++){
             if (this.gondola[gondolaABuscar-1][i].getMarca().equals(marca)){
                 aux +=  this.gondola[gondolaABuscar-1][i].toString();
             }
        }
        return aux;
    }
    

    
    public int obtenerNumeroGondolaConMayorCantidad (){
        int gondolaMax = -1;
        int max = -1;
        for (int j = 0; j< this.gondolas; j++){
            int cantidadActual = 0;
            for (int i = 0; i < this.estantesXGondola; i ++){
                cantidadActual += this.gondola[j][i].getCantUni();
            }
            if (cantidadActual > max){
                gondolaMax = j;
                max = cantidadActual;
            }
        }
        return gondolaMax+1;
    }
    
    public String toString (){
        String aux = "Supermercado: "+ this.nombre + " en " + this.direccion + "\n";
        for (int i = 0; i < this.gondolas; i ++){
            aux += " Gondola " + (i+1) + "\n";
            for (int j = 0; j < this.estantesXGondola; j ++){
                aux += " Estante " + (j+1) + ": " + this.gondola[i][j].toString() + "\n";
            }
        }
        return aux;
    }
    
    
    
}
