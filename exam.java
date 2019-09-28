
package institute;
import javax.swing.JOptionPane;
import java.sql.*;

public class exam extends javax.swing.JFrame {

     connection C=new connection();
    public exam() {
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
        txtcnm = new javax.swing.JTextField();
        txtmarks = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        txtdoe = new javax.swing.JFormattedTextField();
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
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Exam");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 19, 166, 73);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(298, 155, 178, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(298, 212, 178, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Course Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(298, 262, 178, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Date Of Exam");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(298, 320, 178, 28);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Marks");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(298, 369, 178, 28);

        cmbsid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbsid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbsid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsidActionPerformed(evt);
            }
        });
        getContentPane().add(cmbsid);
        cmbsid.setBounds(527, 158, 178, 28);

        txtsnm.setEditable(false);
        txtsnm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtsnm);
        txtsnm.setBounds(527, 215, 178, 28);

        txtcnm.setEditable(false);
        txtcnm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtcnm);
        txtcnm.setBounds(527, 265, 178, 28);

        txtmarks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtmarks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmarksKeyPressed(evt);
            }
        });
        getContentPane().add(txtmarks);
        txtmarks.setBounds(527, 372, 178, 28);

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("Tahoma", 2, 15)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(431, 484, 108, 37);

        try {
            txtdoe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtdoe);
        txtdoe.setBounds(530, 320, 170, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\cc2.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
		{

			C.con=DriverManager.getConnection("jdbc:odbc:yash");
			C.stmt=C.con.createStatement();
                        String  qry="select studid from stud_entry";
                        C.rs=C.stmt.executeQuery(qry);
                        while(C.rs.next())
                        {
                            cmbsid.addItem(C.rs.getString(1));
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
            String qry="select * from payment where studid="+cmbsid.getSelectedItem();
          //  JOptionPane.showMessageDialog(this,qry);
             C.rs=C.stmt.executeQuery(qry);
             if(C.rs.next())
             {
                //JOptionPane.showMessageDialog(this, "done");
                txtsnm.setText(C.rs.getString(2)+" ");
               txtcnm.setText(C.rs.getString(3)+" ");




             }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
         
    }//GEN-LAST:event_cmbsidActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(txtdoe.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter date of exam!! ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtdoe.getText().isEmpty() && txtmarks.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(null,"Please enter all details !! ","Error",JOptionPane.ERROR_MESSAGE);
            return;
            
        }
      
        if(txtmarks.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter marks ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        try
        {
            String qry="insert into exam values('"+cmbsid.getSelectedItem()+"','"+txtcnm.getText();
            qry+="','"+txtdoe.getText()+"','"+txtmarks.getText()+"')";


            // JOptionPane.showMessageDialog(this, qry);
            C.stmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(this, "record added");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
         
       
    }//GEN-LAST:event_submitActionPerformed

    private void txtmarksKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmarksKeyPressed
        // TODO add your handling code here:
         char char_input = evt.getKeyChar();
    if (((char_input < '0') || (char_input > '9')) && (char_input != '\b'))
    {
        JOptionPane.showMessageDialog(this, "Accept number only!","Invalid Input",JOptionPane.ERROR_MESSAGE);
        txtmarks.setText(" ");
    }
    }//GEN-LAST:event_txtmarksKeyPressed

   
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
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exam().setVisible(true);
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
    private javax.swing.JTextField txtcnm;
    private javax.swing.JFormattedTextField txtdoe;
    private javax.swing.JTextField txtmarks;
    private javax.swing.JTextField txtsnm;
    // End of variables declaration//GEN-END:variables
}
