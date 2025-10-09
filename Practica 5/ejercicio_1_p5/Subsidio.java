
package ejercicio_1_p5;


public class Subsidio {
    private double monto;
    private String motivo;
    private boolean otorgado;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isOtorgado() {
        return otorgado;
    }

    public void setOtorgado(boolean otorgado) {
        this.otorgado = otorgado;
    }

    public Subsidio(double monto, String motivo, boolean otorgado) {
        this.monto = monto;
        this.motivo = motivo;
        this.otorgado = otorgado;
    }
    
    
    
    
    
}

