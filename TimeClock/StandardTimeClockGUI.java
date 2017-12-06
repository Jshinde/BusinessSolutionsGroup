/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeClock;

import Login.LoginGUI;
import Ticketing.TaskTicketGUI;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Joshua
 */
public class StandardTimeClockGUI extends javax.swing.JFrame {
    private int timeRun = 0;
    private int timesClicked = 0;
    
    
    /**
      * Creates new form TimeClockGUI
      */
    public StandardTimeClockGUI() {
        initComponents();
        
        new Thread()
        {
            public void run()
            {
                while(timeRun == 0)
                {
                    Calendar cal = new GregorianCalendar();
                    
                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int AM_PM = cal.get(Calendar.AM_PM);
                    
                    String day_night = "";
                    
                    if(AM_PM == 1)
                    {
                        day_night = "PM";
                    }
                    else
                    {
                        day_night = "AM";
                    }
                    
                    String time = String.format("%02d:%02d:%02d %s", hour, min, sec, day_night);
                    
                    Clock.setText(time);
                }
            }
        }.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TaskTicketButton = new javax.swing.JButton();
        SchedulerButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        Clock = new javax.swing.JLabel();
        ClockInButton = new javax.swing.JButton();
        ClockOutButton = new javax.swing.JButton();
        ClockIn_OutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Business Solutions");

        TaskTicketButton.setText("TaskTicket");
        TaskTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskTicketButtonActionPerformed(evt);
            }
        });

        SchedulerButton.setText("Scheduler");

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        Clock.setFont(new java.awt.Font("DS-Digital", 0, 90)); // NOI18N
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clock.setText("9:30:49");

        ClockInButton.setText("Clock-In");
        ClockInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClockInButtonActionPerformed(evt);
            }
        });

        ClockOutButton.setText("Clock-Out");
        ClockOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClockOutButtonActionPerformed(evt);
            }
        });

        ClockIn_OutLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ClockIn_OutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TaskTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SchedulerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(ClockInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClockOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Clock, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                            .addComponent(ClockIn_OutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TaskTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SchedulerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(196, 196, 196)
                        .addComponent(Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClockInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClockOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(ClockIn_OutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(287, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TaskTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskTicketButtonActionPerformed
        TaskTicketGUI task = new TaskTicketGUI();
        task.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TaskTicketButtonActionPerformed

    private void ClockInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClockInButtonActionPerformed
        Calendar cal = new GregorianCalendar();
                    
        int hour = cal.get(Calendar.HOUR);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        int AM_PM = cal.get(Calendar.AM_PM);
        String day_night = "";
                    
        if(AM_PM == 1)
        {
            day_night = "PM";
        }
        else
        {
            day_night = "AM";
        }
        
        String time = String.format("%02d:%02d:%02d %s", hour, min, sec, day_night);
        
        if(getTimesClicked() == 0)
        {
            ClockIn_OutLabel.setText("You have been clocked in at " + time);
            setTimesClicked(1);
        }
        else
        {
            ClockIn_OutLabel.setText("You are already clocked in.");
        }
        
    }//GEN-LAST:event_ClockInButtonActionPerformed

    private void ClockOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClockOutButtonActionPerformed
        Calendar cal = new GregorianCalendar();
                    
        int hour = cal.get(Calendar.HOUR);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        int AM_PM = cal.get(Calendar.AM_PM);
        String day_night = "";
                    
        if(AM_PM == 1)
        {
            day_night = "PM";
        }
        else
        {
            day_night = "AM";
        }
        
        String time = String.format("%02d:%02d:%02d %s", hour, min, sec, day_night);
        
        
        if(getTimesClicked() == 1)
        {
            ClockIn_OutLabel.setText("You have been clocked out at " + time);
            setTimesClicked(0);
        }
        else
        {
            ClockIn_OutLabel.setText("You are already clocked out.");
        }
          
    }//GEN-LAST:event_ClockOutButtonActionPerformed

    public int getTimesClicked()
    {
        return timesClicked;
    }
    
    public void setTimesClicked(int timesClicked)
    {
        this.timesClicked = timesClicked;
    }
    
    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        LoginGUI login = new LoginGUI();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        ClockIn_OutLabel.setText("");
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StandardTimeClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StandardTimeClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StandardTimeClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StandardTimeClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StandardTimeClockGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JButton ClockInButton;
    private javax.swing.JLabel ClockIn_OutLabel;
    private javax.swing.JButton ClockOutButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton SchedulerButton;
    private javax.swing.JButton TaskTicketButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
