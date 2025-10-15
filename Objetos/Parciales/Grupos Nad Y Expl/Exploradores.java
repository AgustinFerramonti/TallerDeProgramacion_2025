
package parcial1;


public class Exploradores extends Grupo{
    private double costoAlq;

    public Exploradores(double costoAlq, String nombre, double sueldoIns, double costoInc, int D) {
        super(nombre, sueldoIns, costoInc, D);
        this.costoAlq = costoAlq;
    }

    @Override
    public String agregarChico(Chico c) {
       this.agregarAlGrupo(c);
       return "Se agrego al grupo";
    }

    @Override
    public double obtenerGananciaNeta() {
        return this.obtenerGananciaDelGrupo() - (this.costoAlq * this.getCantChicos());
    }
    
   @Override
    public String toString() {
        return super.toString();
    }
     
    
}
