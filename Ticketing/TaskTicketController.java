/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticketing;
import TimeClock.TimeClockGUI;
import Database.DBMgr;
import java.sql.SQLException;

/**
 *
 * @author Joshua
 */
public class TaskTicketController {
    
    public void login(int userID)
    {
        TimeClockGUI clock = new TimeClockGUI();
        clock.setVisible(true);
    }

    public void getUserID(int ID_NUM) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
