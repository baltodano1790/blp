package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2016-06-06T16:15:03")
@StaticMetamodel(Contacto.class)
public class Contacto_ { 

    public static volatile SingularAttribute<Contacto, String> apellido;
    public static volatile SingularAttribute<Contacto, String> correo;
    public static volatile SingularAttribute<Contacto, Date> fnacimiento;
    public static volatile SingularAttribute<Contacto, Integer> id;
    public static volatile SingularAttribute<Contacto, Integer> telefono;
    public static volatile SingularAttribute<Contacto, String> comentario;
    public static volatile SingularAttribute<Contacto, String> nombre;

}