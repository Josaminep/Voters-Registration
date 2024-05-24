
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
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        uname = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        forgotpw = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 102, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Voter's Registration System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Admin Signup Here");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
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

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Are You A Voter? Login Here");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel6.setText("Admin Login");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voterregister/admin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(forgotpw))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(loginbtn)
                                        .addGap(17, 17, 17))))
                            .addComponent(jLabel5))
                        .addGap(217, 217, 217))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forgotpw))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(loginbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private int attempts = 0; // Define attempts variable to track incorrect password attempts

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
 // Admin login logic
    if (uname.getText().isEmpty() || password.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter Username and Password");
    } else {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voters_db", "root", "");
            String checkBlockedQuery = "SELECT * FROM blocklist WHERE uname=? AND role='admin'";
            PreparedStatement checkBlockedPst = con.prepareStatement(checkBlockedQuery);
            checkBlockedPst.setString(1, uname.getText());
            ResultSet blockedRs = checkBlockedPst.executeQuery();

            if (blockedRs.next()) {
                JOptionPane.showMessageDialog(this, "Your admin account is blocked.");
                con.close();
                return; // Exit the method
            }

            String query = "SELECT * FROM admin WHERE uname=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, uname.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Admin exists, check password
                if (rs.getString("password").equals(password.getText())) {
                    // Admin login successful
                    String admin_name = rs.getString("fname");
                    dispose(); // Close the current login window
                    Home home = new Home(admin_name);
                    home.setVisible(true);

                    // Unblock all voters when an admin logs in
                    String unblockVotersQuery = "DELETE FROM blocklist WHERE role='voter'";
                    PreparedStatement unblockVotersPst = con.prepareStatement(unblockVotersQuery);
                    unblockVotersPst.executeUpdate();
                } else {
                    // Incorrect password
                    attempts++; // Increment the attempts counter
                    if (attempts >= 3) {
                        // Add the user to the block list in the database
                        String blockQuery = "INSERT INTO blocklist (uname, role) VALUES (?, 'admin')";
                        PreparedStatement blockPst = con.prepareStatement(blockQuery);
                        blockPst.setString(1, uname.getText());
                        blockPst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "You have exceeded the maximum number of attempts. Your account is blocked.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Wrong Admin Password! Attempts left: " + (3 - attempts));
                    }
                    password.setText("");
                }
            } else {
                // Admin not found
                JOptionPane.showMessageDialog(this, "Admin not found!");
            }
            con.close(); // Close the connection
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error authenticating admin: " + ex.getMessage());
        }
}

    }//GEN-LAST:event_loginbtnActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbtnMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here
        
        dispose(); // Close the current login window
        Signup sign = new Signup();
        sign.setVisible(true);
        
    }//GEN-LAST:event_jLabel4MouseClicked
    
    private void forgotpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpwMouseClicked
     //Forgot Password 
     
    String email = JOptionPane.showInputDialog(this, "Enter your email:");
    String username = JOptionPane.showInputDialog(this, "Enter your username:");

    if (email != null && username != null) {
        boolean success = forgotPassword(email, username);
        if (success) {
            JOptionPane.showMessageDialog(this, "Password Reset Successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid email or username. Please try again.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Email and username are required.");
    }
}

private boolean forgotPassword(String email, String username) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voters_db", "root", "");
        String query = "SELECT * FROM admin WHERE email=? AND uname=?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, email);
        pst.setString(2, username);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            // Prompt the user to enter a new password
            String newPassword = JOptionPane.showInputDialog(this, "Enter your new password:");
            if (newPassword != null) {
                // Update the password in the database
                String updateQuery = "UPDATE admin SET password=? WHERE email=? AND uname=?";
                PreparedStatement updatePst = con.prepareStatement(updateQuery);
                updatePst.setString(1, newPassword);
                updatePst.setString(2, email);
                updatePst.setString(3, username);
                int rowsUpdated = updatePst.executeUpdate();
                if (rowsUpdated > 0) {
                    return true;
                }
            }
        }
        con.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    return false;


    }//GEN-LAST:event_forgotpwMouseClicked

    private void forgotpwMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpwMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotpwMouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        
                
        dispose(); // Close the current login window
        VoterLogin login = new VoterLogin();
        login.setVisible(true);
        
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
