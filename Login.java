
package institute;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.Timer;


public class Login extends javax.swing.JFrame {

     connection C=new connection();
    
    public Login() {
        initComponents();
        
    }

    Timer timer1 = new Timer(30,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if(jPanel_message.getHeight() !=105)
          {
              jPanel_message.setBounds(0,0,Login.this.getSize().width,jPanel_message.getHeight() + 5);
              if(jPanel_message.getHeight() == 105)
              {
                  timer1.stop();
              }
          }
        }
    });
    
     Timer timer2 = new Timer(30,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if(jPanel_message.getHeight() !=0)
          {
              jPanel_message.setBounds(0,0,Login.this.getSize().width,jPanel_message.getHeight() - 5);
              if(jPanel_message.getHeight() == 0)
              {
                  timer2.stop();
              }
          }
        }
    });
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton_Login = new javax.swing.JButton();
        jPanel_message = new javax.swing.JPanel();
        jLabel_message = new javax.swing.JLabel();
        jButton_ok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        caps_lock = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 580));

        jPanel1.setBackground(java.awt.Color.decode("#bdb76b")
        );
        jPanel1.setMaximumSize(new java.awt.Dimension(980, 580));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 580));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 340, 78, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 390, 74, 30);

        jTextField_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_username.setText("Username");
        jTextField_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_usernameMouseClicked(evt);
            }
        });
        jPanel1.add(jTextField_username);
        jTextField_username.setBounds(190, 340, 182, 30);

        jPasswordField_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField_password.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_password.setText("Passworddddddd");
        jPasswordField_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField_passwordMouseClicked(evt);
            }
        });
        jPasswordField_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_passwordKeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField_password);
        jPasswordField_password.setBounds(190, 390, 182, 30);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(430, 390, 130, 30);

        jButton_Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Login.setText("Login");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Login);
        jButton_Login.setBounds(620, 360, 110, 50);

        jPanel_message.setBackground(new java.awt.Color(0, 0, 204));

        jLabel_message.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jButton_ok.setText("OK");
        jButton_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_messageLayout = new javax.swing.GroupLayout(jPanel_message);
        jPanel_message.setLayout(jPanel_messageLayout);
        jPanel_messageLayout.setHorizontalGroup(
            jPanel_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_messageLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel_message, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel_messageLayout.setVerticalGroup(
            jPanel_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_messageLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_message, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel_message);
        jPanel_message.setBounds(0, 0, 980, 0);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Forgot Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(480, 490, 151, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(780, 360, 110, 50);

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(360, 490, 67, 33);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\stock-photo-security-services-and-protection-concept-login-sign-in-concepts-businessman-offer-padlock-557292859.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 20, 450, 280);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 520, 340, 60);
        jPanel1.add(caps_lock);
        caps_lock.setBounds(340, 420, 150, 20);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Change Password");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(680, 490, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
          if(jCheckBox1.isSelected())
        {
            jPasswordField_password.setEchoChar((char)0);
        }
        else
        {
            jPasswordField_password.setEchoChar('*');
                    
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_okActionPerformed
        timer2.start();
        String s=jLabel_message.getText();
        if(s == "Login Successfully")
        {
            Menu m=new Menu();
                   m.setVisible(true);
        }
        else
        {
            
        }
    }//GEN-LAST:event_jButton_okActionPerformed

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
       
          try
       {
         
         String qry="select * from sign_in where userid='"+jTextField_username.getText()+"' and pwd='"+jPasswordField_password.getText()+"'";
        // JOptionPane.showMessageDialog(this,qry);
         
         C.rs=C.stmt.executeQuery(qry);
         if(C.rs.next())
         {
            //JOptionPane.showMessageDialog(null,"Login Successfully");
              jLabel_message.setText("Login Successfully");
                    jLabel_message.setForeground(Color.GREEN);
                    timer1.start();
                   
         }
         else
         {
            // JOptionPane.showMessageDialog(null,"Invalid username and password");
               jLabel_message.setText("Invalid username or password");
                    jLabel_message.setForeground(Color.RED);
                    timer1.start();
         }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this,e.toString());
           
       }
            
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

       jTextField_username.setText(null);
       jPasswordField_password.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_passwordKeyPressed

        if(Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK))
        {
            caps_lock.setText("Caps Lock is ON");
            
        }
        else
        {
            caps_lock.setText(null);
        }
    }//GEN-LAST:event_jPasswordField_passwordKeyPressed

    private void jTextField_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_usernameMouseClicked
        // TODO add your handling code here:
        jTextField_username.setText(null);
    }//GEN-LAST:event_jTextField_usernameMouseClicked

    private void jPasswordField_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField_passwordMouseClicked
        // TODO add your handling code here:
        jPasswordField_password.setText(null);
    }//GEN-LAST:event_jPasswordField_passwordMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        forgot f=new forgot();
        f.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        changepass c=new changepass();
        c.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

 
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caps_lock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JButton jButton_ok;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_message;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_message;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_username;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
