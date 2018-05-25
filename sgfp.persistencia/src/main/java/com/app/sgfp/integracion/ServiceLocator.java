
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sgfp.integracion;

import com.app.sgfp.dao.ContactoDAO;
import com.app.sgfp.dao.UsuarioDAO;
import com.app.sgfp.dao.ViviendaDAO;
import com.app.sgfp.dao.ConfiguracionDAO;
import com.app.sgfp.dao.GestionGastoDAO;
import com.app.sgfp.dao.InstalacionesDAO;
import com.app.sgfp.dao.RelConvenioDAO;
import com.app.sgfp.dao.RelMantenimientoDAO;
import com.app.sgfp.dao.ReservacionDAO;
import com.app.sgfp.dao.TipoInstalacionDAO;

/**
 *
 * @author xhendor
 */
public class ServiceLocator {

    private static ViviendaDAO viviendaDAO;

    private static UsuarioDAO usuarioDAO;

    private static ContactoDAO contactoDAO;
    
    private static ConfiguracionDAO configuracionDAO;
    
    private static GestionGastoDAO gestionGastoDAO;
    
    private static InstalacionesDAO instalacionesDAO;
    
    private static RelConvenioDAO relConvenioDAO;
    
    private static RelMantenimientoDAO relMantenimientoDAO;
    
    private static ReservacionDAO reservacionDAO;
    
    private static TipoInstalacionDAO tipoInstalacionDAO;

    public static ContactoDAO getInstanceContactoDAO() {
        if (contactoDAO == null) {
            contactoDAO = new ContactoDAO();
            return contactoDAO;
        } else {
            return contactoDAO;
        }
    }

    public static ViviendaDAO getInstanceViviendaDAO() {
        if (viviendaDAO == null) {
            viviendaDAO = new ViviendaDAO();
            return viviendaDAO;
        } else {
            return viviendaDAO;
        }
    }

    public static UsuarioDAO getInstanceUsuarioDAO() {
        if (usuarioDAO == null) {
            usuarioDAO = new UsuarioDAO();
            return usuarioDAO;
        } else {
            return usuarioDAO;
        }
    }
    public static ConfiguracionDAO getInstanceConfiguracionDAO() {
        if (configuracionDAO == null) {
            configuracionDAO = new ConfiguracionDAO();
            return configuracionDAO;
        } else {
            return configuracionDAO;
        }
    }
    
    public static GestionGastoDAO getInstanceGestionGastoDAO() {
        if (gestionGastoDAO == null) {
            gestionGastoDAO = new GestionGastoDAO();
            return gestionGastoDAO;
        } else {
            return gestionGastoDAO;
        }
    }
    
    public static InstalacionesDAO getInstanceInstalacionesDAO() {
        if (instalacionesDAO == null) {
            instalacionesDAO = new InstalacionesDAO();
            return instalacionesDAO;
        } else {
            return instalacionesDAO;
        }
    }
    
    public static RelConvenioDAO getInstanceRelConvenioAO() {
        if (relConvenioDAO == null) {
            relConvenioDAO = new RelConvenioDAO();
            return relConvenioDAO;
        } else {
            return relConvenioDAO;
        }
    }
    public static RelMantenimientoDAO getInstanceRelMantenimientoDAO() {
        if (relMantenimientoDAO == null) {
            relMantenimientoDAO = new RelMantenimientoDAO();
            return relMantenimientoDAO;
        } else {
            return relMantenimientoDAO;
        }
    }
    
    public static ReservacionDAO getInstanceReservacionDAO() {
        if (reservacionDAO == null) {
            reservacionDAO = new ReservacionDAO();
            return reservacionDAO;
        } else {
            return reservacionDAO;
        }
    }
    
    public static TipoInstalacionDAO getInstanceTipoInstalacionDAO() {
        if (tipoInstalacionDAO == null) {
            tipoInstalacionDAO = new TipoInstalacionDAO();
            return tipoInstalacionDAO;
        } else {
            return tipoInstalacionDAO;
        }
    }

}
 