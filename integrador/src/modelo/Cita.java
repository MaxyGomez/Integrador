package modelo;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="citas")
public class Cita {
    @Id
    @SequenceGenerator(name="sec_citas",initialValue=1,allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_citas")
    private int id;
    private Paciente paciente;
    @OneToOne
    private Medico medico;
    @OneToOne
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horaComienzo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horaTermina;
    private boolean disponible;
    private boolean asistencia;
    
public Cita(){
    
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getHoraComienzo() {
        return horaComienzo;
    }

    public void setHoraComienzo(Date horaComienzo) {
        this.horaComienzo = horaComienzo;
    }

    public Date getHoraTermina() {
        return horaTermina;
    }

    public void setHoraTermina(Date horaTermina) {
        this.horaTermina = horaTermina;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
 



}
