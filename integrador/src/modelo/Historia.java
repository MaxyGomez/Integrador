package modelo;

import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="historia")
public class Historia {
    @Id
    @SequenceGenerator(name="sec_historia",initialValue=1,allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_historia")
    private int id; 
    @OneToOne
    private Paciente paciente;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private String descripcion;
    @OneToOne
    private Medico medico;
}
