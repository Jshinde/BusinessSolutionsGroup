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
import Scheduler.SchedulerGUI;

public class TaskTicketController {
    private final StandardTimeClockGUI clock = new StandardTimeClockGUI();
    private final AdminTimeClockGUI aClock = new AdminTimeClockGUI();
    private final AdminSchedulerGUI aSched = new AdminSchedulerGUI();
    private final SchedulerGUI sched = new SchedulerGUI();
    private final LoginGUI login = new LoginGUI();
    private final CreateTicketGUI newTicket = new CreateTicketGUI();
    
    public void login(int userID)
    {
        clock.setVisible(true);
    }
    
    public void timeClockPressed()
    {
        clock.setVisible(true);
    }
    
    public void adminTimeClockRedirect()
    {
        aClock.setVisible(true);
    }
    
    public void adminSchedulerPressed()
    {
        aSched.setVisible(true);
    }
    
    public void schedulerPressed()
    {
        sched.setVisible(true);
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
