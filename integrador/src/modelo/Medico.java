package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
@Entity
@DiscriminatorValue("Medico")
public class Medico extends Persona {
    private String numeroMatricula;
    
    @ManyToMany
    private List<Especialidad> especialidad;
   
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horarioinicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horariofinal;
    private int turno;
    
    public String getNumeroMatricula() {
        return numeroMatricula;
    }
    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
   
    public Date getHorarioinicio() {
        return horarioinicio;
    }
    public void setHorarioinicio(Date horarioinicio) {
        this.horarioinicio = horarioinicio;
    }
    public Date getHorariofinal() {
        return horariofinal;
    }
    public void setHorariofinal(Date horariofinal) {
        this.horariofinal = horariofinal;
    }
      public List<Especialidad> getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(List<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }
    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    }
    
public Medico(String DNI, String apellidos, String nombres, Date fechanacimiento, String calle, String numero, String localidad, String provincia, String mail, String Telefono, String NMatricula){
    super.setDni(DNI);
    super.setNombres(nombres);
    super.setApellidos(apellidos);
    super.setFechaNacimiento(fechanacimiento);
    super.setTelefono(Telefono);
    super.setMail(mail);
    Domicilio d = new Domicilio(calle, numero, localidad, provincia);
    super.setDomicilio(d);
    this.numeroMatricula = NMatricula;
}

 public Medico(String dni, String matricula, Date horaComienza, Date horaTermina, String nombres, String apellidos, String telefono, String mail, Date fechaNacimiento, String calle, String numero, String localidad, String provincia, Especialidad especialidad) {
        super.setDni(dni);
        this.numeroMatricula = matricula;
        super.setNombres(nombres);
        super.setApellidos(apellidos);
        super.setTelefono(telefono);
        super.setMail(mail);
        super.setFechaNacimiento(fechaNacimiento);
        Domicilio d = new Domicilio(calle, numero, localidad, provincia);
        super.setDomicilio(d);
        this.especialidad = new ArrayList<>();
    }

public Medico(){
    this.especialidad = new ArrayList<>();
}
public void agregarEspecialidad(Especialidad e){
    this.especialidad.add(e);
}

public void quitarEspecialidad(Especialidad e){
    this.especialidad.remove(e);
}

}
