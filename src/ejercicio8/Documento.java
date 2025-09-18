/**
 * @author Lautaro Cejas
 */
class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composición - la firma se crea con el documento
    
    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        // Composición: se crea la firma digital al crear el documento
        this.firmaDigital = new FirmaDigital(
            "HASH_" + System.currentTimeMillis(), 
            java.time.LocalDate.now().toString(), 
            usuario
        );
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
    
    @Override
    public String toString() {
        return "Documento{titulo='" + titulo + "', contenido='" + contenido + "', firmaDigital=" + firmaDigital + "}";
    }
}