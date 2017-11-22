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
   
   /**
    * 
    * @param ID_NUM
    * @throws SQLException 
    * 
    * This method will be used to login to the 
    * Business Solutions software. The database is
    * queried and if the ID_NUM supplied comes back
    * as a real ID_NUM, then the user is let into the program.
    * 
    * If not, the user will be asked to try again or exit.
    */
   public void loginToProgram(int ID_NUM) throws SQLException
   {
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/BusinessSolutions", "person", "password");
        System.out.println("Connection Created");
        
        if (stat.execute("SELECT * FROM EMPLOYEE WHERE ID_NUM =" + ID_NUM))
        {
            //login program code to enter program
        }
        
        else
        {
            //login code to exit program or try again.
        }
   }
}
