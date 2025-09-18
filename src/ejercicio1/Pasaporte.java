/**
 * Clase Pasaporte con composición a Foto y asociación bidireccional con Titular
 * @author Lautaro Cejas
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composición - se crea con el pasaporte
    private Titular titular; // Asociación bidireccional
    
    public Pasaporte(String numero, String fechaEmision, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;
        
        // COMPOSICIÓN: se crea la foto automáticamente al crear el pasaporte
        this.foto = new Foto("foto_" + numero + ".jpg", "JPEG");
        
        // Establecer la relación bidireccional
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getFechaEmision() {
        return fechaEmision;
    }
    
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    public Foto getFoto() {
        return foto;
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }
    
    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", fechaEmision='" + fechaEmision + '\'' +
                ", foto=" + foto +
                ", titular=" + titular +
                '}';
    }
}