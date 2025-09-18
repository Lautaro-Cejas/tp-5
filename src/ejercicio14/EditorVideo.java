/**
 * Clase EditorVideo - DEPENDENCIA DE CREACIÓN con Render y USO con Proyecto
 * NO guarda el render como atributo, solo lo crea en tiempo de ejecución
 * @author Lautaro Cejas
 */
public class EditorVideo {

    // DEPENDENCIA DE CREACIÓN: Crea el render en el método, no lo guarda
    // DEPENDENCIA DE USO: Usa proyecto como parámetro
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);

        System.out.println("=== EXPORTACIÓN DE VIDEO ===");
        System.out.println("Proyecto: " + render.getProyecto().getNombre());
        System.out.println("Duración: " + render.getProyecto().getDuracionMin() + " minutos");
        System.out.println("Formato de exportación: " + render.getFormato());

        // Simular tiempos de render
        int tiempoEstimado = proyecto.getDuracionMin() * 2;
        System.out.println("--- DETALLES ---");
        System.out.println("Tiempo estimado: " + tiempoEstimado + " minutos");
        System.out.println("Archivo: " + proyecto.getNombre() + "." + formato.toLowerCase());
        System.out.println("==========================");
    }

    // DEPENDENCIA DE CREACIÓN: Exporta con calidad específica
    public void exportarConCalidad(String formato, Proyecto proyecto, String calidad) {
        Render render = new Render(formato, proyecto);

        String resolucion;
        switch (calidad.toLowerCase()) {
            case "alta":
                resolucion = "4K";
                break;
            case "media":
                resolucion = "1080p";
                break;
            case "baja":
                resolucion = "720p";
                break;
            default:
                resolucion = "1080p";
        }

        System.out.println("=== EXPORTACIÓN CON CALIDAD ===");
        System.out.println("Proyecto: " + render.getProyecto().getNombre());
        System.out.println("Formato: " + render.getFormato());
        System.out.println("Calidad: " + calidad);
        System.out.println("Resolución: " + resolucion);
        System.out.println("===============================");
    }

    // DEPENDENCIA DE CREACIÓN múltiple: Exporta varios renders
    public void exportarBatch(Proyecto proyecto, String... formatos) {
        System.out.println("=== EXPORTACIÓN EN BATCH ===");
        System.out.println("Proyecto: " + proyecto.getNombre());

        for (int i = 0; i < formatos.length; i++) {
            Render render = new Render(formatos[i], proyecto);
            System.out.println("Render " + (i + 1) + ": " + render.getFormato());
        }

        System.out.println("Total exportados: " + formatos.length);
        System.out.println("==========================");
    }

    // DEPENDENCIA DE CREACIÓN: Previsualiza render
    public void previsualizar(String formato, Proyecto proyecto) {
        Render renderTemp = new Render(formato, proyecto);

        System.out.println("=== PREVISUALIZACIÓN ===");
        System.out.println("Proyecto: " + renderTemp.getProyecto().getNombre());
        System.out.println("Formato temporal: " + renderTemp.getFormato());
        System.out.println("Duración: " + renderTemp.getProyecto().getDuracionMin() + " min");
        System.out.println("Previsualización: OK");
        System.out.println("=======================");

        // El render se descarta después
    }

    // DEPENDENCIA DE CREACIÓN: Exporta con efectos
    public void exportarConEfectos(String formato, Proyecto proyecto, int numEfectos) {
        Render render = new Render(formato, proyecto);

        System.out.println("=== EXPORTACIÓN CON EFECTOS ===");
        System.out.println("Proyecto: " + render.getProyecto().getNombre());
        System.out.println("Formato: " + render.getFormato());
        System.out.println("Número de efectos: " + numEfectos);
        int tiempoExtra = numEfectos * 5;
        System.out.println("Tiempo extra por efectos: " + tiempoExtra + " minutos");
        System.out.println("================================");
    }
}