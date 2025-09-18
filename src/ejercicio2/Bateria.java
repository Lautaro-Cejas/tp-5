/**
 * Clase Batería - Parte de la agregación con Celular
 * Esta clase puede existir independientemente del Celular (agregación)
 * @author Lautaro Cejas
 */
public class Bateria {
    private String modelo;
    private int capacidad;
    
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString() {
        return "Bateria{" +
                "modelo='" + modelo + '\'' +
                ", capacidad=" + capacidad + "mAh" +
                '}';
    }
}