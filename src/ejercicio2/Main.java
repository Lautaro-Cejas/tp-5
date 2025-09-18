/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        // La batería puede existir independientemente (agregación)
        Bateria bateria = new Bateria("Li-Ion 4000", 4000);
        Usuario usuario = new Usuario("María González", "87654321");
        
        // Crear celular con batería existente y usuario
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21", bateria, usuario);
        
        System.out.println("=== INFORMACIÓN DEL CELULAR ===");
        System.out.println("IMEI: " + celular.getImei());
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("DNI: " + celular.getUsuario().getDni());
        System.out.println("Batería: " + celular.getBateria().getModelo());
        System.out.println("Capacidad: " + celular.getBateria().getCapacidad() + "mAh");
        
        // Demostrar relación bidireccional
        System.out.println("\n=== RELACIÓN BIDIRECCIONAL ===");
        System.out.println("Celular del usuario: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());
        
        // Demostrar agregación: cambiar batería
        System.out.println("\n=== AGREGACIÓN - CAMBIO DE BATERÍA ===");
        Bateria nuevaBateria = new Bateria("Li-Po 5000", 5000);
        celular.setBateria(nuevaBateria);
        System.out.println("Nueva batería instalada: " + celular.getBateria().getModelo() + " - " + celular.getBateria().getCapacidad() + "mAh");
        
        // La batería original sigue existiendo independientemente
        System.out.println("Batería original sigue existiendo: " + bateria.getModelo() + " - " + bateria.getCapacidad() + "mAh");
        
        // Ejemplo de celular sin batería inicialmente
        System.out.println("\n=== CELULAR SIN BATERÍA ===");
        Usuario usuario2 = new Usuario("Carlos López", "11223344");
        Celular celular2 = new Celular("987654321098765", "iPhone", "13 Pro", usuario2);
        System.out.println("Celular sin batería: " + celular2.getMarca() + " " + celular2.getModelo());
        System.out.println("Batería: " + celular2.getBateria()); // null
    }
}