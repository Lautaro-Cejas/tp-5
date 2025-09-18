/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        // Crear titular
        Titular titular = new Titular("Juan Pérez", "12345678");
        
        // Crear pasaporte (que automáticamente crea la foto - composición)
        Pasaporte pasaporte = new Pasaporte("AB123456", "2023-01-01", titular);
        
        // Mostrar información completa
        System.out.println("=== INFORMACIÓN DEL PASAPORTE ===");
        System.out.println("Pasaporte número: " + pasaporte.getNumero());
        System.out.println("Fecha de emisión: " + pasaporte.getFechaEmision());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("DNI: " + pasaporte.getTitular().getDni());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
        System.out.println("Formato: " + pasaporte.getFoto().getFormato());
        
        // Demostrar relación bidireccional
        System.out.println("\n=== RELACIÓN BIDIRECCIONAL ===");
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());
        
        // Demostrar composición (la foto se creó automáticamente)
        System.out.println("\n=== COMPOSICIÓN ===");
        System.out.println("La foto se creó automáticamente: " + pasaporte.getFoto());
    }
}