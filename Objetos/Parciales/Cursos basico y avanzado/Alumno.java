/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author ferra
 */
public class Alumno {
    private String nombre;
    private int cantTareasComp = 0;
    private int sumaTotalNotas = 0;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCantTareasComp(int cantTareasComp) {
        this.cantTareasComp = cantTareasComp;
    }

    public void setSumaTotalNotas(int sumaTotalNotas) {
        this.sumaTotalNotas = sumaTotalNotas;
    }

    public int getCantTareasComp() {
        return cantTareasComp;
    }

    public int getSumaTotalNotas() {
        return sumaTotalNotas;
    }
    
    public void sumarTarea(){
        this.cantTareasComp++;
    }
    
    public void sumarNota (int x){
        this.sumaTotalNotas +=x;
    }
    
    public String toString (){
        return this.nombre + ", " + this.cantTareasComp + ", " + this.sumaTotalNotas;
    }
    
    public double promedio (){
        return this.sumaTotalNotas / this.cantTareasComp;
    }
}
