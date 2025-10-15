
package ej4_p5;


public class Corohileras extends Coro{
    Corista [][] matriz;
    private int fila ;
    private int columna;

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
   
    
    
    
    public Corohileras(String nombre, Director director, int fila, int columna) {
        super(nombre, director);
        this.matriz = new Corista [fila][columna];
        this.columna= columna;
        this.fila = fila;
    }
    
    
    
    public void agregarCorista (Corista corista){
        if (!this.coroLleno()){
            int f= this.getCantidadCoristas() / this.getColumna();
            int c = this.getCantidadCoristas() % this.getColumna();
            matriz [f][c] = corista;
            this.incrementarCoristas();
        }
    }
    
    public boolean coroLleno (){
        return this.getCantidadCoristas() == this.getColumna() * this.getFila();
   }

    @Override
    public boolean coroOrdenado() {
       for (int f = 0; f < this.getFila() ; f++ ){
          if (matriz[f][0].getTono() < matriz[f+1][0].getTono()){
              return false;
          }
          for (int c = 0; c < this.getColumna(); c++){
              
          }
       }
     return true;
    }
    
    public String toString() {
        String aux = super.toString();
        for (int i = 0; i < this.getFila() ; i++ ){
            for (int j = 0; j < this.getColumna() ; j++)
            aux += " Corista " + i + " " +this.matriz[i][j].toString();
        }
        return aux;
    }
    
}
