/**
 * Clase Reproductor - DEPENDENCIA DE USO con Cancion
 * NO guarda la canción como atributo, solo la usa como parámetro del método
 * @author Lautaro Cejas
 */
public class Reproductor {
    private int volumen;
    private boolean reproduciendo;
    private String estado;
    
    public Reproductor() {
        this.volumen = 50; // Volumen por defecto
        this.reproduciendo = false;
        this.estado = "Detenido";
    }
    
    // DEPENDENCIA DE USO: No guarda la canción como atributo,
    // solo la usa como parámetro del método
    public void reproducir(Cancion cancion) {
        this.reproduciendo = true;
        this.estado = "Reproduciendo";
        
        System.out.println("♪ ♫ REPRODUCIENDO ♫ ♪");
        System.out.println("Canción: " + cancion.getTitulo());
        System.out.println("Artista: " + cancion.getArtista().getNombre());
        System.out.println("Género: " + cancion.getArtista().getGenero());
        System.out.println("Volumen: " + this.volumen + "%");
        System.out.println("Estado: " + this.estado);
        System.out.println("♪ ♫ ♪ ♫ ♪ ♫ ♪ ♫ ♪");
    }
    
    public void pausar() {
        if (this.reproduciendo) {
            this.reproduciendo = false;
            this.estado = "Pausado";
            System.out.println("⏸ Reproducción pausada");
        } else {
            System.out.println("No hay reproducción activa");
        }
    }
    
    public void detener() {
        this.reproduciendo = false;
        this.estado = "Detenido";
        System.out.println("⏹ Reproducción detenida");
    }
    
    public void ajustarVolumen(int nuevoVolumen) {
        if (nuevoVolumen >= 0 && nuevoVolumen <= 100) {
            this.volumen = nuevoVolumen;
            System.out.println("🔊 Volumen ajustado a: " + this.volumen + "%");
        } else {
            System.out.println("Volumen debe estar entre 0 y 100");
        }
    }
    
    public void avanzar(int segundos) {
        System.out.println("⏩ Avanzando " + segundos + " segundos");
    }
    
    public void retroceder(int segundos) {
        System.out.println("⏪ Retrocediendo " + segundos + " segundos");
    }
    
    // DEPENDENCIA DE USO múltiple: Recibe array de canciones como parámetro
    public void reproducirPlaylist(Cancion[] canciones) {
        System.out.println("🎵 INICIANDO PLAYLIST 🎵");
        for (int i = 0; i < canciones.length; i++) {
            System.out.println("--- Pista " + (i + 1) + " ---");
            reproducir(canciones[i]);
            System.out.println();
        }
        System.out.println("🎵 PLAYLIST FINALIZADA 🎵");
    }
    
    public void mostrarEstado() {
        System.out.println("Estado del reproductor:");
        System.out.println("- Estado: " + this.estado);
        System.out.println("- Volumen: " + this.volumen + "%");
        System.out.println("- Reproduciendo: " + this.reproduciendo);
    }
}