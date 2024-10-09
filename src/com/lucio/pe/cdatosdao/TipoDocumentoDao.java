/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucio.pe.cdatosdao;

import com.lucoi.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.SwingConstants;
import oracle.jdbc.driver.Message;

/**
 *
 * @author Alumno-PB203
 */
public class TipoDocumentoDao {
    
    private String Mensaje;
    //primer metodo - INSERTAR TIPO DOCUMENTOS A LA DB 
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento ){
       PreparedStatement ps = null;
       String sql = "INSERT INTO TIPO_DOCUMENTO( NOMBRE, SIGLA,ESTADO,ORDEN,FECHA_ACTUALIZA,FECHA)"
               + "VALUES(?,?,?,?,?,?) ";
       
       try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,tipoDocumento.getNombre() );
            ps.setString(2,tipoDocumento.getSigla());
            ps.setString(3,tipoDocumento.getEstado());
            ps.setInt(4,tipoDocumento.getOrden());
            ps.setString(5,tipoDocumento.getFechaActualiza());
            ps.setString(6,tipoDocumento.getFecha());
            
          
            
            ps.execute();
            ps.close();
            Mensaje = "El tipodocumento fue creado correctamente ";
            
       }catch(Exception e){
       Mensaje = "Alto! error al crear tipo de documento." + e.getMessage();
               System.out.println(e.getMessage());
    }
       return Mensaje;
    }
    
    //segundo metodo - eliminar tipo de documento
     public String eliminarTipoDocumento(Connection conn, TipoDocumento tipoDocumento ){
       PreparedStatement ps = null;
       String sql = "DELETE FROM TIPO_DOCUMENTO WHERE ID_TIPO_DOCUMENTO = ?" ;
               
      
       try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,tipoDocumento.getIdTipoDocumento());
            ps.execute();
            ps.close();
            Mensaje = "El tipodocumento fue eliminado correctamente ";
            
       }catch(Exception e){
       Mensaje = "Alto! error al aliminar tipo de documento." + e.getMessage();
               System.out.println(e.getMessage());
    }
       return Mensaje;
    }
    //tercer metodo - modificar tipo de documento
     
     public String modificarTipoDocumento(Connection conn, TipoDocumento tipoDocumento ){
       PreparedStatement ps = null;
       String sql = "UPDATE TIPO_DOCUMENTO SET NOMBRE = ?, SIGLA = ?,ESTADO = ?,ORDEN = ?,FECHA_ACTUALIZA = ?,FECHA = ? " 
               + "WHERE ID_TIPO_DOCUMENTO = ?";
               
               
      
       try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,tipoDocumento.getNombre() );
            ps.setString(2,tipoDocumento.getSigla());
            ps.setString(3,tipoDocumento.getEstado());
            ps.setInt(4,tipoDocumento.getOrden());
            ps.setString(5,tipoDocumento.getFechaActualiza());
            ps.setString(6,tipoDocumento.getFecha());
            
            ps.setInt(7,tipoDocumento.getIdTipoDocumento());
            
            ps.execute();
            ps.close();
            Mensaje = "El tipodocumento fue modificado correctamente ";
            
       }catch(Exception e){
       Mensaje = "Alto! error al modificar tipo de documento." + e.getMessage();
               System.out.println(e.getMessage());
    }
       return Mensaje;
    }
 
}
