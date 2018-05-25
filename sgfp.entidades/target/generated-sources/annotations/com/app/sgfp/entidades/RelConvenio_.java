package com.app.sgfp.entidades;

import com.app.sgfp.entidades.Vivienda;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-23T23:29:52")
@StaticMetamodel(RelConvenio.class)
public class RelConvenio_ { 

    public static volatile SingularAttribute<RelConvenio, Integer> idRelConvenio;
    public static volatile SingularAttribute<RelConvenio, Vivienda> fkVivienda;
    public static volatile SingularAttribute<RelConvenio, Boolean> pagado;
    public static volatile SingularAttribute<RelConvenio, Date> fechaIni;
    public static volatile SingularAttribute<RelConvenio, String> concepto;
    public static volatile SingularAttribute<RelConvenio, Date> fechaFin;

}