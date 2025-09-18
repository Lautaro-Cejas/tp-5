/**
 * Clase Computadora con composición a PlacaMadre y asociación bidireccional con Propietario
 * @author Lautaro Cejas
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Composición - se crea con la computadora
    private Propietario propietario; // Asociación bidireccional
    
    public Computadora(String marca, String numeroSerie, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
        
        // COMPOSICIÓN: se crea la placa madre automáticamente al crear la computadora
        this.placaMadre = new PlacaMadre("ATX-" + numeroSerie, "Intel Z690");
        
        // Establecer la relación bidireccional
        if (propietario != null) {
            propietario.setComputadora(this);
        }
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
    
    public Propietario getPropietario() {
        return propietario;
    }
    
    public void setPropietario(Propietario propietario) {
        // Romper relación bidireccional anterior si existe
        if (this.propietario != null) {
            this.propietario.setComputadora(null);
        }
        
        this.propietario = propietario;
        
        // Establecer nueva relación bidireccional
        if (propietario != null) {
            propietario.setComputadora(this);
        }
    }
    
    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", placaMadre=" + placaMadre +
                ", propietario=" + propietario +
                '}';
    }
}