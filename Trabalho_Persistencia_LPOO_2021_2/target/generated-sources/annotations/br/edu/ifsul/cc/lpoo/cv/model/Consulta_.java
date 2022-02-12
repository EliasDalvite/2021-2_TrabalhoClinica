package br.edu.ifsul.cc.lpoo.cv.model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-01-24T11:35:21")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, String> observacao;
    public static volatile SingularAttribute<Consulta, Calendar> data;
    public static volatile SingularAttribute<Consulta, Calendar> data_retorno;
    public static volatile SingularAttribute<Consulta, Float> valor;
    public static volatile SingularAttribute<Consulta, Integer> id;

}