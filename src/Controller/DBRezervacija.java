/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author veron
 */
public class DBRezervacija {
    
    public static Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn=DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/sgolemovic","sgolemovic","11");
        return conn;
    }
}
