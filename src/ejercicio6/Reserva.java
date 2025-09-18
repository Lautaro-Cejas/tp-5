/**
 * Clase Reserva con asociación unidireccional a Cliente y agregación a Mesa
 * @author Lautaro Cejas
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación unidireccional - la reserva conoce al cliente
    private Mesa mesa; // Agregación - puede existir independientemente
    
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente; // Asociación unidireccional
        this.mesa = mesa; // Agregación: se asigna una mesa existente
    }
    
    // Constructor alternativo sin mesa asignada (para demostrar agregación)
    public Reserva(String fecha, String hora, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        // La mesa queda null inicialmente
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Mesa getMesa() {
        return mesa;
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    public void confirmarReserva() {
        System.out.println("=== CONFIRMACIÓN DE RESERVA ===");
        if (mesa != null) {
            System.out.println("✅ Reserva confirmada para " + cliente.getNombre() + 
                             " el " + fecha + " a las " + hora + 
                             " en la mesa " + mesa.getNumero() + 
                             " (capacidad: " + mesa.getCapacidad() + " personas)");
        } else {
            System.out.println("❌ No se puede confirmar la reserva: falta asignar mesa");
        }
        System.out.println("===============================");
    }
    
    public void reprogramarReserva(String nuevaFecha, String nuevaHora) {
        System.out.println("Reprogramando reserva de " + fecha + " " + hora + 
                         " a " + nuevaFecha + " " + nuevaHora);
        this.fecha = nuevaFecha;
        this.hora = nuevaHora;
        System.out.println("✅ Cita reprogramada exitosamente");
        confirmarReserva();
    }
    
    public void cancelarReserva() {
        System.out.println("❌ Reserva cancelada para " + cliente.getNombre() + 
                         " del " + fecha + " a las " + hora);
        if (mesa != null) {
            System.out.println("Mesa " + mesa.getNumero() + " liberada");
        }
    }
    
    @Override
    public String toString() {
        return "Reserva{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", cliente=" + cliente +
                ", mesa=" + mesa +
                '}';
    }
}