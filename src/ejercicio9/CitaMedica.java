class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente; // Asociación unidireccional - la cita conoce al paciente
    private Profesional profesional; // Asociación unidireccional - la cita conoce al profesional
    
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente; // Asociación unidireccional
        this.profesional = profesional; // Asociación unidireccional
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Profesional getProfesional() {
        return profesional;
    }
    
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    public void confirmarCita() {
        System.out.println("=== CONFIRMACIÓN DE CITA MÉDICA ===");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Obra Social: " + paciente.getObraSocial());
        System.out.println("Profesional: Dr/a " + profesional.getNombre());
        System.out.println("Especialidad: " + profesional.getEspecialidad());
        System.out.println("=====================================");
    }
    
    public void reprogramarCita(String nuevaFecha, String nuevaHora) {
        System.out.println("Reprogramando cita de " + fecha + " " + hora + 
                         " a " + nuevaFecha + " " + nuevaHora);
        this.fecha = nuevaFecha;
        this.hora = nuevaHora;
        System.out.println("Cita reprogramada exitosamente");
    }
    
    public void cancelarCita() {
        System.out.println("Cita cancelada para " + paciente.getNombre() + 
                         " con Dr/a " + profesional.getNombre() + 
                         " del " + fecha + " a las " + hora);
    }
    
    @Override
    public String toString() {
        return "CitaMedica{fecha='" + fecha + "', hora='" + hora + "', paciente=" + paciente + ", profesional=" + profesional + "}";
    }
}