
package ej4_p5;


public class Corosemicircular extends Coro{
    Corista [] vector;
    private int dl = 0;

    public Corosemicircular(String nombre, Director director, int df) {
        super(nombre, director);
        this.vector = new Corista [df];
        this.dl=df;
    }

   
    public void agregarCorista (Corista corista) {
        if (!this.coroLleno()){
        if (dl > this.getCantidadCoristas()){
            vector[this.getCantidadCoristas()] = corista;
            this.incrementarCoristas();
        }
        }
    }
    
   public boolean coroLleno (){
       return this.getCantidadCoristas() == dl;
   }
   
   public boolean coroOrdenado(){

       for (int i = 0; i < this.getCantidadCoristas() ; i++ ){
           if (vector[i].getTono() < vector[i+1].getTono()){
               return false;
           } 
        }
       return true;
   }
   
   public String toString() {
        String aux  = super.toString();
        for (int i = 0; i < this.getCantidadCoristas() ; i++ ){
            aux += " Corista " + i + " " +this.vector[i].toString();
        }
        return aux;
    }
}
