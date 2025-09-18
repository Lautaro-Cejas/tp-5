/**
 * Clase Calculadora - DEPENDENCIA DE USO con Impuesto
 * NO guarda el impuesto como atributo, solo lo usa como parámetro del método
 * @author Lautaro Cejas
 */
public class Calculadora {
    
    // DEPENDENCIA DE USO: No guarda el impuesto como atributo,
    // solo lo usa como parámetro del método
    public void calcular(Impuesto impuesto) {
        System.out.println("=== CÁLCULO DE IMPUESTO ===");
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
        System.out.println("Monto base: $" + impuesto.getMonto());
        
        // Ejemplo de cálculo con diferentes alícuotas
        double montoBase = impuesto.getMonto();
        double iva = montoBase * 0.21;
        double ganancias = montoBase * 0.35;
        double ingresosBrutos = montoBase * 0.05;
        double total = montoBase + iva + ganancias + ingresosBrutos;
        
        System.out.println("--- DETALLE DE IMPUESTOS ---");
        System.out.println("IVA (21%): $" + String.format("%.2f", iva));
        System.out.println("Ganancias (35%): $" + String.format("%.2f", ganancias));
        System.out.println("Ingresos Brutos (5%): $" + String.format("%.2f", ingresosBrutos));
        System.out.println("TOTAL A PAGAR: $" + String.format("%.2f", total));
        System.out.println("============================");
    }
    
    // DEPENDENCIA DE USO: Recibe impuesto como parámetro temporal
    public double calcularDescuento(Impuesto impuesto, double porcentajeDescuento) {
        double descuento = impuesto.getMonto() * (porcentajeDescuento / 100);
        double montoConDescuento = impuesto.getMonto() - descuento;
        
        System.out.println("=== CÁLCULO DE DESCUENTO ===");
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto original: $" + impuesto.getMonto());
        System.out.println("Descuento (" + porcentajeDescuento + "%): $" + String.format("%.2f", descuento));
        System.out.println("Monto con descuento: $" + String.format("%.2f", montoConDescuento));
        System.out.println("=============================");
        
        return descuento;
    }
    
    // DEPENDENCIA DE USO múltiple: Recibe varios impuestos como parámetros
    public void compararImpuestos(Impuesto... impuestos) {
        System.out.println("=== ANÁLISIS COMPARATIVO ===");
        
        double totalGeneral = 0;
        double impuestoMasAlto = 0;
        String contribuyenteMasAlto = "";
        
        for (int i = 0; i < impuestos.length; i++) {
            Impuesto impuesto = impuestos[i];
            System.out.println("Impuesto " + (i + 1) + ": " + 
                             impuesto.getContribuyente().getNombre() + 
                             " - $" + impuesto.getMonto());
            
            totalGeneral += impuesto.getMonto();
            
            if (impuesto.getMonto() > impuestoMasAlto) {
                impuestoMasAlto = impuesto.getMonto();
                contribuyenteMasAlto = impuesto.getContribuyente().getNombre();
            }
        }
        
        double promedio = totalGeneral / impuestos.length;
        
        System.out.println("--- ESTADÍSTICAS ---");
        System.out.println("Total general: $" + String.format("%.2f", totalGeneral));
        System.out.println("Promedio: $" + String.format("%.2f", promedio));
        System.out.println("Impuesto más alto: " + contribuyenteMasAlto + " con $" + String.format("%.2f", impuestoMasAlto));
        System.out.println("====================");
    }
    
    // DEPENDENCIA DE USO: Calcula proyección anual
    public void calcularProyeccionAnual(Impuesto impuesto, int meses) {
        double proyeccionAnual = impuesto.getMonto() * meses;
        
        System.out.println("=== PROYECCIÓN ANUAL ===");
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("Impuesto mensual: $" + impuesto.getMonto());
        System.out.println("Proyección " + meses + " meses: $" + String.format("%.2f", proyeccionAnual));
        System.out.println("========================");
    }
    
    // DEPENDENCIA DE USO: Aplica diferentes categorías fiscales
    public void aplicarCategoriaFiscal(Impuesto impuesto, String categoria) {
        double multiplicador = 1.0;
        
        switch (categoria.toLowerCase()) {
            case "monotributo":
                multiplicador = 0.5;
                break;
            case "responsable inscripto":
                multiplicador = 1.0;
                break;
            case "exento":
                multiplicador = 0.0;
                break;
            default:
                multiplicador = 1.0;
        }
        
        double montoAjustado = impuesto.getMonto() * multiplicador;
        
        System.out.println("=== APLICACIÓN CATEGORÍA FISCAL ===");
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("Categoría: " + categoria);
        System.out.println("Monto original: $" + impuesto.getMonto());
        System.out.println("Monto ajustado: $" + String.format("%.2f", montoAjustado));
        System.out.println("====================================");
    }
}