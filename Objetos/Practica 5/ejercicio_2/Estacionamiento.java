
package ej2_p5;


public class Estacionamiento {
    private String nombre;
    private String direccion;
    private String horaCierra;
    private String horaApertura;
    private int pisos;
    private int plazas;
    private Auto [][] matriz;
    
    
    public Estacionamiento (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaCierra = "21:00";
        this.horaApertura = "8:00";
        this.pisos = pisos;
        this.plazas = plazas;
        matriz = new Auto[this.getPisos()][this.getPlazas()];
    }
    
    public Estacionamiento (String nombre, String direccion, String horaApertura, String horaCierre,int pisos, int plazas){
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaCierra = horaCierre;
        this.horaApertura = horaApertura;
        this.pisos = pisos;
        this.plazas = plazas;
        matriz = new Auto[this.getPisos()][this.getPlazas()];
    }

    public int getPisos() {
        return pisos;
    }

    public int getPlazas() {
        return plazas;
    }
    
    
    
    public void agregarAuto(Auto a,int piso, int plaza){
        this.matriz[piso-1][plaza-1] = a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHoraCierra() {
        return horaCierra;
    }

    public void setHoraCierra(String horaCierra) {
        this.horaCierra = horaCierra;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public Auto[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Auto[][] matriz) {
        this.matriz = matriz;
    }
    
    
    
    public String buscarXPatente (String patente){
        for (int i = 0;i< this.getPisos(); i++ ){
            for (int j = 0; j < this.getPlazas();j++){
                if (this.matriz[i][j] != null){
                    if (this.matriz[i][j].getPatente().equals(patente)){
                        return "El auto se encuentra en el piso: " + (i+1) +" y plaza: " + (j+1);
                    }
                }
            }
        }
        return "Auto inexistente";
    }
    
    public String toString (){
        String aux = " ";
        for (int i = 0;i< this.getPisos(); i++ ){
            aux = aux + "Piso: " + (i+1);
            for (int j = 0; j < this.getPlazas();j++){
                if (this.matriz[i][j] != null){
                    aux +=" Plaza: " + (j+1) + " " + this.matriz[i][j].toString()+ " ";
                }else {
                            aux += "Plaza: "+ (j+1)+ " Libre ";
                            }
                }
        
        }
        return aux;
}

    public int contarAutosEnPlaza (int plaza){
        int contador = 0;
        for (int i =0; i < this.getPisos();i++){
            if (matriz[i][plaza-1] != null){
                contador++;
            }
        }
        return contador;
    }
    
}
