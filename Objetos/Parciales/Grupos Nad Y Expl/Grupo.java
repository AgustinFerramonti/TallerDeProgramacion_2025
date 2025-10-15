
package parcial1;


public abstract class Grupo {
    private String nombre;
    private double sueldoIns;
    private double costoInc;
    private Chico[] chicos;
    private int cantChicos = 0;
    
    public Grupo(String nombre, double sueldoIns, double costoInc, int D) {
        this.nombre = nombre;
        this.sueldoIns = sueldoIns;
        this.costoInc = costoInc;
        this.chicos = new Chico[D];
    }

    public int getCantChicos() {
        return cantChicos;
    }
    
   
    public abstract String agregarChico(Chico c);
    public abstract double obtenerGananciaNeta();
    
    public void agregarAlGrupo (Chico c){
        this.chicos[cantChicos] = c; 
        this.cantChicos++;
    }
    
    public double obtenerGananciaDelGrupo(){
        return (this.costoInc * this.cantChicos) - this.sueldoIns;
    }
    
    
    
    public String toString (){
        String aux = this.nombre + ", cantidad de chicos inscriptos: " + this.cantChicos + "\n";
        for (int i = 0; i < this.getCantChicos(); i++){
            aux += " Datos del chico " + (i+1) + " " + this.chicos[i].toString() + "; ";
        }
        aux += "\n" + " Ganancia neta: " + this.obtenerGananciaNeta();
        return aux;
    }
    
    public boolean esRentable(){
        return (this.obtenerGananciaNeta() > 5000000);
    }
    
}
