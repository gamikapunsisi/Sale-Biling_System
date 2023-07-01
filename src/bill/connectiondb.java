/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bill;
import java.sql.*;
/**
 *
 * @author user
 */
public class connectiondb {
    public static Connection getCon()
    {
        try
        {
            Class.forName("conn.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/billmanagrment","root","");
            return conn;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            
        }
        return null;
    }
    
}
