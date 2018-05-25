package com.app.sgfp.entidades;

import com.app.sgfp.entidades.Contacto;
import com.app.sgfp.entidades.RelConvenio;
import com.app.sgfp.entidades.RelMantenimiento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-23T23:29:52")
@StaticMetamodel(Vivienda.class)
public class Vivienda_ { 

    public static volatile ListAttribute<Vivienda, RelMantenimiento> relMantenimientoList;
    public static volatile SingularAttribute<Vivienda, Boolean> habitada;
    public static volatile ListAttribute<Vivienda, RelConvenio> relConvenioList;
    public static volatile SingularAttribute<Vivienda, Integer> idVivienda;
    public static volatile SingularAttribute<Vivienda, String> calle;
    public static volatile ListAttribute<Vivienda, Contacto> contactoList;
    public static volatile SingularAttribute<Vivienda, String> numeroExterior;
    public static volatile SingularAttribute<Vivienda, Boolean> renta;

}