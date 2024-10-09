/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucio.pe.ctest;

import com.lucio.pe.cnegocio.TipoDocumentoBo;
import com.lucoi.pe.cmodelo.TipoDocumento;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author Alumno-PB203
 */
public class Test {
    
    TipoDocumentoBo tdbo = new TipoDocumentoBo();
    TipoDocumento td = new TipoDocumento();
    
    public void insertar() throws SQLException, ParseException{
        td.setNombre("Documento nacional de identidad");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("DNI");
        //td.setIdTipoDocumento(7);
        td.setFechaActualiza("10-05-2024");
        td.setFecha("11-08-2021");
        
               
        tdbo.agregarTipoDocumento(td);
                
    }
    
   
      public void eliminar() throws SQLException, ParseException{
       
        td.setIdTipoDocumento(10);
      
        tdbo.eliminarTipoDocumento(td);
                
    }
      
       public void modificar() throws SQLException, ParseException{
       
        td.setNombre("pasaporte");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("P");
        td.setFechaActualiza("10-05-2024");
        td.setFecha("11-08-2021");
        
        td.setIdTipoDocumento(6);
        
         td.setNombre("pasaporte");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("P");
        td.setFechaActualiza("10-05-2024");
        td.setFecha("11-08-2021");
        
        td.setIdTipoDocumento(7); 
        
        tdbo.modificarTipoDocumento(td);
                
    }
      
    
    public static void main(String[] args) throws SQLException, ParseException {
        
        Test t = new Test();
        //t.insertar();
        //t.eliminar();
        t.modificar();
        
    }
}
