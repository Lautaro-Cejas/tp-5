/**
 * Clase GeneradorQR - DEPENDENCIA DE CREACIÓN con CodigoQR y USO con Usuario
 * NO guarda el código QR como atributo, solo lo crea en tiempo de ejecución
 * @author Lautaro Cejas
 */
public class GeneradorQR {
    
    // DEPENDENCIA DE CREACIÓN: Crea el código QR en el método, no lo guarda
    // DEPENDENCIA DE USO: Usa usuario como parámetro
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        
        System.out.println("=== GENERACIÓN DE CÓDIGO QR ===");
        System.out.println("Usuario: " + codigoQR.getUsuario().getNombre());
        System.out.println("Email: " + codigoQR.getUsuario().getEmail());
        System.out.println("Valor del QR: " + codigoQR.getValor());
        
        // Simular generación de QR con diferentes formatos
        System.out.println("--- FORMATOS DISPONIBLES ---");
        System.out.println("Formato PNG: qr_" + valor + ".png");
        System.out.println("Formato SVG: qr_" + valor + ".svg");
        System.out.println("Formato PDF: qr_" + valor + ".pdf");
        System.out.println("============================");
    }
    
    // DEPENDENCIA DE CREACIÓN: Crea código QR con opciones adicionales
    public void generarConOpciones(String valor, Usuario usuario, String color, int tamano) {
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        
        System.out.println("=== GENERACIÓN CON OPCIONES ===");
        System.out.println("Usuario: " + codigoQR.getUsuario().getNombre());
        System.out.println("Valor: " + codigoQR.getValor());
        System.out.println("Color: " + color);
        System.out.println("Tamaño: " + tamano + "x" + tamano);
        System.out.println("Archivo generado: qr_custom_" + valor + ".png");
        System.out.println("=============================");
    }
    
    // DEPENDENCIA DE CREACIÓN múltiple: Crea varios códigos QR
    public void generarBatch(String[] valores, Usuario usuario) {
        System.out.println("=== GENERACIÓN EN BATCH ===");
        System.out.println("Usuario: " + usuario.getNombre());
        
        for (int i = 0; i < valores.length; i++) {
            CodigoQR codigoQR = new CodigoQR(valores[i], usuario);
            System.out.println("QR " + (i + 1) + ": " + codigoQR.getValor());
        }
        
        System.out.println("Total generados: " + valores.length);
        System.out.println("========================");
    }
    
    // DEPENDENCIA DE CREACIÓN: Genera QR temporal para verificación
    public void verificarGeneracion(String valor, Usuario usuario) {
        CodigoQR codigoQRTemp = new CodigoQR(valor, usuario);
        
        System.out.println("=== VERIFICACIÓN DE QR ===");
        System.out.println("Usuario: " + codigoQRTemp.getUsuario().getNombre());
        System.out.println("Valor temporal: " + codigoQRTemp.getValor());
        System.out.println("Verificación: OK");
        System.out.println("========================");
        
        // El QR se descarta después del método
    }
    
    // DEPENDENCIA DE CREACIÓN: Genera QR con tipo específico
    public void generarPorTipo(String valor, Usuario usuario, String tipo) {
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        
        String descripcionTipo;
        switch (tipo.toLowerCase()) {
            case "url":
                descripcionTipo = "Enlace a sitio web";
                break;
            case "texto":
                descripcionTipo = "Mensaje de texto";
                break;
            case "contacto":
                descripcionTipo = "Información de contacto";
                break;
            default:
                descripcionTipo = "Tipo genérico";
        }
        
        System.out.println("=== GENERACIÓN POR TIPO ===");
        System.out.println("Usuario: " + codigoQR.getUsuario().getNombre());
        System.out.println("Valor: " + codigoQR.getValor());
        System.out.println("Tipo: " + tipo);
        System.out.println("Descripción: " + descripcionTipo);
        System.out.println("==========================");
    }
}