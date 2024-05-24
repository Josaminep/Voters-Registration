/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author josam
 */package voterregister;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
 
public class UpdateVoter extends javax.swing.JFrame {

    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;
    
    
    public UpdateVoter() {
        initComponents();
        
    }
    

    @SuppressWarnings("unchecked")
    
    int VId ;
    Statement Stl = null;
    ResultSet Rsl = null;
    
    private void VoterCount()
    {
        try{
            Stl = Con.createStatement();
            Rsl = Stl.executeQuery("select MAx(VId) from register");
            Rsl.next();
            VId = Rsl.getInt(1)+1;
            
        }catch(Exception Ex)
        {
    }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vpassword3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        vpassword5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        voter_id = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        new_address = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        vpassword3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        vpassword3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpassword3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel16.setText("Password:");

        vpassword5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        vpassword5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpassword5ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel18.setText("Age:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel13.setText("Voters Id:");

        voter_id.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        voter_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voter_idActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel22.setText("Current Address:");

        address.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel25.setText("New Address:");

        new_address.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_addressActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        back.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(new_address, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(voter_id, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voter_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transfer Address");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voter_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voter_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voter_idActionPerformed

    private void vpassword3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpassword3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vpassword3ActionPerformed

    private void vpassword5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpassword5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vpassword5ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed
int Key = -1;
    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
if (voter_id.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Invalid Voter ID");
    return; // Exit method early
}

try {
    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voters_db", "root", "");
    
    // Fetch current address
    String selectQuery = "SELECT address FROM register WHERE voter_id=?";
    PreparedStatement selectStatement = Con.prepareStatement(selectQuery);
    selectStatement.setString(1, voter_id.getText());
    ResultSet resultSet = selectStatement.executeQuery();
    if (resultSet.next()) {
        address.setText(resultSet.getString("address"));
        Key = 1; // Set Key to indicate voter ID is valid
    } else {
        address.setText(""); // Clear address field if no matching voter ID found
        JOptionPane.showMessageDialog(this, "Voter ID not found");
        Key = -1; // Set Key to indicate missing or incorrect voter ID
        return; // Exit method early
    }
    
    // Update address
    if (Key == 1) {
        String updateQuery = "UPDATE register SET address=? WHERE voter_id=?";
        PreparedStatement updateStatement = Con.prepareStatement(updateQuery);
        updateStatement.setString(1, new_address.getText());
        updateStatement.setString(2, voter_id.getText());
        
        int updatedRows = updateStatement.executeUpdate();
        if (updatedRows > 0) {
            JOptionPane.showMessageDialog(this, "Transfer Address Successfully");            
         // Close the current window and open Voters.java
        dispose();
        Voters list = new Voters();
        list.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update address");
        }
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, e);
}




        
    }//GEN-LAST:event_updateMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void new_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_addressActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:

        if (voter_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid Voter ID");
            return; // Exit method early
        }

        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voters_db", "root", "");

            // Fetch current data for the given voter ID
            String selectQuery = "SELECT * FROM register WHERE voter_id=?";
            PreparedStatement selectStatement = Con.prepareStatement(selectQuery);
            selectStatement.setString(1, voter_id.getText());
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                // Display current data              
                address.setText(resultSet.getString("address"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_searchMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:

        dispose(); // Close the current login window
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateVoter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField new_address;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    private javax.swing.JTextField voter_id;
    private javax.swing.JTextField vpassword3;
    private javax.swing.JTextField vpassword5;
    // End of variables declaration//GEN-END:variables

}
