/**
 * Clase Foto - Parte de la composición con Pasaporte
 * Esta clase depende completamente del Pasaporte (composición)
 * @author Lautaro Cejas
 */
public class Foto {
    private String imagen;
    private String formato;
    
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    
    public String getImagen() {
        return imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    @Override
    public String toString() {
        return "Foto{" +
                "imagen='" + imagen + '\'' +
                ", formato='" + formato + '\'' +
                '}';
    }
}