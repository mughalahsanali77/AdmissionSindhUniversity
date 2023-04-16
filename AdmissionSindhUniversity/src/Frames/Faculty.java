package Frames;

import BeanClasses.FacultyBean;
import DBConnections.DatabaseManager;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Faculty extends javax.swing.JPanel {

    public Faculty() {
        initComponents();
        
        getFaculty();
    }
    
    private void getFaculty(){
        try{
        
            Vector v = DatabaseManager.getFaculty();
            
            facultyList.setListData(v);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//end of getFaculty

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        home1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        addBtn = new javax.swing.JLabel();
        updateBtn = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JLabel();
        clearBtn = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        facIdTextField = new javax.swing.JTextField();
        facNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        facultyList = new javax.swing.JList();
        home = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(96, 83, 150));

        jPanel1.setBackground(new java.awt.Color(232, 201, 232));

        home1.setBackground(new java.awt.Color(255, 255, 255));
        home1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home1.setForeground(new java.awt.Color(181, 71, 180));
        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/icons8_student_center_30px_2.png"))); // NOI18N
        home1.setText("Faculty");
        home1.setFocusable(false);
        home1.setIconTextGap(15);
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(home1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(home1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        jPanel2.setMaximumSize(new java.awt.Dimension(966, 448));
        jPanel2.setMinimumSize(new java.awt.Dimension(966, 448));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(96, 83, 150));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 83, 150));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Faculty Id");
        jLabel1.setIconTextGap(3);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(55, 80, 92, 27);

        facIdTextField.setEditable(false);
        facIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        facIdTextField.setForeground(new java.awt.Color(96, 83, 150));
        facIdTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        facIdTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        jPanel2.add(facIdTextField);
        facIdTextField.setBounds(195, 72, 367, 44);

        facNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        facNameTextField.setForeground(new java.awt.Color(96, 83, 150));
        facNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        facNameTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        jPanel2.add(facNameTextField);
        facNameTextField.setBounds(195, 126, 367, 44);

        jLabel2.setBackground(new java.awt.Color(96, 83, 150));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 83, 150));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Faculty Name");
        jLabel2.setIconTextGap(3);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 130, 130, 27);

        facultyList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        facultyList.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        facultyList.setForeground(new java.awt.Color(96, 83, 150));
        facultyList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                facultyListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(facultyList);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(589, 72, 356, 365);

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(96, 83, 150));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/facultyLightIcon.png"))); // NOI18N
        home.setText("Faculies");
        home.setFocusable(false);
        home.setIconTextGap(15);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel2.add(home);
        home.setBounds(589, 40, 135, 32);

        remarksTextArea.setColumns(20);
        remarksTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remarksTextArea.setForeground(new java.awt.Color(96, 83, 150));
        remarksTextArea.setRows(5);
        remarksTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        jScrollPane1.setViewportView(remarksTextArea);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(55, 237, 507, 200);

        jLabel3.setBackground(new java.awt.Color(96, 83, 150));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 83, 150));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Remarks");
        jLabel3.setIconTextGap(3);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(55, 210, 81, 27);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
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
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home1MouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        addFaculty();
    }//GEN-LAST:event_addBtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        updateFaculty();
    }//GEN-LAST:event_updateBtnMouseClicked

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        clear();
    }//GEN-LAST:event_clearBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        deleteFaculty();
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked

    }//GEN-LAST:event_backBtnMouseClicked

    private void facultyListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_facultyListValueChanged
        getFacultyData();
    }//GEN-LAST:event_facultyListValueChanged

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

    }//GEN-LAST:event_homeMouseClicked

    private void getFacultyData(){
        clear();
        FacultyBean bean = (FacultyBean) facultyList.getSelectedValue();
        
        if(bean == null)
            return;
        
        facIdTextField.setText(""+bean.getFacId());
        facNameTextField.setText(bean.getfacName());
        remarksTextArea.setText(bean.getRemarks());
    }//end of getFacultyData
    
    private void addFaculty(){
        String facName = facNameTextField.getText();
        String remarks = remarksTextArea.getText(); 
        
        if(facName.equals("")){
            JOptionPane.showMessageDialog(this, "please fill full form");
        }else{
            try{
            
                int rows  = DatabaseManager.addFaculty(facName, remarks);
                
                if(rows >= 1)
                    JOptionPane.showMessageDialog(this, rows + " Record Inserted");
                
                clear();
                getFaculty();
                    
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }    
    }//end of addFaculty   
    
    private void updateFaculty(){
        
        FacultyBean bean = (FacultyBean) facultyList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select Faculty which you want to update");
            return;
        }
        String facName = facNameTextField.getText();
        String remarks = remarksTextArea.getText();
        
        if(facName.equals("")){
            JOptionPane.showMessageDialog(null, "Faculty Name cant't be null");
        }else{
            try{
            
                int rows = DatabaseManager.updateFaculty(bean.getFacId(), facName, remarks);
                
                if(rows >= 1)
                    JOptionPane.showMessageDialog(null, rows + " Record Updated");
                    
                    clear();
                    getFaculty();
                
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
    }//end of updateFaculty

    private void deleteFaculty(){
        FacultyBean bean = (FacultyBean) facultyList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select Faculty which you want to delete");
            return;
        }
        try{
        
            int rows  = DatabaseManager.deleteFaculty(bean.getFacId());
            
            if(rows >= 1)
                    JOptionPane.showMessageDialog(this, rows + " record Deleted");
            
                    clear();
                    getFaculty();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of deleteFaculty
    
    private void clear(){
        facIdTextField.setText(null);
        facNameTextField.setText(null);
        remarksTextArea.setText(null);
    }//end of clear
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel clearBtn;
    private javax.swing.JLabel deleteBtn;
    private javax.swing.JTextField facIdTextField;
    private javax.swing.JTextField facNameTextField;
    private javax.swing.JList facultyList;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea remarksTextArea;
    private javax.swing.JLabel updateBtn;
    // End of variables declaration//GEN-END:variables
}
