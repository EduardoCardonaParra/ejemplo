package com.app.sgfp.entidades;

import com.app.sgfp.entidades.Vivienda;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-23T23:29:52")
@StaticMetamodel(RelMantenimiento.class)
public class RelMantenimiento_ { 

    public static volatile SingularAttribute<RelMantenimiento, Vivienda> fkVivienda;
    public static volatile SingularAttribute<RelMantenimiento, Date> fechaIni;
    public static volatile SingularAttribute<RelMantenimiento, Integer> periodo;
    public static volatile SingularAttribute<RelMantenimiento, Float> cantidad;
    public static volatile SingularAttribute<RelMantenimiento, Date> fechaFin;
    public static volatile SingularAttribute<RelMantenimiento, String> fechaPago;
    public static volatile SingularAttribute<RelMantenimiento, Integer> idRelMantenimiento;

}