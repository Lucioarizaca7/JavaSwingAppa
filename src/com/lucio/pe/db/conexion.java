/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucio.pe.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alumno-PB203
 */
public class conexion {
     
    private static Connection con = null ;
    private static String usuario = "USUARIO_MATRICULA";
    private static String clave = "1234560 ";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection(){
       try {
           //cargar el controlador jdbc
           Class.forName("oracle.jdbc.OracleDriver");
           
           //Establecer la conecxion con la base de datos
           con = DriverManager.getConnection(url,usuario,clave);
           con.setAutoCommit(false);
           System.out.println("lucio........");
           
           if(con != null){
           System.out.println("Conexion exitosa");
             }else{
                  System.out.println("Conexion fallida");
                  }
       }catch(Exception e ){
           System.out.println("Error: "+e.getMessage());
       }
       return con;
    
    };
    
        public void closeConnection(){
          try {
            con.close();
              } catch (Exception e) {
              System.out.println("Error al cerrar la conexion "+e.getMessage());
           }
         }
           public static void  main(String[] args){
               conexion con =  new conexion();
               conexion.getConnection();
             
      }
}

         

