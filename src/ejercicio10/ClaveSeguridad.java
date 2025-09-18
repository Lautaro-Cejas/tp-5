/**
 * Clase ClaveSeguridad - Parte de la composición con CuentaBancaria
 * Esta clase depende completamente de la CuentaBancaria (composición)
 * @author Lautaro Cejas
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = java.time.LocalDate.now().toString();
    }
    
    public String getUltimaModificacion() {
        return ultimaModificacion;
    }
    
    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }
    
    public void actualizarClave(String nuevoCodigo) {
        String codigoAnterior = this.codigo;
        this.codigo = nuevoCodigo;
        this.ultimaModificacion = java.time.LocalDate.now().toString();
        System.out.println("Clave de seguridad actualizada");
        System.out.println("Código anterior: " + codigoAnterior);
        System.out.println("Nuevo código: " + this.codigo);
        System.out.println("Fecha actualización: " + this.ultimaModificacion);
    }
    
    @Override
    public String toString() {
        return "ClaveSeguridad{" +
                "codigo='****'" + // Por seguridad, no mostramos el código completo
                ", ultimaModificacion='" + ultimaModificacion + '\'' +
                '}';
    }
}