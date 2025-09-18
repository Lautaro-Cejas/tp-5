/**
 * Clase Impuesto con asociación unidireccional a Contribuyente
 * @author Lautaro Cejas
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociación unidireccional
    
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    
    public double getMonto() {
        return monto;
    }
    
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public Contribuyente getContribuyente() {
        return contribuyente;
    }
    
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    @Override
    public String toString() {
        return "Impuesto{" +
                "monto=" + monto +
                ", contribuyente=" + contribuyente +
                '}';
    }
}