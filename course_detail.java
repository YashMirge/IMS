
package institute;
import javax.swing.JOptionPane;
import java.sql.*;

public class course_detail extends javax.swing.JFrame {
 connection C=new connection();
    
    public course_detail() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblcurdur = new javax.swing.JLabel();
        lblrevfees = new javax.swing.JLabel();
        lblfees = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbldur = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnedit1 = new javax.swing.JButton();
        txtdur = new javax.swing.JTextField();
        txtnewdur = new javax.swing.JTextField();
        txtfees = new javax.swing.JTextField();
        txtrevfees = new javax.swing.JTextField();
        btnedit2 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbnm = new javax.swing.JComboBox<>();
        button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 580));
        setMinimumSize(new java.awt.Dimension(980, 580));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Course Detail");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 417, 57);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Course Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(245, 145, 159, 30);

        lblcurdur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcurdur.setForeground(new java.awt.Color(255, 255, 0));
        lblcurdur.setText("Current Duration");
        getContentPane().add(lblcurdur);
        lblcurdur.setBounds(245, 271, 159, 30);

        lblrevfees.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblrevfees.setForeground(new java.awt.Color(255, 255, 0));
        lblrevfees.setText("Revised Fees");
        getContentPane().add(lblrevfees);
        lblrevfees.setBounds(245, 398, 126, 30);

        lblfees.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblfees.setForeground(new java.awt.Color(255, 255, 0));
        lblfees.setText("Fees");
        getContentPane().add(lblfees);
        lblfees.setBounds(250, 340, 113, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Rs.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(389, 346, 28, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Rs.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(389, 395, 28, 30);

        lbldur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldur.setForeground(new java.awt.Color(255, 255, 0));
        lbldur.setText("Duration");
        getContentPane().add(lbldur);
        lbldur.setBounds(245, 214, 159, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Months");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(626, 224, 58, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Months");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(626, 280, 58, 22);

        btnedit1.setBackground(new java.awt.Color(0, 0, 0));
        btnedit1.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        btnedit1.setForeground(new java.awt.Color(255, 255, 255));
        btnedit1.setText("Edit");
        btnedit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit1);
        btnedit1.setBounds(724, 219, 72, 37);

        txtdur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtdur);
        txtdur.setBounds(435, 223, 159, 30);

        txtnewdur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnewdur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnewdurKeyPressed(evt);
            }
        });
        getContentPane().add(txtnewdur);
        txtnewdur.setBounds(435, 274, 159, 30);

        txtfees.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtfees);
        txtfees.setBounds(435, 349, 159, 30);

        txtrevfees.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtrevfees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrevfeesKeyPressed(evt);
            }
        });
        getContentPane().add(txtrevfees);
        txtrevfees.setBounds(435, 398, 159, 30);

        btnedit2.setBackground(new java.awt.Color(0, 0, 0));
        btnedit2.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        btnedit2.setForeground(new java.awt.Color(255, 255, 255));
        btnedit2.setText("Edit");
        btnedit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit2);
        btnedit2.setBounds(726, 349, 70, 33);

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(290, 500, 99, 32);

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
        submit.setBounds(580, 500, 99, 32);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 0);

        cmbnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnmActionPerformed(evt);
            }
        });
        getContentPane().add(cmbnm);
        cmbnm.setBounds(440, 150, 150, 30);

        button.setText("Show");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button);
        button.setBounds(660, 150, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\programming-languages-1024x576.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        lblcurdur.setVisible(false);
        jLabel7.setVisible(false);
        lblrevfees.setVisible(false);
        jLabel9.setVisible(false);
        txtnewdur.setVisible(false);
        txtrevfees.setVisible(false);


        String qry;
        
                try
		{
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	//dirver relation
		}
		catch(Exception e)
		{
                    System.out.println("class not found");
		}
                try
		{

			C.con=DriverManager.getConnection("jdbc:odbc:yash");
			C.stmt=C.con.createStatement();
                        qry="select cname from course_master";
                        C.rs=C.stmt.executeQuery(qry);
                        while(C.rs.next())
                        {
                            cmbnm.addItem(C.rs.getString(1));
                        }


                }
                 catch(Exception e)
		 {
			JOptionPane.showMessageDialog(this,e.toString());
		 }
                
    }//GEN-LAST:event_formWindowOpened

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try
        {
            String value1=txtnewdur.getText();
            String value2=txtrevfees.getText();
            String update=" update course_master set duration='"+value1+"',fees='"+value2+"'where cname='"+cmbnm.getSelectedItem()+"'";
            C.stmt.executeUpdate(update);
            JOptionPane.showMessageDialog(this,update);
             JOptionPane.showMessageDialog(null,"Data Updated");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void btnedit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit1ActionPerformed
         lblcurdur.setVisible(true);
        txtnewdur.setVisible(true);
        jLabel7.setVisible(true);
    }//GEN-LAST:event_btnedit1ActionPerformed

    private void btnedit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit2ActionPerformed
       lblrevfees.setVisible(true);
        jLabel9.setVisible(true);
        txtrevfees.setVisible(true);
    }//GEN-LAST:event_btnedit2ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
      
    }//GEN-LAST:event_submitActionPerformed

    private void txtnewdurKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewdurKeyPressed
        // TODO add your handling code here:
         char char_input = evt.getKeyChar();
    if (((char_input < '0') || (char_input > '9')) && (char_input != '\b'))
    {
        JOptionPane.showMessageDialog(this, "Accept number only!","Invalid Input",JOptionPane.ERROR_MESSAGE);
        txtnewdur.setText(" ");
    }
    }//GEN-LAST:event_txtnewdurKeyPressed

    private void txtrevfeesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrevfeesKeyPressed
        // TODO add your handling code here:
         char char_input = evt.getKeyChar();
    if (((char_input < '0') || (char_input > '9')) && (char_input != '\b'))
    {
        JOptionPane.showMessageDialog(this, "Accept number only!","Invalid Input",JOptionPane.ERROR_MESSAGE);
        txtrevfees.setText(" ");
    }
    }//GEN-LAST:event_txtrevfeesKeyPressed

    private void cmbnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnmActionPerformed
        // TODO add your handling code here:
   /*    try
       {
            String qry="select * from course_master where cname='"+cmbnm.getSelectedItem()+"'";
            JOptionPane.showMessageDialog(this,qry);
             C.rs=C.stmt.executeQuery(qry);
             if(C.rs.next())
             {
                JOptionPane.showMessageDialog(this, "done");
               txtdur.setText(C.rs.getInt(3)+"");
              txtfees.setText(C.rs.getLong(4)+"");

             }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.toString());
        }*/
    }//GEN-LAST:event_cmbnmActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
         try
        {
            String qry="select * from course_master where cname='"+cmbnm.getSelectedItem()+"'";
           // JOptionPane.showMessageDialog(this,qry);
             C.rs=C.stmt.executeQuery(qry);
             if(C.rs.next())
             {
              //  JOptionPane.showMessageDialog(this, "done");
               txtdur.setText(C.rs.getInt(3)+"");
              txtfees.setText(C.rs.getLong(4)+"");

             }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.toString());
        }
    }//GEN-LAST:event_buttonActionPerformed

  
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
            java.util.logging.Logger.getLogger(course_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(course_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(course_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(course_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new course_detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit1;
    private javax.swing.JButton btnedit2;
    private javax.swing.JButton button;
    private javax.swing.JComboBox<String> cmbnm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblcurdur;
    private javax.swing.JLabel lbldur;
    private javax.swing.JLabel lblfees;
    private javax.swing.JLabel lblrevfees;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txtdur;
    private javax.swing.JTextField txtfees;
    private javax.swing.JTextField txtnewdur;
    private javax.swing.JTextField txtrevfees;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
