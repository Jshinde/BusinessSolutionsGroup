/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import Database.DBMgr;
import java.sql.SQLException;

/**
 *
 * @author cpeaden
 */
public class LoginController {
    private int userID;
    
    public void getUserID(int newUserID) throws SQLException
    {
        newUserID = userID;
        DBMgr temp = new DBMgr();
        
        temp.loginToProgram(userID);
    }
}
