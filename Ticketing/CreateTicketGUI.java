/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticketing;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Joshua
 */
public class CreateTicketGUI extends javax.swing.JFrame {

    /**
     * Creates new form CreateTicketGUI
     */
    public CreateTicketGUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TaskTable = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        SendButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        TaskField = new javax.swing.JTextField();
        TaskLabel = new javax.swing.JLabel();
        EmployeeField = new javax.swing.JTextField();
        DateField = new javax.swing.JTextField();
        EmployeeLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        ErrorMessage = new javax.swing.JLabel();
        SendLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TaskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task", "Employee ID", "Completion Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TaskTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaskTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TaskTable);
        if (TaskTable.getColumnModel().getColumnCount() > 0) {
            TaskTable.getColumnModel().getColumn(0).setMinWidth(300);
        }

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        SendButton.setText("Send");
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        TaskLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TaskLabel.setText("Task:");

        EmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EmployeeLabel.setText("Employee ID:");

        DateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DateLabel.setText("Date:");

        ErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ErrorMessage.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BackButton))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmployeeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SendButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TaskLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TaskField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EmployeeField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SendLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TaskField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TaskLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SendButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SendLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        ErrorMessage.setText("");
        DefaultTableModel model = (DefaultTableModel) TaskTable.getModel();
        if(!EmployeeField.getText().equals("123456"))
        {
            ErrorMessage.setText("Enter a valid Employee ID.");
        }
        else if(!TaskField.getText().trim().equals(""))
        {
            ErrorMessage.setText("");
            SendLabel.setText("");
            model.addRow(new Object[]{TaskField.getText(), EmployeeField.getText(), DateField.getText()});
        }
        else
        {
            ErrorMessage.setText("Input should not be left blank.");
        }
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) TaskTable.getModel();
        if(TaskTable.getSelectedRow() == -1)
        {
            if(TaskTable.getRowCount() == 0)
            {
                ErrorMessage.setText("Table is empty.");
            }
            else
            {
                ErrorMessage.setText("You must select a task.");
            }
        }
        else
        {
            ErrorMessage.setText("");
            SendLabel.setText("");
            model.setValueAt(TaskField.getText(), TaskTable.getSelectedRow(), 0);
            model.setValueAt(EmployeeField.getText(), TaskTable.getSelectedRow(), 1);
            model.setValueAt(DateField.getText(), TaskTable.getSelectedRow(), 2);
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void TaskTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaskTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) TaskTable.getModel();
        TaskField.setText(model.getValueAt(TaskTable.getSelectedRow(), 0).toString());
        EmployeeField.setText(model.getValueAt(TaskTable.getSelectedRow(), 1).toString());
        DateField.setText(model.getValueAt(TaskTable.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_TaskTableMouseClicked

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) TaskTable.getModel();
        if(TaskTable.getSelectedRow() == -1)
        {
            if(TaskTable.getRowCount() == 0)
            {
                ErrorMessage.setText("Table is empty.");
            }
            else
            {
                ErrorMessage.setText("You must select a task.");
            }
        }
        else
        {
            ErrorMessage.setText("");
            SendLabel.setText("");
            model.removeRow(TaskTable.getSelectedRow());
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        TaskTicketGUI task = new TaskTicketGUI();
        task.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
        if(TaskTable.getRowCount() == 0)
        {
            ErrorMessage.setText("Table is empty.");
        }
        else
        {
            ErrorMessage.setText("");
            TaskTable.setModel(new DefaultTableModel(null, new String[]{"Task", "Employee", "Completion Date"}));
            SendLabel.setText("Task(s) Successfully Sent!");
        }
    }//GEN-LAST:event_SendButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CreateTicketGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateTicketGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateTicketGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateTicketGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTicketGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField DateField;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField EmployeeField;
    private javax.swing.JLabel EmployeeLabel;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JButton SendButton;
    private javax.swing.JLabel SendLabel;
    private javax.swing.JTextField TaskField;
    private javax.swing.JLabel TaskLabel;
    private javax.swing.JTable TaskTable;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
