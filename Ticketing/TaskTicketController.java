/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticketing;
import TimeClock.StandardTimeClockGUI;
import Login.LoginGUI;
import TimeClock.AdminTimeClockGUI;
import Scheduler.AdminSchedulerGUI;
import java.sql.SQLException;
//Comment

/**
 *
 * @author Joshua
 */
public class TaskTicketController {
    private final StandardTimeClockGUI clock = new StandardTimeClockGUI();
    private final AdminTimeClockGUI aClock = new AdminTimeClockGUI();
    private final AdminSchedulerGUI aSched = new AdminSchedulerGUI();
    private final LoginGUI login = new LoginGUI();
    private final CreateTicketGUI newTicket = new CreateTicketGUI();
    
    public void login(int userID)
    {
        //TimeClockGUI clock = new TimeClockGUI();
        clock.setVisible(true);
    }
    
    public void timeClockPressed()
    {
        //TimeClockGUI clock = new TimeClockGUI();
        clock.setVisible(true);
    }
    
    public void adminTimeClockRedirect()
    {
        aClock.setVisible(true);
    }
    
    public void schedulerPressed()
    {
        aSched.setVisible(true);
    }
    
    public void logout()
    {
        login.setVisible(true);
    }
    
    public void newTicket()
    {
        newTicket.setVisible(true);
    }

    public void getUserID(int ID_NUM) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
