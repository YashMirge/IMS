
package institute;
import javax.swing.JOptionPane;
import java.sql.*;

public class fees extends javax.swing.JFrame {

    connection C=new connection();
    public fees() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbsid = new javax.swing.JComboBox<>();
        txtsnm = new javax.swing.JTextField();
        txttotfees = new javax.swing.JTextField();
        txtpaidfees = new javax.swing.JTextField();
        txtbalfees = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

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
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Student Fees");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 10, 448, 73);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(288, 169, 86, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(288, 210, 112, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Total Fees");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(288, 251, 81, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Paid Fees");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(288, 301, 74, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Balance Fees");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(288, 341, 101, 22);

        cmbsid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbsid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbsid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsidActionPerformed(evt);
            }
        });
        getContentPane().add(cmbsid);
        cmbsid.setBounds(455, 173, 177, 26);

        txtsnm.setEditable(false);
        txtsnm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtsnm);
        txtsnm.setBounds(455, 214, 177, 26);

        txttotfees.setEditable(false);
        txttotfees.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txttotfees);
        txttotfees.setBounds(455, 255, 177, 28);

        txtpaidfees.setEditable(false);
        txtpaidfees.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtpaidfees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaidfeesActionPerformed(evt);
            }
        });
        getContentPane().add(txtpaidfees);
        txtpaidfees.setBounds(455, 305, 177, 25);

        txtbalfees.setEditable(false);
        txtbalfees.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtbalfees);
        txtbalfees.setBounds(455, 341, 177, 28);

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
        submit.setBounds(440, 480, 90, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\pexels-photo-90333.jpeg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -10, 980, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtpaidfeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaidfeesActionPerformed
       
    }//GEN-LAST:event_txtpaidfeesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       String qry;

                 try
		{

			C.con=DriverManager.getConnection("jdbc:odbc:yash");
			C.stmt=C.con.createStatement();
                        qry="select studid from stud_entry";
                        C.rs=C.stmt.executeQuery(qry);
                        while(C.rs.next())
                        {
                            cmbsid.addItem(C.rs.getInt(1)+ " ");
                        }


                }
                 catch(SQLException e)
		 {
			JOptionPane.showMessageDialog(this,e.toString());
		 }
    }//GEN-LAST:event_formWindowOpened

    private void cmbsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsidActionPerformed
       try
        {
            String qry="select * from payment where studid='"+cmbsid.getSelectedItem()+"'";
           // JOptionPane.showMessageDialog(this,qry);
             C.rs=C.stmt.executeQuery(qry);
             if(C.rs.next())
             {
               // JOptionPane.showMessageDialog(this, "done");
               txtsnm.setText(C.rs.getString(2)+" ");
               txttotfees.setText(C.rs.getLong(4)+"");
               txtpaidfees.setText(C.rs.getLong(6)+" ");
               txtbalfees.setText(C.rs.getLong(8)+" ");
              
              

             }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
    }//GEN-LAST:event_cmbsidActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
          try
        {
            String qry="insert into total_fees values('"+cmbsid.getSelectedItem()+"','"+txtsnm.getText();
            qry+="','"+txttotfees.getText()+"','"+txtpaidfees.getText()+"','"+txtbalfees.getText()+"')";


            // JOptionPane.showMessageDialog(this, qry);
            C.stmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(this, "record added");
            cmbsid.setSelectedItem(" ");
            txtsnm.setText(" ");
            txttotfees.setText(" ");
            txtpaidfees.setText(" ");
            txtbalfees.setText(" ");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
          
          
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
            java.util.logging.Logger.getLogger(fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbsid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txtbalfees;
    private javax.swing.JTextField txtpaidfees;
    private javax.swing.JTextField txtsnm;
    private javax.swing.JTextField txttotfees;
    // End of variables declaration//GEN-END:variables
}
