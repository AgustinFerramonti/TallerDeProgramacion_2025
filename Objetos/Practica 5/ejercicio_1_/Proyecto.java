/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1_p5;

/**
 *
 * @author ferra
 */
public class Proyecto {
    private String nombre;
    private int codigo;
    private String nombreDirector;
    private Investigador[] investigadores = new Investigador[50];
    private int totalInv = 0;
    
    
    
    public void agregarInvestigador(Investigador unInvestigador){
        if (this.totalInv < 50){
            investigadores[this.totalInv] = unInvestigador;
            this.totalInv++;
        }
    }
    
    public double dineroTotalOtorgado(){
        double aux = 0;
        for (int i = 0; i < this.totalInv ; i++){
            aux = aux + investigadores[i].sumarSubsidios();
        }
        return aux;
    }
    
    public void otorgarTodos(String nombre){
        for (int i = 0; i < this.totalInv ; i++){
            if (this.investigadores[i].equals(nombre)){
                this.investigadores[i].otorgarTodos();
            }
        }
    }
    
    public String toString (){
        String aux = " ";
        for (int i = 0; i < this.totalInv ; i++){
            aux = aux + this.investigadores[i].toString();
        }
        return "| Proyecto " + this.nombre + ","+this.codigo + ","+ this.nombreDirector+ ","+this.dineroTotalOtorgado()+ aux;
              
    }
    
}
