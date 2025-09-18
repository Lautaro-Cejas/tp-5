// Documento - FirmaDigital - Usuario
// a. Composición: Documento → FirmaDigital
// b. Agregación: FirmaDigital → Usuario

/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan Pérez", "juan@email.com");
        Documento documento = new Documento("Contrato", "Contenido del contrato...", usuario);
        
        System.out.println(documento);
        System.out.println("Firma del documento: " + documento.getFirmaDigital());
    }
}