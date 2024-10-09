/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucio.pe.cnegocio;

import com.lucio.pe.cdatosdao.TipoDocumentoDao;
import java.sql.Connection;
import com.lucio.pe.db.conexion;
import com.lucoi.pe.cmodelo.TipoDocumento;
import java.sql.SQLException;


/**
 *
 * @author Alumno-PB203
 */
public class TipoDocumentoBo {
    private String mensaje;

    TipoDocumentoDao  tdd = new TipoDocumentoDao();
    
    public String agregarTipoDocumento (TipoDocumento tipoDocumento) throws SQLException{
        Connection c = conexion.getConnection();
        c.commit();
        try {
        tdd.agregarTipoDocumento(c, tipoDocumento);
        }catch(Exception e){
            c.rollback();
        }finally{
            c.close();
        }
        return mensaje;
    }
     public String eliminarTipoDocumento (TipoDocumento tipoDocumento) throws SQLException{
        Connection c = conexion.getConnection();
        c.commit();
        try {
        tdd.eliminarTipoDocumento(c, tipoDocumento);
        }catch(Exception e){
            c.rollback();
        }finally{
            c.close();
        }
        return mensaje;
    }
     
    public String modificarTipoDocumento (TipoDocumento tipoDocumento) throws SQLException{
        Connection c = conexion.getConnection();
        c.commit();
        try {
        tdd.modificarTipoDocumento(c, tipoDocumento);
        }catch(Exception e){
            c.rollback();
        }finally{
            c.close();
        }
        return mensaje;
    } 
}
