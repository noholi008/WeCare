/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wecare;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Fariha
 */
public class ConnectionProvider {
     public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/gymdb","root","");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }

}
