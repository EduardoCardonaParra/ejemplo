/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sgfp.integracion;

import com.app.sgfp.facade.ViviendaFacade;

/**
 *
 * @author Eduardo
 */
public class ServiceFacadeLocator {
    
    private static ViviendaFacade viviendaFacade;
    
    public static ViviendaFacade getInstanceViviendaFacade() {
        if (viviendaFacade == null) {
            viviendaFacade = new ViviendaFacade();
            return viviendaFacade;
        } else {
            return viviendaFacade;
        }
    }
}
