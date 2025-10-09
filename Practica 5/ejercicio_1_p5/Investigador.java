
package ejercicio_1_p5;


public class Investigador {
    private String nombre;
    private int categoria;
    private String especialidad;
    private Subsidio[] subsidios = new Subsidio[5];
    private int totalSub = 0;

  public void agregarSubsidio (Subsidio subsidio){
      if (this.totalSub < 5){
          this.subsidios[this.totalSub] = subsidio;
      }
  }

    public Investigador(String nombre, int categoria, String especialidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.especialidad = especialidad;
    }
    
  public double sumarSubsidios(){
      double aux = 0;
      for (int i = 0; i < this.totalSub;i++){
          if (subsidios[i].isOtorgado()){
              aux = aux + this.subsidios[i].getMonto();
          }
      }
      return aux;
  }
  
  public void otorgarTodos(){
      for (int i = 0; i < this.totalSub;i++){
          this.subsidios[i].setOtorgado(true);
      }
  }
  
  public String toString (){
      return " Investigador " + this.nombre + ", " + this.categoria + ", " + this.especialidad + ", "+ this.sumarSubsidios();
  }
  
}
 
    
    

