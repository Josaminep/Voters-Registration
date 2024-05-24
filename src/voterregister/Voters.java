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

public class Voters extends javax.swing.JFrame {

    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;


    public Voters() {
        initComponents();
        DisplayVoters();

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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VotersTable = new javax.swing.JTable();
        search_voter = new javax.swing.JLabel();
        search_id = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        back = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        jLabel2.setText("List of Voters");

        VotersTable.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        VotersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Voters ID", "Lastname", "Middlename", "Firstname", "Age", "Sex", "Date of Birth", "Place of Birth", "Current Address", "Contact #", "Occupation", "Civil Status"
            }
        ));
        VotersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VotersTable);

        search_voter.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        search_voter.setText("Search by Voter Id:");

        search_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_idActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
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

        delete.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        search1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        search1.setText("Refresh");
        search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search1MouseClicked(evt);
            }
        });
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete)
                        .addGap(277, 277, 277)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(search_voter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search1)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back)
                    .addComponent(search_voter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete)
                    .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Voter's Registration System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(14, 14, 14))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VotersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotersTableMouseClicked

    }//GEN-LAST:event_VotersTableMouseClicked

    private void search_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_idActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        String search_voter = search_id.getText();
if (!search_voter.isEmpty()) {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voters_db", "root", "");
        String query = "SELECT voter_id, lname, mname, fname, age, sex, bday, birth_place, address, contact, occupation, civil_status FROM register WHERE voter_id=?";
        PreparedStatement pst = Con.prepareStatement(query);
        pst.setString(1, search_voter);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Voter ID");
            model.addColumn("Last Name");
            model.addColumn("Middle Name");
            model.addColumn("First Name");
            model.addColumn("Age");
            model.addColumn("Sex");
            model.addColumn("Birthdate");
            model.addColumn("Birth Place");
            model.addColumn("Address");
            model.addColumn("Contact");
            model.addColumn("Occupation");
            model.addColumn("Civil Status");

            String[] row = new String[12];
            row[0] = rs.getString("voter_id");
            row[1] = rs.getString("lname");
            row[2] = rs.getString("mname");
            row[3] = rs.getString("fname");
            row[4] = rs.getString("age");
            row[5] = rs.getString("sex");
            row[6] = rs.getString("bday");
            row[7] = rs.getString("birth_place");
            row[8] = rs.getString("address");
            row[9] = rs.getString("contact");
            row[10] = rs.getString("occupation");
            row[11] = rs.getString("civil_status");
            model.addRow(row);

            VotersTable.setModel(model);
        } else {
            JOptionPane.showMessageDialog(this, "Voter ID not found");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error executing query: " + e.getMessage());
        e.printStackTrace();
    }
} else {
    JOptionPane.showMessageDialog(this, "Please enter a Voter ID to search");
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
int Key = -1;
    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
int selectedRow = VotersTable.getSelectedRow();
if (selectedRow == -1) {
    JOptionPane.showMessageDialog(this, "Select a Voter To Be Deleted");
} else {
    String keyString = (String) VotersTable.getValueAt(selectedRow, 0); // Assuming voter_id is in the first column
    Key = Integer.parseInt(keyString); // Convert the String to an Integer
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voters_db", "root", "");
        String Query = "DELETE FROM register WHERE voter_id=?";
        PreparedStatement pst = Con.prepareStatement(Query);
        pst.setInt(1, Key);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Voter Deleted Successfully!");
        DisplayVoters(); // Refresh the voter table
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e);
    }
}






    }//GEN-LAST:event_deleteMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void search1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseClicked
        // TODO add your handling code here:
        
        DisplayVoters();
    }//GEN-LAST:event_search1MouseClicked

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed
private void DisplayVoters() {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voters_db", "root", "");
        St = Con.createStatement();
        Rs = St.executeQuery("SELECT voter_id, lname, mname, fname, age, sex, bday, birth_place, address, contact, occupation, civil_status FROM register");

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Voter ID");
        model.addColumn("Last Name");
        model.addColumn("Middle Name");
        model.addColumn("First Name");
        model.addColumn("Age");
        model.addColumn("Sex");
        model.addColumn("Birthdate");
        model.addColumn("Birth Place");
        model.addColumn("Address");
        model.addColumn("Contact");
        model.addColumn("Occupation");
        model.addColumn("Civil Status");

        while (Rs.next()) {
            String[] row = new String[12];
            row[0] = Rs.getString("voter_id");
            row[1] = Rs.getString("lname");
            row[2] = Rs.getString("mname");
            row[3] = Rs.getString("fname");
            row[4] = Rs.getString("age");
            row[5] = Rs.getString("sex");
            row[6] = Rs.getString("bday");
            row[7] = Rs.getString("birth_place");
            row[8] = Rs.getString("address");
            row[9] = Rs.getString("contact");
            row[10] = Rs.getString("occupation");
            row[11] = Rs.getString("civil_status");
            model.addRow(row);
        }

        VotersTable.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e);
    }
}

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
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VotersTable;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JButton search1;
    private javax.swing.JTextField search_id;
    private javax.swing.JLabel search_voter;
    // End of variables declaration//GEN-END:variables

}
