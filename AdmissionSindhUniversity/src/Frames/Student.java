package Frames;

import BeanClasses.BatchBean;
import BeanClasses.Decoder;
import BeanClasses.DepartmentBean;
import BeanClasses.Encoder;
import BeanClasses.FacultyBean;
import BeanClasses.ProgramBean;
import BeanClasses.StudentBean;
import DBConnections.DatabaseManager;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Student extends javax.swing.JPanel {

    public Student() {
        initComponents();
        
        getFaculty();
    }

    private void getFaculty(){
        try{
        
            Vector v = DatabaseManager.getFaculty();
            
            facComboBox.removeAllItems();
            
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
        
        if(bean == null){
            return;
        }
        
        try{
        
            Vector v = DatabaseManager.getDepartment(bean.getFacId());
            
            dptComboBox.removeAllItems();
            
            for(int i = 0; i < v.size(); i++){
            
                DepartmentBean dptBean = (DepartmentBean) v.elementAt(i);
                
                dptComboBox.addItem(dptBean);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of department
    
    private void getProgram(){
        DepartmentBean bean = (DepartmentBean) dptComboBox.getSelectedItem();
        
        if(bean == null){
            return;
        }
        
        try{
        
            Vector v = DatabaseManager.getProgram(bean.getDptId());
         
            programComboBox.removeAllItems();
            
            for(int i = 0; i < v.size(); i++){
                ProgramBean progBean = (ProgramBean) v.elementAt(i);
                
                programComboBox.addItem(progBean);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of getProgram
    
    private void getBatch(){
    
        ProgramBean bean = (ProgramBean) programComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        try{
        
            Vector v = DatabaseManager.getBatch(bean.getProgId());
            
            batchYearComboBox.removeAllItems();
                      
            for(int i = 0; i < v.size(); i++){
                
                BatchBean batchBean = (BatchBean) v.elementAt(i);
                
                batchYearComboBox.addItem(batchBean);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//end of getBatch
    
    private void getStudent(){
        BatchBean bean = (BatchBean) batchYearComboBox.getSelectedItem();
        
        if(bean == null){
            return;
        }
        
          groupComboBox.setSelectedItem(Decoder.groupDecode(bean.getGroup()));
          shiftComboBox.setSelectedItem(Decoder.shiftDecode(bean.getShift()));
        
        try{
            
           Vector v = DatabaseManager.getStudent(bean.getBatchId());
            
           studentList.setListData(v);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of getStudent
    
    private void getStudentData(){
        StudentBean bean = (StudentBean) studentList.getSelectedValue();
        
        if(bean == null)
            //clear();
            return;
        
        studentIdTextField.setText("" + bean.getStudentId());
        nameTextField.setText(bean.getFatherName());
        fatherNameTextField.setText(bean.getFatherName());
        surnameTextField.setText(bean.getStudentName());
        rollNoTextField.setText(bean.getRollNo());
        emailTextField.setText(bean.getEmail());
        phoneNoTextField.setText(bean.getPhoneNo());
        remarksTextArea.setText(bean.getRemarks());
        genderComboBox.setSelectedItem(Decoder.genderDecode(bean.getGender()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        backBtn = new javax.swing.JLabel();
        clearBtn = new javax.swing.JLabel();
        updateBtn = new javax.swing.JLabel();
        addBtn = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        facComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        dptComboBox = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        programComboBox = new javax.swing.JComboBox();
        batchYearComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        shiftComboBox = new javax.swing.JComboBox();
        groupComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        studentIdTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        rollNoTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fatherNameTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        surnameTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        phoneNoTextField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        home1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(232, 201, 232));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(181, 71, 180));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/student.png"))); // NOI18N
        home.setText("Student");
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
                .addGap(385, 385, 385)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator1.setBackground(new java.awt.Color(96, 83, 150));

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

        jSeparator2.setBackground(new java.awt.Color(96, 83, 150));

        jScrollPane1.setBorder(null);

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

        jLabel9.setBackground(new java.awt.Color(96, 83, 150));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(96, 83, 150));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Department");
        jLabel9.setIconTextGap(3);

        dptComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        dptComboBox.setForeground(new java.awt.Color(96, 83, 150));
        dptComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        dptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptComboBoxActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(96, 83, 150));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(96, 83, 150));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Program");
        jLabel12.setIconTextGap(3);

        programComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        programComboBox.setForeground(new java.awt.Color(96, 83, 150));
        programComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        programComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programComboBoxActionPerformed(evt);
            }
        });

        batchYearComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        batchYearComboBox.setForeground(new java.awt.Color(96, 83, 150));
        batchYearComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        batchYearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchYearComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(96, 83, 150));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 83, 150));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Batch Year");
        jLabel1.setIconTextGap(3);

        jLabel14.setBackground(new java.awt.Color(96, 83, 150));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(96, 83, 150));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Group");
        jLabel14.setIconTextGap(3);

        jLabel11.setBackground(new java.awt.Color(96, 83, 150));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(96, 83, 150));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Shift");
        jLabel11.setIconTextGap(3);

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
        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "General", "Engineering", "Medical", "Commerce" }));
        groupComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        groupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(96, 83, 150));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 83, 150));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student ID");
        jLabel2.setIconTextGap(3);

        studentIdTextField.setEditable(false);
        studentIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        studentIdTextField.setForeground(new java.awt.Color(96, 83, 150));
        studentIdTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        studentIdTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        studentIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdTextFieldActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(96, 83, 150));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(96, 83, 150));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Roll No");
        jLabel18.setIconTextGap(3);

        rollNoTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        rollNoTextField.setForeground(new java.awt.Color(96, 83, 150));
        rollNoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        rollNoTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        jLabel13.setBackground(new java.awt.Color(96, 83, 150));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(96, 83, 150));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Name");
        jLabel13.setIconTextGap(3);

        nameTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(96, 83, 150));
        nameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        nameTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(96, 83, 150));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(96, 83, 150));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Father Name");
        jLabel16.setIconTextGap(3);

        fatherNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        fatherNameTextField.setForeground(new java.awt.Color(96, 83, 150));
        fatherNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        fatherNameTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        jLabel17.setBackground(new java.awt.Color(96, 83, 150));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(96, 83, 150));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Surname");
        jLabel17.setIconTextGap(3);

        surnameTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        surnameTextField.setForeground(new java.awt.Color(96, 83, 150));
        surnameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        surnameTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        jLabel19.setBackground(new java.awt.Color(96, 83, 150));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(96, 83, 150));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Email");
        jLabel19.setIconTextGap(3);

        emailTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(96, 83, 150));
        emailTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        emailTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        jLabel20.setBackground(new java.awt.Color(96, 83, 150));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(96, 83, 150));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Phone No");
        jLabel20.setIconTextGap(3);

        phoneNoTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        phoneNoTextField.setForeground(new java.awt.Color(96, 83, 150));
        phoneNoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        phoneNoTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        genderComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        genderComboBox.setForeground(new java.awt.Color(96, 83, 150));
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        genderComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(96, 83, 150));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(96, 83, 150));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Gender");
        jLabel15.setIconTextGap(3);

        home1.setBackground(new java.awt.Color(255, 255, 255));
        home1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home1.setForeground(new java.awt.Color(96, 83, 150));
        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/studentLightIcon.png"))); // NOI18N
        home1.setText("Students");
        home1.setFocusable(false);
        home1.setIconTextGap(15);
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });

        studentList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        studentList.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        studentList.setForeground(new java.awt.Color(96, 83, 150));
        studentList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                studentListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(studentList);

        remarksTextArea.setColumns(20);
        remarksTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remarksTextArea.setForeground(new java.awt.Color(96, 83, 150));
        remarksTextArea.setRows(5);
        remarksTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        jScrollPane3.setViewportView(remarksTextArea);

        jLabel3.setBackground(new java.awt.Color(96, 83, 150));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 83, 150));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Remarks");
        jLabel3.setIconTextGap(3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel18)
                                .addComponent(jLabel13)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rollNoTextField)
                                .addComponent(nameTextField)
                                .addComponent(fatherNameTextField)
                                .addComponent(surnameTextField)
                                .addComponent(emailTextField)
                                .addComponent(phoneNoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                                .addComponent(studentIdTextField)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12)
                                .addComponent(jLabel1)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel15))))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(groupComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 478, Short.MAX_VALUE)
                                .addComponent(shiftComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(batchYearComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(facComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dptComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(programComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(genderComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(facComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9))
                            .addComponent(dptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(programComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batchYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shiftComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel18)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel13)
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel19)))
                                .addGap(11, 11, 11)
                                .addComponent(jLabel20))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(rollNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(fatherNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(surnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(phoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(home1)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
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
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
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

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked

    }//GEN-LAST:event_backBtnMouseClicked

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        clear();
    }//GEN-LAST:event_clearBtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        updateStudent();
    }//GEN-LAST:event_updateBtnMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        addStudent();
    }//GEN-LAST:event_addBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        deleteStudent();
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void facComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facComboBoxActionPerformed
        getDepartment();
    }//GEN-LAST:event_facComboBoxActionPerformed

    private void dptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptComboBoxActionPerformed
        getProgram();
    }//GEN-LAST:event_dptComboBoxActionPerformed

    private void programComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programComboBoxActionPerformed
        getBatch();
    }//GEN-LAST:event_programComboBoxActionPerformed

    private void batchYearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchYearComboBoxActionPerformed
        getStudent();
    }//GEN-LAST:event_batchYearComboBoxActionPerformed

    private void shiftComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftComboBoxActionPerformed
        
    }//GEN-LAST:event_shiftComboBoxActionPerformed

    private void groupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupComboBoxActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void studentIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdTextFieldActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked

    }//GEN-LAST:event_home1MouseClicked

    private void studentListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_studentListValueChanged
        getStudentData();
    }//GEN-LAST:event_studentListValueChanged

    private void addStudent(){
        BatchBean bean = (BatchBean) batchYearComboBox.getSelectedItem();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select batch in which you want to ad student");
            return;
        }
        
        String rollNo = rollNoTextField.getText();
        String name = nameTextField.getText();
        String fatherName = fatherNameTextField.getText();
        String surname = surnameTextField.getText();
        String email = emailTextField.getText();
        String phoneNo = phoneNoTextField.getText();
        String gender = Encoder.genderEncode((String) genderComboBox.getSelectedItem());
        String remarks = remarksTextArea.getText();
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "student name can't be empty");
        }else
            if(rollNo.equals("")){
                JOptionPane.showMessageDialog(this, "must give Roll No");
            }else
                if(phoneNo.equals("")){
                    JOptionPane.showMessageDialog(this, "phone no is necessary");
                }else{
                    
                    try{
                    
                        int rows = DatabaseManager.addStudent(bean.getBatchId(), rollNo, name, fatherName, surname, gender, phoneNo, email, remarks);
                        
                        if(rows >= 1)
                            JOptionPane.showMessageDialog(this, rows + " Record Inserted");
                        
                            clear();
                            getStudent();
                            
                    }catch(Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                }//end of if else    
    }//end of add student
    
    private void updateStudent(){
    
        StudentBean bean = (StudentBean) studentList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select student which you want to update");
            return;
        }
        
         String rollNo = rollNoTextField.getText();
        String name = nameTextField.getText();
        String fatherName = fatherNameTextField.getText();
        String surname = surnameTextField.getText();
        String email = emailTextField.getText();
        String phoneNo = phoneNoTextField.getText();
        String gender = Encoder.genderEncode((String) genderComboBox.getSelectedItem());
        String remarks = remarksTextArea.getText();
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "student name can't be empty");
        }else
            if(rollNo.equals("")){
                JOptionPane.showMessageDialog(this, "must give Roll No");
            }else
                if(phoneNo.equals("")){
                    JOptionPane.showMessageDialog(this, "phone no is necessary");
                }else{
                    
                    try{
                    
                        int rows = DatabaseManager.updateStudent(bean.getStudentId(), rollNo, name, fatherName, surname, gender, phoneNo, email, remarks);
                        
                        if(rows >= 1)
                            JOptionPane.showMessageDialog(this, rows + " Record Inserted");
                        
                            clear();
                            getStudent();
                            
                    }catch(Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                }//end of if else 
        
    }//end of update student
    
    private void deleteStudent(){
    
        StudentBean bean = (StudentBean) studentList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select student which you want to delete");
            return;
        }
        
        try{
        
            int rows = DatabaseManager.deleteStudent(bean.getStudentId());
            
            if(rows >= 1)
                 JOptionPane.showMessageDialog(this, rows + " Record Deleted");
                 
                 clear();
                 getStudent();
        }catch(Exception e){
            e.printStackTrace();
             JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//end of delete student
    
    private void clear(){
        studentIdTextField.setText(null);
        nameTextField.setText(null);
        fatherNameTextField.setText(null);
        surnameTextField.setText(null);
        rollNoTextField.setText(null);
        emailTextField.setText(null);
        phoneNoTextField.setText(null);
        remarksTextArea.setText(null);
        //genderComboBox.setSelectedItem(Decoder.genderDecode(bean.getGender()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private javax.swing.JLabel backBtn;
    private javax.swing.JComboBox batchYearComboBox;
    private javax.swing.JLabel clearBtn;
    private javax.swing.JLabel deleteBtn;
    private javax.swing.JComboBox dptComboBox;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox facComboBox;
    private javax.swing.JTextField fatherNameTextField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JComboBox groupComboBox;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneNoTextField;
    private javax.swing.JComboBox programComboBox;
    private javax.swing.JTextArea remarksTextArea;
    private javax.swing.JTextField rollNoTextField;
    private javax.swing.JComboBox shiftComboBox;
    private javax.swing.JTextField studentIdTextField;
    private javax.swing.JList studentList;
    private javax.swing.JTextField surnameTextField;
    private javax.swing.JLabel updateBtn;
    // End of variables declaration//GEN-END:variables
}
