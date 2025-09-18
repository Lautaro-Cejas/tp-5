/**
 * @author Lautaro Cejas
 */
public class Main {
    public static void main(String[] args) {
        // El banco puede existir independientemente (agregación)
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente = new Cliente("Ana López", "98765432");
        
        // Crear tarjeta de crédito con asociación bidireccional al cliente y agregación al banco
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4567 8901 2345 6789", "12/2027", cliente, banco);
        
        System.out.println("=== INFORMACIÓN DE LA TARJETA ===");
        System.out.println("Número: " + tarjeta.getNumero());
        System.out.println("Vencimiento: " + tarjeta.getFechaVencimiento());
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("DNI Cliente: " + tarjeta.getCliente().getDni());
        System.out.println("Banco Emisor: " + tarjeta.getBanco().getNombre());
        System.out.println("CUIT Banco: " + tarjeta.getBanco().getCuit());
        
        // Demostrar relación bidireccional
        System.out.println("\n=== RELACIÓN BIDIRECCIONAL ===");
        System.out.println("Tarjeta del cliente: " + cliente.getTarjetaDeCredito().getNumero());
        System.out.println("Cliente de la tarjeta: " + tarjeta.getCliente().getNombre());
        
        // Demostrar agregación: cambiar banco emisor
        System.out.println("\n=== AGREGACIÓN - CAMBIO DE BANCO ===");
        Banco nuevoBanco = new Banco("Banco Santander", "30-98765432-1");
        tarjeta.setBanco(nuevoBanco);
        System.out.println("Nuevo banco emisor: " + tarjeta.getBanco().getNombre());
        System.out.println("CUIT: " + tarjeta.getBanco().getCuit());
        
        // El banco original sigue existiendo independientemente
        System.out.println("Banco original sigue existiendo: " + banco.getNombre());
        
        // Ejemplo de cambio de cliente (asociación bidireccional)
        System.out.println("\n=== CAMBIO DE CLIENTE (BIDIRECCIONAL) ===");
        Cliente nuevoCliente = new Cliente("Carlos Mendoza", "11223344");
        tarjeta.setCliente(nuevoCliente);
        System.out.println("Nuevo titular: " + tarjeta.getCliente().getNombre());
        System.out.println("Tarjeta del nuevo cliente: " + nuevoCliente.getTarjetaDeCredito().getNumero());
        
        // El cliente original ya no tiene tarjeta (se rompió la relación bidireccional)
        System.out.println("Cliente original sin tarjeta: " + cliente.getTarjetaDeCredito()); // null
        
        // Crear otra tarjeta con el mismo banco (agregación permite reutilización)
        System.out.println("\n=== REUTILIZACIÓN DE BANCO ===");
        Cliente cliente2 = new Cliente("María García", "55667788");
        TarjetaDeCredito tarjeta2 = new TarjetaDeCredito("1234 5678 9012 3456", "08/2026", cliente2, nuevoBanco);
        System.out.println("Segunda tarjeta del mismo banco: " + tarjeta2.getNumero());
        System.out.println("Banco: " + tarjeta2.getBanco().getNombre());
    }
}