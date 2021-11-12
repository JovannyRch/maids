/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    Connection con;
    
   
    
    String host = "localhost";
    String port = "3306";
    String database = "bd_ea";
    String user = "root";
    String pass = "";

    public Connection Conectar() {
        
         String url = "jdbc:mysql://"
                 + host
                 + ":"
                 + port
                 + "/"
                 + database
            + "?useTimezone=true&serverTimezone=UTC";
        
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Fallo al conectar: "+e.getMessage());
        }
        return con;
    }
    
    public Connection Desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            System.err.print(ex);
        }
        return null;
    }
    
}
