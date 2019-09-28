
package institute;
import javax.swing.JOptionPane;
import java.sql.*;

public class course_master extends javax.swing.JFrame {

    String cname;
      connection C=new connection();
    public course_master() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtcid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtduration = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtfees = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 580));
        setMinimumSize(new java.awt.Dimension(980, 580));
        setPreferredSize(new java.awt.Dimension(980, 580));
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Course Information");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(185, 11, 618, 77);

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
        submit.setBounds(420, 490, 100, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Course ID");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(256, 182, 100, 22);

        txtcid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtcid);
        txtcid.setBounds(488, 180, 200, 32);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Course Name");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(256, 232, 130, 22);

        txtcname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtcname);
        txtcname.setBounds(488, 230, 200, 32);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Duration");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(256, 280, 80, 22);

        txtduration.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtduration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdurationKeyPressed(evt);
            }
        });
        getContentPane().add(txtduration);
        txtduration.setBounds(488, 278, 200, 32);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("Fees");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(256, 330, 41, 22);

        txtfees.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtfees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfeesKeyPressed(evt);
            }
        });
        getContentPane().add(txtfees);
        txtfees.setBounds(488, 328, 200, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\programming-languages-1024x576.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
         if(txtcid.getText().isEmpty() && txtcname.getText().isEmpty() && txtduration.getText().isEmpty() && txtfees.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(null,"Please enter all details !! ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtcid.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter course ID ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
         if(txtcname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter course name ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
          if(txtduration.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter course duration ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
           if(txtfees.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter course fees ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            String qry="insert into course_master values('"+txtcid.getText()+"','"+txtcname.getText()+"','"+txtduration.getText()+"','"+txtfees.getText()+"')";
            
           // JOptionPane.showMessageDialog(this, qry);
            C.stmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(this, "record added");

          
           course_detail cd=new course_detail();
           cd.setVisible(true);
        }
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(this, e.toString());
        }
       
    }//GEN-LAST:event_submitActionPerformed

    private void txtdurationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdurationKeyPressed
        // TODO add your handling code here:
         char char_input = evt.getKeyChar();
    if (((char_input < '0') || (char_input > '9')) && (char_input != '\b'))
    {
        JOptionPane.showMessageDialog(this, "Please enter number only !","Invalid Input",JOptionPane.ERROR_MESSAGE);
        txtduration.setText(" ");
    }
    }//GEN-LAST:event_txtdurationKeyPressed

    private void txtfeesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfeesKeyPressed
        // TODO add your handling code here:
         char char_input = evt.getKeyChar();
    if (((char_input < '0') || (char_input > '9')) && (char_input != '\b'))
    {
        JOptionPane.showMessageDialog(this, "please enter number only !","Invalid Input",JOptionPane.ERROR_MESSAGE);
        txtfees.setText(" ");
    }
    }//GEN-LAST:event_txtfeesKeyPressed

    
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
            java.util.logging.Logger.getLogger(course_master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(course_master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(course_master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(course_master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new course_master().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtfees;
    // End of variables declaration//GEN-END:variables
}
