
package institute;
import javax.swing.JOptionPane;
import java.sql.*;

public class course_delete extends javax.swing.JFrame {
connection C=new connection();
    
    public course_delete() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbcnm = new javax.swing.JComboBox<>();
        cmdshow = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtcid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtduration = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtfees = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 580));
        setMinimumSize(new java.awt.Dimension(980, 580));
        setPreferredSize(new java.awt.Dimension(980, 580));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Delete Course");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(289, 11, 422, 65);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Course Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(161, 131, 137, 31);

        cmbcnm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbcnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcnmActionPerformed(evt);
            }
        });
        getContentPane().add(cmbcnm);
        cmbcnm.setBounds(328, 134, 173, 31);

        cmdshow.setBackground(new java.awt.Color(0, 0, 0));
        cmdshow.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        cmdshow.setForeground(new java.awt.Color(255, 255, 255));
        cmdshow.setText("Show course details");
        cmdshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdshowActionPerformed(evt);
            }
        });
        getContentPane().add(cmdshow);
        cmdshow.setBounds(519, 132, 173, 31);

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(433, 471, 90, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Course ID");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(263, 235, 184, 26);

        txtcid.setEditable(false);
        txtcid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtcid);
        txtcid.setBounds(465, 238, 184, 26);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Course Name");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(263, 275, 184, 26);

        txtcname.setEditable(false);
        txtcname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtcname.setFocusable(false);
        getContentPane().add(txtcname);
        txtcname.setBounds(465, 283, 184, 26);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Duration");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(263, 330, 184, 26);

        txtduration.setEditable(false);
        txtduration.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtduration);
        txtduration.setBounds(465, 335, 184, 26);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("Fees");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(263, 379, 184, 26);

        txtfees.setEditable(false);
        txtfees.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtfees);
        txtfees.setBounds(465, 379, 184, 26);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\programming-languages-1024x576.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     try
		{

			C.con=DriverManager.getConnection("jdbc:odbc:yash");
			C.stmt=C.con.createStatement();
                        String  qry="select cname from course_master";
                        C.rs=C.stmt.executeQuery(qry);
                        while(C.rs.next())
                        {
                            cmbcnm.addItem(C.rs.getString(1));
                        }


                }
                 catch(SQLException e)
		 {
			JOptionPane.showMessageDialog(this,e.toString());
		 }
    }//GEN-LAST:event_formWindowOpened

    private void cmbcnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcnmActionPerformed

    private void cmdshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdshowActionPerformed
  try
       {
           String qry=" select * from course_master where cname='"+cmbcnm.getSelectedItem()+"'";
          // JOptionPane.showMessageDialog(this,qry);
           C.rs=C.stmt.executeQuery(qry);
           if(C.rs.next())
           {
               txtcid.setText(C.rs.getString(1)+" ");
               txtcname.setText(C.rs.getString(2)+" ");
               txtduration.setText(C.rs.getInt(3)+" ");
               txtfees.setText(C.rs.getInt(4)+" ");
               

               
           }
           

       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this,e.toString());
       }
    }//GEN-LAST:event_cmdshowActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
 try
        {

            String str1 = "delete from course_cont where c_id='"+txtcid.getText()+"'";
            String upqry="delete from  course_master where  c_id='"+txtcid.getText()+"'";
           // JOptionPane.showMessageDialog(this,upqry);
            C.stmt.executeUpdate(str1);
            C.stmt.executeUpdate(upqry);

            JOptionPane.showMessageDialog(null,"Data Deleted");
            cmbcnm.setSelectedItem(" ");
            txtcid.setText(" ");
            txtcname.setText(" ");
            txtduration.setText(" ");
            txtfees.setText(" ");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
    }//GEN-LAST:event_deleteActionPerformed

   
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
            java.util.logging.Logger.getLogger(course_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(course_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(course_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(course_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new course_delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbcnm;
    private javax.swing.JButton cmdshow;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtfees;
    // End of variables declaration//GEN-END:variables
}
