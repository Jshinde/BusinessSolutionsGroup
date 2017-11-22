/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.sql.*;

/**
 *
 * @author cpeaden
 */
public class DBMgr 
{    
   Connection conn = null;
   Statement stat = null;
   ResultSet rs = null;
   
   public DBMgr() throws SQLException
   {
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/BusinessSolutions", "person", "password");
        System.out.println("Connection Created");
   }
}
