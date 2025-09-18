/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        // Crear objetos independientes
        Artista artista1 = new Artista("The Beatles", "Rock");
        Artista artista2 = new Artista("Queen", "Rock");
        
        // Crear canciones con asociación unidireccional al artista
        Cancion cancion1 = new Cancion("Hey Jude", artista1);
        Cancion cancion2 = new Cancion("Bohemian Rhapsody", artista2);
        Cancion cancion3 = new Cancion("Come Together", artista1);
        
        // Crear reproductor
        Reproductor reproductor = new Reproductor();
        
        System.out.println("=== INFORMACIÓN DE CANCIONES ===");
        System.out.println("Canción 1: " + cancion1.getTitulo() + " - " + cancion1.getArtista().getNombre());
        System.out.println("Canción 2: " + cancion2.getTitulo() + " - " + cancion2.getArtista().getNombre());
        System.out.println("Canción 3: " + cancion3.getTitulo() + " - " + cancion3.getArtista().getNombre());
        
        // Demostrar asociación unidireccional
        System.out.println("\n=== ASOCIACIÓN UNIDIRECCIONAL ===");
        System.out.println("La canción conoce a su artista: " + cancion1.getArtista().getNombre());
        System.out.println("El artista NO conoce automáticamente sus canciones (unidireccional)");
        
        // Demostrar DEPENDENCIA DE USO: El reproductor usa las canciones como parámetros
        System.out.println("\n=== DEPENDENCIA DE USO ===");
        System.out.println("El reproductor NO guarda canciones como atributos");
        System.out.println("Solo las usa como parámetros en los métodos:");
        
        reproductor.reproducir(cancion1);
        reproductor.pausar();
        
        reproductor.reproducir(cancion2);
        reproductor.detener();
        
        reproductor.reproducir(cancion3);
        reproductor.ajustarVolumen(75);
        reproductor.avanzar(30);
        reproductor.pausar();
        
        // Crear playlist y reproducir
        System.out.println("\n=== PLAYLIST DEMO ===");
        Cancion[] playlist = {cancion1, cancion2, cancion3};
        reproductor.reproducirPlaylist(playlist);
        
        // Mostrar que el reproductor no mantiene referencias
        System.out.println("\n=== VERIFICAR DEPENDENCIA DE USO ===");
        System.out.println("Después de reproducir, el reproductor no mantiene ninguna canción guardada");
        System.out.println("Las canciones existen independientemente del reproductor");
    }
}