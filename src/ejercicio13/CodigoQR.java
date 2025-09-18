/**
 * Clase CodigoQR con asociación unidireccional a Usuario
 * @author Lautaro Cejas
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación unidireccional
    
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    
    public String getValor() {
        return valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public String toString() {
        return "CodigoQR{" +
                "valor='" + valor + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}