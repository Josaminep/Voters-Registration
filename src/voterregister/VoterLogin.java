
 package voterregister;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author josam
 */
public class VoterLogin extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public VoterLogin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null; 
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        uname = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        forgotpw = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 102, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setText("Username:");

        loginbtn.setBackground(new java.awt.Color(0, 0, 102));
        loginbtn.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Login");
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        uname.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        forgotpw.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        forgotpw.setForeground(new java.awt.Color(0, 0, 204));
        forgotpw.setText("Forgot Password?");
        forgotpw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpwMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotpwMouseEntered(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel5.setText("Voter Login");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Are You An Admin? Login Here");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voterregister/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(forgotpw)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(loginbtn)
                                .addGap(59, 59, 59))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel5)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forgotpw)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(loginbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(56, 56, 56))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Voter's Registration System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private int attempts = 0; // Define attempts variable to track incorrect password attempts

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed

 // Voter login logic
if (uname.getText().isEmpty() || password.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Enter Username and Password");
} else {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voters_db", "root", "");
        
        // Check if the voter account is blocked
        String checkBlockedQuery = "SELECT * FROM blocklist WHERE uname=? AND role='voter'";
        PreparedStatement checkBlockedPst = con.prepareStatement(checkBlockedQuery);
        checkBlockedPst.setString(1, uname.getText());
        ResultSet blockedRs = checkBlockedPst.executeQuery();
        
        if (blockedRs.next()) {
            JOptionPane.showMessageDialog(this, "Your voter account is blocked. Please contact the admin.");
            con.close();
            return; // Exit the method
        }
        
        // Attempt to log in
        String query = "SELECT * FROM register WHERE username=? AND password=?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, uname.getText());
        pst.setString(2, password.getText());
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            dispose(); // Close the current login window
            VoterHome home = new VoterHome();
            home.setVisible(true);
        } else {
            // Incorrect password
            attempts++; // Increment the attempts counter
            if (attempts >= 3) {
                // Add the user to the block list in the database
                String blockQuery = "INSERT INTO voter_blocklist (uname, role) VALUES (?, 'voter')";
                PreparedStatement blockPst = con.prepareStatement(blockQuery);
                blockPst.setString(1, uname.getText());
                blockPst.executeUpdate();
                JOptionPane.showMessageDialog(this, "You have exceeded the maximum number of attempts. Your account is blocked.");
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Voter Password! Attempts left: " + (3 - attempts));
            }
            password.setText("");
        }
        con.close(); // Close the connection
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error authenticating voter: " + ex.getMessage());
    }
}

    }//GEN-LAST:event_loginbtnActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbtnMouseClicked
    
    private void forgotpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpwMouseClicked

 String contact = JOptionPane.showInputDialog(this, "Enter your contact number:");
String username = JOptionPane.showInputDialog(this, "Enter your username:");

if (contact != null && username != null) {
    boolean success = forgotPassword(contact, username);
    if (success) {
        JOptionPane.showMessageDialog(this, "Password Reset Successfully.");
    } else {
        JOptionPane.showMessageDialog(this, "Invalid contact number or username. Please try again.");
    }
} else {
    JOptionPane.showMessageDialog(this, "Contact Number and username are required.");
}
    }
private boolean forgotPassword(String contact, String username) {
    Connection con = null;
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voters_db", "root", "");
        String query = "SELECT * FROM register WHERE contact=? AND username=?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, contact);
        pst.setString(2, username);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            String newPassword = JOptionPane.showInputDialog(this, "Enter your new password:");
            if (newPassword != null && !newPassword.isEmpty()) {
                String updateQuery = "UPDATE register SET password=? WHERE contact=? AND username=?";
                PreparedStatement updatePst = con.prepareStatement(updateQuery);
                updatePst.setString(1, newPassword);
                updatePst.setString(2, contact);
                updatePst.setString(3, username);
                int rowsUpdated = updatePst.executeUpdate();
                if (rowsUpdated > 0) {
                    return true;
                }
            }
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    } finally {
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                // Handle the exception
            }
        }
    }
    return false;





    }//GEN-LAST:event_forgotpwMouseClicked

    private void forgotpwMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpwMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotpwMouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        
        dispose(); // Close the current login window
         LoginPage login = new LoginPage();
        login.setVisible(true);
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(VoterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoterLogin().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgotpw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
