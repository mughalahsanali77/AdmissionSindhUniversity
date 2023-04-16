package realFrames;

import BeanClasses.BatchBean;
import BeanClasses.Decoder;
import BeanClasses.DepartmentBean;
import BeanClasses.Encoder;
import BeanClasses.FacultyBean;
import BeanClasses.ProgramBean;
import DBConnections.DatabaseManager;
import javax.swing.JOptionPane;

public class Batch extends javax.swing.JFrame {

    
    public Batch() {
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
        shiftComboBox = new javax.swing.JComboBox();
        facComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        batchYearTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        batchIdTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        batchList = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dptComboBox = new javax.swing.JComboBox();
        programComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        groupComboBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Batch Year");
        jLabel1.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Batches");
        jLabel4.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 90, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Faculty");
        jLabel5.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 26));

        shiftComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        shiftComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Evening" }));
        shiftComboBox.setName(""); // NOI18N
        shiftComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(shiftComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 150, 30));

        facComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        facComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(facComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 280, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Program");
        jLabel2.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 26));
        getContentPane().add(batchYearTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Batch Id");
        jLabel3.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 26));

        batchIdTextField.setEditable(false);
        getContentPane().add(batchIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Remarks");
        jLabel6.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Shift");
        jLabel7.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 50, 30));

        remarksTextArea.setColumns(20);
        remarksTextArea.setRows(5);
        jScrollPane1.setViewportView(remarksTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 370, -1));

        batchList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        batchList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                batchListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(batchList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 150, 460));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 90, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 90, 40));

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
        getContentPane().add(dptComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 280, 30));

        programComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        programComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                programComboBoxItemStateChanged(evt);
            }
        });
        programComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(programComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 280, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Group");
        jLabel9.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 70, 30));

        groupComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "Engineering", "Medical" }));
        getContentPane().add(groupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 150, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Batch");
        jLabel10.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 60, 26));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facComboBoxActionPerformed
        getDepartment();
    }//GEN-LAST:event_facComboBoxActionPerformed

    private void programComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programComboBoxActionPerformed
    
    }//GEN-LAST:event_programComboBoxActionPerformed

    private void dptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptComboBoxActionPerformed
          getProgram();
    }//GEN-LAST:event_dptComboBoxActionPerformed

    private void programComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_programComboBoxItemStateChanged
               getBatch();
    }//GEN-LAST:event_programComboBoxItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        
        new Home().show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void shiftComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shiftComboBoxActionPerformed

    private void batchListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_batchListValueChanged
       BatchBean bean = (BatchBean) batchList.getSelectedValue();
       
       if(bean == null)
           return;
       
       batchIdTextField.setText(""+bean.getBatchId());
       batchYearTextField.setText(""+bean.getBatchYear());
       
       
       shiftComboBox.setSelectedItem(Decoder.shiftDecode(bean.getShift()));
       groupComboBox.setSelectedItem(Decoder.groupDecode(bean.getGroup()));
       remarksTextArea.setText(bean.getRemarks());
    }//GEN-LAST:event_batchListValueChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addBatch();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        deleteBatch();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        updateBatch();
    }//GEN-LAST:event_jButton4ActionPerformed

    
     private void getDepartment(){
        FacultyBean bean=(FacultyBean)facComboBox.getSelectedItem();
        if(bean==null)return;
        
        try{
            java.util.Vector v = DatabaseManager.getDepartment(bean.getFacId());
            dptComboBox.removeAllItems();
            
            for(int i=0; i< v.size(); i++){
                DepartmentBean deptbean = (DepartmentBean) v.elementAt(i);
                
                dptComboBox.addItem(deptbean);
            }
        }catch(Exception e){
            e.getStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

     
     private void getProgram(){
        DepartmentBean bean=(DepartmentBean)dptComboBox.getSelectedItem();
        if(bean==null)return;
        
        try{
            java.util.Vector v = DatabaseManager.getProgram(bean.getDptId());
            programComboBox.removeAllItems();
            
            for(int i=0; i< v.size(); i++){
                ProgramBean programBean = (ProgramBean) v.elementAt(i);
                
                programComboBox.addItem(programBean);
            }
        }catch(Exception e){
            e.getStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
     
     
     private void getBatch(){
        ProgramBean bean=(ProgramBean)programComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        if(programComboBox.getSelectedItem() == null)
            batchList.removeAll();
        
        try{
            java.util.Vector v = DatabaseManager.getBatch(bean.getProgId());
            
            batchList.setListData(v);
        }catch(Exception e){
            e.getStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
     
     private void addBatch(){
         ProgramBean bean = (ProgramBean) programComboBox.getSelectedItem();
         
         if(bean == null)
             return;
         
         int batchYear = Integer.parseInt(batchYearTextField.getText());
         String shift = (String) shiftComboBox.getSelectedItem();
         String group = (String) groupComboBox.getSelectedItem();
         String remarks = remarksTextArea.getText();
         
         shift = Encoder.shiftEncode(shift);
         group = Encoder.groupEncode(group);
         
        
         try{
         
             int rows = DatabaseManager.addBatch(bean.getProgId(), batchYear, shift, group, remarks);
             
             if(rows >= 1)
                 JOptionPane.showMessageDialog(null, rows + " Record Inserted");
             
             clear();
             getBatch();
             
         }catch(Exception e){
             e.printStackTrace();
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
     
     
    private void deleteBatch(){
        BatchBean bean = (BatchBean) batchList.getSelectedValue();
        
        if(bean == null)
            return;
        try{
            
            int rows = DatabaseManager.deleteBatch(bean.getBatchId());
            
            JOptionPane.showMessageDialog(null, rows + " Record Deleted");
            
            clear();
            getBatch();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void updateBatch(){
        BatchBean bean = (BatchBean) batchList.getSelectedValue();
        
        if(bean == null)
            return;
        
        int  batchYear = Integer.parseInt(batchYearTextField.getText());
        String shift = Encoder.shiftEncode((String)shiftComboBox.getSelectedItem());
        String group = Encoder.groupEncode((String)groupComboBox.getSelectedItem());
        String remarks = remarksTextArea.getText();
        
        try{
        
            int rows = DatabaseManager.updateBatch(bean.getBatchId(), batchYear, shift, group, remarks);
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(null, rows + " Record Updated");
            
                clear();
                getBatch();
                
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
            java.util.logging.Logger.getLogger(Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batch().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batchIdTextField;
    private javax.swing.JList batchList;
    private javax.swing.JTextField batchYearTextField;
    private javax.swing.JComboBox dptComboBox;
    private javax.swing.JComboBox facComboBox;
    private javax.swing.JComboBox groupComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox programComboBox;
    private javax.swing.JTextArea remarksTextArea;
    private javax.swing.JComboBox shiftComboBox;
    // End of variables declaration//GEN-END:variables

    private void clear(){
        batchIdTextField.setText(null);
        batchYearTextField.setText(null);
        remarksTextArea.setText(null);
    }
}
