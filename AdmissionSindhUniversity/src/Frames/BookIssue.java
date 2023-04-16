package Frames;

import BeanClasses.*;
import DBConnections.DatabaseManager;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BookIssue extends javax.swing.JPanel {

    public BookIssue() {
        initComponents();
        getDepartment();
        
        studentRadioButton.setSelected(true);
        maleRadioButton.setSelected(false);
        
        if(studentRadioButton.isSelected()){
            getBookIssueByStudent();
            studentRadioButton.setEnabled(false);
        }
    }// constructoe

    
    private void getBookIssueByStudent(){
        StudentBean bean = (StudentBean) rollNoComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        try{
            
            java.util.Vector v = DatabaseManager.getBookIssue(bean.getStudentId());
            
            
                bookList.setListData(v);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of getBookIsssueByStudent
    
    private void getBookIssueDataByDateOfIssue(){
        
        BookIssueBean bean = (BookIssueBean) bookList.getSelectedValue();
        
        if(bean == null)
            return;
        
        bookIssueIdTextField.setText("" + bean.getBookIssueId());
        dateOfIssueDateChooser.setDate(bean.getDateOfIssue());
        dateOfReturnDateChooser.setDate(bean.getDateOfReturn());
        fineTextField.setText(""+bean.getFine());
        remarksTextArea.setText(bean.getRemarks());   
    }//end of getBookIssue data by Date of issue in list
    

    private void getStudentDataByDateOfIssueInList(){
    
        BookIssueBean bookIssueBean = (BookIssueBean) bookList.getSelectedValue();
        
        if(bookIssueBean == null)
            return;
        
        try{
        
            StudentBean studentBean = DatabaseManager.getStudents(bookIssueBean.getStudentId());
            
            studentNameTextField.setText(studentBean.getStudentName());
            fatherNameTextField.setText(studentBean.getFatherName());
            surnameTextField.setText(studentBean.getStudentName());
            
            if(studentBean.getGender().equals("M")){
                maleRadioButton.setSelected(true);
                femaleRadioButton.setSelected(false);
            }
            
            if(studentBean.getGender().equals("F")){
                maleRadioButton.setSelected(false);
                femaleRadioButton.setSelected(true);
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of get studentData by dateOfIssue In list
    
    private void getBookDataByDateOfIssueInList(){
        
        BookIssueBean bean = (BookIssueBean) bookList.getSelectedValue();
        
        if(bean == null)
            return;
        
        try{
            
            BookBean bookBean = DatabaseManager.getBooks(bean.getBookId());
            
            bookNameTextField.setText(bookBean.getBookName());
            authorTextField.setText(bookBean.getAuthor());
            editionTextField.setText(bookBean.getEditionVolume());
            languageTextField.setText(Decoder.languageDecode(bookBean.getLanguage()));
            categoryTextField.setText(Decoder.bookCategoryDecode(bookBean.getBookCategory()));
            accessNoTextField.setText(""+bookBean.getAccessNo());
            yearOfPublishTextField.setText(bookBean.getYearOfPublish());
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of get Book data by date of issue in list
    
    
    private void getBookIssueByBook(){
        BookBean bean = (BookBean) bookComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        try{
            
            Vector v = DatabaseManager.getBookIssued(bean.getBookId());
            
            Vector v2 = new Vector();
            
            for(int i=0; i<v.size(); i++){
                
                BookIssueBean bookIssueBean = (BookIssueBean) v.elementAt(i);
                
                StudentBean studentBean = DatabaseManager.getStudents(bookIssueBean.getStudentId());
                
                v2.addElement(studentBean);
                
                bookList.setListData(v2);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of getBookIssueByBook
        
    private void getBookIssueDataByRollNoInList(){
        
       StudentBean studentBean = (StudentBean) bookList.getSelectedValue();
        
         if(studentBean == null)
            return;
        
        try{
            
            Vector v = DatabaseManager.getBookIssue(studentBean.getStudentId());

            for(int i=0; i<v.size(); i++){

                BookIssueBean bean = (BookIssueBean) v.elementAt(i);

                bookIssueIdTextField.setText("" + bean.getBookIssueId());
                dateOfIssueDateChooser.setDate(bean.getDateOfIssue());
                dateOfReturnDateChooser.setDate(bean.getDateOfReturn());
                fineTextField.setText(""+bean.getFine());
                remarksTextArea.setText(bean.getRemarks());
            }//end of for loop        
        }catch(Exception e){
            e.getMessage();
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
    }//end of getBookIssue data by rollNo in list

    private void getStudentDataByRollNoInList(){
    
        StudentBean bean = null;
        
        if(bookRadioButton.isSelected())
            bean = (StudentBean) bookList.getSelectedValue();
    
        if(bean == null)
            return;
        
        try{
        
            studentNameTextField.setText(bean.getStudentName());
            fatherNameTextField.setText(bean.getFatherName());
            surnameTextField.setText(bean.getStudentName());
            
            if(bean.getGender().equals("M")){
                maleRadioButton.setSelected(true);
                femaleRadioButton.setSelected(false);
            }
            
            if(bean.getGender().equals("F")){
                maleRadioButton.setSelected(false);
                femaleRadioButton.setSelected(true);
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//end of get student data by rollNo in list

    private void getBookDataByRollNoInList(){
    
        StudentBean studentBean = null;
        
        if(bookRadioButton.isSelected())
            studentBean = (StudentBean) bookList.getSelectedValue();
        
        if(studentBean == null)
            return;
        
        try{
        
            BookIssueBean bookIssueBean =  DatabaseManager.getBookIssue2(studentBean.getStudentId());
            
            BookBean bookBean = DatabaseManager.getBooks(bookIssueBean.getBookId());
            
            bookNameTextField.setText(bookBean.getBookName());
            authorTextField.setText(bookBean.getAuthor());
            editionTextField.setText(bookBean.getEditionVolume());
            languageTextField.setText(Decoder.languageDecode(bookBean.getLanguage()));
            categoryTextField.setText(Decoder.bookCategoryDecode(bookBean.getBookCategory()));
            accessNoTextField.setText(""+bookBean.getAccessNo());
            yearOfPublishTextField.setText(bookBean.getYearOfPublish());
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of get book book data by roolNo in List
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        addBtn = new javax.swing.JLabel();
        updateBtn = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JLabel();
        clearBrn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        accessNoTextField = new javax.swing.JTextField();
        languageTextField = new javax.swing.JTextField();
        categoryTextField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        editionTextField = new javax.swing.JTextField();
        yearOfPublishTextField = new javax.swing.JTextField();
        bookComboBox = new javax.swing.JComboBox();
        home2 = new javax.swing.JLabel();
        bookDptComboBox = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        home3 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        bookIssueIdTextField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        studentRadioButton = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        bookRadioButton = new javax.swing.JRadioButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        bookNameTextField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        authorTextField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        femaleRadioButton = new javax.swing.JRadioButton();
        studentNameTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        batchComboBox = new javax.swing.JComboBox();
        shiftTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        rollNoComboBox = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        programComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        dateOfReturnDateChooser = new com.toedter.calendar.JDateChooser();
        dateOfIssueDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        fineTextField = new javax.swing.JTextField();
        home1 = new javax.swing.JLabel();
        fatherNameTextField = new javax.swing.JTextField();
        groupTextField = new javax.swing.JTextField();
        surnameTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        dptComboBox = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(96, 83, 150));

        jPanel1.setBackground(new java.awt.Color(232, 201, 232));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(181, 71, 180));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/bookIssue.png"))); // NOI18N
        home.setText("Book Issue");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        clearBrn.setBackground(new java.awt.Color(255, 255, 255));
        clearBrn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        clearBrn.setForeground(new java.awt.Color(96, 83, 150));
        clearBrn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearBrn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/clear.png"))); // NOI18N
        clearBrn.setText("CLEAR");
        clearBrn.setIconTextGap(3);
        clearBrn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBrnMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(96, 83, 150));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/back.png"))); // NOI18N
        jLabel8.setText("Back");
        jLabel8.setIconTextGap(3);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(null);

        accessNoTextField.setEditable(false);
        accessNoTextField.setBackground(new java.awt.Color(255, 255, 255));
        accessNoTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accessNoTextField.setForeground(new java.awt.Color(96, 83, 150));
        accessNoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        accessNoTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        accessNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessNoTextFieldActionPerformed(evt);
            }
        });

        languageTextField.setEditable(false);
        languageTextField.setBackground(new java.awt.Color(255, 255, 255));
        languageTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        languageTextField.setForeground(new java.awt.Color(96, 83, 150));
        languageTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        languageTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        languageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageTextFieldActionPerformed(evt);
            }
        });

        categoryTextField.setEditable(false);
        categoryTextField.setBackground(new java.awt.Color(255, 255, 255));
        categoryTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        categoryTextField.setForeground(new java.awt.Color(96, 83, 150));
        categoryTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        categoryTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        categoryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryTextFieldActionPerformed(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(96, 83, 150));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(96, 83, 150));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Access No");
        jLabel28.setIconTextGap(3);

        editionTextField.setEditable(false);
        editionTextField.setBackground(new java.awt.Color(255, 255, 255));
        editionTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editionTextField.setForeground(new java.awt.Color(96, 83, 150));
        editionTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        editionTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        editionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editionTextFieldActionPerformed(evt);
            }
        });

        yearOfPublishTextField.setEditable(false);
        yearOfPublishTextField.setBackground(new java.awt.Color(255, 255, 255));
        yearOfPublishTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        yearOfPublishTextField.setForeground(new java.awt.Color(96, 83, 150));
        yearOfPublishTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        yearOfPublishTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        yearOfPublishTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearOfPublishTextFieldActionPerformed(evt);
            }
        });

        bookComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookComboBox.setForeground(new java.awt.Color(96, 83, 150));
        bookComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        bookComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookComboBoxActionPerformed(evt);
            }
        });

        home2.setBackground(new java.awt.Color(255, 255, 255));
        home2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home2.setForeground(new java.awt.Color(181, 71, 180));
        home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/book.png"))); // NOI18N
        home2.setText("Book");
        home2.setFocusable(false);
        home2.setIconTextGap(15);
        home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home2MouseClicked(evt);
            }
        });

        bookDptComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookDptComboBox.setForeground(new java.awt.Color(96, 83, 150));
        bookDptComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        bookDptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookDptComboBoxActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(96, 83, 150));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(96, 83, 150));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Department");
        jLabel25.setIconTextGap(3);

        jLabel34.setBackground(new java.awt.Color(96, 83, 150));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(96, 83, 150));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Boo Issue Id");
        jLabel34.setIconTextGap(3);

        home3.setBackground(new java.awt.Color(255, 255, 255));
        home3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home3.setForeground(new java.awt.Color(181, 71, 180));
        home3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/bookIssue.png"))); // NOI18N
        home3.setText("Book Issue");
        home3.setFocusable(false);
        home3.setIconTextGap(15);
        home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home3MouseClicked(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(96, 83, 150));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(96, 83, 150));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Date Of Issue");
        jLabel37.setIconTextGap(3);

        bookIssueIdTextField.setEditable(false);
        bookIssueIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookIssueIdTextField.setForeground(new java.awt.Color(96, 83, 150));
        bookIssueIdTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        bookIssueIdTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        bookIssueIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIssueIdTextFieldActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        studentRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentRadioButton.setForeground(new java.awt.Color(96, 83, 150));
        studentRadioButton.setText("Studetn");
        studentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRadioButtonActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(96, 83, 150));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(96, 83, 150));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Group");
        jLabel21.setIconTextGap(3);

        jLabel42.setBackground(new java.awt.Color(96, 83, 150));
        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(96, 83, 150));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Search by ");
        jLabel42.setIconTextGap(3);

        jLabel41.setBackground(new java.awt.Color(96, 83, 150));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(96, 83, 150));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Book Name");
        jLabel41.setIconTextGap(3);

        bookRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookRadioButton.setForeground(new java.awt.Color(96, 83, 150));
        bookRadioButton.setText("Book");
        bookRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRadioButtonActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setName(""); // NOI18N
        jSeparator6.setOpaque(true);

        jLabel26.setBackground(new java.awt.Color(96, 83, 150));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(96, 83, 150));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Book Title");
        jLabel26.setIconTextGap(3);

        bookNameTextField.setEditable(false);
        bookNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        bookNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookNameTextField.setForeground(new java.awt.Color(96, 83, 150));
        bookNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        bookNameTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        bookNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameTextFieldActionPerformed(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(96, 83, 150));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(96, 83, 150));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Language");
        jLabel30.setIconTextGap(3);

        jLabel27.setBackground(new java.awt.Color(96, 83, 150));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(96, 83, 150));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Category");
        jLabel27.setIconTextGap(3);

        jLabel36.setBackground(new java.awt.Color(96, 83, 150));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(96, 83, 150));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Edition");
        jLabel36.setIconTextGap(3);

        authorTextField.setEditable(false);
        authorTextField.setBackground(new java.awt.Color(255, 255, 255));
        authorTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        authorTextField.setForeground(new java.awt.Color(96, 83, 150));
        authorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        authorTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        authorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorTextFieldActionPerformed(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(96, 83, 150));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(96, 83, 150));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Year Of Publish");
        jLabel29.setIconTextGap(3);

        femaleRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        femaleRadioButton.setForeground(new java.awt.Color(96, 83, 150));
        femaleRadioButton.setText("Female");
        femaleRadioButton.setEnabled(false);
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        studentNameTextField.setEditable(false);
        studentNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        studentNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentNameTextField.setForeground(new java.awt.Color(96, 83, 150));
        studentNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        studentNameTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        studentNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameTextFieldActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(96, 83, 150));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(96, 83, 150));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Surname");
        jLabel24.setIconTextGap(3);

        maleRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(96, 83, 150));
        maleRadioButton.setText("Male");
        maleRadioButton.setBorder(null);
        maleRadioButton.setEnabled(false);
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(96, 83, 150));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(96, 83, 150));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Roll No");
        jLabel19.setIconTextGap(3);

        batchComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        batchComboBox.setForeground(new java.awt.Color(96, 83, 150));
        batchComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        batchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchComboBoxActionPerformed(evt);
            }
        });

        shiftTextField.setEditable(false);
        shiftTextField.setBackground(new java.awt.Color(255, 255, 255));
        shiftTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        shiftTextField.setForeground(new java.awt.Color(96, 83, 150));
        shiftTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        shiftTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        shiftTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftTextFieldActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(96, 83, 150));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(96, 83, 150));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Shift");
        jLabel20.setIconTextGap(3);

        jLabel17.setBackground(new java.awt.Color(96, 83, 150));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(96, 83, 150));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Program");
        jLabel17.setIconTextGap(3);

        jLabel23.setBackground(new java.awt.Color(96, 83, 150));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(96, 83, 150));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Father Name");
        jLabel23.setIconTextGap(3);

        rollNoComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rollNoComboBox.setForeground(new java.awt.Color(96, 83, 150));
        rollNoComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        rollNoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollNoComboBoxActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(96, 83, 150));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(96, 83, 150));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Department");
        jLabel16.setIconTextGap(3);

        programComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        programComboBox.setForeground(new java.awt.Color(96, 83, 150));
        programComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
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

        jLabel4.setBackground(new java.awt.Color(96, 83, 150));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(96, 83, 150));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Remarks");
        jLabel4.setIconTextGap(3);

        dateOfReturnDateChooser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        dateOfIssueDateChooser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel33.setBackground(new java.awt.Color(96, 83, 150));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(96, 83, 150));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Author");
        jLabel33.setIconTextGap(3);

        bookList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        bookList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookList.setForeground(new java.awt.Color(96, 83, 150));
        bookList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                bookListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(bookList);

        jLabel3.setBackground(new java.awt.Color(96, 83, 150));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 83, 150));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/icons8_event_accepted_tentatively_30px.png"))); // NOI18N
        jLabel3.setText("Date of Issue");
        jLabel3.setIconTextGap(5);

        jLabel40.setBackground(new java.awt.Color(96, 83, 150));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(96, 83, 150));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Fine");
        jLabel40.setIconTextGap(3);

        jLabel38.setBackground(new java.awt.Color(96, 83, 150));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(96, 83, 150));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Date Of Return");
        jLabel38.setIconTextGap(3);

        fineTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fineTextField.setForeground(new java.awt.Color(96, 83, 150));
        fineTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        fineTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        fineTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fineTextFieldActionPerformed(evt);
            }
        });

        home1.setBackground(new java.awt.Color(255, 255, 255));
        home1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home1.setForeground(new java.awt.Color(181, 71, 180));
        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/student.png"))); // NOI18N
        home1.setText("Student");
        home1.setFocusable(false);
        home1.setIconTextGap(15);
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });

        fatherNameTextField.setEditable(false);
        fatherNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        fatherNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fatherNameTextField.setForeground(new java.awt.Color(96, 83, 150));
        fatherNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        fatherNameTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        fatherNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatherNameTextFieldActionPerformed(evt);
            }
        });

        groupTextField.setEditable(false);
        groupTextField.setBackground(new java.awt.Color(255, 255, 255));
        groupTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        groupTextField.setForeground(new java.awt.Color(96, 83, 150));
        groupTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        groupTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        groupTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupTextFieldActionPerformed(evt);
            }
        });

        surnameTextField.setEditable(false);
        surnameTextField.setBackground(new java.awt.Color(255, 255, 255));
        surnameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        surnameTextField.setForeground(new java.awt.Color(96, 83, 150));
        surnameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        surnameTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        surnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameTextFieldActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(96, 83, 150));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(96, 83, 150));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Batch");
        jLabel18.setIconTextGap(3);

        dptComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dptComboBox.setForeground(new java.awt.Color(96, 83, 150));
        dptComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        dptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptComboBoxActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(96, 83, 150));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(96, 83, 150));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Name");
        jLabel22.setIconTextGap(3);

        remarksTextArea.setColumns(20);
        remarksTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remarksTextArea.setForeground(new java.awt.Color(96, 83, 150));
        remarksTextArea.setRows(5);
        remarksTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        jScrollPane3.setViewportView(remarksTextArea);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(96, 83, 150));
        jCheckBox1.setText("All");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(batchComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 291, Short.MAX_VALUE)
                                    .addComponent(programComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dptComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rollNoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(shiftTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(groupTextField)
                                    .addComponent(studentNameTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fatherNameTextField)
                                    .addComponent(surnameTextField))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(home1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(home2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel36)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel26)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29))))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editionTextField)
                            .addComponent(bookDptComboBox, 0, 292, Short.MAX_VALUE)
                            .addComponent(bookComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookNameTextField)
                            .addComponent(authorTextField)
                            .addComponent(languageTextField)
                            .addComponent(categoryTextField)
                            .addComponent(accessNoTextField)
                            .addComponent(yearOfPublishTextField))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(home3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel38))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateOfReturnDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel37))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookIssueIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateOfIssueDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentRadioButton)
                                    .addComponent(bookRadioButton)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jLabel42))))))
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator5)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home1))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(dptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(programComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rollNoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shiftTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(fatherNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(bookDptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(bookComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(languageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(categoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accessNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(yearOfPublishTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(home3)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(bookIssueIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateOfIssueDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(dateOfReturnDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(fineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel42)
                                .addGap(1, 1, 1)
                                .addComponent(studentRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bookRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(addBtn)
                .addGap(50, 50, 50)
                .addComponent(updateBtn)
                .addGap(50, 50, 50)
                .addComponent(deleteBtn)
                .addGap(50, 50, 50)
                .addComponent(clearBrn)
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBrn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

    }//GEN-LAST:event_homeMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        addBookIssue();
    }//GEN-LAST:event_addBtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        try {
            updateBookIssue();
        } catch (Exception ex) {
            Logger.getLogger(BookIssue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        try {
            deleteBookIssue();
        } catch (Exception ex) {
            Logger.getLogger(BookIssue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void clearBrnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBrnMouseClicked
        clear();
    }//GEN-LAST:event_clearBrnMouseClicked

    private void accessNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accessNoTextFieldActionPerformed

    private void languageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageTextFieldActionPerformed

    private void categoryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryTextFieldActionPerformed

    private void editionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editionTextFieldActionPerformed

    private void yearOfPublishTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearOfPublishTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearOfPublishTextFieldActionPerformed

    private void bookComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookComboBoxActionPerformed
//       getBookData();
       
       if(bookRadioButton.isSelected())
           getBookIssueByBook();
    }//GEN-LAST:event_bookComboBoxActionPerformed

    private void home2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home2MouseClicked

    private void bookDptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookDptComboBoxActionPerformed
        getBook();
    }//GEN-LAST:event_bookDptComboBoxActionPerformed

    private void bookIssueIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIssueIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIssueIdTextFieldActionPerformed

    private void studentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRadioButtonActionPerformed
        if(studentRadioButton.isSelected())
            getBookIssueByStudent();
        
        studentRadioButton.setEnabled(false);
        bookRadioButton.setEnabled(true);
        
        bookRadioButton.setSelected(false);
    }//GEN-LAST:event_studentRadioButtonActionPerformed

    private void bookRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRadioButtonActionPerformed
        if(bookRadioButton.isSelected())
            getBookIssueByBook();
        
        studentRadioButton.setEnabled(true);
        bookRadioButton.setEnabled(false);
        
        studentRadioButton.setSelected(false);
    }//GEN-LAST:event_bookRadioButtonActionPerformed

    private void bookNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameTextFieldActionPerformed

    private void authorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorTextFieldActionPerformed

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        maleRadioButton.setSelected(false);
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void studentNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNameTextFieldActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void batchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchComboBoxActionPerformed
        getStudent();
    }//GEN-LAST:event_batchComboBoxActionPerformed

    private void shiftTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shiftTextFieldActionPerformed

    private void rollNoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollNoComboBoxActionPerformed
        getStudentData();
       if(studentRadioButton.isSelected())
               getBookIssueByStudent();
    }//GEN-LAST:event_rollNoComboBoxActionPerformed

    private void programComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_programComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_programComboBoxItemStateChanged

    private void programComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programComboBoxActionPerformed
        getBatch();
    }//GEN-LAST:event_programComboBoxActionPerformed

    private void bookListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_bookListValueChanged
        if(studentRadioButton.isSelected()){
            getBookIssueDataByDateOfIssue();
            getStudentDataByDateOfIssueInList();
            getBookDataByDateOfIssueInList();
        }
        
        if(bookRadioButton.isSelected()){
            getBookIssueDataByRollNoInList();
            getStudentDataByRollNoInList();
            getBookDataByRollNoInList();
        }
       // getBookDataByList();
        //getStudentDataByList();
    }//GEN-LAST:event_bookListValueChanged

    private void fineTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fineTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fineTextFieldActionPerformed

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home1MouseClicked

    private void fatherNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatherNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fatherNameTextFieldActionPerformed

    private void groupTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupTextFieldActionPerformed

    private void surnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameTextFieldActionPerformed

    private void dptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptComboBoxActionPerformed
        getProgram();
    }//GEN-LAST:event_dptComboBoxActionPerformed

    private void home3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    }//GEN-LAST:event_jLabel8MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accessNoTextField;
    private javax.swing.JLabel addBtn;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JComboBox batchComboBox;
    private javax.swing.JComboBox bookComboBox;
    private javax.swing.JComboBox bookDptComboBox;
    private javax.swing.JTextField bookIssueIdTextField;
    private javax.swing.JList bookList;
    private javax.swing.JTextField bookNameTextField;
    private javax.swing.JRadioButton bookRadioButton;
    private javax.swing.JTextField categoryTextField;
    private javax.swing.JLabel clearBrn;
    private com.toedter.calendar.JDateChooser dateOfIssueDateChooser;
    private com.toedter.calendar.JDateChooser dateOfReturnDateChooser;
    private javax.swing.JLabel deleteBtn;
    private javax.swing.JComboBox dptComboBox;
    private javax.swing.JTextField editionTextField;
    private javax.swing.JTextField fatherNameTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JTextField fineTextField;
    private javax.swing.JTextField groupTextField;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JLabel home2;
    private javax.swing.JLabel home3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField languageTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JComboBox programComboBox;
    private javax.swing.JTextArea remarksTextArea;
    private javax.swing.JComboBox rollNoComboBox;
    private javax.swing.JTextField shiftTextField;
    private javax.swing.JTextField studentNameTextField;
    private javax.swing.JRadioButton studentRadioButton;
    private javax.swing.JTextField surnameTextField;
    private javax.swing.JLabel updateBtn;
    private javax.swing.JTextField yearOfPublishTextField;
    // End of variables declaration//GEN-END:variables

    
    private void getDepartment(){
        try{
        
            java.util.Vector v = DatabaseManager.getDepartment();
            
            for(int i = 0; i < v.size(); i++){
                DepartmentBean bean = (DepartmentBean) v.elementAt(i);
                
                dptComboBox.addItem(bean);
                bookDptComboBox.addItem(bean);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of get department
    
    private void getProgram(){
    
        DepartmentBean bean = (DepartmentBean) dptComboBox.getSelectedItem();
        
        if(bean == null){
            return;
        }
         
        
        try{
            
            java.util.Vector v = DatabaseManager.getProgram(bean.getDptId());
            
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

    private  void getBatch(){
        
        ProgramBean bean = (ProgramBean) programComboBox.getSelectedItem();
        
        if(bean == null){
            return;
        }
        try{
        
            java.util.Vector v = DatabaseManager.getBatch(bean.getProgId());
            
            batchComboBox.removeAllItems();
            
            for(int i = 0; i < v.size(); i++){
            
                BatchBean batchBean = (BatchBean) v.elementAt(i);
                
                batchComboBox.addItem(batchBean);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of getBatch

    private void getStudent(){
        
        BatchBean bean = (BatchBean) batchComboBox.getSelectedItem();
        
        if(bean == null){
            return;
        }
        
        getDepartment();
        
        shiftTextField.setText(Decoder.shiftDecode(bean.getShift()));
        groupTextField.setText(Decoder.groupDecode(bean.getGroup()));
        
        try{
            
            java.util.Vector v = DatabaseManager.getStudent(bean.getBatchId());
            
            rollNoComboBox.removeAllItems();
            
            for(int i = 0; i < v.size(); i++){
                
                StudentBean studentBean = (StudentBean) v.elementAt(i);
                
                rollNoComboBox.addItem(studentBean);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        
    }//end of getStudent
    
    private void getStudentData(){
        StudentBean bean = (StudentBean) rollNoComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        studentNameTextField.setText(bean.getStudentName());
        fatherNameTextField.setText(bean.getFatherName());
        surnameTextField.setText(bean.getSurname());
        if(bean.getGender().equals("M")){
            maleRadioButton.setSelected(true);
            femaleRadioButton.setSelected(false);
        }
        
        if(bean.getGender().equals("F")){
            maleRadioButton.setSelected(false);
            femaleRadioButton.setSelected(true);
        }
    }//end of get student Dtat
    
    
    private void getBook(){
        DepartmentBean bean = (DepartmentBean) bookDptComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        try{
        
            java.util.Vector v = DatabaseManager.getBook(bean.getDptId());
            
            bookComboBox.removeAllItems();
            
            for(int i = 0; i < v.size(); i++){
                BookBean bookBean = (BookBean) v.elementAt(i);
                
                bookComboBox.addItem(bookBean);
            }
            
        }catch(Exception e){
            e.getMessage();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of get book

    
    private void getBookData(){
        
        BookBean bean = (BookBean) bookComboBox.getSelectedItem();
        
        if(bean == null)
            return;
        
        bookNameTextField.setText(bean.getBookName());
        authorTextField.setText(bean.getAuthor());
        editionTextField.setText(bean.getEditionVolume());
        categoryTextField.setText(Decoder.bookCategoryDecode(bean.getBookCategory()));
        languageTextField.setText(Decoder.languageDecode(bean.getLanguage()));
        yearOfPublishTextField.setText(bean.getYearOfPublish());
        accessNoTextField.setText("" + bean.getAccessNo());
        
    }//end of getBookData
    
    
    private void addBookIssue(){
        
        StudentBean studentBean = (StudentBean) rollNoComboBox.getSelectedItem(); 
        if(studentBean == null)
          return;
        
       BookBean bookBean = (BookBean) bookComboBox.getSelectedItem();
       if(bookBean == null)
          return;
        
       
       if(dateOfIssueDateChooser.getDate() == null){
            JOptionPane.showMessageDialog(this, "please must select date of issue");
            return;
        }
       
        String dateOfIssue = Decoder.getDateFormat(dateOfIssueDateChooser.getDate());
        String dateOfReturn;
        int fine = Integer.parseInt("0"+fineTextField.getText());
        String remarks = remarksTextArea.getText();
        
        
        //date format cant support null value thats why i use that tric
        //go to date format and inslize it null if it is == "" <- this
        if(dateOfReturnDateChooser.getDate() == null){
            dateOfReturn = "";
        }else{
            dateOfReturn = Decoder.getDateFormat(dateOfReturnDateChooser.getDate());
        }
        
        try{
        
            int rows = DatabaseManager.addBookIssue(studentBean.getStudentId(), bookBean.getBookId(), dateOfIssue, dateOfReturn, fine, remarks);
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(this, rows + " record Inserted");
            
            clear();
            
            if(studentRadioButton.isSelected())
                getBookIssueByStudent();
            
            if(bookRadioButton.isSelected())
                getBookIssueByBook();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of add BOOk Issue
    
    
    private void updateBookIssue() throws Exception{
        BookIssueBean bean = null;
        
        if(studentRadioButton.isSelected())
            bean = (BookIssueBean) bookList.getSelectedValue();
        
        if(bookRadioButton.isSelected()){
            StudentBean studentBean = (StudentBean) bookList.getSelectedValue();
            bean = DatabaseManager.getBookIssue2(studentBean.getStudentId());
        }
        
        if(bean == null)
            return;
       
        if(dateOfIssueDateChooser.getDate() == null){
            JOptionPane.showMessageDialog(this, "date of issue cant be null");
            
            if(studentRadioButton.isSelected())
                getBookIssueByStudent();
            
            if(bookRadioButton.isSelected())
                getBookIssueByBook();
            return;
        }
        
        String dateOfIssue = Decoder.getDateFormat(dateOfIssueDateChooser.getDate()); 
        String dateOfReturn;
        int fine = Integer.parseInt("0"+fineTextField.getText());
        String remarks = remarksTextArea.getText();
        
        if(dateOfReturnDateChooser.getDate() == null){
            dateOfReturn = "";
        }else{
            dateOfReturn = Decoder.getDateFormat(dateOfReturnDateChooser.getDate());
        }
        
        try{
        
            int rows = DatabaseManager.updateBookIssue(bean.getBookIssueId(), dateOfIssue, dateOfReturn, fine, remarks);
           
            if(rows >= 1)
                JOptionPane.showMessageDialog(this, rows + " record updated");
            
            clear();
            
            if(studentRadioButton.isSelected())
                getBookIssueByStudent();
            
            if(bookRadioButton.isSelected())
                getBookIssueByBook();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of updateBookIssue

    
        private void deleteBookIssue() throws Exception{
    
        BookIssueBean bean = null;
         
        if(studentRadioButton.isSelected())
            bean = (BookIssueBean) bookList.getSelectedValue();
        
        if(bookRadioButton.isSelected()){
            StudentBean studentBean = (StudentBean) bookList.getSelectedValue();
            bean = DatabaseManager.getBookIssue2(studentBean.getStudentId());
        }
        
        if(bean == null)
            return;
       
        try{
            
            int rows = DatabaseManager.deleteBookIssue(bean.getBookIssueId());
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(this, rows + " record deleted");
            
            clear();
            
            if(studentRadioButton.isSelected()){
                getBookIssueByStudent();
            }
            
            if(bookRadioButton.isSelected()){
                getBookIssueByBook();
            }
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }    
    }//end of delete bookIssue

    

    private void clear(){
        bookIssueIdTextField.setText(null);
        dateOfIssueDateChooser.setDate(null);
        dateOfReturnDateChooser.setDate(null);
        fineTextField.setText(null);
        remarksTextArea.setText(null);
    }//end of clear    
}
