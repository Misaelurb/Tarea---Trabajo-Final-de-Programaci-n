/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

//Conexión con base de datos
public class conexionMysql {
    Connection cn;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/proyectofinal","root","");
            System.out.println("conexión establecida");  
        } catch (Exception e){
            System.out.println("conexión fallida"+e);
        }           
        return cn;
    }
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/proyectofinal","root","");
            System.out.println("conexión establecida");
        } catch (Exception e) {
            System.out.println("conexión fallida"+e);
        }
        return cn;
    }
        
}


