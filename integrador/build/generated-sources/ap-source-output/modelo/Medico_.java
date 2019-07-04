package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Especialidad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-04T09:12:33")
@StaticMetamodel(Medico.class)
public class Medico_ extends Persona_ {

    public static volatile SingularAttribute<Medico, Date> horariofinal;
    public static volatile SingularAttribute<Medico, Date> horarioinicio;
    public static volatile SingularAttribute<Medico, Integer> turno;
    public static volatile ListAttribute<Medico, Especialidad> especialidad;
    public static volatile SingularAttribute<Medico, String> numeroMatricula;

}