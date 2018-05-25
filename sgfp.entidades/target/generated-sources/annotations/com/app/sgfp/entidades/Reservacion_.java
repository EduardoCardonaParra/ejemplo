package com.app.sgfp.entidades;

import com.app.sgfp.entidades.Instalaciones;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-23T23:29:52")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile SingularAttribute<Reservacion, Date> fecha;
    public static volatile SingularAttribute<Reservacion, Instalaciones> fkInstalaciones;
    public static volatile SingularAttribute<Reservacion, String> concepto;
    public static volatile SingularAttribute<Reservacion, Integer> idReservacion;

}