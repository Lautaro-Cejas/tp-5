// Vehículo - Motor - Conductor
// a. Agregación: Vehículo → Motor
// b. Asociación bidireccional: Vehículo ↔ Conductor

/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        // El motor puede existir independientemente (agregación)
        Motor motor = new Motor("V6 Turbo", "MOT123456");
        Conductor conductor = new Conductor("Roberto Silva", "B-12345678");
        
        Vehiculo vehiculo = new Vehiculo("ABC123", "Ford Mustang", motor, conductor);
        
        System.out.println(vehiculo);
        System.out.println("Vehículo del conductor: " + conductor.getVehiculo().getModelo());
        
        vehiculo.encender();
        conductor.conducir();
        
        // Demostrar agregación: cambiar motor
        Motor nuevoMotor = new Motor("V8 Aspirado", "MOT789012");
        vehiculo.setMotor(nuevoMotor);
        System.out.println("Nuevo motor instalado: " + vehiculo.getMotor().getTipo());
        vehiculo.encender();
        
        // El motor original sigue existiendo independientemente
        System.out.println("Motor original sigue existiendo: " + motor.getTipo());
        
        // Ejemplo de cambio de conductor (asociación bidireccional)
        Conductor nuevoConductor = new Conductor("María Fernández", "B-87654321");
        vehiculo.setConductor(nuevoConductor);
        System.out.println("Nuevo conductor: " + vehiculo.getConductor().getNombre());
        nuevoConductor.conducir();
    }
}