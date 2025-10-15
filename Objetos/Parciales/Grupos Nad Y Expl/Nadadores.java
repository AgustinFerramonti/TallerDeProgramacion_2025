
package parcial1;


public class Nadadores extends Grupo{
    private String nombreB;
    private double sueldoB;

    public Nadadores(String nombreB, double sueldoB, String nombre, double sueldoIns, double costoInc, int D) {
        super(nombre, sueldoIns, costoInc, D);
        this.nombreB = nombreB;
        this.sueldoB = sueldoB;
    }

    @Override
    public String agregarChico(Chico c) {
        if (c.isSabeNadar()){
            this.agregarAlGrupo(c);
            return "Se Agrego correctamente";
            
        }
        return "El chico no sabe nadar";
    }

    @Override
    public double obtenerGananciaNeta() {
        return this.obtenerGananciaDelGrupo() - this.sueldoB;
    }

   
    
}
