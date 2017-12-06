/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import TimeClock.TimeClockGUI;
import Database.DBMgr;
import TimeClock.AdminTimeClockGUI;
import java.sql.SQLException;

/**
 *
 * @author cpeaden
 * 
 * blah
 */
public class LoginController {
    
    LoginGUI gui = new LoginGUI();
    
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
       else if (userID == 789456)
       {
           AdminTimeClockGUI admin = new AdminTimeClockGUI();
           admin.setVisible(true);
       }
       
       
    }
    
    public void cancelPressed()
    {
        System.exit(0);
    }

    public void getUserID(int ID_NUM) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
