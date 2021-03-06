package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import model.*;

public class RegisterP extends javax.swing.JFrame {

    public RegisterP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cPasswordRF = new javax.swing.JPasswordField();
        passwordRF = new javax.swing.JPasswordField();
        usernameRF = new javax.swing.JTextField();
        firstnameRF = new javax.swing.JTextField();
        lastnameRF = new javax.swing.JTextField();
        signupRB = new javax.swing.JButton();
        resetRB = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        quitLB4 = new javax.swing.JButton();
        positionF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mobileF = new javax.swing.JTextField();
        FacultyF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facility Management");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(800, 625));
        setMinimumSize(new java.awt.Dimension(800, 625));
        setPreferredSize(new java.awt.Dimension(800, 635));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 153));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 100, 30));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/RegisterT2.png"))); // NOI18N
        jLabel2.setText("REGISTER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        jLabel3.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel3.setText("LASTNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel4.setText("FACULTY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 70, -1));

        jLabel6.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel6.setText("USERNAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        cPasswordRF.setBackground(new java.awt.Color(255, 219, 219));
        cPasswordRF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cPasswordRFKeyReleased(evt);
            }
        });
        getContentPane().add(cPasswordRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 250, 30));

        passwordRF.setBackground(new java.awt.Color(255, 219, 219));
        passwordRF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordRFKeyReleased(evt);
            }
        });
        getContentPane().add(passwordRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 250, 30));

        usernameRF.setBackground(new java.awt.Color(255, 219, 219));
        usernameRF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameRFKeyReleased(evt);
            }
        });
        getContentPane().add(usernameRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 250, 30));

        firstnameRF.setBackground(new java.awt.Color(255, 219, 219));
        getContentPane().add(firstnameRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 250, 30));

        lastnameRF.setBackground(new java.awt.Color(255, 219, 219));
        getContentPane().add(lastnameRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 250, 30));

        signupRB.setBackground(new java.awt.Color(102, 255, 204));
        signupRB.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        signupRB.setForeground(new java.awt.Color(255, 51, 51));
        signupRB.setText("Sign up");
        signupRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupRBActionPerformed(evt);
            }
        });
        getContentPane().add(signupRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 120, 40));

        resetRB.setBackground(new java.awt.Color(102, 255, 204));
        resetRB.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        resetRB.setForeground(new java.awt.Color(255, 51, 51));
        resetRB.setText("Reset");
        resetRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetRBActionPerformed(evt);
            }
        });
        getContentPane().add(resetRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 120, 40));

        jRadioButton1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jRadioButton1.setText("staff");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jRadioButton2.setText("student");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel8.setText("FIRSTNAME");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel9.setText("PASSWORD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel10.setText("RE-PASSWORD");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        quitLB4.setBackground(new java.awt.Color(102, 255, 204));
        quitLB4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        quitLB4.setForeground(new java.awt.Color(255, 51, 51));
        quitLB4.setText("Back");
        quitLB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitLB4ActionPerformed(evt);
            }
        });
        getContentPane().add(quitLB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 120, 40));

        positionF.setBackground(new java.awt.Color(255, 219, 219));
        getContentPane().add(positionF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 250, 30));

        jLabel12.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel12.setText("POSITION");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 70, -1));

        mobileF.setBackground(new java.awt.Color(255, 219, 219));
        getContentPane().add(mobileF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 250, 30));

        FacultyF.setBackground(new java.awt.Color(255, 219, 219));
        getContentPane().add(FacultyF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 250, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/register-icon.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 150, 140));

        jLabel13.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel13.setText("MOBILE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 70, -1));

        jLabel14.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 153));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 100, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/register.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cPasswordRFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPasswordRFKeyReleased
        if (cPasswordRF.getText().equals(passwordRF.getText()) && !passwordRF.getText().equalsIgnoreCase("")) {
            jLabel7.setText("Compatible");
            signupRB.setEnabled(true);
        } else {
            jLabel7.setText("Incompatible");
            signupRB.setEnabled(false);
        }
    }//GEN-LAST:event_cPasswordRFKeyReleased
    private void passwordRFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordRFKeyReleased
        if (cPasswordRF.getText().equals(passwordRF.getText()) && !passwordRF.getText().equalsIgnoreCase("")) {
            jLabel7.setText("Compatible");
            signupRB.setEnabled(true);
        } else {
            jLabel7.setText("Incompatible");
            signupRB.setEnabled(false);
        }
    }//GEN-LAST:event_passwordRFKeyReleased
    private void signupRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupRBActionPerformed
        if (jRadioButton1.isSelected() || jRadioButton2.isSelected()) {
            if (!firstnameRF.getText().equals("") && !lastnameRF.getText().equals("")
                    && !mobileF.getText().equals("") && !usernameRF.getText().equals("")
                    && !passwordRF.getPassword().equals("") && !cPasswordRF.getPassword().equals("")
                    && !position.equals("")) {
                try {
                    user.register(firstnameRF.getText(), lastnameRF.getText(), role, position, mobileF.getText(), usernameRF.getText(), String.valueOf(passwordRF.getPassword()), FacultyF.getText());
                    JOptionPane.showMessageDialog(this, user.toString(), "Test", JOptionPane.WARNING_MESSAGE);
                    LoginP LiP = new LoginP();
                    LiP.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    LiP.setVisible(true);
                    this.setVisible(false);
                } catch (SQLException ex) {
                    System.err.println(ex);
                } finally {
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please insert text in blank space", "Error!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select Staff or Student", "Error!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_signupRBActionPerformed
    private void resetRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetRBActionPerformed
        jLabel7.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        usernameRF.setText("");
        passwordRF.setText("");
        cPasswordRF.setText("");
        firstnameRF.setText("");
        lastnameRF.setText("");
        positionF.setText("");
        mobileF.setText("");
        jLabel14.setText("");
        FacultyF.setText("");
    }//GEN-LAST:event_resetRBActionPerformed
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
        position = positionF.getText();
        role = jRadioButton1.getText();
    }//GEN-LAST:event_jRadioButton1ActionPerformed
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
        position = "student";
        role = jRadioButton2.getText();
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    private void quitLB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitLB4ActionPerformed
        LoginP LiP = new LoginP();
        LiP.setDefaultCloseOperation(EXIT_ON_CLOSE);
        LiP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_quitLB4ActionPerformed
  private void usernameRFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameRFKeyReleased
      con = ConnectionBuilder.getConnection();
      try {
          ps = con.prepareStatement("SELECT username FROM user WHERE username=?");
          ps.setString(1, usernameRF.getText());
          ResultSet rs = ps.executeQuery();
          if (rs.next()) {
              jLabel14.setText("Not available!");
              signupRB.setEnabled(false);
          } else {
              jLabel14.setText("Available!");
              signupRB.setEnabled(true);
          }
      } catch (SQLException ex) {
          System.err.println(ex);
      } finally {
          if (usernameRF.getText().equalsIgnoreCase("")) {
              jLabel14.setText("Not available!");
              signupRB.setEnabled(false);
          }
          try {
              con.close();
          } catch (SQLException ex) {
              System.err.println("!" + ex);
          }
      }
  }//GEN-LAST:event_usernameRFKeyReleased

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterP().setVisible(true);
            }
        });
    }

    Connection con;
    PreparedStatement ps;
    private String position = "";
    private String role = null;
    User user = new User();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FacultyF;
    private javax.swing.JPasswordField cPasswordRF;
    private javax.swing.JTextField firstnameRF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField lastnameRF;
    private javax.swing.JTextField mobileF;
    private javax.swing.JPasswordField passwordRF;
    private javax.swing.JTextField positionF;
    private javax.swing.JButton quitLB4;
    private javax.swing.JButton resetRB;
    private javax.swing.JButton signupRB;
    private javax.swing.JTextField usernameRF;
    // End of variables declaration//GEN-END:variables

}
