/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import TimeClock.TimeClockGUI;
import Database.DBMgr;
import java.sql.SQLException;

/**
 *
 * @author cpeaden
 */
public class LoginController {
   /* private int userID;
    DBMgr temp = null;
    
    public void getUserID(int newUserID) throws SQLException
    {
        newUserID = userID;
        temp.loginToProgram(userID);
    }*/
    
    public void login(int userID)
    {
       if (userID == 123456)
       {
           TimeClockGUI time = new TimeClockGUI();
           time.setVisible(true);
           
       }
    }

    public void getUserID(int ID_NUM) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
