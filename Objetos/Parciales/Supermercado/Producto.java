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
public class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private int cantUni;
    private double precioPorUnidad;

    public Producto(int codigo, String nombre, String marca, int cantUni, double precioPorUnidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.cantUni = cantUni;
        this.precioPorUnidad = precioPorUnidad;
    }

    public String getMarca() {
        return marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantUni() {
        return cantUni;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    @Override
    public String toString() {
        return "Producto { " + codigo + " - " + nombre + " - " + marca + " - " + cantUni + " - " + precioPorUnidad +  "}";
    }
    
    
}
