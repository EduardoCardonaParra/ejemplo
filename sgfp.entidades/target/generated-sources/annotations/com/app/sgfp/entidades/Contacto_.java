package com.app.sgfp.entidades;

import com.app.sgfp.entidades.Vivienda;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-23T23:29:52")
@StaticMetamodel(Contacto.class)
public class Contacto_ { 

    public static volatile SingularAttribute<Contacto, String> telefonoCelular;
    public static volatile SingularAttribute<Contacto, String> apellidoPaterno;
    public static volatile SingularAttribute<Contacto, String> segundoNombre;
    public static volatile SingularAttribute<Contacto, Vivienda> fkVivienda;
    public static volatile SingularAttribute<Contacto, String> primerNombre;
    public static volatile SingularAttribute<Contacto, String> correo;
    public static volatile SingularAttribute<Contacto, Integer> idContacto;
    public static volatile SingularAttribute<Contacto, String> apellidoMaterno;
    public static volatile SingularAttribute<Contacto, String> telefonoFijo;

}