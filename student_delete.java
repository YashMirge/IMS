
package institute;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;

public class student_delete extends javax.swing.JFrame {
 connection C=new connection();
    String qry;
   
    public student_delete() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddr = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        sid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        txtsnm = new javax.swing.JTextField();
        txtsearch = new javax.swing.JTextField();
        s1 = new javax.swing.JRadioButton();
        txtsid = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        s2 = new javax.swing.JRadioButton();
        txtmn2 = new javax.swing.JTextField();
        txtmn1 = new javax.swing.JTextField();
        snm = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        s3 = new javax.swing.JRadioButton();
        delete = new javax.swing.JButton();
        image_label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 580));
        setMinimumSize(new java.awt.Dimension(980, 580));
        setPreferredSize(new java.awt.Dimension(980, 580));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Delete Student");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 0, 495, 67);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Address");

        txtaddr.setEditable(false);
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
        jPanel1.setBounds(417, 290, 268, 170);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mobile No 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(76, 447, 95, 19);

        sid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sid.setText("Student ID");
        getContentPane().add(sid);
        sid.setBounds(76, 282, 86, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mobile No 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(76, 400, 95, 22);

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email.setText("E-mail ID");
        getContentPane().add(email);
        email.setBounds(76, 361, 74, 22);

        txtsnm.setEditable(false);
        getContentPane().add(txtsnm);
        txtsnm.setBounds(229, 316, 170, 27);

        txtsearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtsearch);
        txtsearch.setBounds(246, 159, 419, 27);

        s1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s1.setText("By ID");
        getContentPane().add(s1);
        s1.setBounds(246, 121, 71, 31);

        txtsid.setEditable(false);
        getContentPane().add(txtsid);
        txtsid.setBounds(229, 282, 170, 27);

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
        search.setBounds(406, 213, 88, 29);

        s2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s2.setText("By Name");
        getContentPane().add(s2);
        s2.setBounds(398, 121, 97, 31);

        txtmn2.setEditable(false);
        txtmn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmn2KeyPressed(evt);
            }
        });
        getContentPane().add(txtmn2);
        txtmn2.setBounds(229, 446, 170, 27);

        txtmn1.setEditable(false);
        txtmn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmn1KeyPressed(evt);
            }
        });
        getContentPane().add(txtmn1);
        txtmn1.setBounds(229, 401, 170, 27);

        snm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        snm.setText("Student Name");
        getContentPane().add(snm);
        snm.setBounds(76, 315, 112, 22);

        txtemail.setEditable(false);
        getContentPane().add(txtemail);
        txtemail.setBounds(229, 362, 170, 27);

        s3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s3.setText("By Email");
        getContentPane().add(s3);
        s3.setBounds(578, 121, 93, 31);

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
        delete.setBounds(410, 510, 77, 29);

        image_label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(image_label);
        image_label.setBounds(766, 188, 167, 196);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\pexels-photo-257875.jpeg")); // NOI18N
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
          //  JOptionPane.showMessageDialog(this,qry);
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

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         try
        {

            String qry1="delete from payment  where  studid='"+txtsid.getText()+"'";
            String qry2="delete from total_fees  where  studid='"+txtsid.getText()+"'";
            String qry3="delete from exam  where  studid='"+txtsid.getText()+"'";
            String upqry="delete from stud_entry  where  studid='"+txtsid.getText()+"'";
          //  JOptionPane.showMessageDialog(this,upqry);
            C.stmt.executeUpdate(qry1);
            C.stmt.executeUpdate(qry2);
            C.stmt.executeUpdate(qry3);
            C.stmt.executeUpdate(upqry);

            JOptionPane.showMessageDialog(null,"Data Deleted");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void txtmn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmn1KeyPressed
 char char_input = evt.getKeyChar();
    if (((char_input < '0') || (char_input > '9')) && (char_input != '\b'))
    {
        JOptionPane.showMessageDialog(this, "Accept number only!","Invalid Input",JOptionPane.ERROR_MESSAGE);
        txtmn1.setText(" ");
    }
    }//GEN-LAST:event_txtmn1KeyPressed

    private void txtmn2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmn2KeyPressed
 char char_input = evt.getKeyChar();
    if (((char_input < '0') || (char_input > '9')) && (char_input != '\b'))
    {
        JOptionPane.showMessageDialog(this, "Accept number only!","Invalid Input",JOptionPane.ERROR_MESSAGE);
        txtmn2.setText(" ");
    }
    }//GEN-LAST:event_txtmn2KeyPressed

    
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
            java.util.logging.Logger.getLogger(student_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
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
    private javax.swing.JTextArea txtaddr;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmn1;
    private javax.swing.JTextField txtmn2;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsid;
    private javax.swing.JTextField txtsnm;
    // End of variables declaration//GEN-END:variables
}
