/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;


public class Habitacion {
    private int costo;
    private boolean ocupada = false;
    private Cliente cliente;

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public boolean getOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion(int costo) {
        this.costo = costo;
    }


    public String toString() {
        String aux = "Costo de la habitacion: " + costo;
        if (ocupada){
            aux = aux + " Ocupada por: " + this.cliente.toString();
        }
        else {
            aux = aux + " Libre";
        }
        return aux;
    }
    
    
}
