package realFrames;

import BeanClasses.*;
import DBConnections.DatabaseManager;
import java.util.Vector;
import javax.swing.JOptionPane;


public class Student extends javax.swing.JFrame {

Vector vy = new Vector();
    
    public Student() {
        initComponents();
        
        getFaculty();
    }
    private void getFaculty(){
        
        try{
            java.util.Vector v = DatabaseManager.getFaculty();
            facComboBox.removeAllItems();
            
            for(int i=0; i< v.size(); i++){
                FacultyBean bean = (FacultyBean) v.elementAt(i);
                
                facComboBox.addItem(bean);
            }
        }catch(Exception e){
            e.getStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        facComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        studentIdTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dptComboBox = new javax.swing.JComboBox();
        progComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        shiftComboBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        rollNoTextField = new javax.swing.JTextField();
        batchComboBox = new javax.swing.JComboBox();
        groupComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox();
        phoneTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        surnameTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        fatherNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Batch Year");
        jLabel1.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Students");
        jLabel4.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 90, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Faculty");
        jLabel5.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 26));

        facComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        facComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(facComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 330, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Program");
        jLabel2.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Student ID");
        jLabel3.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 100, 30));

        studentIdTextField.setEditable(false);
        getContentPane().add(studentIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 120, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Remarks");
        jLabel6.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 100, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Shift");
        jLabel7.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 50, 30));

        remarksTextArea.setColumns(20);
        remarksTextArea.setRows(5);
        jScrollPane1.setViewportView(remarksTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 370, 40));

        studentList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                studentListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(studentList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 220, 480));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 90, 40));

        addButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, -1, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, -1, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, 90, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Department");
        jLabel8.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 26));

        dptComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(dptComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 330, 30));

        progComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        progComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(progComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 330, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Group");
        jLabel9.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 70, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Student");
        jLabel12.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 90, 26));

        shiftComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        shiftComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Evening" }));
        shiftComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(shiftComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 330, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Roll No");
        jLabel10.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 70, 30));
        getContentPane().add(rollNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 120, 30));

        batchComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        batchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(batchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 330, 30));

        groupComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Genral", "Medical", "Engineering" }));
        groupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(groupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 330, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Name");
        jLabel11.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 70, 30));
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 330, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Gender");
        jLabel13.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, 30));

        genderComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 170, 30));
        getContentPane().add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 330, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("phone No");
        jLabel14.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 90, 30));
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 330, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Enail");
        jLabel15.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 50, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Surname");
        jLabel16.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, 30));
        getContentPane().add(surnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 330, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Father Name");
        jLabel17.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, 30));

        fatherNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatherNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(fatherNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 330, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);    
        new Home().show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void facComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facComboBoxActionPerformed
       getDepartment();
    }//GEN-LAST:event_facComboBoxActionPerformed

    private void dptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptComboBoxActionPerformed
        getProgram();
    }//GEN-LAST:event_dptComboBoxActionPerformed

    private void progComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progComboBoxActionPerformed
        getBatch();   
    }//GEN-LAST:event_progComboBoxActionPerformed

    private void shiftComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftComboBoxActionPerformed
       
    }//GEN-LAST:event_shiftComboBoxActionPerformed

    private void studentListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_studentListValueChanged
        StudentBean bean = (StudentBean) studentList.getSelectedValue();
       
        if(bean == null)
            return;        
        
        studentIdTextField.setText(""+bean.getStudentId());
        rollNoTextField.setText(bean.getRollNo());
        fatherNameTextField.setText(bean.getFatherName());
        remarksTextArea.setText(bean.getRemarks());
        nameTextField.setText(bean.getStudentName());
        surnameTextField.setText(bean.getSurname());
        phoneTextField.setText(bean.getPhoneNo());
        emailTextField.setText(bean.getEmail());
        genderComboBox.setSelectedItem(Decoder.genderDecode(bean.getGender()));
    }//GEN-LAST:event_studentListValueChanged

    private void batchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchComboBoxActionPerformed
         getStudent();
    }//GEN-LAST:event_batchComboBoxActionPerformed

    private void groupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupComboBoxActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addStudent();
    }//GEN-LAST:event_addButtonActionPerformed

    private void fatherNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatherNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fatherNameTextFieldActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        deleteStudent();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        updateStudent();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void getDepartment(){
        FacultyBean bean = (FacultyBean) facComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        try{
            java.util.Vector v = DatabaseManager.getDepartment(bean.getFacId());
            
            dptComboBox.removeAllItems();
            
            for(int i=0; i<v.size(); i++){
                DepartmentBean dptBean = (DepartmentBean) v.elementAt(i);
                
                dptComboBox.addItem(dptBean);
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    private void getProgram(){
        DepartmentBean bean = (DepartmentBean) dptComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        try{
            java.util.Vector v = DatabaseManager.getProgram(bean.getDptId());
           
                progComboBox.removeAllItems();
                
                for(int i=0; i<v.size(); i++){
                    
                    ProgramBean progBean = (ProgramBean) v.elementAt(i); 
                    
                    progComboBox.addItem(progBean);
                }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    private void getBatch(){
        ProgramBean bean = (ProgramBean) progComboBox.getSelectedItem();
        
        if(bean == null)
            return;
            
        batchComboBox.removeAllItems();
        
        try{
            java.util.Vector v = DatabaseManager.getBatch(bean.getProgId());
         
            System.out.println(v.size());
            
            for(int i = 0;  i < v.size(); i++){
                
                BatchBean batchBean = (BatchBean) v.elementAt(i);
                
                batchComboBox.addItem(batchBean);
            }
                        
        }catch(Exception e){
            e.getStackTrace();
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//end of get Batch
    
    private void getStudent(){
        BatchBean bean = (BatchBean) batchComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        try{
            java.util.Vector v = DatabaseManager.getStudent(bean.getBatchId());
            
            studentList.setListData(v);
        }catch(Exception e){
            e.getStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void addStudent(){
        BatchBean bean = (BatchBean) batchComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        String name = nameTextField.getText();
        String rollNO = rollNoTextField.getText();
        String fatherName = fatherNameTextField.getText();
        String surname = surnameTextField.getText();
        String gender =  Encoder.genderEncode((String)genderComboBox.getSelectedItem());
        String phoneNo = phoneTextField.getText();
        String email = emailTextField.getText();
        String remarks = remarksTextArea.getText();
        
        
        try{
            int rows = DatabaseManager.addStudent(bean.getBatchId(), rollNO, name, fatherName, surname, gender, phoneNo, email, remarks);
        
            if(rows >= 1)
                JOptionPane.showMessageDialog(null, rows + " Record Inserted");
            
                getStudent();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void deleteStudent(){
        StudentBean bean = (StudentBean) studentList.getSelectedValue();
    
        if(bean == null)
            return;
        
        try{
        
            int rows = DatabaseManager.deleteStudent(bean.getStudentId());
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(null, rows + " Records Deleted");
            
                clear();
                getStudent();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void updateStudent(){
        StudentBean bean = (StudentBean) studentList.getSelectedValue();
        
        if(bean == null)
            return;
        
        String studentName = nameTextField.getText();
        String rollNo = rollNoTextField.getText();
        String fatherName = fatherNameTextField.getText();
        String surname = surnameTextField.getText();
        String phone = phoneTextField.getText();
        String email = emailTextField.getText();
        String Remarks = remarksTextArea.getText();
        String gender = Encoder.genderEncode((String)genderComboBox.getSelectedItem());
    
        try{
        
            int rows = DatabaseManager.updateStudent(bean.getStudentId(), rollNo, studentName, fatherName, surname, gender, phone, email, Remarks);
            
            if(rows >= 1)            
            JOptionPane.showMessageDialog(null, rows + " record Updated");
            
            clear();
            getStudent();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox batchComboBox;
    private javax.swing.JComboBox dptComboBox;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox facComboBox;
    private javax.swing.JTextField fatherNameTextField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JComboBox groupComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JComboBox progComboBox;
    private javax.swing.JTextArea remarksTextArea;
    private javax.swing.JTextField rollNoTextField;
    private javax.swing.JComboBox shiftComboBox;
    private javax.swing.JTextField studentIdTextField;
    private javax.swing.JList studentList;
    private javax.swing.JTextField surnameTextField;
    // End of variables declaration//GEN-END:variables

    private void clear(){
        nameTextField.setText(null);
        phoneTextField.setText(null);
        rollNoTextField.setText(null);
        emailTextField.setText(null);
        studentIdTextField.setText(null);
        remarksTextArea.setText(null);
        surnameTextField.setText(null);
        fatherNameTextField.setText(null);
    }

}
