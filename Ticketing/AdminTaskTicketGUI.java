/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticketing;
import javax.swing.table.DefaultTableModel;

public class AdminTaskTicketGUI extends javax.swing.JFrame {
    
    private TaskTicketController taskCont = new TaskTicketController();

    /**
     * Creates new form TaskTicketGUI
     */
    public AdminTaskTicketGUI() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TimeClockButton = new javax.swing.JButton();
        SchedulerButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        ViewTicketsButton = new javax.swing.JButton();
        CreateTicketButton = new javax.swing.JButton();
        TaskTablePane = new javax.swing.JScrollPane();
        TaskTable = new javax.swing.JTable();
        CompleteButton = new javax.swing.JButton();
        ErrorMessage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        TimeClockButton.setText("TimeClock");
        TimeClockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeClockButtonActionPerformed(evt);
            }
        });

        SchedulerButton.setText("Scheduler");
        SchedulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchedulerButtonActionPerformed(evt);
            }
        });

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        ViewTicketsButton.setText("View Tickets");
        ViewTicketsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTicketsButtonActionPerformed(evt);
            }
        });

        CreateTicketButton.setText("Create Ticket");
        CreateTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTicketButtonActionPerformed(evt);
            }
        });

        TaskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task", "Employee ID", "Date"
            }
        ));
        TaskTablePane.setViewportView(TaskTable);

        CompleteButton.setText("Complete");
        CompleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteButtonActionPerformed(evt);
            }
        });

        ErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Scheduler/BusinessSolutionsLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimeClockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SchedulerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ViewTicketsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CompleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TaskTablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TimeClockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SchedulerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CompleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ViewTicketsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CreateTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TaskTablePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ShowData()
    {
        DefaultTableModel model = (DefaultTableModel) TaskTable.getModel();
        
        String[] cols = {"Task", "Employee ID", "Date"};
        String[][] data = {
                            {"Create a simple GUI.", "789456", "12/06/2017"},
                            {"Meeting at 4:00PM.", "789456", "12/07/2017"},
                            {"Finish sale calculations.", "789456", "12/15/2017"},
                            {"Complete GUI.", "789456", "01/15/2018"}                          
                          };
        
        model.setDataVector(data, cols);
    }
    
    private void TimeClockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeClockButtonActionPerformed
        taskCont.adminTimeClockRedirect();
        this.dispose();
    }//GEN-LAST:event_TimeClockButtonActionPerformed

    private void SchedulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchedulerButtonActionPerformed
        taskCont.adminSchedulerPressed();
        this.dispose();
    }//GEN-LAST:event_SchedulerButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        taskCont.logout();
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ViewTicketsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTicketsButtonActionPerformed
        ErrorMessage.setText("");
        ShowData();
    }//GEN-LAST:event_ViewTicketsButtonActionPerformed

    private void CreateTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTicketButtonActionPerformed
        taskCont.newTicket();
    }//GEN-LAST:event_CreateTicketButtonActionPerformed

    private void CompleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) TaskTable.getModel();
        if(TaskTable.getSelectedRow() == -1)
        {
            if(TaskTable.getRowCount() == 0)
            {
                ErrorMessage.setText("Table is empty.");
            }
            else
            {
                ErrorMessage.setText("You must select a task to complete.");
            }
        }
        else
        {
            ErrorMessage.setText("Task Complete!");
            model.removeRow(TaskTable.getSelectedRow());
        }
    }//GEN-LAST:event_CompleteButtonActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        ErrorMessage.setText("");
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
            java.util.logging.Logger.getLogger(AdminTaskTicketGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTaskTicketGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTaskTicketGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTaskTicketGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTaskTicketGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CompleteButton;
    private javax.swing.JButton CreateTicketButton;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton SchedulerButton;
    private javax.swing.JTable TaskTable;
    private javax.swing.JScrollPane TaskTablePane;
    private javax.swing.JButton TimeClockButton;
    private javax.swing.JButton ViewTicketsButton;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
