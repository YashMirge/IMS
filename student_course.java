
package institute;
import javax.swing.JOptionPane;
import java.sql.*;

public class student_course extends javax.swing.JFrame {
    
    String id,nm;
      connection C=new connection();
      
    public student_course() {
        initComponents();
    }
    
     public student_course(int sno) {
        initComponents();
         try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	//dirver relation
		C.con=DriverManager.getConnection("jdbc:odbc:yash");
		C.stmt=C.con.createStatement();
                C.rs=C.stmt.executeQuery("select * from stud_entry where studid="+sno);
                if(C.rs.next())
                {
                    txtsid.setText(C.rs.getLong(1)+" ");
                    txtsname.setText(C.rs.getString(2)+" "+C.rs.getString(3)+" "+C.rs.getString(4)+" ");
                }
                
             }
             catch(Exception e)
            {
                 System.out.println("class not found exception");
            }
    }
      public student_course(String x,String y) {
        initComponents();
        id=x;
        nm=y;
        txtsid.setText(id);
        txtsname.setText(nm);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtsid = new javax.swing.JTextField();
        txtsname = new javax.swing.JTextField();
        cmbcourse = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfees = new javax.swing.JTextField();
        txtduration = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfeespaid = new javax.swing.JTextField();
        txtbalfees = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        txtdoa = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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
        jLabel1.setText("Student-Course Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(142, 11, 699, 55);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 130, 86, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 130, 112, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Select Course");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(700, 130, 106, 22);

        txtsid.setEditable(false);
        getContentPane().add(txtsid);
        txtsid.setBounds(140, 160, 107, 28);

        txtsname.setEditable(false);
        txtsname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtsname);
        txtsname.setBounds(371, 158, 210, 28);

        cmbcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcourseActionPerformed(evt);
            }
        });
        getContentPane().add(cmbcourse);
        cmbcourse.setBounds(680, 160, 161, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Fees");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(185, 248, 35, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Duration");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(583, 248, 80, 22);

        txtfees.setEditable(false);
        getContentPane().add(txtfees);
        txtfees.setBounds(359, 248, 159, 28);

        txtduration.setEditable(false);
        getContentPane().add(txtduration);
        txtduration.setBounds(702, 248, 159, 28);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Fees Paid");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(185, 294, 100, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Date Of Admission");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(185, 347, 170, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Balance Fees");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(185, 405, 120, 22);

        txtfeespaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfeespaidKeyPressed(evt);
            }
        });
        getContentPane().add(txtfeespaid);
        txtfeespaid.setBounds(359, 294, 159, 28);

        txtbalfees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbalfeesKeyPressed(evt);
            }
        });
        getContentPane().add(txtbalfees);
        txtbalfees.setBounds(359, 405, 159, 28);

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
        submit.setBounds(430, 498, 83, 29);

        try {
            txtdoa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtdoa);
        txtdoa.setBounds(360, 340, 160, 30);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 0, 580);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\pexels-photo-257875.jpeg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       if(txtfeespaid.getText().isEmpty() && txtbalfees.getText().isEmpty())
       {
            JOptionPane.showMessageDialog(null, "Please enter all details ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
           
       }
       if(txtfeespaid.getText().isEmpty())
       {
            JOptionPane.showMessageDialog(null, "Please enter paid fees ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
       }
        if(txtbalfees.getText().isEmpty())
       {
            JOptionPane.showMessageDialog(null, "Please enter balance fees ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
       }
        try
        {
            String qry="insert into payment values('"+txtsid.getText()+"','"+txtsname.getText()+"','"+cmbcourse.getSelectedItem();
            qry+="','"+txtfees.getText()+"','"+txtduration.getText()+"','"+txtfeespaid.getText();
            qry+="','"+txtdoa.getText()+"','"+txtbalfees.getText()+"')";

             JOptionPane.showMessageDialog(this, qry);
             C.stmt.executeUpdate(qry);
             JOptionPane.showMessageDialog(this, "record added");
            txtsid.setText(" ");
            txtsname.setText(" ");
            
          
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
       
        
       
        fees f=new fees();
       f.setVisible(true);
    }//GEN-LAST:event_submitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
		{

			C.con=DriverManager.getConnection("jdbc:odbc:yash");
			C.stmt=C.con.createStatement();
                        String  qry="select cname from course_master";
                        C.rs=C.stmt.executeQuery(qry);
                        while(C.rs.next())
                        {
                            cmbcourse.addItem(C.rs.getString(1));
                        }


                }
                 catch(SQLException e)
		 {
			JOptionPane.showMessageDialog(this,e.toString());
		 }


    }//GEN-LAST:event_formWindowOpened

    private void cmbcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcourseActionPerformed
       try
        {
            String qry="select * from course_master where cname='"+cmbcourse.getSelectedItem()+"'";
           // JOptionPane.showMessageDialog(this,qry);
             C.rs=C.stmt.executeQuery(qry);
             if(C.rs.next())
             {
              //  JOptionPane.showMessageDialog(this, "done");
               txtduration.setText(C.rs.getInt(3)+" ");
              txtfees.setText(C.rs.getInt(4)+" ");

             }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.toString());
        }
    }//GEN-LAST:event_cmbcourseActionPerformed

    private void txtfeespaidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfeespaidKeyPressed
 char char_input = evt.getKeyChar();
    if (((char_input < '0') || (char_input > '9')) && (char_input != '\b'))
    {
        JOptionPane.showMessageDialog(this, "Accept number only!","Invalid Input",JOptionPane.ERROR_MESSAGE);
        txtfeespaid.setText(" ");
    }
    }//GEN-LAST:event_txtfeespaidKeyPressed

    private void txtbalfeesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbalfeesKeyPressed
 char char_input = evt.getKeyChar();
    if (((char_input < '0') || (char_input > '9')) && (char_input != '\b'))
    {
        JOptionPane.showMessageDialog(this, "Accept number only!","Invalid Input",JOptionPane.ERROR_MESSAGE);
        txtbalfees.setText(" ");
    }
    }//GEN-LAST:event_txtbalfeesKeyPressed

   
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
            java.util.logging.Logger.getLogger(student_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbcourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txtbalfees;
    private javax.swing.JFormattedTextField txtdoa;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtfees;
    private javax.swing.JTextField txtfeespaid;
    private javax.swing.JTextField txtsid;
    private javax.swing.JTextField txtsname;
    // End of variables declaration//GEN-END:variables
}
