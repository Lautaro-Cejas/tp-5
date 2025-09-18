/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        // Crear objetos independientes
        Proyecto proyecto1 = new Proyecto("Video Corporativo", 15);
        Proyecto proyecto2 = new Proyecto("Documental", 45);

        // Crear editor
        EditorVideo editor = new EditorVideo();

        System.out.println("=== INFORMACIÓN DE PROYECTOS ===");
        System.out.println("Proyecto 1: " + proyecto1.getNombre() + " - " + proyecto1.getDuracionMin() + " min");
        System.out.println("Proyecto 2: " + proyecto2.getNombre() + " - " + proyecto2.getDuracionMin() + " min");

        // Demostrar asociación unidireccional (simulada ya que se crea en el método)
        System.out.println("\n=== ASOCIACIÓN UNIDIRECCIONAL ===");
        System.out.println("El Render conocerá a su proyecto cuando se cree");
        System.out.println("El proyecto NO conoce automáticamente sus renders (unidireccional)");

        // Demostrar DEPENDENCIA DE CREACIÓN: El editor crea los renders en runtime
        System.out.println("\n=== DEPENDENCIA DE CREACIÓN ===");
        System.out.println("El editor NO guarda renders como atributos");
        System.out.println("Solo los crea en tiempo de ejecución en los métodos:");

        editor.exportar("MP4", proyecto1);
        System.out.println("\n" + "=".repeat(50) + "\n");

        editor.exportar("AVI", proyecto2);
        System.out.println("\n" + "=".repeat(50) + "\n");

        // Exportar con calidad
        editor.exportarConCalidad("MOV", proyecto1, "Alta");

        // Exportar batch
        System.out.println("\n=== EXPORTACIÓN BATCH ===");
        String[] formatos = {"MP4", "WEBM", "MKV"};
        editor.exportarBatch(proyecto2, formatos);

        System.out.println("\n=== VERIFICAR DEPENDENCIA DE CREACIÓN ===");
        System.out.println("Después de exportar, el editor no mantiene ningún render guardado");
        System.out.println("Los renders se crean y descartan en cada método");
    }
}