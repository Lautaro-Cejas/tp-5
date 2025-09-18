/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        // Crear objetos independientes
        Usuario usuario1 = new Usuario("Juan Pérez", "juan@email.com");
        Usuario usuario2 = new Usuario("María Gómez", "maria@email.com");
        
        // Crear generador
        GeneradorQR generador = new GeneradorQR();
        
        System.out.println("=== INFORMACIÓN DE USUARIOS ===");
        System.out.println("Usuario 1: " + usuario1.getNombre() + " - " + usuario1.getEmail());
        System.out.println("Usuario 2: " + usuario2.getNombre() + " - " + usuario2.getEmail());
        
        // Demostrar asociación unidireccional (simulada ya que se crea en el método)
        System.out.println("\n=== ASOCIACIÓN UNIDIRECCIONAL ===");
        System.out.println("El CódigoQR conocerá a su usuario cuando se cree");
        System.out.println("El usuario NO conoce automáticamente sus códigos QR (unidireccional)");
        
        // Demostrar DEPENDENCIA DE CREACIÓN: El generador crea los códigos QR en runtime
        System.out.println("\n=== DEPENDENCIA DE CREACIÓN ===");
        System.out.println("El generador NO guarda códigos QR como atributos");
        System.out.println("Solo los crea en tiempo de ejecución en los métodos:");
        
        generador.generar("https://sitio.com", usuario1);
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        generador.generar("Texto de prueba", usuario2);
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Generar con opciones
        generador.generarConOpciones("Contacto", usuario1, "Rojo", 300);
        
        // Generar batch
        System.out.println("\n=== GENERACIÓN BATCH ===");
        String[] valores = {"Valor1", "Valor2", "Valor3"};
        generador.generarBatch(valores, usuario2);
        
        System.out.println("\n=== VERIFICAR DEPENDENCIA DE CREACIÓN ===");
        System.out.println("Después de generar, el generador no mantiene ningún código QR guardado");
        System.out.println("Los códigos QR se crean y descartan en cada método");
    }
}