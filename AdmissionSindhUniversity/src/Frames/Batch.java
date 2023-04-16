package Frames;

import BeanClasses.*;
import DBConnections.DatabaseManager;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Batch extends javax.swing.JPanel {

    public Batch() {
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
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of getFaculty
    
    private void getDepartment(){
        FacultyBean bean = (FacultyBean) facComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        try{
            
            dptComboBox.removeAllItems();
        
            Vector v = DatabaseManager.getDepartment(bean.getFacId());
            
            for(int i = 0; i < v.size(); i++){
                
                DepartmentBean dptBean = (DepartmentBean) v.elementAt(i);
                
                dptComboBox.addItem(dptBean);
            }
        }catch(Exception e){
            e.getMessage();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of get department

    private void getProgram(){
        DepartmentBean bean = (DepartmentBean) dptComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        programComboBox.removeAllItems();
        
        try{
        
            Vector v = DatabaseManager.getProgram(bean.getDptId());
            
            for(int i = 0; i < v.size(); i++){
                
                ProgramBean programBean = (ProgramBean) v.elementAt(i);
                
                programComboBox.addItem(programBean);
            }
        
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    
    private void getBatch(){
    
        ProgramBean bean = (ProgramBean) programComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        try{
            
            Vector v = DatabaseManager.getBatch(bean.getProgId());
            
            batchList.setListData(v);
        
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//end of getBact
    
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
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        facComboBox = new javax.swing.JComboBox();
        dptComboBox = new javax.swing.JComboBox();
        programComboBox = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        batchIdTextField = new javax.swing.JTextField();
        batchYearTextField = new javax.swing.JTextField();
        shiftComboBox = new javax.swing.JComboBox();
        groupComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        batchList = new javax.swing.JList();
        home1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(232, 201, 232));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(181, 71, 180));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/batch.png"))); // NOI18N
        home.setText("Batch");
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
                .addContainerGap(410, Short.MAX_VALUE))
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

        jLabel10.setBackground(new java.awt.Color(96, 83, 150));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(96, 83, 150));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Faculty");
        jLabel10.setIconTextGap(3);

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

        programComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        programComboBox.setForeground(new java.awt.Color(96, 83, 150));
        programComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        programComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programComboBoxActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(96, 83, 150));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(96, 83, 150));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Program");
        jLabel12.setIconTextGap(3);

        jLabel9.setBackground(new java.awt.Color(96, 83, 150));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(96, 83, 150));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Department");
        jLabel9.setIconTextGap(3);

        jLabel1.setBackground(new java.awt.Color(96, 83, 150));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 83, 150));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Batch Id");
        jLabel1.setIconTextGap(3);

        batchIdTextField.setEditable(false);
        batchIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        batchIdTextField.setForeground(new java.awt.Color(96, 83, 150));
        batchIdTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        batchIdTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        batchYearTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        batchYearTextField.setForeground(new java.awt.Color(96, 83, 150));
        batchYearTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        batchYearTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        shiftComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        shiftComboBox.setForeground(new java.awt.Color(96, 83, 150));
        shiftComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Morning", "Evening" }));
        shiftComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        shiftComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftComboBoxActionPerformed(evt);
            }
        });

        groupComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        groupComboBox.setForeground(new java.awt.Color(96, 83, 150));
        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "General", "Medical", "Engineering", "Commerce" }));
        groupComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        groupComboBox.setDoubleBuffered(true);

        jLabel2.setBackground(new java.awt.Color(96, 83, 150));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 83, 150));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Batch Year");
        jLabel2.setIconTextGap(3);

        jLabel11.setBackground(new java.awt.Color(96, 83, 150));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(96, 83, 150));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Shift");
        jLabel11.setIconTextGap(3);

        jLabel13.setBackground(new java.awt.Color(96, 83, 150));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(96, 83, 150));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Group");
        jLabel13.setIconTextGap(3);

        batchList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        batchList.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        batchList.setForeground(new java.awt.Color(96, 83, 150));
        batchList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                batchListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(batchList);

        home1.setBackground(new java.awt.Color(255, 255, 255));
        home1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home1.setForeground(new java.awt.Color(96, 83, 150));
        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/batchLightIcon.png"))); // NOI18N
        home1.setText("Batches");
        home1.setFocusable(false);
        home1.setIconTextGap(15);
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(facComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dptComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(programComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(batchIdTextField)
                        .addComponent(batchYearTextField)
                        .addComponent(shiftComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(home1)
                        .addGap(462, 462, 462))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(facComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(programComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(batchIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(batchYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(shiftComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap())
            .addComponent(jSeparator2)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

    }//GEN-LAST:event_homeMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        addBatch();
    }//GEN-LAST:event_addBtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        updateBatch();
    }//GEN-LAST:event_updateBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        deleteBatch();
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

    private void programComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programComboBoxActionPerformed
        getBatch();
    }//GEN-LAST:event_programComboBoxActionPerformed

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked

    }//GEN-LAST:event_home1MouseClicked

    private void batchListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_batchListValueChanged
        getBatchData();
    }//GEN-LAST:event_batchListValueChanged

    private void shiftComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shiftComboBoxActionPerformed
     
    private void getBatchData(){
        BatchBean bean = (BatchBean) batchList.getSelectedValue();
        
        if(bean == null){
            clear();
            return;
        }
        
        batchIdTextField.setText("" + bean.getBatchId());
        batchYearTextField.setText("" + bean.getBatchYear());
        shiftComboBox.setSelectedItem(Decoder.shiftDecode(bean.getShift()));
        groupComboBox.setSelectedItem(Decoder.groupDecode(bean.getGroup()));
        remarksTextArea.setText(bean.getRemarks());
        
    }
    
    private void addBatch(){
        ProgramBean bean = (ProgramBean) programComboBox.getSelectedItem();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select program in which you want to add batch");
            return;
        }
        
        int batchYear = Integer.parseInt("0"+batchYearTextField.getText());
        String shift = Encoder.shiftEncode((String)shiftComboBox.getSelectedItem());
        String group = Encoder.groupEncode((String)groupComboBox.getSelectedItem());
        String remarks = remarksTextArea.getText();
        
        if(batchYearTextField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "please fill batch year");
        }else
            if(shift.equals("")){
                JOptionPane.showMessageDialog(this, "please must select shift");
            }else
                if(group.equals("")){
                    JOptionPane.showMessageDialog(this, "please must select group");
                }else{

                    try{

                        int rows = DatabaseManager.addBatch(bean.getProgId(), batchYear, shift, group, remarks);

                        if(rows >= 1)
                            JOptionPane.showMessageDialog(this, rows + "Recored Inserted");

                            clear();
                            getBatch();

                    }catch(Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }

            }//end of else
    }//end of addBatch
    
    private void updateBatch(){
        BatchBean bean = (BatchBean) batchList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select batch which you want to update");
            return;
        }
        
        int batchYear = Integer.parseInt("0"+batchYearTextField.getText());
        String shift = Encoder.shiftEncode((String)shiftComboBox.getSelectedItem());
        String group = Encoder.groupEncode((String)groupComboBox.getSelectedItem());
        String remarks = remarksTextArea.getText();
        
        if(batchYearTextField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "please fill batch year");
        }else
            if(shift.equals("")){
                JOptionPane.showMessageDialog(this, "please must select shift");
            }else
                if(group.equals("")){
                    JOptionPane.showMessageDialog(this, "please must select group");
                }else{

                    try{

                        int rows = DatabaseManager.updateBatch(bean.getBatchId(),batchYear, shift, group, remarks);

                        if(rows >= 1)
                            JOptionPane.showMessageDialog(this, rows + "Recored Updated");

                            clear();
                            getBatch();

                        
                    }catch(Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }//end of try catch
              }
    }//emd of batch
    
    private void deleteBatch(){
        BatchBean bean = (BatchBean) batchList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select Batch which you want to delete");
            return;
        }
        
        try{
        
            int rows = DatabaseManager.deleteBatch(bean.getBatchId());
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(this, rows + "recored deleted");
            
            clear();
            getBatch();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void clear(){
        batchYearTextField.setText(null);
        shiftComboBox.setSelectedItem("");
        groupComboBox.setSelectedItem("");
        remarksTextArea.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private javax.swing.JLabel backBtn;
    private javax.swing.JTextField batchIdTextField;
    private javax.swing.JList batchList;
    private javax.swing.JTextField batchYearTextField;
    private javax.swing.JLabel clearBtn;
    private javax.swing.JLabel deleteBtn;
    private javax.swing.JComboBox dptComboBox;
    private javax.swing.JComboBox facComboBox;
    private javax.swing.JComboBox groupComboBox;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox programComboBox;
    private javax.swing.JTextArea remarksTextArea;
    private javax.swing.JComboBox shiftComboBox;
    private javax.swing.JLabel updateBtn;
    // End of variables declaration//GEN-END:variables
}
