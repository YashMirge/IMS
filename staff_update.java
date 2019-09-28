
package institute;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class staff_update extends javax.swing.JFrame {

    
    
   connection C=new connection();
    public staff_update() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbsname = new javax.swing.JComboBox<>();
        cmdshow = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsid = new javax.swing.JTextField();
        txtpnm = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddr = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        image_label = new javax.swing.JLabel();
        txtmn1 = new javax.swing.JFormattedTextField();
        txtmn2 = new javax.swing.JFormattedTextField();
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
        jLabel1.setText("Update Staff Information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(112, 0, 762, 65);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Teacher Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 120, 113, 22);

        cmbsname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbsname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsnameActionPerformed(evt);
            }
        });
        getContentPane().add(cmbsname);
        cmbsname.setBounds(210, 150, 190, 30);

        cmdshow.setBackground(new java.awt.Color(0, 0, 0));
        cmdshow.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        cmdshow.setForeground(new java.awt.Color(255, 255, 255));
        cmdshow.setText("Show Teacher Details");
        cmdshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdshowActionPerformed(evt);
            }
        });
        getContentPane().add(cmdshow);
        cmdshow.setBounds(440, 150, 192, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Date Of Birth");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 350, 104, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Parent Name");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 320, 101, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Mobile No 2");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 460, 95, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Mobile No 1");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 420, 95, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Teacher ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 280, 87, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("E-Mail");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 390, 48, 22);

        txtsid.setEditable(false);
        getContentPane().add(txtsid);
        txtsid.setBounds(212, 273, 180, 30);

        txtpnm.setEditable(false);
        getContentPane().add(txtpnm);
        txtpnm.setBounds(212, 310, 180, 30);

        txtdob.setEditable(false);
        getContentPane().add(txtdob);
        txtdob.setBounds(212, 345, 180, 30);

        txtemail.setEditable(false);
        getContentPane().add(txtemail);
        txtemail.setBounds(212, 380, 180, 30);

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
        update.setBounds(420, 500, 90, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtaddr.setColumns(20);
        txtaddr.setRows(5);
        jScrollPane1.setViewportView(txtaddr);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(410, 290, 282, 181);

        image_label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(image_label);
        image_label.setBounds(760, 150, 190, 220);

        try {
            txtmn1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtmn1);
        txtmn1.setBounds(210, 420, 180, 30);

        try {
            txtmn2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtmn2);
        txtmn2.setBounds(210, 460, 180, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\pexels-photo-257875.jpeg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         try
        {


            String value1=txtemail.getText();
            String value2=txtmn1.getText();
            String value3=txtmn2.getText();
            String value4=txtaddr.getText();
            
            String upqry="update registration set email='"+value1+"',mobile_no_1='"+value2+"'";
            upqry+=", mobile_no_2='"+value3+"',addr='"+value4+"' where  userid='"+txtsid.getText()+"'";
            //JOptionPane.showMessageDialog(this,upqry);
            C.stmt.executeUpdate(upqry);
            
             JOptionPane.showMessageDialog(null,"Data Updated");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
        }

    }//GEN-LAST:event_updateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       cmbsname.removeAllItems();
          try
        {


            String query="select fname,mname,lname  from registration";
           // JOptionPane.showMessageDialog(this,query);
            C.rs=C.stmt.executeQuery(query);

           while(C.rs.next())
           {
               String nm=C.rs.getString(1)+" "+C.rs.getString(2)+" "+C.rs.getString(3);
               cmbsname.addItem(nm);
           }



        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_formWindowOpened

    private void cmdshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdshowActionPerformed


        String nme=cmbsname.getSelectedItem().toString();
        int i = nme.indexOf(" ");
        int j=nme.lastIndexOf(" ");
        String fnme,mnme,lnme;
        ImageIcon k;
        fnme=nme.substring(0,i);
        mnme=nme.substring(i+1, j);
        lnme=nme.substring(j+1,nme.length());
   //     JOptionPane.showMessageDialog(this, fnme);
     //   JOptionPane.showMessageDialog(this, mnme);
       // JOptionPane.showMessageDialog(this, lnme);
         try
       {
           String qry=" select * from registration where fname='"+fnme+"' and mname='"+mnme+"' and lname='"+lnme+"'";
      //     JOptionPane.showMessageDialog(this,qry);
           C.rs=C.stmt.executeQuery(qry);
           if(C.rs.next())
           {
               /*byte[] imageBytes;
               Image image;*/
               txtsid.setText(C.rs.getString(1)+"");
               txtpnm.setText(C.rs.getString(3)+"");
               txtaddr.setText(C.rs.getString(6)+"");
               txtdob.setText(C.rs.getDate(7)+"");
               txtmn1.setText(C.rs.getString(8)+"");
               txtmn2.setText(C.rs.getString(9)+"");
               txtemail.setText(C.rs.getString(10)+"");
            //  k=new ImageIcon(C.rs.getString(11));
            k= new ImageIcon(new ImageIcon (C.rs.getString(11)).getImage().getScaledInstance(image_label.getWidth(),image_label.getHeight(),Image.SCALE_DEFAULT));
               image_label.setIcon(k);
               
             



                //  byte[] image=C.rs.getBytes("img");
              
               
               
             
                
             /*   byte[] img=C.rs.getBytes("Image");
                ImageIcon image=new ImageIcon(img);
                Image im=image.getImage();
                Image myImg = im.getScaledInstance(image_label.getWidth(),image_label.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon newImage =new ImageIcon(myImg);
                image_label.setIcon(newImage);
                */
                
              
                
           
         
               
           }
           
           
           

       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this,e.toString());
       }
    }//GEN-LAST:event_cmdshowActionPerformed

    private void cmbsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsnameActionPerformed

  
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
            java.util.logging.Logger.getLogger(staff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staff_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbsname;
    private javax.swing.JButton cmdshow;
    private javax.swing.JLabel image_label;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtaddr;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JFormattedTextField txtmn1;
    private javax.swing.JFormattedTextField txtmn2;
    private javax.swing.JTextField txtpnm;
    private javax.swing.JTextField txtsid;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

  /* private ImageIcon format=null;
    String filename = null;
    byte[] person_image=null;*/
    
}
