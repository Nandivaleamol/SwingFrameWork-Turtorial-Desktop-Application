/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing_Framework_Application;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.regex.*;

/**
 *
 * @author suraj
 */
public class UnionNation extends javax.swing.JFrame {

    /**
     * Creates new form UnionNation
     */
    public UnionNation() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        RollNo1 = new javax.swing.JTextField();
        EmailID = new javax.swing.JTextField();
        MobileNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Password2 = new javax.swing.JPasswordField();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        Continue = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Password1 = new javax.swing.JPasswordField();
        Passworderror = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        emailid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RollNo1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 255)));
        RollNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollNo1ActionPerformed(evt);
            }
        });
        RollNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RollNo1KeyReleased(evt);
            }
        });
        jPanel1.add(RollNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 329, 30));

        EmailID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 255)));
        EmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailIDActionPerformed(evt);
            }
        });
        EmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmailIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailIDKeyTyped(evt);
            }
        });
        jPanel1.add(EmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 329, 30));

        MobileNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 255)));
        MobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MobileNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MobileNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MobileNumberKeyTyped(evt);
            }
        });
        jPanel1.add(MobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 329, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sign Up");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 23));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Re-Enter Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 136, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Mobile Number");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 136, 25));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Email-ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 136, 25));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Roll No");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 136, 25));

        Password2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 255)));
        Password2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Password2FocusLost(evt);
            }
        });
        Password2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Password2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Password2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Password2KeyTyped(evt);
            }
        });
        jPanel1.add(Password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 326, 30));

        kGradientPanel2.setkGradientFocus(300);
        kGradientPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kGradientPanel2MouseEntered(evt);
            }
        });

        Continue.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Continue.setForeground(new java.awt.Color(255, 255, 255));
        Continue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Continue.setText("CONTINUE");
        Continue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContinueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ContinueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContinueMouseExited(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Continue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 330, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FOR A FREE STA ACCOUNT ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 23));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Have an Account? Please Login!");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 310, 25));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("Password");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 136, 25));

        Password1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 255)));
        jPanel1.add(Password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 326, 30));

        Passworderror.setForeground(new java.awt.Color(255, 0, 0));
        Passworderror.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Passworderror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassworderrorActionPerformed(evt);
            }
        });
        jPanel1.add(Passworderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 330, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("UserName");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 136, 25));

        UserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 255)));
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        UserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UserNameKeyReleased(evt);
            }
        });
        jPanel1.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 329, 30));

        emailid.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 230, 30));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 380, 590));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html>NEVER STOP LEARNING<BR>BECAUSE LIFE NEVER STOP TEACHING..</html>");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 592, 82));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome To Java Swing Tutorial Software");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 755, 64));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swing_Framework_Application/allura (1).png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 460, 300));

        jLabel14.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("<html>SURAJ DHANAJI KALE<br>AMOL SAYABANNA NANDIVALE</html>");
        jLabel14.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel14PropertyChange(evt);
            }
        });
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 440, 88));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Developed By-:");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 125, 35));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOpaque(true);
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 720, -1));

        jLabel17.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(212, 231, 87));
        jLabel17.setText("THE LEARNING SOFTWARE");
        kGradientPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 301, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailIDActionPerformed

    private void kGradientPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseEntered
        // TODO add your handling code here:
        Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
        kGradientPanel2.setCursor(cur1);
    }//GEN-LAST:event_kGradientPanel2MouseEntered

    private void kGradientPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseClicked
        // TODO add your handling code here:
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        lp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_kGradientPanel2MouseClicked

    private void jLabel14PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel14PropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel14PropertyChange

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
        jLabel16.setForeground(Color.green);
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
        jLabel16.setForeground(Color.red);
    }//GEN-LAST:event_jLabel16MouseExited

    private void ContinueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueMouseEntered
        // TODO add your handling code here:
        Continue.setForeground(Color.orange);
    }//GEN-LAST:event_ContinueMouseEntered

    private void ContinueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueMouseExited
        // TODO add your handling code here:
        Continue.setForeground(Color.white);
    }//GEN-LAST:event_ContinueMouseExited

    private void ContinueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueMouseClicked
        // TODO add your handling code here:
        if (RollNo1.getText().isEmpty() && MobileNumber.getText().isEmpty() && EmailID.getText().isEmpty() && Password1.getText().isEmpty() && Password2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Fill all Fields", "Warning", JOptionPane.WARNING_MESSAGE);
            
        } else {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "root");
                //Creating an query
                String q = "insert into student(Name,RollNo,Mobile,Email,Password,Repassword) values (?,?,?,?,?,?)";
                //getting The prpared statement
                PreparedStatement stmnt = con.prepareStatement(q);

                String Name = UserName.getText();
                String RollNo = RollNo1.getText();
                String Mobile = MobileNumber.getText();
                String Email = EmailID.getText();
                String Password = Password1.getText();
                String Repassword = Password2.getText();
                //setting the values into it by using the variables..
                stmnt.setString(1, Name);
                stmnt.setString(2, RollNo);
                stmnt.setString(3, Mobile);
                stmnt.setString(4, Email);
                stmnt.setString(5, Password);
                stmnt.setString(6, Repassword);

                stmnt.executeUpdate();

                System.out.println("Values inserted....");
                
                setVisible(false);
                new LoginPage(RollNo).setVisible(true);
