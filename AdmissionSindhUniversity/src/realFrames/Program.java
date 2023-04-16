package realFrames;

import BeanClasses.DepartmentBean;
import BeanClasses.FacultyBean;
import BeanClasses.ProgramBean;
import DBConnections.DatabaseManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Program extends javax.swing.JFrame{

    
    public Program() {
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
            
            programList.setListData(v);
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
        dptComboBox = new javax.swing.JComboBox();
        facComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        programNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        programIdTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        durationInSemTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        programList = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Program Name");
        jLabel1.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Programs");
        jLabel4.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 90, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Faculty");
        jLabel5.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 26));

        dptComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dptComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dptComboBoxItemStateChanged(evt);
            }
        });
        dptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(dptComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 280, 30));

        facComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        facComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(facComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 280, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Deparrtment");
        jLabel2.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 26));
        getContentPane().add(programNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Program ID");
        jLabel3.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 26));

        programIdTextField.setEditable(false);
        getContentPane().add(programIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 50, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Remarks");
        jLabel6.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, 26));
        getContentPane().add(durationInSemTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 50, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Duration in sem");
        jLabel7.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, 26));

        remarksTextArea.setColumns(20);
        remarksTextArea.setRows(5);
        jScrollPane1.setViewportView(remarksTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 370, -1));

        programList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        programList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                programListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(programList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 190, 460));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 90, 40));

        addButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 90, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Program");
        jLabel8.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 90, 26));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptComboBoxActionPerformed
        getProgram();
    }//GEN-LAST:event_dptComboBoxActionPerformed

    private void facComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facComboBoxActionPerformed
        getDepartment();
    }//GEN-LAST:event_facComboBoxActionPerformed

    private void programListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_programListValueChanged
        ProgramBean bean = (ProgramBean) programList.getSelectedValue();
        
        if(bean == null) 
               return;
        
       programIdTextField.setText(""+bean.getProgId());
       programNameTextField.setText(bean.getProgName());
       durationInSemTextField.setText(""+bean.getDurationInSem());
       remarksTextArea.setText(bean.getRemarks());
    }//GEN-LAST:event_programListValueChanged

    private void dptComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dptComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_dptComboBoxItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setVisible(false);
       
       new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addProgram();
    }//GEN-LAST:event_addButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        deleteProgram();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        updateProgram();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void addProgram(){
        DepartmentBean bean = (DepartmentBean) dptComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        String programName = programNameTextField.getText();
        int semester = Integer.parseInt(durationInSemTextField.getText());
        String remarks = remarksTextArea.getText();
        
       
        try{
        
            int rows = DatabaseManager.addProgram(bean.getDptId(), programName, semester, remarks);
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(null, rows + " Record Inserted");
            
            clear();
            getProgram();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void deleteProgram(){
        ProgramBean bean = (ProgramBean) programList.getSelectedValue();
        
        if(bean == null)
            return;
        try{
            
            int rows = DatabaseManager.deleteProgram(bean.getProgId());
            
            JOptionPane.showMessageDialog(null, rows + " Record Deleted");
            
            clear();
            getProgram();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void updateProgram(){
        ProgramBean bean = (ProgramBean) programList.getSelectedValue();
    
        if(bean == null)
            return;
        
        String programName = programNameTextField.getText();
        int semesters = Integer.parseInt(durationInSemTextField.getText());
        String remarks = remarksTextArea.getText();
        
        try{
            
            int rows = DatabaseManager.updateProgram(bean.getProgId(), programName, semesters, remarks);
        
            if(rows >= 1)
                JOptionPane.showMessageDialog(null, rows + " record Updated");
            
            clear();
            getProgram();
            
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
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox dptComboBox;
    private javax.swing.JTextField durationInSemTextField;
    private javax.swing.JComboBox facComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField programIdTextField;
    private javax.swing.JList programList;
    private javax.swing.JTextField programNameTextField;
    private javax.swing.JTextArea remarksTextArea;
    // End of variables declaration//GEN-END:variables

    private void clear(){
        programIdTextField.setText(null);
        programNameTextField.setText(null);
        durationInSemTextField.setText(null);
        remarksTextArea.setText(null);
    }
}
