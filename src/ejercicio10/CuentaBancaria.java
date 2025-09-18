/**
 * Clase CuentaBancaria con composición a ClaveSeguridad y asociación bidireccional con Titular
 * @author Lautaro Cejas
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición - se crea con la cuenta
    private Titular titular; // Asociación bidireccional
    
    public CuentaBancaria(String cbu, double saldo, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.titular = titular;
        
        // COMPOSICIÓN: se crea la clave de seguridad automáticamente al crear la cuenta
        this.claveSeguridad = new ClaveSeguridad("CLAVE_" + System.currentTimeMillis(), java.time.LocalDate.now().toString());
        
        // Establecer la relación bidireccional
        if (titular != null) {
            titular.setCuentaBancaria(this);
        }
    }
    
    public String getCbu() {
        return cbu;
    }
    
    public void setCbu(String cbu) {
        this.cbu = cbu;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular) {
        // Romper relación bidireccional anterior si existe
        if (this.titular != null) {
            this.titular.setCuentaBancaria(null);
        }
        
        this.titular = titular;
        
        // Establecer nueva relación bidireccional
        if (titular != null) {
            titular.setCuentaBancaria(this);
        }
    }
    
    // Métodos específicos de cuenta bancaria
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito realizado: $" + monto);
            System.out.println("Nuevo saldo: $" + this.saldo);
        } else {
            System.out.println("El monto debe ser positivo");
        }
    }
    
    public void retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro realizado: $" + monto);
            System.out.println("Nuevo saldo: $" + this.saldo);
        } else if (monto > this.saldo) {
            System.out.println("Fondos insuficientes");
        } else {
            System.out.println("El monto debe ser positivo");
        }
    }
    
    public void consultarSaldo() {
        System.out.println("Saldo actual de " + titular.getNombre() + ": $" + this.saldo);
    }
    
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cbu='" + cbu + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titular +
                ", claveSeguridad=" + claveSeguridad +
                '}';
    }
}