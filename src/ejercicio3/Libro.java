/**
 * Clase Libro con asociación unidireccional a Autor y agregación a Editorial
 * @author Lautaro Cejas
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor; // Asociación unidireccional - el libro conoce a su autor
    private Editorial editorial; // Agregación - puede existir independientemente
    
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor; // Asociación unidireccional: el libro conoce al autor
        this.editorial = editorial; // Agregación: se asigna una editorial existente
    }
    
    // Constructor alternativo sin editorial (para demostrar agregación)
    public Libro(String titulo, String isbn, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        // La editorial queda null inicialmente
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public Editorial getEditorial() {
        return editorial;
    }
    
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor=" + autor +
                ", editorial=" + editorial +
                '}';
    }
}