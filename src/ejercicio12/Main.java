/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        // Crear objetos independientes
        Contribuyente contribuyente1 = new Contribuyente("Carlos López", "20-12345678-9");
        Contribuyente contribuyente2 = new Contribuyente("Ana Martínez", "27-87654321-4");
        
        // Crear impuestos con asociación unidireccional al contribuyente
        Impuesto impuesto1 = new Impuesto(50000.0, contribuyente1);
        Impuesto impuesto2 = new Impuesto(75000.0, contribuyente2);
        Impuesto impuesto3 = new Impuesto(120000.0, contribuyente1);
        
        // Crear calculadora
        Calculadora calculadora = new Calculadora();
        
        System.out.println("=== INFORMACIÓN DE IMPUESTOS ===");
        System.out.println("Impuesto 1: $" + impuesto1.getMonto() + " - " + impuesto1.getContribuyente().getNombre());
        System.out.println("Impuesto 2: $" + impuesto2.getMonto() + " - " + impuesto2.getContribuyente().getNombre());
        System.out.println("Impuesto 3: $" + impuesto3.getMonto() + " - " + impuesto3.getContribuyente().getNombre());
        
        // Demostrar asociación unidireccional
        System.out.println("\n=== ASOCIACIÓN UNIDIRECCIONAL ===");
        System.out.println("El impuesto conoce a su contribuyente: " + impuesto1.getContribuyente().getNombre());
        System.out.println("El contribuyente NO conoce automáticamente sus impuestos (unidireccional)");
        
        // Demostrar DEPENDENCIA DE USO: La calculadora usa los impuestos como parámetros
        System.out.println("\n=== DEPENDENCIA DE USO ===");
        System.out.println("La calculadora NO guarda impuestos como atributos");
        System.out.println("Solo los usa como parámetros en los métodos:");
        
        calculadora.calcular(impuesto1);
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        calculadora.calcular(impuesto2);
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Calcular descuentos
        double descuento1 = calculadora.calcularDescuento(impuesto1, 15);
        double descuento2 = calculadora.calcularDescuento(impuesto3, 10);
        
        System.out.println("\n=== ANÁLISIS COMPARATIVO ===");
        calculadora.compararImpuestos(impuesto1, impuesto2, impuesto3);
        
        System.out.println("\n=== VERIFICAR DEPENDENCIA DE USO ===");
        System.out.println("Después de calcular, la calculadora no mantiene ningún impuesto guardado");
        System.out.println("Los impuestos existen independientemente de la calculadora");
    }
}