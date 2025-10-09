
package ejercicio_2;


public class Entrenador extends Empleado{
    private int campeonatos;

    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }

    public Entrenador( String nombre, double sueldo, int antiguedad,int campeonatos) {
        super(nombre, sueldo, antiguedad);
        this.campeonatos = campeonatos;
    }

  
    public double calcularEfectividad() {
        return this.getCampeonatos() / this.getAntiguedad();
    }

    private int plusAdicional(){
        if (this.getCampeonatos() == 0){
            return 0;
        }
        else if ( 1 <= this.getCampeonatos() && this.getCampeonatos() <= 4){
            return 5000;
        }
        else if ( 5 <= this.getCampeonatos() && this.getCampeonatos() <= 10){
            return 30000;
        }
        else return 50000;    
    }
    
    @Override
    public double calcularSueldACobrar() {
       return super.calcularSueldoAntiguedad() + this.plusAdicional();
    }

    @Override
    public String toString() {
        String aux = super.toString() + " Entrenador{" + "campeonatos=" + campeonatos + '}';
        return aux;
    }


    
}
