/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sgfp.delegate;

import com.app.sgfp.entidades.Vivienda;
import com.app.sgfp.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class ViviendaDelegate {
    
    public ViviendaDelegate(){
        
    }
    /**
    * @return listado de vivienda
    * */
    
    public List<Vivienda> ObtenerVivienda(){
        return ServiceLocator.getInstanceViviendaDAO().findAll();
    }
    
    /**
    * @param id identificador de vivienda
    * @return  objeto vivienda
    * */
    public Vivienda obtenerVivienda(Integer id){
        
       
        return ServiceLocator.getInstanceViviendaDAO().find(id);
    }
    
    
    /**
    * @param calle calle de vivienda
    * @return  lista de vivienda
    * */
    
    public List<Vivienda> buscarVivienda (String calle){
        
        return ServiceLocator.getInstanceViviendaDAO().findByOneParameter(calle,"calle");
    }
    /**
     * 
     * @param vivienda para actualizar datos
     * @return si fue realizado cambio
     */
    public boolean actualizarVivienda(Vivienda vivienda){
        try{
            
        
            ServiceLocator.getInstanceViviendaDAO().update(vivienda);
        }catch(Exception e){
            System.out.println("Error!"+ e.getMessage());
            return false;
        }
        return true;
    }
    /**
     * 
     * @param id para borrar elemento
     * @return si fue borrado o no
     */
    public boolean borrarViviendaById(Integer id){
        try{
            Vivienda viviendaPaBorrar=ServiceLocator.getInstanceViviendaDAO().find(id);
            
            ServiceLocator.getInstanceViviendaDAO().delete(viviendaPaBorrar);
        }catch(Exception e){
            System.out.println("Error!"+ e.getMessage());
            return false;
        }
        return true;
    }
    /**
     * 
     * @param vivienda para borrar vivienda
     * @return si se borro el elemento
     */
    public boolean borrarVivienda(Vivienda vivienda){
        try{
            ServiceLocator.getInstanceViviendaDAO().delete(vivienda);
        }catch(Exception e){
            System.out.println("Error!"+ e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean crearVivienda(Vivienda vivienda){
         try{
            ServiceLocator.getInstanceViviendaDAO().save(vivienda);
        }catch(Exception e){
            System.out.println("Error!"+ e.getMessage());
            return false;
        }
        return true;
    }
    
    
   
}
