package Scheduler;

import javax.swing.JFrame;

public class SchedulerController 
{
	public void schedulePerson(Object personToSchedule, String dayToSchedule) 
	{
		//Add person to day
	}
	
	public static void main() {
		SchedulerGUI sgui = new SchedulerGUI();
		sgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sgui.setSize(275,180);
		sgui.setVisible(true);
	}
}
