/**
 * @author Lautaro Cejas
 */
class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // Agregación - puede existir independientemente
    private Conductor conductor; // Asociación bidireccional
    
    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; // Agregación: se asigna un motor existente
        this.conductor = conductor;
        // Establecer la relación bidireccional
        if (conductor != null) {
            conductor.setVehiculo(this);
        }
    }
    
    // Constructor alternativo sin motor
    public Vehiculo(String patente, String modelo, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.conductor = conductor;
        if (conductor != null) {
            conductor.setVehiculo(this);
        }
    }
    
    public String getPatente() {
        return patente;
    }
    
    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Motor getMotor() {
        return motor;
    }
    
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public Conductor getConductor() {
        return conductor;
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null) {
            conductor.setVehiculo(this);
        }
    }
    
    public void encender() {
        if (motor != null) {
            System.out.println("Encendiendo vehículo " + modelo + " con motor " + motor.getTipo());
        } else {
            System.out.println("No se puede encender: vehículo sin motor");
        }
    }
    
    @Override
    public String toString() {
        return "Vehiculo{patente='" + patente + "', modelo='" + modelo + "', motor=" + motor + ", conductor=" + conductor + "}";
    }
}