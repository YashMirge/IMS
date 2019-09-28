
package institute;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.sql.*;

public class signin extends javax.swing.JFrame {
    
     public void close(){

WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

}

   String uid,nm;
    connection C=new connection();
    
    public signin() {
        initComponents();
    }
    
     public signin(String x,String y) {
        initComponents();
         uid=x;
        nm=y;
        txtuid.setText(uid);
        txtusname.setText(nm);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtusname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtuid = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpwd = new javax.swing.JPasswordField();
        txtcpwd = new javax.swing.JPasswordField();
        secque = new javax.swing.JComboBox();
        secans = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 580));
        setMinimumSize(new java.awt.Dimension(980, 580));
        setPreferredSize(new java.awt.Dimension(980, 580));
        getContentPane().setLayout(null);

        txtusname.setEditable(false);
        txtusname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtusname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtusname);
        txtusname.setBounds(360, 170, 257, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Welcome ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(409, 122, 160, 37);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sign In");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(298, 11, 402, 73);

        txtuid.setEditable(false);
        txtuid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtuid);
        txtuid.setBounds(487, 223, 165, 30);

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(452, 498, 100, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Your UserID is");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 222, 131, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 290, 87, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Confirm Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 330, 170, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Security Question");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 380, 160, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Security Answer");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 430, 147, 22);
        getContentPane().add(txtpwd);
        txtpwd.setBounds(500, 290, 225, 30);
        getContentPane().add(txtcpwd);
        txtcpwd.setBounds(500, 330, 225, 30);

        secque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        secque.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is your building name?", "What is your favorite book name?", "What are your hobbies?", "What is your favorite color?", "What is your dream job?" }));
        getContentPane().add(secque);
        secque.setBounds(500, 380, 225, 30);

        secans.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(secans);
        secans.setBounds(500, 430, 225, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\05.jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        if(txtpwd.getText().isEmpty() && txtcpwd.getText().isEmpty() && secans.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(null, "Please enter all details !! ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtpwd.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(null, "Please enter password !! ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtcpwd.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(null, "Please enter confirm password !! ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(secans.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(null, "Please enter security answer ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtpwd.getText().equals(txtcpwd.getText()))
        {
           JOptionPane.showMessageDialog(this,"OK");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please check your password");
        }
       /* if(secans.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"please enter security answer");
        }
        if(secans.getText().length()==0)
        {
             JOptionPane.showMessageDialog(this,"please enter security answer");
        }*/
        try
        {
      
         String qry="insert into sign_in values('"+uid+"','"+txtpwd.getText()+"','"+secque.getSelectedItem()+"','"+secans.getText()+"')";
        //  JOptionPane.showMessageDialog(this, qry);
          
          C.stmt.executeUpdate(qry);
          JOptionPane.showMessageDialog(this, "record added");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.toString());


        }
        //course_master cs=new course_master();
        //cs.setVisible(true);

    }//GEN-LAST:event_submitActionPerformed

   
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
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField secans;
    private javax.swing.JComboBox secque;
    private javax.swing.JButton submit;
    private javax.swing.JPasswordField txtcpwd;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JTextField txtuid;
    private javax.swing.JTextField txtusname;
    // End of variables declaration//GEN-END:variables
}
