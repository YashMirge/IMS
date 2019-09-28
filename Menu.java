
package institute;
public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        staff = new javax.swing.JMenuItem();
        student = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        staff1 = new javax.swing.JMenu();
        add_staff = new javax.swing.JMenuItem();
        update_staff = new javax.swing.JMenuItem();
        delete_staff = new javax.swing.JMenuItem();
        student2 = new javax.swing.JMenu();
        add_student = new javax.swing.JMenuItem();
        search_student = new javax.swing.JMenuItem();
        update_student = new javax.swing.JMenuItem();
        delete_student = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        add_course = new javax.swing.JMenuItem();
        update_course = new javax.swing.JMenuItem();
        delete_course = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        fees = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        exam = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        close = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 580));
        setMinimumSize(new java.awt.Dimension(980, 580));
        setPreferredSize(new java.awt.Dimension(980, 580));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yash\\Music\\All Documents\\project folder\\pexels-photo-204611.jpeg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 560);

        jMenuBar1.setBackground(new java.awt.Color(51, 102, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu1.setText("Register");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        staff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        staff.setText("Staff");
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });
        jMenu1.add(staff);

        student.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        student.setText("Student");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        jMenu1.add(student);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        staff1.setText("Staff");
        staff1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        add_staff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_staff.setText("Add");
        add_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_staffActionPerformed(evt);
            }
        });
        staff1.add(add_staff);

        update_staff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        update_staff.setText("Update");
        update_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_staffActionPerformed(evt);
            }
        });
        staff1.add(update_staff);

        delete_staff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete_staff.setText("Delete");
        delete_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_staffActionPerformed(evt);
            }
        });
        staff1.add(delete_staff);

        jMenu2.add(staff1);

        student2.setText("Student");
        student2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        add_student.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_student.setText("Add");
        add_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_studentActionPerformed(evt);
            }
        });
        student2.add(add_student);

        search_student.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_student.setText("Search");
        search_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_studentActionPerformed(evt);
            }
        });
        student2.add(search_student);

        update_student.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        update_student.setText("Update");
        update_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_studentActionPerformed(evt);
            }
        });
        student2.add(update_student);

        delete_student.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete_student.setText("Delete");
        delete_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_studentActionPerformed(evt);
            }
        });
        student2.add(delete_student);

        jMenu2.add(student2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Courses");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        add_course.setText("Add Course");
        add_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_courseActionPerformed(evt);
            }
        });
        jMenu3.add(add_course);

        update_course.setText("Update Course");
        update_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_courseActionPerformed(evt);
            }
        });
        jMenu3.add(update_course);

        delete_course.setText("Delete Course");
        delete_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_courseActionPerformed(evt);
            }
        });
        jMenu3.add(delete_course);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("DailyTransaction");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        fees.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fees.setText("Fees");
        fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesActionPerformed(evt);
            }
        });
        jMenu4.add(fees);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Student-Marks");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        exam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exam.setText("Exam");
        exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examActionPerformed(evt);
            }
        });
        jMenu5.add(exam);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Exit");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        close.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jMenu6.add(close);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void update_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_staffActionPerformed
        staff_update su=new staff_update();
        su.setVisible(true);
    }//GEN-LAST:event_update_staffActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
       staff_registration k=new staff_registration();
       k.setVisible(true);
    }//GEN-LAST:event_staffActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
       System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examActionPerformed
        exam e=new exam();
        e.setVisible(true);
    }//GEN-LAST:event_examActionPerformed

    private void feesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesActionPerformed
        fees f=new fees();
        f.setVisible(true);
    }//GEN-LAST:event_feesActionPerformed

    private void add_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_courseActionPerformed
      course_master cm=new course_master();
      cm.setVisible(true);
    }//GEN-LAST:event_add_courseActionPerformed

    private void update_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_courseActionPerformed
       course_detail cd=new course_detail();
       cd.setVisible(true);
    }//GEN-LAST:event_update_courseActionPerformed

    private void delete_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_courseActionPerformed
        course_delete ce=new course_delete();
        ce.setVisible(true);
    }//GEN-LAST:event_delete_courseActionPerformed

    private void add_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_staffActionPerformed
       staff_registration sr=new staff_registration();
       sr.setVisible(true);
    }//GEN-LAST:event_add_staffActionPerformed

    private void delete_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_staffActionPerformed
       staff_delete sd =new staff_delete();
       sd.setVisible(true);
    }//GEN-LAST:event_delete_staffActionPerformed

    private void add_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_studentActionPerformed
   Admission a =new Admission();
   a.setVisible(true);
    }//GEN-LAST:event_add_studentActionPerformed

    private void search_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_studentActionPerformed
        student_search b=new student_search();
        b.setVisible(true);
    }//GEN-LAST:event_search_studentActionPerformed

    private void update_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_studentActionPerformed
        student_search c=new student_search();
        c.setVisible(true);
    }//GEN-LAST:event_update_studentActionPerformed

    private void delete_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_studentActionPerformed
        student_delete x=new student_delete();
        x.setVisible(true);
    }//GEN-LAST:event_delete_studentActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
     Admission a=new Admission();
     a.setVisible(true);
    }//GEN-LAST:event_studentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add_course;
    private javax.swing.JMenuItem add_staff;
    private javax.swing.JMenuItem add_student;
    private javax.swing.JMenuItem close;
    private javax.swing.JMenuItem delete_course;
    private javax.swing.JMenuItem delete_staff;
    private javax.swing.JMenuItem delete_student;
    private javax.swing.JMenuItem exam;
    private javax.swing.JMenuItem fees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem search_student;
    private javax.swing.JMenuItem staff;
    private javax.swing.JMenu staff1;
    private javax.swing.JMenuItem student;
    private javax.swing.JMenu student2;
    private javax.swing.JMenuItem update_course;
    private javax.swing.JMenuItem update_staff;
    private javax.swing.JMenuItem update_student;
    // End of variables declaration//GEN-END:variables
}
