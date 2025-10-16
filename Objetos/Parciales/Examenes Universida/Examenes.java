/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial4;

/**
 *
 * @author ferra
 */
public class Examenes {
    private int mes;
    private int ano;
    private double nota;
    private String modalidad;

    public Examenes(int mes, int ano, double nota, String modalidad) {
        this.mes = mes;
        this.ano = ano;
        this.nota = nota;
        this.modalidad = modalidad;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getModalidad() {
        return modalidad;
    }

    public double getNota() {
        return nota;
    }
    
    
    
}
