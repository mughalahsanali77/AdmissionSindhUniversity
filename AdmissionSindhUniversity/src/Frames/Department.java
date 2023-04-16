package Frames;

import BeanClasses.*;
import DBConnections.DatabaseManager;
import java.util.*;
import javax.swing.*;

public class Department extends javax.swing.JPanel {

    public Department(){
        initComponents();
        
        getFaculty();
    }
    
    private void getFaculty(){
        try{
        
            Vector v = DatabaseManager.getFaculty();
            
            for(int i = 0; i < v.size(); i++){
                
                FacultyBean bean = (FacultyBean) v.elementAt(i);
                
                facComboBox.addItem(bean);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        home2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        addBtn = new javax.swing.JLabel();
        updateBtn = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JLabel();
        clearBtn = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        facComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        dptIdTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dptNameTextField = new javax.swing.JTextField();
        home = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dptList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(232, 201, 232));

        home2.setBackground(new java.awt.Color(255, 255, 255));
        home2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home2.setForeground(new java.awt.Color(181, 71, 180));
        home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/dept.png"))); // NOI18N
        home2.setText("Department");
        home2.setFocusable(false);
        home2.setIconTextGap(15);
        home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(home2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(home2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator1.setBackground(new java.awt.Color(96, 83, 150));

        jSeparator2.setBackground(new java.awt.Color(96, 83, 150));

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        addBtn.setForeground(new java.awt.Color(96, 83, 150));
        addBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/add.png"))); // NOI18N
        addBtn.setText("ADD");
        addBtn.setIconTextGap(3);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(255, 255, 255));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(96, 83, 150));
        updateBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/update.png"))); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.setIconTextGap(3);
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(96, 83, 150));
        deleteBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/delete.png"))); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setIconTextGap(3);
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(96, 83, 150));
        clearBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/clear.png"))); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.setIconTextGap(3);
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        backBtn.setForeground(new java.awt.Color(96, 83, 150));
        backBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/back.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.setIconTextGap(3);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(96, 83, 150));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(96, 83, 150));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Faculty");
        jLabel9.setIconTextGap(3);

        facComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        facComboBox.setForeground(new java.awt.Color(96, 83, 150));
        facComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        facComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(96, 83, 150));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 83, 150));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Department Id");
        jLabel1.setIconTextGap(3);

        dptIdTextField.setEditable(false);
        dptIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        dptIdTextField.setForeground(new java.awt.Color(96, 83, 150));
        dptIdTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        dptIdTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        jLabel2.setBackground(new java.awt.Color(96, 83, 150));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 83, 150));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Department Name");
        jLabel2.setIconTextGap(3);

        dptNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        dptNameTextField.setForeground(new java.awt.Color(96, 83, 150));
        dptNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        dptNameTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(96, 83, 150));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/dptLightIcon.png"))); // NOI18N
        home.setText("Departments");
        home.setFocusable(false);
        home.setIconTextGap(15);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        dptList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        dptList.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        dptList.setForeground(new java.awt.Color(96, 83, 150));
        dptList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dptListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(dptList);

        jLabel3.setBackground(new java.awt.Color(96, 83, 150));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 83, 150));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Remarks");
        jLabel3.setIconTextGap(3);

        remarksTextArea.setColumns(20);
        remarksTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remarksTextArea.setForeground(new java.awt.Color(96, 83, 150));
        remarksTextArea.setRows(5);
        remarksTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        jScrollPane1.setViewportView(remarksTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dptIdTextField)
                            .addComponent(dptNameTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(117, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(dptIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dptNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(addBtn)
                .addGap(50, 50, 50)
                .addComponent(updateBtn)
                .addGap(50, 50, 50)
                .addComponent(deleteBtn)
                .addGap(50, 50, 50)
                .addComponent(clearBtn)
                .addGap(50, 50, 50)
                .addComponent(backBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void home2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home2MouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        addDepartment();
    }//GEN-LAST:event_addBtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        updateDepartment();
    }//GEN-LAST:event_updateBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        deleteDepartment();
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        clear();
    }//GEN-LAST:event_clearBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked

    }//GEN-LAST:event_backBtnMouseClicked

    private void facComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facComboBoxActionPerformed
        getDepartment();
    }//GEN-LAST:event_facComboBoxActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

    }//GEN-LAST:event_homeMouseClicked

    private void dptListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dptListValueChanged
        getDepartmentData();
    }//GEN-LAST:event_dptListValueChanged

    
      private void getDepartment(){
    
        FacultyBean facBean = (FacultyBean) facComboBox.getSelectedItem();
        
        if(facBean == null)
            return;
        
        try{
            java.util.Vector v = DatabaseManager.getDepartment(facBean.getFacId());
           
            dptList.setListData(v); 
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of getDepartment
      
    private void getDepartmentData(){
        DepartmentBean bean = (DepartmentBean) dptList.getSelectedValue();
        
        if(bean == null){
            clear();
            return;
        }
        
        dptIdTextField.setText("" + bean.getDptId());
        dptNameTextField.setText(bean.getDptName());
        remarksTextArea.setText(bean.getRemarks());
        
    }//end of getDepartmentData

    private void addDepartment(){
        FacultyBean bean = (FacultyBean) facComboBox.getSelectedItem();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select faculty in whihc you want add department");
            return;
        }
        
        String dptName = dptNameTextField.getText();
        String remarks = remarksTextArea.getText();
        
        if(dptName.equals("")){
            JOptionPane.showMessageDialog(this, " please fill full forms");
        }else{
            try{
                int rows = DatabaseManager.addDepartment(bean.getFacId(), dptName, remarks);

                if(rows >= 1)
                    JOptionPane.showMessageDialog(this, rows + " Record Inserted");

                    clear();
                    getDepartment();
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//end of add Department
    
    private void updateDepartment(){
        DepartmentBean bean = (DepartmentBean) dptList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select department which you want update");
            return;
        }
        String dptName = dptNameTextField.getText();
        String remarks = remarksTextArea.getText();
        
        if(dptName.equals("")){
            JOptionPane.showMessageDialog(this, "Department Name cant't be null");
        }else{
            try{
                int rows = DatabaseManager.updateDepartment(bean.getDptId(), dptName, remarks);
                
                if(rows >= 1)
                    JOptionPane.showMessageDialog(this, rows + " record Updated");
                
                clear();
                getDepartment();
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//end of updateDepartment
    
    private void deleteDepartment(){
        DepartmentBean bean = (DepartmentBean) dptList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select department which you want to delete");
            return;
        }
        
        try{
            int rows = DatabaseManager.deleteDepartment(bean.getDptId());
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(this, rows + " Record Deleted ");
            
            clear();         
           getDepartment();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of DeleteDepartment
    
    private void clear(){
        dptIdTextField.setText(null);
        dptNameTextField.setText(null);
        remarksTextArea.setText(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel clearBtn;
    private javax.swing.JLabel deleteBtn;
    private javax.swing.JTextField dptIdTextField;
    private javax.swing.JList dptList;
    private javax.swing.JTextField dptNameTextField;
    private javax.swing.JComboBox facComboBox;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea remarksTextArea;
    private javax.swing.JLabel updateBtn;
    // End of variables declaration//GEN-END:variables
}
