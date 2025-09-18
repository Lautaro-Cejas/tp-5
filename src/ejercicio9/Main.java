// CitaMédica - Paciente - Profesional
// a. Asociación unidireccional: CitaMédica → Paciente
// b. Asociación unidireccional: CitaMédica → Profesional

public class Main {
    public static void main(String[] args) {
        // Crear objetos independientes
        Paciente paciente = new Paciente("Elena Rodríguez", "OSDE");
        Profesional profesional = new Profesional("Dr. Juan Carlos López", "Cardiología");
        
        CitaMedica cita = new CitaMedica("2024-09-25", "10:30", paciente, profesional);
        
        System.out.println(cita);
        cita.confirmarCita();
        
        // Reprogramar cita
        System.out.println("\n" + "=".repeat(40) + "\n");
        cita.reprogramarCita("2024-09-26", "14:00");
        cita.confirmarCita();
        
        // Crear otra cita con diferente profesional
        System.out.println("\n" + "=".repeat(40) + "\n");
        Profesional profesional2 = new Profesional("Dra. Ana Martínez", "Dermatología");
        CitaMedica cita2 = new CitaMedica("2024-09-30", "16:15", paciente, profesional2);
        cita2.confirmarCita();
        
        // Cancelar cita
        System.out.println("\n" + "=".repeat(40) + "\n");
        cita2.cancelarCita();
        
        // Demostrar que paciente y profesional existen independientemente
        System.out.println("\nPaciente original sigue existiendo: " + paciente.getNombre());
        System.out.println("Profesional original sigue existiendo: " + profesional.getNombre());
    }
}