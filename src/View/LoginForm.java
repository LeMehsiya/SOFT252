/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Controller.patient;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
/**
 *
 * @author Simon Yates
 */
public class LoginForm extends javax.swing.JFrame {
    

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        passwordField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Email:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Password:");

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addComponent(emailField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(70, 70, 70)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)))
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        // TODO add your handling code here:
          String idInput = idField.getText();
        String emailInput = emailField.getText();
        String passwordInput = passwordField.getText();
        File file = new File("file.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // operation
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        if (idInput.equals(patient.getID()) && passwordInput.equals(patient.getPassword()) && emailInput.equals(patient.getEmail()))
         {
             JOptionPane.showMessageDialog(null,
                     "Login Successful", "Success",
                     JOptionPane.INFORMATION_MESSAGE);
         }else
         {
             JOptionPane.showMessageDialog(null,
                     "Login Fail", "Fail",
                     JOptionPane.WARNING_MESSAGE);
         }

    

   
    

     
     /*
        String idInput = idField.getText();
     String emailInput = emailField.getText();
     String passwordInput = passwordField.getText
        
        Gson gson = new Gson();

        try (Reader reader = new FileReader("Accounts.txt")) {
            while (reader.hasNextLine()) {
                    String data = in.nextLine();
                    System.out.println(data);
      }
            // Convert JSON File to Java Object
            Patient patients = gson.fromJson(reader, Patient.class);
            try {
      
      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      
            String s = in.nextLine();
            String[] sArray = s.split(":");
            System.out.println(patients);

        } catch (IOException e) {
            e.printStackTrace();
        }

         Patient patient = new Patient ();
         
         if (idInput.equals(patient.getID()) && passwordInput.equals(patient.getPassword()) && emailInput.equals(patient.getEmail()))
         {
             JOptionPane.showMessageDialog(null,
                     "Login Successful", "Success",
                     JOptionPane.INFORMATION_MESSAGE);
         }else
         {
             JOptionPane.showMessageDialog(null,
                     "Login Fail", "Fail",
                     JOptionPane.WARNING_MESSAGE);
         }
*/
        
        

    


        
     
     

    }//GEN-LAST:event_submitButtonMouseClicked

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}