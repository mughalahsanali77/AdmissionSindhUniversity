package Frames;

import BeanClasses.*;
import DBConnections.DatabaseManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Book extends javax.swing.JPanel {

    public Book() {
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
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }//end of getDepartment
    
    private void getBook(){
        DepartmentBean bean = (DepartmentBean) dptComboBox.getSelectedItem();
        if(bean==null)
            return;
        
        try{
            Vector v = DatabaseManager.getBook(bean.getDptId());
            
            
            
            bookList.setListData(v);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of getBook
    
    private void getBookData(){
        BookBean bean = (BookBean) bookList.getSelectedValue();
        
        if(bean == null)
            return;
        
        try{
        
            bookIdTextField.setText("" + bean.getBookId());
            bookNameTextField.setText(bean.getBookName());
            authorTextField.setText(bean.getAuthor());
            editorTextField.setText(bean.getAuthor());
            editionVolumeTextField.setText(bean.getEditionVolume());
            yearOfPublishTextField.setText(bean.getYearOfPublish());
            quantityTextField.setText("" + bean.getQuantity());
            isbnTextField.setText("" + bean.getIsbn());
            accessNoTextField.setText("" + bean.getAccessNo());
            purchaseFromTextField.setText(bean.getPurchaseFrom());
            priceTextField.setText("" + bean.getPrice());
            pagesTextField.setText("" + bean.getPages());
            
            DateChooser.setDate(bean.getPurchaseDate());
                        
            remarksTextArea.setText(bean.getRemarks());
            bookCategoryComboBox.setSelectedItem(Decoder.bookCategoryDecode(bean.getBookCategory()));
            languageComboBox.setSelectedItem(Decoder.languageDecode(bean.getLanguage()));
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of getBookData
    
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
        clearBrn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        bookIdTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        home1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookList = new javax.swing.JList();
        languageComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bookCategoryComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        bookNameTextField = new javax.swing.JTextField();
        authorTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        editorTextField = new javax.swing.JTextField();
        editionVolumeTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        yearOfPublishTextField = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        isbnTextField = new javax.swing.JTextField();
        accessNoTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        purchaseFromTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        pagesTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dptComboBox = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        facComboBox = new javax.swing.JComboBox();
        DateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(232, 201, 232));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(181, 71, 180));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/book.png"))); // NOI18N
        home.setText("Book");
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
                .addContainerGap(392, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
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

        jScrollPane3.setBorder(null);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        remarksTextArea.setColumns(20);
        remarksTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remarksTextArea.setForeground(new java.awt.Color(96, 83, 150));
        remarksTextArea.setRows(5);
        remarksTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        jScrollPane1.setViewportView(remarksTextArea);

        bookIdTextField.setEditable(false);
        bookIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bookIdTextField.setForeground(new java.awt.Color(96, 83, 150));
        bookIdTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        bookIdTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        bookIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(96, 83, 150));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 83, 150));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Remarks");
        jLabel3.setIconTextGap(3);

        jLabel1.setBackground(new java.awt.Color(96, 83, 150));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 83, 150));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Id");
        jLabel1.setIconTextGap(3);

        jLabel2.setBackground(new java.awt.Color(96, 83, 150));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 83, 150));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book Name");
        jLabel2.setIconTextGap(3);

        home1.setBackground(new java.awt.Color(255, 255, 255));
        home1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home1.setForeground(new java.awt.Color(96, 83, 150));
        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/book (2).png"))); // NOI18N
        home1.setText("Books");
        home1.setFocusable(false);
        home1.setIconTextGap(15);
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });

        bookList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        bookList.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bookList.setForeground(new java.awt.Color(96, 83, 150));
        bookList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                bookListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(bookList);

        languageComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        languageComboBox.setForeground(new java.awt.Color(96, 83, 150));
        languageComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sindhi", "English", "Urdu", "Arabic", "Persian" }));
        languageComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        languageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(96, 83, 150));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(96, 83, 150));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Language");
        jLabel9.setIconTextGap(3);

        jLabel10.setBackground(new java.awt.Color(96, 83, 150));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(96, 83, 150));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Book Category");
        jLabel10.setIconTextGap(3);

        bookCategoryComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bookCategoryComboBox.setForeground(new java.awt.Color(96, 83, 150));
        bookCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Magzine", "News Paper", "Story", "Histry", "Poem", "Grammer" }));
        bookCategoryComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        bookCategoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookCategoryComboBoxActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(96, 83, 150));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(96, 83, 150));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Author");
        jLabel11.setIconTextGap(3);

        bookNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bookNameTextField.setForeground(new java.awt.Color(96, 83, 150));
        bookNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        bookNameTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        authorTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        authorTextField.setForeground(new java.awt.Color(96, 83, 150));
        authorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        authorTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        jLabel4.setBackground(new java.awt.Color(96, 83, 150));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(96, 83, 150));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Editior");
        jLabel4.setIconTextGap(3);

        editorTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        editorTextField.setForeground(new java.awt.Color(96, 83, 150));
        editorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        editorTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        editorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorTextFieldActionPerformed(evt);
            }
        });

        editionVolumeTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        editionVolumeTextField.setForeground(new java.awt.Color(96, 83, 150));
        editionVolumeTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        editionVolumeTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        jLabel12.setBackground(new java.awt.Color(96, 83, 150));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(96, 83, 150));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Ediation Volume");
        jLabel12.setIconTextGap(3);

        yearOfPublishTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        yearOfPublishTextField.setForeground(new java.awt.Color(96, 83, 150));
        yearOfPublishTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        yearOfPublishTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));
        yearOfPublishTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearOfPublishTextFieldActionPerformed(evt);
            }
        });

        quantityTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        quantityTextField.setForeground(new java.awt.Color(96, 83, 150));
        quantityTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        quantityTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        isbnTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        isbnTextField.setForeground(new java.awt.Color(96, 83, 150));
        isbnTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        isbnTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        accessNoTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        accessNoTextField.setForeground(new java.awt.Color(96, 83, 150));
        accessNoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        accessNoTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        jLabel13.setBackground(new java.awt.Color(96, 83, 150));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(96, 83, 150));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Access No");
        jLabel13.setIconTextGap(3);

        jLabel5.setBackground(new java.awt.Color(96, 83, 150));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(96, 83, 150));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ISBN");
        jLabel5.setIconTextGap(3);

        jLabel14.setBackground(new java.awt.Color(96, 83, 150));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(96, 83, 150));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Quantity");
        jLabel14.setIconTextGap(3);

        jLabel6.setBackground(new java.awt.Color(96, 83, 150));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(96, 83, 150));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Year of Publishing");
        jLabel6.setIconTextGap(3);

        jLabel15.setBackground(new java.awt.Color(96, 83, 150));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(96, 83, 150));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Price");
        jLabel15.setIconTextGap(3);

        jLabel7.setBackground(new java.awt.Color(96, 83, 150));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(96, 83, 150));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Purchase From");
        jLabel7.setIconTextGap(3);

        purchaseFromTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        purchaseFromTextField.setForeground(new java.awt.Color(96, 83, 150));
        purchaseFromTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        purchaseFromTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        priceTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        priceTextField.setForeground(new java.awt.Color(96, 83, 150));
        priceTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        priceTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        pagesTextField.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        pagesTextField.setForeground(new java.awt.Color(96, 83, 150));
        pagesTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        pagesTextField.setDisabledTextColor(new java.awt.Color(96, 83, 150));

        jLabel18.setBackground(new java.awt.Color(96, 83, 150));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(96, 83, 150));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Purchase Date");
        jLabel18.setIconTextGap(3);

        jLabel19.setBackground(new java.awt.Color(96, 83, 150));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(96, 83, 150));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("No Of Pages");
        jLabel19.setIconTextGap(3);

        jLabel16.setBackground(new java.awt.Color(96, 83, 150));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(96, 83, 150));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Department");
        jLabel16.setIconTextGap(3);

        dptComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        dptComboBox.setForeground(new java.awt.Color(96, 83, 150));
        dptComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        dptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptComboBoxActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(96, 83, 150));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(96, 83, 150));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Faculty");
        jLabel20.setIconTextGap(3);

        facComboBox.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        facComboBox.setForeground(new java.awt.Color(96, 83, 150));
        facComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        facComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facComboBoxActionPerformed(evt);
            }
        });

        DateChooser.setBackground(new java.awt.Color(255, 255, 255));
        DateChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150), 2));
        DateChooser.setForeground(new java.awt.Color(96, 83, 150));
        DateChooser.setDateFormatString("dd-MMM-YYYY");
        DateChooser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(91, 91, 91)
                            .addComponent(accessNoTextField))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel14))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yearOfPublishTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(isbnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(facComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel12))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(editionVolumeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel16))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bookCategoryComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dptComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18))
                            .addGap(52, 52, 52)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pagesTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                                .addComponent(priceTextField)
                                .addComponent(purchaseFromTextField)
                                .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(home1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(facComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookCategoryComboBox)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(bookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(editorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(editionVolumeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(yearOfPublishTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(isbnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(accessNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(purchaseFromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(pagesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(116, 116, 116)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel3);

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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBrn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

    }//GEN-LAST:event_homeMouseClicked

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked

    }//GEN-LAST:event_home1MouseClicked

    private void bookCategoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookCategoryComboBoxActionPerformed
        
    }//GEN-LAST:event_bookCategoryComboBoxActionPerformed

    private void languageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageComboBoxActionPerformed
        
    }//GEN-LAST:event_languageComboBoxActionPerformed

    private void bookListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_bookListValueChanged
        getBookData();
    }//GEN-LAST:event_bookListValueChanged

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        try {        
            addBook();
        } catch (ParseException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_addBtnMouseClicked

    private void clearBrnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBrnMouseClicked
        clear();
    }//GEN-LAST:event_clearBrnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        updateBook();
    }//GEN-LAST:event_updateBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        deleteBook();
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void bookIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIdTextFieldActionPerformed

    private void editorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editorTextFieldActionPerformed

    private void dptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptComboBoxActionPerformed
        getBook();
    }//GEN-LAST:event_dptComboBoxActionPerformed

    private void facComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facComboBoxActionPerformed
        getDepartment();
    }//GEN-LAST:event_facComboBoxActionPerformed

    private void yearOfPublishTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearOfPublishTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearOfPublishTextFieldActionPerformed

    private void addBook() throws ParseException{
        DepartmentBean bean = (DepartmentBean) dptComboBox.getSelectedItem();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select department in which you want to add book");
            return;
        }                  
        
        String bookName = bookNameTextField.getText();
        String author = authorTextField.getText();
        String editor = editorTextField.getText();
        String editionVolume = editionVolumeTextField.getText();
        String yearOfPublish = yearOfPublishTextField.getText();
        int quantity = Integer.parseInt("0"+quantityTextField.getText());
        int isbn = Integer.parseInt("0"+isbnTextField.getText());
        int accessNo = Integer.parseInt("0"+accessNoTextField.getText());
        String purchaseFrom = purchaseFromTextField.getText();
        int price = Integer.parseInt("0"+priceTextField.getText());
        int pages = Integer.parseInt("0"+pagesTextField.getText());
        
        //to handel the null point exception 
        if(bookName.equals("") || author.equals("") || editionVolume.equals("") || yearOfPublish.equals("")){
                JOptionPane.showMessageDialog(this, "please fill full form");
                return;
        }else //to handel the null point exception for purchase date purchase date cant be null 
            if(DateChooser.getDate() == null){
                JOptionPane.showMessageDialog(this, "must select purchase Date");
                return;
        }
        
        
        String purchaseDate  = Decoder.getDateFormat(DateChooser.getDate());
            
        String bookCategory = Encoder.bookCategoryEncode((String)bookCategoryComboBox.getSelectedItem());
        String language = Encoder.languageEncode((String)languageComboBox.getSelectedItem());
        String remarks = remarksTextArea.getText();
        try{
            
            int rows = DatabaseManager.addBook(bean.getDptId(), bookName, author, editor, editionVolume, 
                                                yearOfPublish, quantity, isbn, accessNo, purchaseFrom, price,
                                                pages, purchaseDate, bookCategory, language, remarks
                                               );
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(this, rows + " record inserted");
                
                clear();
                getBook();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
              
    }//end of addBook method
    
    private void updateBook(){
        BookBean bean = (BookBean) bookList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select book whihc you wanr to update");
            return;   
        }
        
        String bookName = bookNameTextField.getText();
        String author = authorTextField.getText();
        String editor = editorTextField.getText();
        String editionVolume = editionVolumeTextField.getText();
        String yearOfPublish = yearOfPublishTextField.getText();
        int quantity = Integer.parseInt("0"+quantityTextField.getText());
        int isbn = Integer.parseInt("0"+isbnTextField.getText());
        int accessNo = Integer.parseInt("0"+accessNoTextField.getText());
        String purchaseFrom = purchaseFromTextField.getText();
        int price = Integer.parseInt("0"+priceTextField.getText());
        int pages = Integer.parseInt("0"+pagesTextField.getText());
        
        //to handel the null point exception 
        if(bookName.equals("") || author.equals("") || editionVolume.equals("") || yearOfPublish.equals("")){
                JOptionPane.showMessageDialog(this, "please fill full form");
                return;
        }else //to handel the null point exception for purchase date purchase date cant be null 
            if(DateChooser.getDate() == null){
                JOptionPane.showMessageDialog(this, "must select purchase Date");
                return;
        }
        
        String purchaseDate = Decoder.getDateFormat(DateChooser.getDate());
        
        String bookCategory = Encoder.bookCategoryEncode((String)bookCategoryComboBox.getSelectedItem());
        String language = Encoder.languageEncode((String)languageComboBox.getSelectedItem());
        String remarks = remarksTextArea.getText();
        
        try{
        
            int rows = DatabaseManager.updateBook(bean.getBookId(), bookName, author, editor, editionVolume,
                    yearOfPublish, quantity, isbn, accessNo, purchaseFrom, price, pages, purchaseDate, 
                    bookCategory, language, remarks
                    );
        
            if(rows >= 1)
                JOptionPane.showMessageDialog(this, rows + "rows updated");
            
            clear();
            getBook();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of update book
    
    private void deleteBook(){
        
        BookBean bean = (BookBean) bookList.getSelectedValue();
        
        if(bean == null){
            JOptionPane.showMessageDialog(this, "please select book which you want to delete");
            return;
        }
        try{
        
            int rows = DatabaseManager.deleteBook(bean.getBookId());
            
            if(rows >= 1)
                JOptionPane.showMessageDialog(this, rows + "record deleted");
            
            clear();
            getBook();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end of deleteBook
    
    private void clear(){
        bookIdTextField.setText(null);
        bookNameTextField.setText(null);
        authorTextField.setText(null);
        editorTextField.setText(null);
        editionVolumeTextField.setText(null);
        yearOfPublishTextField.setText(null);
        quantityTextField.setText(null);
        isbnTextField.setText(null);
        accessNoTextField.setText(null);
        purchaseFromTextField.setText(null);
        priceTextField.setText(null);
        pagesTextField.setText(null);
        DateChooser.setDate(null);
        remarksTextArea.setText(null);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTextField accessNoTextField;
    private javax.swing.JLabel addBtn;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JComboBox bookCategoryComboBox;
    private javax.swing.JTextField bookIdTextField;
    private javax.swing.JList bookList;
    private javax.swing.JTextField bookNameTextField;
    private javax.swing.JLabel clearBrn;
    private javax.swing.JLabel deleteBtn;
    private javax.swing.JComboBox dptComboBox;
    private javax.swing.JTextField editionVolumeTextField;
    private javax.swing.JTextField editorTextField;
    private javax.swing.JComboBox facComboBox;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox languageComboBox;
    private javax.swing.JTextField pagesTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField purchaseFromTextField;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JTextArea remarksTextArea;
    private javax.swing.JLabel updateBtn;
    private javax.swing.JTextField yearOfPublishTextField;
    // End of variables declaration//GEN-END:variables
}
