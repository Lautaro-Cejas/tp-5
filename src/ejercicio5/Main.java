/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Carlos Rodríguez", "11223344");
        
        // Crear computadora (que automáticamente crea la placa madre - composición)
        Computadora computadora = new Computadora("Dell", "XPS001234", propietario);
        
        System.out.println("=== INFORMACIÓN DE LA COMPUTADORA ===");
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Número de Serie: " + computadora.getNumeroSerie());
        System.out.println("Propietario: " + computadora.getPropietario().getNombre());
        System.out.println("DNI Propietario: " + computadora.getPropietario().getDni());
        System.out.println("Placa Madre: " + computadora.getPlacaMadre().getModelo());
        System.out.println("Chipset: " + computadora.getPlacaMadre().getChipset());
        
        // Demostrar relación bidireccional
        System.out.println("\n=== RELACIÓN BIDIRECCIONAL ===");
        System.out.println("Computadora del propietario: " + propietario.getComputadora().getMarca() + " " + propietario.getComputadora().getNumeroSerie());
        
        // Demostrar composición: la placa madre se creó automáticamente
        System.out.println("\n=== COMPOSICIÓN ===");
        System.out.println("La placa madre se creó automáticamente con la computadora:");
        System.out.println("Modelo generado: " + computadora.getPlacaMadre().getModelo());
        System.out.println("Chipset asignado: " + computadora.getPlacaMadre().getChipset());
        
        // Cambio de propietario (asociación bidireccional)
        System.out.println("\n=== CAMBIO DE PROPIETARIO ===");
        Propietario nuevoPropietario = new Propietario("Ana Martínez", "55667788");
        computadora.setPropietario(nuevoPropietario);
        System.out.println("Nuevo propietario: " + computadora.getPropietario().getNombre());
        System.out.println("Computadora del nuevo propietario: " + nuevoPropietario.getComputadora().getMarca());
        
        // El propietario original ya no tiene computadora
        System.out.println("Propietario original sin computadora: " + propietario.getComputadora()); // null
        
        // Crear otra computadora
        System.out.println("\n=== SEGUNDA COMPUTADORA ===");
        Propietario propietario2 = new Propietario("Luis García", "99887766");
        Computadora computadora2 = new Computadora("HP", "PAV002567", propietario2);
        System.out.println("Segunda computadora: " + computadora2.getMarca() + " " + computadora2.getNumeroSerie());
        System.out.println("Su placa madre: " + computadora2.getPlacaMadre().getModelo());
    }
}