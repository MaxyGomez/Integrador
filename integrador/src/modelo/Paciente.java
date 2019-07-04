package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import javax.persistence.*;
@Entity
@DiscriminatorValue("paciente")

public class Paciente extends Persona {

    private String historial;
    @OneToMany(mappedBy = "paciente")
    private List<Historia> historiaClinica;
    @OneToMany(mappedBy = "paciente")
    private List<Cita> listaCitas;
    
    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public List<Historia> getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(List<Historia> historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public List<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(List<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    public Paciente() {
        this.historiaClinica = new ArrayList();
        this.listaCitas = new ArrayList();
    }
    public void setNombres (String nombre){
        super.setNombres(nombre);
    }
    public Paciente(String DNI, String apellidos, String nombres, Date fechanacimiento, String calle, String numero, String localidad, String provincia, String mail, String Telefono, String historial) {
        super.setDni(DNI);
        super.setNombres(nombres);
        super.setApellidos(apellidos);
        super.setFechaNacimiento(fechanacimiento);
        super.setTelefono(Telefono);
        super.setMail(mail);
        this.historial = historial;
        Domicilio d = new Domicilio(calle, numero, localidad, provincia);
        super.setDomicilio(d);
        this.historiaClinica = new ArrayList();
        this.listaCitas = new ArrayList();
    }     
    
    public void agregarHistoriaClinica(Historia h) {
        this.historiaClinica.add(h);
    }

    public void quitarHustoriaClinica(Historia h) {
        this.historiaClinica.remove(h);
    }
    
    public void agregarCitas(Cita c) {
        this.listaCitas.add(c);
    }

    public void quitarCita(Cita c) {
        this.listaCitas.remove(c);
    }
    
    
    @Override
    public String toString() {
        return super.getDni() +" "+ super.getApellidos() +" "+ super.getNombres();
    }
}
