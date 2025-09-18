/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("María García", "12345678");
        
        // Crear cuenta bancaria (que automáticamente crea la clave de seguridad - composición)
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 5000.0, titular);
        
        System.out.println("=== INFORMACIÓN DE LA CUENTA ===");
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("DNI: " + cuenta.getTitular().getDni());
        System.out.println("Clave de Seguridad: " + cuenta.getClaveSeguridad().getCodigo());
        System.out.println("Última modificación: " + cuenta.getClaveSeguridad().getUltimaModificacion());
        
        // Demostrar relación bidireccional
        System.out.println("\n=== RELACIÓN BIDIRECCIONAL ===");
        System.out.println("Cuenta del titular: " + titular.getCuentaBancaria().getCbu());
        
        // Demostrar composición: la clave se creó automáticamente
        System.out.println("\n=== COMPOSICIÓN ===");
        System.out.println("La clave de seguridad se creó automáticamente con la cuenta:");
        System.out.println("Código generado: " + cuenta.getClaveSeguridad().getCodigo());
        System.out.println("Fecha creación: " + cuenta.getClaveSeguridad().getUltimaModificacion());
        
        // Cambio de titular (asociación bidireccional)
        System.out.println("\n=== CAMBIO DE TITULAR ===");
        Titular nuevoTitular = new Titular("Carlos López", "87654321");
        cuenta.setTitular(nuevoTitular);
        System.out.println("Nuevo titular: " + cuenta.getTitular().getNombre());
        System.out.println("Cuenta del nuevo titular: " + nuevoTitular.getCuentaBancaria().getCbu());
        
        // El titular original ya no tiene cuenta
        System.out.println("Titular original sin cuenta: " + titular.getCuentaBancaria()); // null
        
        // Operaciones bancarias
        System.out.println("\n=== OPERACIONES BANCARIAS ===");
        cuenta.depositar(1500.0);
        cuenta.retirar(500.0);
        cuenta.consultarSaldo();
        
        // Actualizar clave de seguridad
        System.out.println("\n=== ACTUALIZACIÓN DE CLAVE ===");
        cuenta.getClaveSeguridad().actualizarClave("NUEVA_CLAVE_2024");
    }
}