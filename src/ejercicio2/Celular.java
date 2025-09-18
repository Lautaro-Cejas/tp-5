/**
 * Clase Celular con agregación a Batería y asociación bidireccional con Usuario
 * @author Lautaro Cejas
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregación - puede existir independientemente
    private Usuario usuario; // Asociación bidireccional
    
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // Agregación: se asigna una batería existente
        this.usuario = usuario;
        // Establecer la relación bidireccional
        if (usuario != null) {
            usuario.setCelular(this);
        }
    }
    
    // Constructor alternativo sin batería (para demostrar agregación)
    public Celular(String imei, String marca, String modelo, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.usuario = usuario;
        if (usuario != null) {
            usuario.setCelular(this);
        }
    }
    
    public String getImei() {
        return imei;
    }
    
    public void setImei(String imei) {
        this.imei = imei;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Bateria getBateria() {
        return bateria;
    }
    
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null) {
            usuario.setCelular(this);
        }
    }
    
    @Override
    public String toString() {
        return "Celular{" +
                "imei='" + imei + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + bateria +
                ", usuario=" + usuario +
                '}';
    }
}