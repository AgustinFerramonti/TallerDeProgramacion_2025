
package ej2_p5;


public class Auto {
    private String nombreDueño;
    private String patente;

    @Override
    public String toString() {
        return "Auto de" +  this.getNombreDueño() + this.getPatente() ;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Auto(String nombreDueño, String patente) {
        this.nombreDueño = nombreDueño;
        this.patente = patente;
    }
    
    
}
