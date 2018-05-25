package com.app.sgfp.entidades;

import com.app.sgfp.entidades.Reservacion;
import com.app.sgfp.entidades.TipoInstalacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-23T23:29:52")
@StaticMetamodel(Instalaciones.class)
public class Instalaciones_ { 

    public static volatile SingularAttribute<Instalaciones, Integer> idInstalaciones;
    public static volatile SingularAttribute<Instalaciones, TipoInstalacion> fkTipoInstalacion;
    public static volatile SingularAttribute<Instalaciones, String> nombre;
    public static volatile ListAttribute<Instalaciones, Reservacion> reservacionList;
    public static volatile SingularAttribute<Instalaciones, Boolean> renta;

}