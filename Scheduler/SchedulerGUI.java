package Scheduler;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;



@SuppressWarnings("serial")
public class SchedulerGUI extends JFrame 
{
	private JLabel item1;
	
	//Constructor
	public SchedulerGUI()
	{
		initComponents();
	}
	
	//Initialize Components
	public void initComponents() 
	{
		setLayout(new FlowLayout());
		item1 = new JLabel("test");
		add(item1);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		pack();
	}
}
