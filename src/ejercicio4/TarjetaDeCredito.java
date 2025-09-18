/**
 * Clase TarjetaDeCredito con asociación bidireccional a Cliente y agregación a Banco
 * @author Lautaro Cejas
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional
    private Banco banco; // Agregación - puede existir independientemente
    
    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco; // Agregación: se asigna un banco existente
        // Establecer la relación bidireccional con el cliente
        if (cliente != null) {
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        // Romper relación bidireccional anterior si existe
        if (this.cliente != null) {
            this.cliente.setTarjetaDeCredito(null);
        }
        
        this.cliente = cliente;
        
        // Establecer nueva relación bidireccional
        if (cliente != null) {
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    public Banco getBanco() {
        return banco;
    }
    
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", cliente=" + cliente +
                ", banco=" + banco +
                '}';
    }
}