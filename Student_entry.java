
package institute;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Student_entry extends javax.swing.JFrame {

    String gen;
      int sno=0;
       connection C=new connection();
    public Student_entry() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtsid = new javax.swing.JTextField();
        txtfnm = new javax.swing.JTextField();
        txtmnm = new javax.swing.JTextField();
        txtlnm = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        txtemail = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddr = new javax.swing.JTextArea();
        image_label = new javax.swing.JLabel();
        image = new javax.swing.JButton();
        txtdob = new javax.swing.JFormattedTextField();
        txtmn1 = new javax.swing.JFormattedTextField();
        txtmn2 = new javax.swing.JFormattedTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();

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
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Student Registration");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 628, 73);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Email-ID");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 480, 84, 27);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Mobile No 2");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 440, 107, 27);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Mobile No 1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 390, 107, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Date Of Birth");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 350, 107, 27);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 300, 107, 27);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 260, 107, 27);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Middle Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 210, 118, 27);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 170, 108, 27);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Student ID");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 130, 118, 27);

        txtsid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsidKeyPressed(evt);
            }
        });
        getContentPane().add(txtsid);
        txtsid.setBounds(170, 130, 162, 27);

        txtfnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfnmKeyPressed(evt);
            }
        });
        getContentPane().add(txtfnm);
        txtfnm.setBounds(170, 170, 162, 27);

        txtmnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmnmKeyPressed(evt);
            }
        });
        getContentPane().add(txtmnm);
        txtmnm.setBounds(170, 210, 162, 27);

        txtlnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlnmKeyPressed(evt);
            }
        });
        getContentPane().add(txtlnm);
        txtlnm.setBounds(170, 260, 162, 27);

        buttonGroup1.add(male);
        male.setText("Male");
        getContentPane().add(male);
        male.setBounds(170, 300, 60, 27);

        buttonGroup1.add(female);
        female.setText("Female");
        getContentPane().add(female);
        female.setBounds(250, 300, 80, 27);
        getContentPane().add(txtemail);
        txtemail.setBounds(170, 480, 162, 27);

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
        submit.setBounds(450, 510, 83, 29);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Address");

        txtaddr.setColumns(20);
        txtaddr.setRows(5);
        jScrollPane1.setViewportView(txtaddr);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, 260, 280, 190);

        image_label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(image_label);
        image_label.setBounds(760, 160, 179, 219);

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
        image.setBounds(780, 410, 127, 29);

        try {
            txtdob.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtdob);
        txtdob.setBounds(170, 350, 160, 30);

        try {
            txtmn1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtmn1);
        txtmn1.setBounds(200, 390, 130, 30);

        try {
            txtmn2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtmn2);
        txtmn2.setBounds(200, 430, 130, 30);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+91")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(170, 390, 30, 30);

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+91")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(170, 430, 30, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\pexels-photo-257875.jpeg")); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 980, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       if(txtfnm.getText().isEmpty() && txtmnm.getText().isEmpty() && txtlnm.getText().isEmpty() && txtdob.getText().isEmpty()
                && txtmn1.getText().isEmpty() && txtmn2.getText().isEmpty() && txtemail.getText().isEmpty() && txtaddr.getText().isEmpty() && image_label.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter all details !! ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtfnm.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter first name ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
         if(txtmnm.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter middle name ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
          if(txtlnm.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter last name ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
           if(txtdob.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter date of birth ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
            if(txtmn1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter mobile no 1 ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
             if(txtmn2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter mobile no 2 ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
              if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", txtemail.getText()))) {
            JOptionPane.showMessageDialog(null, "please enter a valid email", "error", JOptionPane.ERROR_MESSAGE);
            txtemail.setText(null);
        } else {
            // JOptionPane.showMessageDialog(null,"Valid Email","Good",JOptionPane.INFORMATION_MESSAGE);
        }
         if(txtemail.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter Email id ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
          if(txtaddr.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter address ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
          if(image_label.getIcon()==null)
          {
                JOptionPane.showMessageDialog(null, "Please upload image", "Error", JOptionPane.ERROR_MESSAGE);
            return;
          }
        
        if(male.isSelected()==true)
        {
            gen="M";
        }
        else if(female.isSelected()==true)
        {
            gen="F";
        }
         try
         {

                 String qry="insert into stud_entry values('"+txtsid.getText()+"','"+txtfnm.getText()+"','"+txtmnm.getText();
                 qry+="','"+txtlnm.getText()+"','"+gen+"','"+txtaddr.getText();
                 qry+="','"+txtdob.getText()+"','"+txtmn1.getText()+"','"+txtmn2.getText();
                 qry+="','"+txtemail.getText()+"','" + filename + "')";

                 //JOptionPane.showMessageDialog(this, qry);
                 C.stmt.executeUpdate(qry);
                 JOptionPane.showMessageDialog(this, "record added");
                
                
          }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this, e.toString());
         }
          
               
         
         student_course sc=new student_course(sno);
         sc.setVisible(true);
    }//GEN-LAST:event_submitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {
         C.rs=C.stmt.executeQuery("select max(studid) from stud_entry");
         if(C.rs.next())
         {
             sno=C.rs.getInt(1)+1;
             JOptionPane.showMessageDialog(this, sno);
             txtsid.setText(sno+"");
         }
        }
        catch(Exception ex)
        {}
    }//GEN-LAST:event_formWindowOpened

    private void txtfnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnmKeyPressed
 char ch = evt.getKeyChar();

        if (Character.isDigit(ch)) {

            txtfnm.setText(" ");

            JOptionPane.showMessageDialog(null, "Please enter characters only!!!");
            txtfnm.setText("");

        }
    }//GEN-LAST:event_txtfnmKeyPressed

    private void imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageActionPerformed
 JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        
        filename=f.getAbsolutePath();
        ImageIcon image=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(image_label.getWidth(),image_label.getHeight(),Image.SCALE_DEFAULT));
        image_label.setIcon(image);
        try
        {
            File img=new File(filename);
            FileInputStream fix=new FileInputStream(img);
            ByteArrayOutputStream bos =new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            
            for(int number;(number=fix.read(buf))!= -1;)
            {
                bos.write(buf,0,number);
            }
            person_image=bos.toByteArray();
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_imageActionPerformed

    private void txtsidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsidKeyPressed
char ch = evt.getKeyChar();

                if(Character.isDigit(ch)){

                    txtfnm.setText(" ");

                    JOptionPane.showMessageDialog(null, "Please enter characters only!!!");

                }  
    }//GEN-LAST:event_txtsidKeyPressed

    private void txtmnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmnmKeyPressed
 char ch = evt.getKeyChar();

        if (Character.isDigit(ch)) {

            txtmnm.setText(" ");

            JOptionPane.showMessageDialog(null, "Please enter characters only!!!");
            txtmnm.setText("");

        }
    }//GEN-LAST:event_txtmnmKeyPressed

    private void txtlnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlnmKeyPressed
 char ch = evt.getKeyChar();

        if (Character.isDigit(ch)) {

            txtlnm.setText(" ");

            JOptionPane.showMessageDialog(null, "Please enter characters only!!!");
            txtlnm.setText("");

        }
    }//GEN-LAST:event_txtlnmKeyPressed

   
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
            java.util.logging.Logger.getLogger(Student_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton image;
    private javax.swing.JLabel image_label;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JRadioButton male;
    private javax.swing.JButton submit;
    private javax.swing.JTextArea txtaddr;
    private javax.swing.JFormattedTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfnm;
    private javax.swing.JTextField txtlnm;
    private javax.swing.JFormattedTextField txtmn1;
    private javax.swing.JFormattedTextField txtmn2;
    private javax.swing.JTextField txtmnm;
    private javax.swing.JTextField txtsid;
    // End of variables declaration//GEN-END:variables

     private ImageIcon format=null;
    String filename=null;
    byte[] person_image=null;

}
