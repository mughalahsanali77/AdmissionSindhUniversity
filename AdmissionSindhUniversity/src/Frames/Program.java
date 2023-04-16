package Frames;

import BeanClasses.*;
import DBConnections.DatabaseManager;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Program extends javax.swing.JPanel {

    public Program() {
        initComponents();
        
        getFaculty();
    }
    
    
        private void getFaculty(){
        try{
            Vector v = DatabaseManager.getFaculty();
            
            for(int i=0; i < v.size(); i++){
                
                FacultyBean bean = (FacultyBean) v.elementAt(i);
                
                facComboBox.addItem(bean);
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//end of getFaculty
    
    private void getDepartment(){
        FacultyBean bean = (FacultyBean) facComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        dptComboBox.removeAllItems();
        
        try{
        
            Vector v = DatabaseManager.getDepartment(bean.getFacId());
            
            for(int i = 0; i < v.size(); i++){
                
                DepartmentBean dptBean = (DepartmentBean) v.elementAt(i);
                
                dptComboBox.addItem(dptBean);
            }             
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    } 
    
    private void getProgram(){
        DepartmentBean bean = (DepartmentBean) dptComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        try{
        
            Vector v = DatabaseManager.getProgram(bean.getDptId());
            
            programList.setListData(v);            
        }catch(Exception e){
            e.getMessage();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of getProgram
    
     private void getProgramData(){
        try{
            ProgramBean bean = (ProgramBean) programList.getSelectedValue();
        
            if(bean == null)
             return;        
            
            programIdTextField.setText("" + bean.getProgId());
            programNameTextField.setText(bean.getProgName());
            semesterTextField.setText("" + bean.getDurationInSem());
            remarksTextArea.setText(bean.getRemarks());
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of getProgramData

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        addBtn = new javax.swing.JLabel();
        updateBtn = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JLabel();
        clearBtn = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        facComboBox = new javax.swing.JComboBox();
        dptComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        programIdTextField = new javax.swing.JTextField();
        programNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        semesterTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        home1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        programList = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(232, 201, 232));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(181, 71, 180));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/program.png"))); // NOI18N
        home.setText("Program");
        home.setFocusable(false);
        home.setIconTextGap(15);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        facComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        facComboBox.setForeground(new java.awt.Color(96, 83, 150));
        facComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        facComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facComboBoxActionPerformed(evt);
            }
        });

        dptComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        dptComboBox.setForeground(new java.awt.Color(96, 83, 150));
        dptComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        dptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(96, 83, 150));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(96, 83, 150));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Department");
        jLabel9.setIconTextGap(3);

        jLabel10.setBackground(new java.awt.Color(96, 83, 150));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(96, 83, 150));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Faculty");
        jLabel10.setIconTextGap(3);

        programIdTextField.setEditable(false);
        programIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        programIdTextField.setForeground(new java.awt.Color(96, 83, 150));
        programIdTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        programIdTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        programIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programIdTextFieldActionPerformed(evt);
            }
        });

        programNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        programNameTextField.setForeground(new java.awt.Color(96, 83, 150));
        programNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        programNameTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        jLabel2.setBackground(new java.awt.Color(96, 83, 150));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 83, 150));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Program Name");
        jLabel2.setIconTextGap(3);

        jLabel1.setBackground(new java.awt.Color(96, 83, 150));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 83, 150));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Program Id");
        jLabel1.setIconTextGap(3);

        semesterTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        semesterTextField.setForeground(new java.awt.Color(96, 83, 150));
        semesterTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        semesterTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        jLabel3.setBackground(new java.awt.Color(96, 83, 150));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 83, 150));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Semesters");
        jLabel3.setIconTextGap(3);

        home1.setBackground(new java.awt.Color(255, 255, 255));
        home1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home1.setForeground(new java.awt.Color(96, 83, 150));
        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/programLightIcon.png"))); // NOI18N
        home1.setText("Programs");
        home1.setFocusable(false);
        home1.setIconTextGap(15);
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });

        programList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        programList.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        programList.setForeground(new java.awt.Color(96, 83, 150));
        programList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                programListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(programList);

        remarksTextArea.setColumns(20);
        remarksTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remarksTextArea.setForeground(new java.awt.Color(96, 83, 150));
        remarksTextArea.setRows(5);
        remarksTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        jScrollPane1.setViewportView(remarksTextArea);

        jLabel4.setBackground(new java.awt.Color(96, 83, 150));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(96, 83, 150));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Remarks");
        jLabel4.setIconTextGap(3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(611, 611, 611)
                .addComponent(home1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(33, 33, 33)
                                .addComponent(dptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(programIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(programNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(51, 51, 51)
                                .addComponent(semesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(79, 79, 79)
                                .addComponent(facComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(home1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel10))
                            .addComponent(facComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9))
                            .addComponent(dptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1))
                            .addComponent(programIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2))
                            .addComponent(programNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3))
                            .addComponent(semesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

    }//GEN-LAST:event_homeMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        addProgram();
    }//GEN-LAST:event_addBtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        updateProgram();
    }//GEN-LAST:event_updateBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        deleteProgram();
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        clear();
    }//GEN-LAST:event_clearBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked

    }//GEN-LAST:event_backBtnMouseClicked

    private void facComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facComboBoxActionPerformed
        getDepartment();
    }//GEN-LAST:event_facComboBoxActionPerformed

    private void dptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptComboBoxActionPerformed
        getProgram();
    }//GEN-LAST:event_dptComboBoxActionPerformed

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked

    }//GEN-LAST:event_home1MouseClicked

    private void programIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programIdTextFieldActionPerformed

    private void programListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_programListValueChanged
        getProgramData();
    }//GEN-LAST:event_programListValueChanged

        private void addProgram(){
        DepartmentBean bean = (DepartmentBean) dptComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        String programName = programNameTextField.getText();
        int semesters = Integer.parseInt("0"+semesterTextField.getText());
        String remarks = remarksTextArea.getText();
        
        if(programName.equals("") || semesterTextField.getText().equals("")){
               JOptionPane.showMessageDialog(this, "please fill full form");
        }else{
            try{
        
                int rows = DatabaseManager.addProgram(bean.getDptId(), programName, semesters, remarks);
                
                if(rows >= 1)
                    JOptionPane.showMessageDialog(this, rows + " Record Inserted");
                
                    clear();
                    getProgram();
                
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//end of add program
    
    private void updateProgram(){
        ProgramBean bean = (ProgramBean) programList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select program which you want to update");
            return;
        }
        
        String programName  = programNameTextField.getText();
        int semesters = Integer.parseInt("0"+semesterTextField.getText());
        String remarks = remarksTextArea.getText();
        
        if(programName.equals("")){
            JOptionPane.showMessageDialog(this, "program Naem cant't be null");
        }else
            if(semesterTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "semesters cant't be null");
            }else{
                try{
                    
                    int rows = DatabaseManager.updateProgram(bean.getProgId(), programName, semesters, remarks);
                    
                    if(rows >= 1)
                        JOptionPane.showMessageDialog(this, rows + " record Updated");
                
                    clear();
                    getProgram();
                }catch(Exception e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
    }//end of updateProgram
    
    private void deleteProgram(){
        ProgramBean bean = (ProgramBean) programList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select program which you wnat to delete");
            return;
        }
        
        try{
            
            int rows = DatabaseManager.deleteProgram(bean.getProgId());
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(this, rows + " record Deleted");
            
            clear();
            getProgram();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void clear(){
        programIdTextField.setText(null);
        programNameTextField.setText(null);
        semesterTextField.setText(null);
        remarksTextArea.setText(null);
    }//end of clear
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel clearBtn;
    private javax.swing.JLabel deleteBtn;
    private javax.swing.JComboBox dptComboBox;
    private javax.swing.JComboBox facComboBox;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField programIdTextField;
    private javax.swing.JList programList;
    private javax.swing.JTextField programNameTextField;
    private javax.swing.JTextArea remarksTextArea;
    private javax.swing.JTextField semesterTextField;
    private javax.swing.JLabel updateBtn;
    // End of variables declaration//GEN-END:variables
}
