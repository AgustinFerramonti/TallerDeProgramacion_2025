
package ejercicio_2;


public class Jugador extends Empleado{
    private int partidosJugados;
    private int goles;

    public Jugador (String nombre, double sueldo, int antiguedad,int goles,int partidosJugados){
        super(nombre,sueldo,antiguedad);
        this.setGoles(goles);
        this.setPartidosJugados(partidosJugados);
    }
    
    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    public double calcularEfectividad(){
        return this.getPartidosJugados() / this.getGoles();
    }

    private double promedioDeGoles(){
        return this.getGoles() / this.getPartidosJugados();
    }
    
    @Override
    public double calcularSueldACobrar() {
        double aux = 0;
        if (this.promedioDeGoles() > 0.5){
            aux = this.getSueldo();
        }
        return super.calcularSueldoAntiguedad() + aux;
    }
    
    @Override
    public String toString() {
        String aux = super.toString() + " Partidos jugados: " + this.partidosJugados + " goles: " + this.goles;
        return aux;
    }    
    
    
}
