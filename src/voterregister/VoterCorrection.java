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
 
public class VoterCorrection extends javax.swing.JFrame {

    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;
    
    
    public VoterCorrection() {
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
        new_lname = new javax.swing.JTextField();
        new_mname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        new_fname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        new_age = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        new_sex = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        new_bday = new javax.swing.JTextField();
        new_birthplace = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        new_address = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        new_contact = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        new_occupation = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        new_civilstatus = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        new_username = new javax.swing.JTextField();
        new_password = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        voter_id = new javax.swing.JTextField();
        search = new javax.swing.JButton();

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
        jLabel13.setText("Lastname:");

        new_lname.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_lnameActionPerformed(evt);
            }
        });

        new_mname.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_mnameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel14.setText("Middlename:");

        new_fname.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_fnameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel15.setText("Firstname:");

        new_age.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_ageActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel17.setText("Age:");

        jLabel19.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel19.setText("Sex:");

        new_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel20.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel20.setText("Date of Birth:");

        new_bday.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_bday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_bdayActionPerformed(evt);
            }
        });

        new_birthplace.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_birthplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_birthplaceActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel21.setText("Place of Birth:");

        jLabel22.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel22.setText("Current Address:");

        new_address.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_addressActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel23.setText("Contact #:");

        new_contact.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_contactActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel24.setText("Occupation:");

        new_occupation.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_occupationActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel26.setText("Civil Status:");

        new_civilstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced", "Separated", "Widowed" }));

        jLabel27.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel27.setText("Username:");

        new_username.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_usernameActionPerformed(evt);
            }
        });

        new_password.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        new_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_passwordActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel28.setText("Password:");

        update.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        update.setText("Save");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(new_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(new_sex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(new_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(new_bday, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(new_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(new_birthplace, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(new_age, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(new_address, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel23)
                                .addComponent(new_contact, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addComponent(new_occupation, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(jLabel26)
                                .addComponent(new_civilstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(new_username, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(new_bday, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(new_occupation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(new_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(new_sex)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(new_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(new_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(new_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(new_birthplace, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(new_civilstatus))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_age, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(new_username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(back))
                .addGap(126, 126, 126))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Correction of Entry");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel25.setText("Voter Id:");

        voter_id.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        voter_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voter_idActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel25)
                .addGap(27, 27, 27)
                .addComponent(voter_id, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voter_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vpassword3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpassword3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vpassword3ActionPerformed

    private void vpassword5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpassword5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vpassword5ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed
int Key = -1;

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        //Code to Correct/Update Entry
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
        // Update fields if voter ID exists
        String updateQuery = "UPDATE register SET lname=?, mname=?, fname=?, age=?, sex=?, bday=?, birth_place=?, address=?, contact=?, occupation=?, civil_status=?, username=?, password=? WHERE voter_id=?";
        PreparedStatement updateStatement = Con.prepareStatement(updateQuery);
        updateStatement.setString(1, new_lname.getText());
        updateStatement.setString(2, new_mname.getText());
        updateStatement.setString(3, new_fname.getText());
        updateStatement.setString(4, new_age.getText());
        updateStatement.setString(5, (String) new_sex.getSelectedItem());
        updateStatement.setString(6, new_bday.getText());
        updateStatement.setString(7, new_birthplace.getText());
        updateStatement.setString(8, new_address.getText());
        updateStatement.setString(9, new_contact.getText());
        updateStatement.setString(10, new_occupation.getText());
        updateStatement.setString(11, (String) new_civilstatus.getSelectedItem());
        updateStatement.setString(12, new_username.getText());
        updateStatement.setString(13, new_password.getText());
        updateStatement.setString(14, voter_id.getText());

        int updatedRows = updateStatement.executeUpdate();
        if (updatedRows > 0) {
            JOptionPane.showMessageDialog(this, "Information updated successfully");
            
        dispose();
        Voters list = new Voters();
        list.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update information");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Voter ID not found");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, e);
}

    }//GEN-LAST:event_updateMouseClicked

    private void new_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_passwordActionPerformed

    private void new_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_usernameActionPerformed

    private void new_occupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_occupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_occupationActionPerformed

    private void new_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_contactActionPerformed

    private void new_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_addressActionPerformed

    private void new_bdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_bdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_bdayActionPerformed

    private void new_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_ageActionPerformed

    private void new_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_fnameActionPerformed

    private void new_mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_mnameActionPerformed

    private void new_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_lnameActionPerformed

    private void new_birthplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_birthplaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_birthplaceActionPerformed

    private void voter_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voter_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voter_idActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // Search by Voter ID
        
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
        new_lname.setText(resultSet.getString("lname"));
        new_mname.setText(resultSet.getString("mname"));
        new_fname.setText(resultSet.getString("fname"));
        new_age.setText(resultSet.getString("age"));
        new_sex.setSelectedItem(resultSet.getString("sex"));
        new_bday.setText(resultSet.getString("bday")); // Assuming the format is correct
        new_birthplace.setText(resultSet.getString("birth_place"));
        new_address.setText(resultSet.getString("address"));
        new_contact.setText(resultSet.getString("contact"));
        new_occupation.setText(resultSet.getString("occupation"));
        new_civilstatus.setSelectedItem(resultSet.getString("civil_status"));
        new_username.setText(resultSet.getString("username"));
        new_password.setText(resultSet.getString("password"));
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
            java.util.logging.Logger.getLogger(VoterCorrection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoterCorrection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoterCorrection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoterCorrection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoterCorrection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField new_address;
    private javax.swing.JTextField new_age;
    private javax.swing.JTextField new_bday;
    private javax.swing.JTextField new_birthplace;
    private javax.swing.JComboBox<String> new_civilstatus;
    private javax.swing.JTextField new_contact;
    private javax.swing.JTextField new_fname;
    private javax.swing.JTextField new_lname;
    private javax.swing.JTextField new_mname;
    private javax.swing.JTextField new_occupation;
    private javax.swing.JTextField new_password;
    private javax.swing.JComboBox<String> new_sex;
    private javax.swing.JTextField new_username;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    private javax.swing.JTextField voter_id;
    private javax.swing.JTextField vpassword3;
    private javax.swing.JTextField vpassword5;
    // End of variables declaration//GEN-END:variables

}
