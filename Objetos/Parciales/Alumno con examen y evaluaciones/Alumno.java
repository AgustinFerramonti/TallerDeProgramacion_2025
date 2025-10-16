
package parcialalumnosexamen;


public class Alumno {
    private String nombre;
    private String legajo;
    private EvaluacionEntrega[] eEntrega;
    private EvaluacionExamen eExamen;
    private int cantEntregasMax;

    public Alumno(String nombre, String legajo, EvaluacionExamen eExamen) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.eExamen = eExamen;
        this.eEntrega = new EvaluacionEntrega [9];
        this.cantEntregasMax = 9;
    }
    
    public void agregarEntrega (int i, EvaluacionEntrega entrega){
        if (this.espacioLibre(i-1)){
        this.eEntrega[i-1] = entrega;
        } else System.out.println(" Espacio ocupado");
    }
    
    private boolean espacioLibre (int i){
        return (this.eEntrega[i] == null); 
    }
    
    public double obtenerNotaFinalExamen (){
        return this.eExamen.notaFinal();
    }
    
    public double obtenerNotaFinalEvaluacion (int i){
        return this.eEntrega[i].notaFinal();
    }
    
    private boolean saberSiExamenAprobado (){
        return this.eExamen.evaluacionAprobada();
    }
    
    private boolean saberSiEntregaAprobado(int i){
        return this.eEntrega[i].evaluacionAprobada();
    }
    
    private int contarEntregasAprobadas (){
        int contador = 0;
        for (int i = 0; i < this.cantEntregasMax; i ++){
            if (this.eEntrega[i] != null){
                if (this.eEntrega[i].evaluacionAprobada()){
                    contador++;
                }
            }
        }
        return contador;
    }
    
    
    public String saberSiEstaAprobado(){
        String aux = " ";
        if (this.saberSiExamenAprobado() && this.contarEntregasAprobadas() >= 3){
            aux += " Cumple y esta aprobado";     
        } else {
            aux += " No cumple y no esta aprobado";
        }
        return aux;
    }
    
}
