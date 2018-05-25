/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sgfp.negocios;

import com.app.sgfp.entidades.Vivienda;
import com.app.sgfp.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class Text {
    
    public static void main(String[] args){
        
        List<Vivienda> lista= ServiceLocator.getInstanceViviendaDAO().findAll();
        
        
        
       
        
    }
}