//                   
            } catch (ClassNotFoundException | SQLException e) {
                //System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_ContinueMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        lp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void RollNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RollNo1ActionPerformed

    private void PassworderrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassworderrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassworderrorActionPerformed

    private void MobileNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MobileNumberKeyPressed
        // TODO add your handling code here:
        //For Numeric Keywords only...
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            JOptionPane.showMessageDialog(this, "Please Enter Only Number", "Warning", JOptionPane.WARNING_MESSAGE);
            MobileNumber.setEditable(true);
        } else {
            MobileNumber.setEditable(true);
        }

        //For 10 Limit only..//
        String number = MobileNumber.getText();
        //get length of the string..
        int length = number.length();

        //checking for the 0 to 9
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            //checking length more than 10
            if (length < 10) {
                MobileNumber.setEditable(true);
            } else {
                MobileNumber.setEditable(false);
            }
        } else {
            //allowing the backspace and delete
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                MobileNumber.setEditable(true);
            }
        }
    }//GEN-LAST:event_MobileNumberKeyPressed

    private void Password2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Password2KeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_Password2KeyTyped

    private void MobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MobileNumberKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_MobileNumberKeyReleased

    private void MobileNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MobileNumberKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_MobileNumberKeyTyped

    private void Password2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Password2KeyPressed
        // TODO add your handling code here:
          if(!(new String(Password1.getPassword()).equals(new String(Password2.getPassword())))){
                        Passworderror.setVisible(true);
                        Passworderror.setText("Password Not Matching..");
                        Continue.setVisible(false);

            }
                    else{
                        Passworderror.setVisible(false);
                       
                        
                    }

    }//GEN-LAST:event_Password2KeyPressed

    private void Password2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Password2KeyReleased
        // TODO add your handling code here:
         if(!(new String(Password1.getPassword()).equals(new String(Password2.getPassword())))){
                        Passworderror.setVisible(true);
                        Passworderror.setText("Password Not Matching..");
                        Continue.setVisible(false);
//            JOptionPane.showMessageDialog(this, "Password Not Matching..");
        }
                    else{
                        Passworderror.setVisible(false);
                       Continue.setVisible(true);
                        
                    }
    }//GEN-LAST:event_Password2KeyReleased

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void UserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserNameKeyReleased
        // TODO add your handling code here:
        //String PATTERN = "^[a-zA-Z]{0,30}$";
        String PATTERN = "^[0-9][@][.][/][!][~][#][$][%][^][&][*][()][_][=][;][,][-][{}][+]]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(UserName.getText());
        if (match.matches()) {
            JOptionPane.showMessageDialog(this, "Naming Is Incorrect\n Plz Use Only Alphabets: a-z and A-Z", "Warning", JOptionPane.WARNING_MESSAGE);
            UserName.setEditable(true);
        }

    }//GEN-LAST:event_UserNameKeyReleased

    private void RollNo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RollNo1KeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(RollNo1.getText());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Roll No Is Incorrect\n Plz Use Only Numarics: 0-9\n range-10", "Warning", JOptionPane.WARNING_MESSAGE);
            RollNo1.setEditable(true);
        }
    }//GEN-LAST:event_RollNo1KeyReleased

    private void EmailIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailIDKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-z0-9]{0,30}[@][a-z0-9][.][com]$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(EmailID.getText());
        if (!match.matches()) {
            
            EmailID.setEditable(true);
        } else {
            emailid.setText(null);
        }
    }//GEN-LAST:event_EmailIDKeyReleased

    private void EmailIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailIDKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_EmailIDKeyTyped

    private void EmailIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailIDKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_EmailIDKeyPressed

    private void Password2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Password2FocusLost
        // TODO add your handling code here:
         if(!(new String(Password1.getPassword()).equals(new String(Password2.getPassword())))){
                        Passworderror.setVisible(true);
                        Passworderror.setText("Password Not Matching..");
                        Continue.setVisible(false);
//            JOptionPane.showMessageDialog(this, "Password Not Matching..");
        }
    }//GEN-LAST:event_Password2FocusLost

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
            java.util.logging.Logger.getLogger(UnionNation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnionNation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnionNation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnionNation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UnionNation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Continue;
    private javax.swing.JTextField EmailID;
    private javax.swing.JTextField MobileNumber;
    private javax.swing.JPasswordField Password1;
    private javax.swing.JPasswordField Password2;
    private javax.swing.JTextField Passworderror;
    private javax.swing.JTextField RollNo1;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel emailid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
