/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        // La mesa puede existir independientemente (agregación)
        Mesa mesa = new Mesa(5, 4);
        Cliente cliente = new Cliente("Pedro Martínez", "011-1234-5678");
        
        // Crear reserva con asociación unidireccional al cliente y agregación a mesa
        Reserva reserva = new Reserva("2024-09-20", "20:30", cliente, mesa);
        
        System.out.println("=== INFORMACIÓN DE LA RESERVA ===");
        System.out.println("Fecha: " + reserva.getFecha());
        System.out.println("Hora: " + reserva.getHora());
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Teléfono: " + reserva.getCliente().getTelefono());
        System.out.println("Mesa: " + reserva.getMesa().getNumero());
        System.out.println("Capacidad: " + reserva.getMesa().getCapacidad() + " personas");
        
        // Confirmar reserva
        System.out.println("\n=== CONFIRMACIÓN ===");
        reserva.confirmarReserva();
        
        // Demostrar asociación unidireccional (la reserva conoce al cliente, pero no viceversa)
        System.out.println("\n=== ASOCIACIÓN UNIDIRECCIONAL ===");
        System.out.println("La reserva conoce al cliente: " + reserva.getCliente().getNombre());
        System.out.println("El cliente NO conoce automáticamente sus reservas (unidireccional)");
        
        // Demostrar agregación: cambiar mesa
        System.out.println("\n=== AGREGACIÓN - CAMBIO DE MESA ===");
        Mesa nuevaMesa = new Mesa(8, 6);
        reserva.setMesa(nuevaMesa);
        System.out.println("Nueva mesa asignada: " + reserva.getMesa().getNumero());
        System.out.println("Capacidad: " + reserva.getMesa().getCapacidad() + " personas");
        reserva.confirmarReserva();
        
        // La mesa original sigue existiendo independientemente
        System.out.println("Mesa original sigue disponible: Mesa " + mesa.getNumero() + " (" + mesa.getCapacidad() + " personas)");
        
        // Ejemplo de reserva sin mesa asignada inicialmente
        System.out.println("\n=== RESERVA SIN MESA ===");
        Cliente cliente2 = new Cliente("Laura García", "011-9876-5432");
        Reserva reserva2 = new Reserva("2024-09-21", "19:00", cliente2);
        System.out.println("Reserva sin mesa: " + reserva2.getFecha() + " " + reserva2.getHora());
        System.out.println("Cliente: " + reserva2.getCliente().getNombre());
        System.out.println("Mesa: " + reserva2.getMesa()); // null
        reserva2.confirmarReserva();
        
        // Asignar mesa después (agregación)
        reserva2.setMesa(mesa); // Reutilizar mesa original
        System.out.println("Mesa asignada: " + reserva2.getMesa().getNumero());
        reserva2.confirmarReserva();
        
        // Reprogramar reserva
        System.out.println("\n=== REPROGRAMAR RESERVA ===");
        reserva.reprogramarReserva("2024-09-22", "21:00");
    }
}