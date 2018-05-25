/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sgfp.facade;

import com.app.sgfp.delegate.ViviendaDelegate;
import com.app.sgfp.entidades.Vivienda;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class ViviendaFacade {
    private final ViviendaDelegate delegate;
    
    public ViviendaFacade(){
        delegate= new ViviendaDelegate();
    }
    
    public List<Vivienda> buscarVivienda(){
        
        return delegate.ObtenerVivienda();
    }
    
    public List<Vivienda> buscarViviendaByCalle(String calle){
        
        return delegate.buscarVivienda(calle);
    }
    
    public boolean crearVivienda(String calle, String numeroExterior,boolean habitada,boolean renta){
        Vivienda vivienda= new Vivienda(0,calle,numeroExterior,habitada,renta);
        return delegate.crearVivienda(vivienda);
    }
}
