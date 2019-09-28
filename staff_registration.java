package institute;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class staff_registration extends javax.swing.JFrame {

    String uid;
    String gen;

    
   
    connection C = new connection();

    public staff_registration() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        computer_systems = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfn = new javax.swing.JTextField();
        txtmn = new javax.swing.JTextField();
        txtln = new javax.swing.JTextField();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        txtemail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddr = new javax.swing.JTextArea();
        submit = new javax.swing.JButton();
        image_label = new javax.swing.JLabel();
        image = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        txtmn1 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        txtmn2 = new javax.swing.JFormattedTextField();
        txtdob = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(978, 574));
        setMinimumSize(new java.awt.Dimension(978, 574));
        setResizable(false);
        getContentPane().setLayout(null);

        computer_systems.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        computer_systems.setForeground(new java.awt.Color(0, 51, 255));
        computer_systems.setText("Computer Systems");
        getContentPane().add(computer_systems);
        computer_systems.setBounds(170, 0, 638, 73);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 150, 105, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 270, 105, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Date Of Birth");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 300, 105, 22);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("E-Mail");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 430, 60, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Middle Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 190, 98, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 230, 105, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Mobile No 1");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 342, 105, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Mobile NO 2");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 390, 105, 22);

        txtfn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfnFocusLost(evt);
            }
        });
        txtfn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfnKeyPressed(evt);
            }
        });
        getContentPane().add(txtfn);
        txtfn.setBounds(220, 150, 161, 30);
        getContentPane().add(txtmn);
        txtmn.setBounds(220, 190, 161, 30);
        getContentPane().add(txtln);
        txtln.setBounds(220, 230, 161, 30);

        buttonGroup1.add(rbmale);
        rbmale.setText("Male");
        getContentPane().add(rbmale);
        rbmale.setBounds(220, 270, 60, 23);

        buttonGroup1.add(rbfemale);
        rbfemale.setText("Female");
        getContentPane().add(rbfemale);
        rbfemale.setBounds(300, 270, 70, 23);

        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
        });
        getContentPane().add(txtemail);
        txtemail.setBounds(220, 430, 161, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Address");

        txtaddr.setColumns(20);
        txtaddr.setRows(5);
        jScrollPane1.setViewportView(txtaddr);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(390, 260, 270, 180);

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
        submit.setBounds(430, 500, 110, 40);

        image_label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(image_label);
        image_label.setBounds(740, 120, 190, 220);

        image.setBackground(new java.awt.Color(0, 0, 0));
        image.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        image.setForeground(new java.awt.Color(255, 255, 255));
        image.setText("Attach Image");
        image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageActionPerformed(evt);
            }
        });
        getContentPane().add(image);
        image.setBounds(770, 370, 130, 40);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+91")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(220, 340, 40, 30);

        try {
            txtmn1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtmn1);
        txtmn1.setBounds(260, 340, 120, 30);

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+91")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextField3);
        jFormattedTextField3.setBounds(220, 390, 40, 30);

        try {
            txtmn2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtmn2);
        txtmn2.setBounds(259, 390, 120, 30);

        try {
            txtdob.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtdob);
        txtdob.setBounds(220, 300, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\pexels-photo-257875.jpeg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if (txtfn.getText().isEmpty() && txtmn.getText().isEmpty() && txtln.getText().isEmpty() && txtdob.getText().isEmpty()
                && txtmn1.getText().isEmpty() && txtmn2.getText().isEmpty() && txtemail.getText().isEmpty() && txtaddr.getText().isEmpty() && image_label.getIcon()==null) {
            JOptionPane.showMessageDialog(null, "Please enter all details !! ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtfn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter first name ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtmn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter middle name ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtln.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter last name ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtdob.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter date of birth ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtmn1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter mobile no 1 ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtmn2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter mobile no 2 ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", txtemail.getText()))) {
            JOptionPane.showMessageDialog(null, "please enter a valid email", "error", JOptionPane.ERROR_MESSAGE);
            txtemail.setText(null);
        } else {
            // JOptionPane.showMessageDialog(null,"Valid Email","Good",JOptionPane.INFORMATION_MESSAGE);
        }
        if (txtemail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter email ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
         if (txtaddr.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter address", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
         if(image_label.getIcon()==null)
         {  JOptionPane.showMessageDialog(null, "Please upload image", "Error", JOptionPane.ERROR_MESSAGE);
            return;
             
         }
        /* if(image_label.getIcon())
         {
             
         }*/

 /*  validation emailValidator = new validation();
              if(!emailValidator.validate(txtemail.getText().trim())) 
              {
                System.out.print("Invalid Email ID");
              }*/
        if (rbmale.isSelected() == true) {
            gen = "M";
        } else if (rbfemale.isSelected() == true) {
            gen = "F";
        }
        try {
            uid = (txtfn.getText().substring(0, 2) + txtmn.getText().substring(0, 2) + txtln.getText().substring(0, 2)).toLowerCase();
            JOptionPane.showMessageDialog(this, uid);
            signin S = new signin(uid, txtfn.getText());
            /*String qry="insert into registration values('"+uid+"','"+txtfn.getText();
            qry+="','"+txtmn.getText()+"','"+txtln.getText()+"','"+gen+"','"+txtaddr.getText();
            qry+="','"+txtdob.getText()+"','"+txtmn1.getText()+"','"+txtmn2.getText();
            qry+="','"+txtemail.getText()+"','"+image_label.getText()+"')";*/
            String qry = "insert into registration values('" + uid + "','" + txtfn.getText();
            qry += "','" + txtmn.getText() + "','" + txtln.getText() + "','" + gen + "','" + txtaddr.getText();
            qry += "','" + txtdob.getText() + "','" + txtmn1.getText() + "','" + txtmn2.getText();
            qry += "','" + txtemail.getText() + "','" + filename + "')";
          //  JOptionPane.showMessageDialog(this, qry);
            C.stmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(this, "record added");
            S.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }


    }//GEN-LAST:event_submitActionPerformed

    private void txtfnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnKeyPressed
        char ch = evt.getKeyChar();

        if (Character.isDigit(ch)) {

            txtfn.setText(" ");

            JOptionPane.showMessageDialog(null, "Please enter characters only!!!");

        }
    }//GEN-LAST:event_txtfnKeyPressed

    private void txtfnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfnFocusLost

    }//GEN-LAST:event_txtfnFocusLost

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed

        /*  if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$",txtemail.getText())))
         {
             JOptionPane.showMessageDialog(null,"please enter a valid email","error",JOptionPane.ERROR_MESSAGE);
             
         }
         else
         {
             JOptionPane.showMessageDialog(null,"Valid Email","Good",JOptionPane.INFORMATION_MESSAGE);
         }*/
    }//GEN-LAST:event_txtemailKeyPressed

    private void imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File f = chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        //path.setText(filename);
        ImageIcon image = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(image_label.getWidth(), image_label.getHeight(), Image.SCALE_DEFAULT));
        image_label.setIcon(image);
        try {
            File img = new File(filename);
            FileInputStream fix = new FileInputStream(img);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int number; (number = fix.read(buf)) != -1;) {
                bos.write(buf, 0, number);
            }
            person_image = bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_imageActionPerformed

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
            java.util.logging.Logger.getLogger(staff_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staff_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staff_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staff_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staff_registration().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel computer_systems;
    private javax.swing.JButton image;
    private javax.swing.JLabel image_label;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JButton submit;
    private javax.swing.JTextArea txtaddr;
    private javax.swing.JFormattedTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfn;
    private javax.swing.JTextField txtln;
    private javax.swing.JTextField txtmn;
    private javax.swing.JFormattedTextField txtmn1;
    private javax.swing.JFormattedTextField txtmn2;
    // End of variables declaration//GEN-END:variables

    private ImageIcon format = null;
    String filename = null;
    byte[] person_image = null;

    private static class path {

        private static void setText(String filename) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public path() {
        }
    }

}
