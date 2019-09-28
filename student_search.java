
package institute;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;

public class student_search extends javax.swing.JFrame {

   connection C=new connection();
    String qry;
    public student_search() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        s1 = new javax.swing.JRadioButton();
        s2 = new javax.swing.JRadioButton();
        s3 = new javax.swing.JRadioButton();
        snm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sid = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        txtsid = new javax.swing.JTextField();
        txtsnm = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddr = new javax.swing.JTextArea();
        update = new javax.swing.JButton();
        step2 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        image_label = new javax.swing.JLabel();
        txtmn1 = new javax.swing.JFormattedTextField();
        txtmn2 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 580));
        setMinimumSize(new java.awt.Dimension(980, 580));
        setPreferredSize(new java.awt.Dimension(980, 580));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Search Student");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 0, 495, 67);

        buttonGroup1.add(s1);
        s1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s1.setText("By ID");
        getContentPane().add(s1);
        s1.setBounds(256, 102, 71, 31);

        buttonGroup1.add(s2);
        s2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s2.setText("By Name");
        getContentPane().add(s2);
        s2.setBounds(408, 102, 97, 31);

        buttonGroup1.add(s3);
        s3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s3.setText("By Email");
        getContentPane().add(s3);
        s3.setBounds(588, 102, 93, 31);

        snm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        snm.setText("Student Name");
        getContentPane().add(snm);
        snm.setBounds(110, 310, 112, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mobile No 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 390, 95, 22);

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email.setText("E-mail ID");
        getContentPane().add(email);
        email.setBounds(110, 350, 74, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mobile No 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 440, 95, 19);

        sid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sid.setText("Student ID");
        getContentPane().add(sid);
        sid.setBounds(110, 270, 86, 22);

        txtsearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtsearch);
        txtsearch.setBounds(256, 140, 419, 27);

        txtsid.setEditable(false);
        getContentPane().add(txtsid);
        txtsid.setBounds(260, 270, 170, 27);

        txtsnm.setEditable(false);
        getContentPane().add(txtsnm);
        txtsnm.setBounds(260, 310, 170, 27);

        txtemail.setEditable(false);
        getContentPane().add(txtemail);
        txtemail.setBounds(260, 350, 170, 27);

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(413, 195, 88, 29);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Address");

        txtaddr.setColumns(20);
        txtaddr.setRows(5);
        jScrollPane1.setViewportView(txtaddr);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(450, 280, 268, 170);

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
        update.setBounds(230, 505, 83, 29);

        step2.setBackground(new java.awt.Color(0, 0, 0));
        step2.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        step2.setForeground(new java.awt.Color(255, 255, 255));
        step2.setText("Step 2");
        step2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step2ActionPerformed(evt);
            }
        });
        getContentPane().add(step2);
        step2.setBounds(421, 505, 77, 29);

        close.setBackground(new java.awt.Color(0, 0, 0));
        close.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(645, 505, 71, 29);

        image_label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(image_label);
        image_label.setBounds(770, 190, 173, 197);

        try {
            txtmn1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtmn1);
        txtmn1.setBounds(260, 390, 170, 30);

        try {
            txtmn2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtmn2);
        txtmn2.setBounds(260, 440, 170, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\pexels-photo-326522.jpeg")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        ImageIcon k; 
        if(s1.isSelected()==true)
        {
            qry="select * from stud_entry where studid="+txtsearch.getText();
            // JOptionPane.showMessageDialog(this,qry);

        }
        else if(s2.isSelected()==true)
        {
            String nm=txtsearch.getText().toString();
            int st=nm.indexOf(" ");
            int lt=nm.lastIndexOf(" ");
            String fn=nm.substring(0,st);
            String mn=nm.substring(st+1,lt);
            String ln=nm.substring(lt+1,nm.length());
          //  JOptionPane.showMessageDialog(this, fn);
            //JOptionPane.showMessageDialog(this, mn);
            //JOptionPane.showMessageDialog(this, ln);

          
             qry=" select * from stud_entry where fname='"+fn+"' and mname='"+mn+"' and lname='"+ln+"'";
          //   JOptionPane.showMessageDialog(this, qry);

        }
        else if(s3.isSelected()==true)
        {
             qry="select * from stud_entry where email='"+txtsearch.getText()+"'";
           //   JOptionPane.showMessageDialog(this,qry);
        }

        try
        {

           C.rs=C.stmt.executeQuery(qry);
            if(C.rs.next())
            {
                txtsid.setText(C.rs.getInt(1)+" ");
                txtsnm.setText(C.rs.getString(2)+" "+C.rs.getString(3)+" "+C.rs.getString(4)+" ");
                txtaddr.setText(C.rs.getString(6)+" ");
               // txtdob.setText(C.rs.getDate(7)+"");
                txtmn1.setText(C.rs.getString(8)+" ");
                txtmn2.setText(C.rs.getString(9)+" ");
                txtemail.setText(C.rs.getString(10)+" ");
                   k= new ImageIcon(new ImageIcon (C.rs.getString(11)).getImage().getScaledInstance(image_label.getWidth(),image_label.getHeight(),Image.SCALE_DEFAULT));
               image_label.setIcon(k);

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Student not found....");
            }

            

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }

        
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try
        {


            String value1=txtemail.getText();
            String value2=txtmn1.getText();
            String value3=txtmn2.getText();
            String value4=txtaddr.getText();

            String upqry="update stud_entry set email='"+value1+"',mobile_no_1='"+value2+"'";
            upqry+=", mobile_no_2='"+value3+"',addr='"+value4+"' where  studid="+txtsid.getText();
           // JOptionPane.showMessageDialog(this,upqry);
            C.stmt.executeUpdate(upqry);

             JOptionPane.showMessageDialog(null,"Data Updated");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void step2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step2ActionPerformed
         try
         {
                student_course sc=new student_course(txtsid.getText(),txtsnm.getText());
                sc.setVisible(true);
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this,e.toString());
             
         }
    }//GEN-LAST:event_step2ActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
         setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

   
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
            java.util.logging.Logger.getLogger(student_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton close;
    private javax.swing.JLabel email;
    private javax.swing.JLabel image_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton s1;
    private javax.swing.JRadioButton s2;
    private javax.swing.JRadioButton s3;
    private javax.swing.JButton search;
    private javax.swing.JLabel sid;
    private javax.swing.JLabel snm;
    private javax.swing.JButton step2;
    private javax.swing.JTextArea txtaddr;
    private javax.swing.JTextField txtemail;
    private javax.swing.JFormattedTextField txtmn1;
    private javax.swing.JFormattedTextField txtmn2;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsid;
    private javax.swing.JTextField txtsnm;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
