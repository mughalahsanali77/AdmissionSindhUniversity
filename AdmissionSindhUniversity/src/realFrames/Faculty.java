package realFrames;

import BeanClasses.*;
import DBConnections.DatabaseManager;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class Faculty extends javax.swing.JFrame{

    public Faculty() {
        initComponents();
        
        getFaculty();
    }

    private void getFaculty(){
        try{
            
            Vector v = DatabaseManager.getFaculty();
            facList.setListData(v);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//end getFaculty method
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        facIdTextField = new javax.swing.JTextField();
        facNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        facList = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        facAddBtn = new javax.swing.JButton();
        facUpdateBtn = new javax.swing.JButton();
        facDeleteBtn = new javax.swing.JButton();
        facClearBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        facBacBtn1 = new javax.swing.JButton();
        facBacBtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("FACULTY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 0, -1, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Faculty Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 130, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Remarks");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 30));

        facIdTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        facIdTextField.setEnabled(false);
        facIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facIdTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(facIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, -1));

        facNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(facNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 390, -1));

        remarksTextArea.setColumns(20);
        remarksTextArea.setRows(5);
        jScrollPane1.setViewportView(remarksTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 350, 130));

        facList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        facList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                facListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(facList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 250, 270));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Faculty Id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 102, 35));

        facAddBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        facAddBtn.setText("ADD");
        facAddBtn.setIconTextGap(5);
        facAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facAddBtnActionPerformed(evt);
            }
        });
        getContentPane().add(facAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, 36));

        facUpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        facUpdateBtn.setText("UPDATE");
        facUpdateBtn.setIconTextGap(5);
        facUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facUpdateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(facUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 36));

        facDeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        facDeleteBtn.setText("DELETE");
        facDeleteBtn.setIconTextGap(5);
        facDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facDeleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(facDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, 36));

        facClearBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        facClearBtn.setText("CLEAR");
        facClearBtn.setIconTextGap(5);
        facClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facClearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(facClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, 36));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Faculties");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 103, 35));

        facBacBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        facBacBtn1.setText("BACK");
        facBacBtn1.setIconTextGap(5);
        facBacBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facBacBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(facBacBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 110, 36));

        facBacBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        facBacBtn2.setText("Home");
        facBacBtn2.setIconTextGap(5);
        facBacBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facBacBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(facBacBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 110, 36));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facIdTextFieldActionPerformed

    private void facAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facAddBtnActionPerformed
        addFaculty();
    }//GEN-LAST:event_facAddBtnActionPerformed

    private void facBacBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facBacBtn1ActionPerformed
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_facBacBtn1ActionPerformed

    private void facBacBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facBacBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facBacBtn2ActionPerformed

    private void facClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facClearBtnActionPerformed
        clear();
    }//GEN-LAST:event_facClearBtnActionPerformed

    private void facListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_facListValueChanged
        FacultyBean bean = (FacultyBean) facList.getSelectedValue();
        
        if(bean == null) 
                return;
        
       facIdTextField.setText(""+bean.getFacId());
       facNameTextField.setText(bean.getfacName());
       remarksTextArea.setText(bean.getRemarks());
    }//GEN-LAST:event_facListValueChanged

    private void facDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facDeleteBtnActionPerformed
        deleteFaculty();
    }//GEN-LAST:event_facDeleteBtnActionPerformed

    private void facUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facUpdateBtnActionPerformed
        updateFaculty();
    }//GEN-LAST:event_facUpdateBtnActionPerformed

    
    private void addFaculty(){
        String facName = facNameTextField.getText();
        String remarks = remarksTextArea.getText();
        
        if(facName.equals("")){
            JOptionPane.showMessageDialog(this, " mut fill data ");
        }else{
            try{

               int rows = DatabaseManager.addFaculty(facName, remarks);

               if(rows >= 1)
                   JOptionPane.showMessageDialog(null, rows + " Record Inserted");
                   clear();
                   getFaculty();

            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//end of addFaculty method
    
    private void clear(){
        facNameTextField.setText(null);
        facIdTextField.setText(null);
        remarksTextArea.setText(null);
    }
    
    
    private void deleteFaculty(){
        FacultyBean bean = (FacultyBean) facList.getSelectedValue();
        
        if(bean == null)
            return;
        
        try{
            
            int rows = DatabaseManager.deleteFaculty(bean.getFacId());
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(null, rows + " Record Deleted");
            
            clear();
            getFaculty();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
    
    private void updateFaculty(){
        FacultyBean bean = (FacultyBean) facList.getSelectedValue();
        
        if(bean == null) 
            return;
        
        String facName = facNameTextField.getText();
        String remarks = remarksTextArea.getText();
        
        try{
        
            int rows = DatabaseManager.updateFaculty(bean.getFacId(), facName, remarks);
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(null, rows + " Updated");
                
                clear();
                getFaculty();
            
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
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faculty().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton facAddBtn;
    private javax.swing.JButton facBacBtn1;
    private javax.swing.JButton facBacBtn2;
    private javax.swing.JButton facClearBtn;
    private javax.swing.JButton facDeleteBtn;
    private javax.swing.JTextField facIdTextField;
    private javax.swing.JList facList;
    private javax.swing.JTextField facNameTextField;
    private javax.swing.JButton facUpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea remarksTextArea;
    // End of variables declaration//GEN-END:variables
}
