package modelo;

import java.util.Date;
import javax.persistence.*;
@Entity 
@Table (name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Tipo_persona")
public abstract class Persona {
    
    @Id
    @SequenceGenerator(name="sec_persona",initialValue=1,allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_persona")
    private int id;
    private String dni;
    private String nombres;
    private String apellidos;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;
    private String telefono;
    private String mail;
    @Embedded
    private Domicilio domicilio;

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return dni +" "+ nombres +" "+ apellidos;
    }
    
    
    
}
