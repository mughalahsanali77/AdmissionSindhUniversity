package Frames;


import java.awt.*;
import javax.swing.*;

public class DashBoard extends javax.swing.JFrame {

    public DashBoard() {
        initComponents();
        setLocationRelativeTo(null);
        //make program fit accourding to screan
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getHome();
        
        //jLabel2.setBackground(new Color(20,10,220,20));
        //ImageIcon icon = new ImageIcon("exitGreenIcon.png");
        //ImageIcon x = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("homeGreenIcon.png")));
        //Icon x = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("batchGreenIcon.png")));
       //exitButton.setIcon(x);
    }
    
    
    
      private void getHome(){
         mainPanel.removeAll();
         mainPanel.repaint();
         mainPanel.revalidate();
         mainPanel.add(new Home());
         onClick(homeBtn);
         homeIndicator.setOpaque(true);
     } 
    
    private void getFaculty(){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(new Faculty());
    }
    
    private void getDepartment(){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(new Department());
    }
    
    private void getProgram(){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(new Program());
    }
    
    private void getBatch(){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(new Batch());
    }
    
     private void getStudent(){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(new Student());
    }
     
     
     private void getBook(){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(new Book());
    }
     
    private void getBookIssue(){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(new BookIssue());
    }
    
    private void getDefaulterStudents(){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(new DefaulterStudents());
    }
    
    
    
    
    private void onClick(JPanel panel){
        panel.setBackground(new Color(232, 201, 232));
    }
    
    private void onLeave(JPanel panel){
        panel.setBackground(Color.white);
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JPanel();
        homeIndicator = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        facBtn = new javax.swing.JPanel();
        facultyIndicator = new javax.swing.JPanel();
        facultyButton = new javax.swing.JLabel();
        dptBtn = new javax.swing.JPanel();
        deptIndicator = new javax.swing.JPanel();
        dptButton = new javax.swing.JLabel();
        progBtn = new javax.swing.JPanel();
        programIndicator = new javax.swing.JPanel();
        programButton = new javax.swing.JLabel();
        batchBtn = new javax.swing.JPanel();
        batchIndicator = new javax.swing.JPanel();
        batchButton = new javax.swing.JLabel();
        studentBtn = new javax.swing.JPanel();
        studentIndicator = new javax.swing.JPanel();
        studentButton = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitIndicator = new javax.swing.JPanel();
        exitButton = new javax.swing.JLabel();
        dashbard = new javax.swing.JPanel();
        exitButton1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bookBtn = new javax.swing.JPanel();
        bookIndicator = new javax.swing.JPanel();
        bookButton = new javax.swing.JLabel();
        bookIssueBtn = new javax.swing.JPanel();
        bookIssueIndicator = new javax.swing.JPanel();
        bookIssueButton = new javax.swing.JLabel();
        defaulterStudentsBtn = new javax.swing.JPanel();
        defaulterStudentsIndicator = new javax.swing.JPanel();
        defaulterStudentsButton = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150)));
        jPanel3.setForeground(new java.awt.Color(51, 51, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(255, 255, 255));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/icons8_shutdown_40px.png"))); // NOI18N
        closeButton.setIconTextGap(0);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(116, 57, 195));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/icons8_university_campus_40px.png"))); // NOI18N
        jLabel1.setText("University Of Sindh");

        jSeparator2.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 952, Short.MAX_VALUE)
                .addComponent(closeButton))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150)));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        homeBtn.setBackground(new java.awt.Color(255, 255, 255));
        homeBtn.setVerifyInputWhenFocusTarget(false);
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });

        homeIndicator.setBackground(new java.awt.Color(204, 0, 204));
        homeIndicator.setForeground(new java.awt.Color(181, 71, 180));
        homeIndicator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeIndicator.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout homeIndicatorLayout = new javax.swing.GroupLayout(homeIndicator);
        homeIndicator.setLayout(homeIndicatorLayout);
        homeIndicatorLayout.setHorizontalGroup(
            homeIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        homeIndicatorLayout.setVerticalGroup(
            homeIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        homeButton.setForeground(new java.awt.Color(96, 83, 150));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/homeLightIcon.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setFocusable(false);
        homeButton.setIconTextGap(15);
        homeButton.setVerifyInputWhenFocusTarget(false);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homeBtnLayout = new javax.swing.GroupLayout(homeBtn);
        homeBtn.setLayout(homeBtnLayout);
        homeBtnLayout.setHorizontalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBtnLayout.createSequentialGroup()
                .addComponent(homeIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeBtnLayout.setVerticalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        facBtn.setBackground(new java.awt.Color(255, 255, 255));
        facBtn.setVerifyInputWhenFocusTarget(false);
        facBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facBtnMouseClicked(evt);
            }
        });

        facultyIndicator.setBackground(new java.awt.Color(204, 0, 204));
        facultyIndicator.setForeground(new java.awt.Color(181, 71, 180));
        facultyIndicator.setOpaque(false);
        facultyIndicator.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout facultyIndicatorLayout = new javax.swing.GroupLayout(facultyIndicator);
        facultyIndicator.setLayout(facultyIndicatorLayout);
        facultyIndicatorLayout.setHorizontalGroup(
            facultyIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        facultyIndicatorLayout.setVerticalGroup(
            facultyIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        facultyButton.setBackground(new java.awt.Color(255, 255, 255));
        facultyButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        facultyButton.setForeground(new java.awt.Color(96, 83, 150));
        facultyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/facultyLightIcon.png"))); // NOI18N
        facultyButton.setText("Faculty");
        facultyButton.setFocusable(false);
        facultyButton.setIconTextGap(15);
        facultyButton.setVerifyInputWhenFocusTarget(false);
        facultyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facultyButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout facBtnLayout = new javax.swing.GroupLayout(facBtn);
        facBtn.setLayout(facBtnLayout);
        facBtnLayout.setHorizontalGroup(
            facBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facBtnLayout.createSequentialGroup()
                .addComponent(facultyIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(facultyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        facBtnLayout.setVerticalGroup(
            facBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(facultyIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(facultyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dptBtn.setBackground(new java.awt.Color(255, 255, 255));
        dptBtn.setVerifyInputWhenFocusTarget(false);
        dptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dptBtnMouseClicked(evt);
            }
        });

        deptIndicator.setBackground(new java.awt.Color(204, 0, 204));
        deptIndicator.setForeground(new java.awt.Color(181, 71, 180));
        deptIndicator.setOpaque(false);
        deptIndicator.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout deptIndicatorLayout = new javax.swing.GroupLayout(deptIndicator);
        deptIndicator.setLayout(deptIndicatorLayout);
        deptIndicatorLayout.setHorizontalGroup(
            deptIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        deptIndicatorLayout.setVerticalGroup(
            deptIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        dptButton.setBackground(new java.awt.Color(255, 255, 255));
        dptButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dptButton.setForeground(new java.awt.Color(96, 83, 150));
        dptButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/dptLightIcon.png"))); // NOI18N
        dptButton.setText("Department");
        dptButton.setFocusable(false);
        dptButton.setIconTextGap(15);
        dptButton.setVerifyInputWhenFocusTarget(false);
        dptButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dptButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dptBtnLayout = new javax.swing.GroupLayout(dptBtn);
        dptBtn.setLayout(dptBtnLayout);
        dptBtnLayout.setHorizontalGroup(
            dptBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dptBtnLayout.createSequentialGroup()
                .addComponent(deptIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dptBtnLayout.setVerticalGroup(
            dptBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deptIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(dptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        progBtn.setBackground(new java.awt.Color(255, 255, 255));
        progBtn.setVerifyInputWhenFocusTarget(false);

        programIndicator.setBackground(new java.awt.Color(204, 0, 204));
        programIndicator.setForeground(new java.awt.Color(181, 71, 180));
        programIndicator.setOpaque(false);
        programIndicator.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout programIndicatorLayout = new javax.swing.GroupLayout(programIndicator);
        programIndicator.setLayout(programIndicatorLayout);
        programIndicatorLayout.setHorizontalGroup(
            programIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        programIndicatorLayout.setVerticalGroup(
            programIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        programButton.setBackground(new java.awt.Color(255, 255, 255));
        programButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        programButton.setForeground(new java.awt.Color(96, 83, 150));
        programButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/programLightIcon.png"))); // NOI18N
        programButton.setText("Program");
        programButton.setFocusable(false);
        programButton.setIconTextGap(15);
        programButton.setVerifyInputWhenFocusTarget(false);
        programButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout progBtnLayout = new javax.swing.GroupLayout(progBtn);
        progBtn.setLayout(progBtnLayout);
        progBtnLayout.setHorizontalGroup(
            progBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(progBtnLayout.createSequentialGroup()
                .addComponent(programIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(programButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        progBtnLayout.setVerticalGroup(
            progBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(programIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(programButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        batchBtn.setBackground(new java.awt.Color(255, 255, 255));
        batchBtn.setVerifyInputWhenFocusTarget(false);

        batchIndicator.setBackground(new java.awt.Color(204, 0, 204));
        batchIndicator.setForeground(new java.awt.Color(181, 71, 180));
        batchIndicator.setOpaque(false);
        batchIndicator.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout batchIndicatorLayout = new javax.swing.GroupLayout(batchIndicator);
        batchIndicator.setLayout(batchIndicatorLayout);
        batchIndicatorLayout.setHorizontalGroup(
            batchIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        batchIndicatorLayout.setVerticalGroup(
            batchIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        batchButton.setBackground(new java.awt.Color(255, 255, 255));
        batchButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        batchButton.setForeground(new java.awt.Color(96, 83, 150));
        batchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/batchLightIcon.png"))); // NOI18N
        batchButton.setText("Batch");
        batchButton.setFocusable(false);
        batchButton.setIconTextGap(15);
        batchButton.setVerifyInputWhenFocusTarget(false);
        batchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batchButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout batchBtnLayout = new javax.swing.GroupLayout(batchBtn);
        batchBtn.setLayout(batchBtnLayout);
        batchBtnLayout.setHorizontalGroup(
            batchBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(batchBtnLayout.createSequentialGroup()
                .addComponent(batchIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(batchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        batchBtnLayout.setVerticalGroup(
            batchBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(batchIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(batchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        studentBtn.setBackground(new java.awt.Color(255, 255, 255));
        studentBtn.setVerifyInputWhenFocusTarget(false);

        studentIndicator.setBackground(new java.awt.Color(204, 0, 204));
        studentIndicator.setForeground(new java.awt.Color(181, 71, 180));
        studentIndicator.setOpaque(false);
        studentIndicator.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout studentIndicatorLayout = new javax.swing.GroupLayout(studentIndicator);
        studentIndicator.setLayout(studentIndicatorLayout);
        studentIndicatorLayout.setHorizontalGroup(
            studentIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        studentIndicatorLayout.setVerticalGroup(
            studentIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        studentButton.setBackground(new java.awt.Color(255, 255, 255));
        studentButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        studentButton.setForeground(new java.awt.Color(96, 83, 150));
        studentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/studentLightIcon.png"))); // NOI18N
        studentButton.setText("Student");
        studentButton.setFocusable(false);
        studentButton.setIconTextGap(15);
        studentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout studentBtnLayout = new javax.swing.GroupLayout(studentBtn);
        studentBtn.setLayout(studentBtnLayout);
        studentBtnLayout.setHorizontalGroup(
            studentBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentBtnLayout.createSequentialGroup()
                .addComponent(studentIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(studentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        studentBtnLayout.setVerticalGroup(
            studentBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(studentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitIndicator.setBackground(new java.awt.Color(204, 0, 204));
        exitIndicator.setForeground(new java.awt.Color(181, 71, 180));
        exitIndicator.setOpaque(false);

        javax.swing.GroupLayout exitIndicatorLayout = new javax.swing.GroupLayout(exitIndicator);
        exitIndicator.setLayout(exitIndicatorLayout);
        exitIndicatorLayout.setHorizontalGroup(
            exitIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        exitIndicatorLayout.setVerticalGroup(
            exitIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitButton.setForeground(new java.awt.Color(96, 83, 150));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/exitLightIco .png"))); // NOI18N
        exitButton.setText("Exit");
        exitButton.setFocusable(false);
        exitButton.setIconTextGap(15);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(exitIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        exitButton1.setBackground(new java.awt.Color(232, 201, 232));
        exitButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitButton1.setForeground(new java.awt.Color(96, 83, 150));
        exitButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/dashboardLightIcon.png"))); // NOI18N
        exitButton1.setText("Dashboard");
        exitButton1.setDoubleBuffered(true);
        exitButton1.setIconTextGap(15);
        exitButton1.setOpaque(true);

        javax.swing.GroupLayout dashbardLayout = new javax.swing.GroupLayout(dashbard);
        dashbard.setLayout(dashbardLayout);
        dashbardLayout.setHorizontalGroup(
            dashbardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashbardLayout.createSequentialGroup()
                .addComponent(exitButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        dashbardLayout.setVerticalGroup(
            dashbardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashbardLayout.createSequentialGroup()
                .addComponent(exitButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jSeparator1.setBackground(new java.awt.Color(96, 83, 150));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        bookBtn.setBackground(new java.awt.Color(255, 255, 255));
        bookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBtnMouseClicked(evt);
            }
        });

        bookIndicator.setBackground(new java.awt.Color(204, 0, 204));
        bookIndicator.setForeground(new java.awt.Color(181, 71, 180));
        bookIndicator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bookIndicator.setOpaque(false);

        javax.swing.GroupLayout bookIndicatorLayout = new javax.swing.GroupLayout(bookIndicator);
        bookIndicator.setLayout(bookIndicatorLayout);
        bookIndicatorLayout.setHorizontalGroup(
            bookIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        bookIndicatorLayout.setVerticalGroup(
            bookIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bookButton.setBackground(new java.awt.Color(255, 255, 255));
        bookButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bookButton.setForeground(new java.awt.Color(96, 83, 150));
        bookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/book (2).png"))); // NOI18N
        bookButton.setText("Book");
        bookButton.setFocusable(false);
        bookButton.setIconTextGap(15);
        bookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bookBtnLayout = new javax.swing.GroupLayout(bookBtn);
        bookBtn.setLayout(bookBtnLayout);
        bookBtnLayout.setHorizontalGroup(
            bookBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookBtnLayout.createSequentialGroup()
                .addComponent(bookIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bookBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookBtnLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bookButton, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
        );
        bookBtnLayout.setVerticalGroup(
            bookBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bookBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bookButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        bookIssueBtn.setBackground(new java.awt.Color(255, 255, 255));
        bookIssueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookIssueBtnMouseClicked(evt);
            }
        });

        bookIssueIndicator.setBackground(new java.awt.Color(204, 0, 204));
        bookIssueIndicator.setForeground(new java.awt.Color(181, 71, 180));
        bookIssueIndicator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bookIssueIndicator.setOpaque(false);

        javax.swing.GroupLayout bookIssueIndicatorLayout = new javax.swing.GroupLayout(bookIssueIndicator);
        bookIssueIndicator.setLayout(bookIssueIndicatorLayout);
        bookIssueIndicatorLayout.setHorizontalGroup(
            bookIssueIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        bookIssueIndicatorLayout.setVerticalGroup(
            bookIssueIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bookIssueButton.setBackground(new java.awt.Color(255, 255, 255));
        bookIssueButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bookIssueButton.setForeground(new java.awt.Color(96, 83, 150));
        bookIssueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/bookIssue2.png"))); // NOI18N
        bookIssueButton.setText("Book Issue");
        bookIssueButton.setFocusable(false);
        bookIssueButton.setIconTextGap(15);
        bookIssueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookIssueButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bookIssueBtnLayout = new javax.swing.GroupLayout(bookIssueBtn);
        bookIssueBtn.setLayout(bookIssueBtnLayout);
        bookIssueBtnLayout.setHorizontalGroup(
            bookIssueBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookIssueBtnLayout.createSequentialGroup()
                .addComponent(bookIssueIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bookIssueBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bookIssueBtnLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bookIssueButton, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
        );
        bookIssueBtnLayout.setVerticalGroup(
            bookIssueBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookIssueIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bookIssueBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bookIssueButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        defaulterStudentsBtn.setBackground(new java.awt.Color(255, 255, 255));
        defaulterStudentsBtn.setVerifyInputWhenFocusTarget(false);
        defaulterStudentsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                defaulterStudentsBtnMouseClicked(evt);
            }
        });

        defaulterStudentsIndicator.setBackground(new java.awt.Color(204, 0, 204));
        defaulterStudentsIndicator.setForeground(new java.awt.Color(181, 71, 180));
        defaulterStudentsIndicator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        defaulterStudentsIndicator.setOpaque(false);
        defaulterStudentsIndicator.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout defaulterStudentsIndicatorLayout = new javax.swing.GroupLayout(defaulterStudentsIndicator);
        defaulterStudentsIndicator.setLayout(defaulterStudentsIndicatorLayout);
        defaulterStudentsIndicatorLayout.setHorizontalGroup(
            defaulterStudentsIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        defaulterStudentsIndicatorLayout.setVerticalGroup(
            defaulterStudentsIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        defaulterStudentsButton.setBackground(new java.awt.Color(255, 255, 255));
        defaulterStudentsButton.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        defaulterStudentsButton.setForeground(new java.awt.Color(96, 83, 150));
        defaulterStudentsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/defaulterStd.png"))); // NOI18N
        defaulterStudentsButton.setText("Defaulter Students");
        defaulterStudentsButton.setFocusable(false);
        defaulterStudentsButton.setIconTextGap(15);
        defaulterStudentsButton.setVerifyInputWhenFocusTarget(false);
        defaulterStudentsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                defaulterStudentsButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout defaulterStudentsBtnLayout = new javax.swing.GroupLayout(defaulterStudentsBtn);
        defaulterStudentsBtn.setLayout(defaulterStudentsBtnLayout);
        defaulterStudentsBtnLayout.setHorizontalGroup(
            defaulterStudentsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaulterStudentsBtnLayout.createSequentialGroup()
                .addComponent(defaulterStudentsIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(defaulterStudentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        defaulterStudentsBtnLayout.setVerticalGroup(
            defaulterStudentsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(defaulterStudentsIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(defaulterStudentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(homeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(facBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(progBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(batchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(studentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookIssueBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dashbard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(defaulterStudentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(dashbard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(facBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(dptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(progBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(batchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(bookIssueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(defaulterStudentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 83, 150)));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        
         getHome();
         onClick(homeBtn);
         onLeave(facBtn);
         onLeave(dptBtn);
         onLeave(progBtn);
         onLeave(batchBtn);
         onLeave(studentBtn);
         onLeave(bookBtn);
         onLeave(bookIssueBtn);
         onLeave(defaulterStudentsBtn);
         onLeave(exitBtn);
         
         homeIndicator.setOpaque(true);
         facultyIndicator.setOpaque(false);
         deptIndicator.setOpaque(false);
         programIndicator.setOpaque(false);
         batchIndicator.setOpaque(false);
         studentIndicator.setOpaque(false);
         bookIndicator.setOpaque(true);
         bookIssueIndicator.setOpaque(false);
         defaulterStudentsIndicator.setOpaque(false);
         exitIndicator.setOpaque(false);
    }//GEN-LAST:event_homeButtonMouseClicked

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged
     int xMouse, yMouse;
    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void facultyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyButtonMouseClicked
         
         getFaculty();     
        
         onLeave(homeBtn);
         onClick(facBtn);
         onLeave(dptBtn);
         onLeave(progBtn);
         onLeave(batchBtn);
         onLeave(studentBtn);
         onLeave(bookBtn);
         onLeave(bookIssueBtn);
         onLeave(defaulterStudentsBtn);
         onLeave(exitBtn);
         
         homeIndicator.setOpaque(false);
         facultyIndicator.setOpaque(true);
         deptIndicator.setOpaque(false);
         programIndicator.setOpaque(false);
         batchIndicator.setOpaque(false);
         studentIndicator.setOpaque(false);
         bookIndicator.setOpaque(true);
         bookIssueIndicator.setOpaque(false);
         defaulterStudentsIndicator.setOpaque(false);
        exitIndicator.setOpaque(false);
    }//GEN-LAST:event_facultyButtonMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
       
    }//GEN-LAST:event_homeBtnMouseClicked

    private void facBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facBtnMouseClicked
        
    }//GEN-LAST:event_facBtnMouseClicked

    private void dptBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dptBtnMouseClicked
        
    }//GEN-LAST:event_dptBtnMouseClicked

    private void dptButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dptButtonMouseClicked
        getDepartment();
        
         onLeave(homeBtn);
         onLeave(facBtn);
         onClick(dptBtn);
         onLeave(progBtn);
         onLeave(batchBtn);
         onLeave(studentBtn);
         onLeave(bookBtn);
         onLeave(bookIssueBtn);
         onLeave(defaulterStudentsBtn);
         onLeave(exitBtn);
         
         homeIndicator.setOpaque(false);
         facultyIndicator.setOpaque(false);
         deptIndicator.setOpaque(true);
         programIndicator.setOpaque(false);
         batchIndicator.setOpaque(false);
         studentIndicator.setOpaque(false);
         bookIndicator.setOpaque(false);
         bookIssueIndicator.setOpaque(false);
         defaulterStudentsIndicator.setOpaque(false);
         exitIndicator.setOpaque(false);
    }//GEN-LAST:event_dptButtonMouseClicked

    private void programButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programButtonMouseClicked
         getProgram();        
         onLeave(homeBtn);
         onLeave(facBtn);
         onLeave(dptBtn);
         onClick(progBtn);
         onLeave(batchBtn);
         onLeave(studentBtn);
         onLeave(bookBtn);
         onLeave(bookIssueBtn);
         onLeave(defaulterStudentsBtn);
         onLeave(exitBtn);
         
         homeIndicator.setOpaque(false);
         facultyIndicator.setOpaque(false);
         deptIndicator.setOpaque(false);
         programIndicator.setOpaque(true);
         batchIndicator.setOpaque(false);
         studentIndicator.setOpaque(false);
         bookIndicator.setOpaque(false);
         defaulterStudentsIndicator.setOpaque(false);
         bookIssueIndicator.setOpaque(false);
         exitIndicator.setOpaque(false);
    }//GEN-LAST:event_programButtonMouseClicked

    private void batchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batchButtonMouseClicked
        getBatch();
         onLeave(homeBtn);
         onLeave(facBtn);
         onLeave(dptBtn);
         onLeave(progBtn);
         onClick(batchBtn);
         onLeave(studentBtn);
         onLeave(bookBtn);
         onLeave(bookIssueBtn);
         onLeave(defaulterStudentsBtn);
         onLeave(exitBtn);
         
         homeIndicator.setOpaque(false);
         facultyIndicator.setOpaque(false);
         deptIndicator.setOpaque(false);
         programIndicator.setOpaque(false);
         batchIndicator.setOpaque(true);
         studentIndicator.setOpaque(false);
         bookIndicator.setOpaque(false);
         bookIssueIndicator.setOpaque(false);
         defaulterStudentsIndicator.setOpaque(false); 
         exitIndicator.setOpaque(false);
    }//GEN-LAST:event_batchButtonMouseClicked

    private void studentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentButtonMouseClicked
        
        getStudent();
        
         onLeave(homeBtn);
         onLeave(facBtn);
         onLeave(dptBtn);
         onLeave(progBtn);
         onLeave(batchBtn);
         onClick(studentBtn);
         onLeave(bookBtn);
         onLeave(bookIssueBtn);
         onLeave(defaulterStudentsBtn);
         onLeave(exitBtn);
         
         homeIndicator.setOpaque(false);
         facultyIndicator.setOpaque(false);
         deptIndicator.setOpaque(false);
         programIndicator.setOpaque(false);
         batchIndicator.setOpaque(false);
         studentIndicator.setOpaque(true);
         bookIndicator.setOpaque(false);
         bookIssueIndicator.setOpaque(false);
         defaulterStudentsIndicator.setOpaque(false);
         exitIndicator.setOpaque(false);
    }//GEN-LAST:event_studentButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
         onLeave(homeBtn);
         onLeave(facBtn);
         onLeave(dptBtn);
         onLeave(progBtn);
         onLeave(batchBtn);
         onLeave(studentBtn);
         onLeave(bookBtn);
         onLeave(bookIssueBtn);
         onLeave(defaulterStudentsBtn);
         onClick(exitBtn);
         
         homeIndicator.setOpaque(false);
         facultyIndicator.setOpaque(false);
         deptIndicator.setOpaque(false);
         programIndicator.setOpaque(false);
         batchIndicator.setOpaque(false);
         studentIndicator.setOpaque(false);
         bookIndicator.setOpaque(false);
         bookIssueIndicator.setOpaque(false);
         defaulterStudentsIndicator.setOpaque(false);
         exitIndicator.setOpaque(true);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void bookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookBtnMouseClicked

    }//GEN-LAST:event_bookBtnMouseClicked

    private void bookButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookButtonMouseClicked

        getBook();
        onLeave(homeBtn);
        onLeave(facBtn);
        onLeave(dptBtn);
        onLeave(progBtn);
        onLeave(batchBtn);
        onLeave(studentBtn);
        onClick(bookBtn);
        onLeave(bookIssueBtn);
        onLeave(defaulterStudentsBtn);
        onLeave(exitBtn);

        homeIndicator.setOpaque(false);
        facultyIndicator.setOpaque(false);
        deptIndicator.setOpaque(false);
        programIndicator.setOpaque(false);
        batchIndicator.setOpaque(false);
        studentIndicator.setOpaque(false);
        bookIndicator.setOpaque(true);
        bookIssueIndicator.setOpaque(false);
        defaulterStudentsIndicator.setOpaque(false);
        exitIndicator.setOpaque(false);
    }//GEN-LAST:event_bookButtonMouseClicked

    private void bookIssueBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookIssueBtnMouseClicked

    }//GEN-LAST:event_bookIssueBtnMouseClicked

    private void bookIssueButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookIssueButtonMouseClicked

        getBookIssue();
        onLeave(homeBtn);
        onLeave(facBtn);
        onLeave(dptBtn);
        onLeave(progBtn);
        onLeave(batchBtn);
        onLeave(studentBtn);
        onLeave(bookBtn);
        onClick(bookIssueBtn);
        onLeave(defaulterStudentsBtn);
        onLeave(exitBtn);

        homeIndicator.setOpaque(false);
        facultyIndicator.setOpaque(false);
        deptIndicator.setOpaque(false);
        programIndicator.setOpaque(false);
        batchIndicator.setOpaque(false);
        studentIndicator.setOpaque(false);
        bookIndicator.setOpaque(false);
        bookIssueIndicator.setOpaque(true);
        defaulterStudentsIndicator.setOpaque(false);
        exitIndicator.setOpaque(false);
    }//GEN-LAST:event_bookIssueButtonMouseClicked

    private void defaulterStudentsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defaulterStudentsBtnMouseClicked

    }//GEN-LAST:event_defaulterStudentsBtnMouseClicked

    private void defaulterStudentsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defaulterStudentsButtonMouseClicked
        getDefaulterStudents();
        onLeave(homeBtn);
        onLeave(facBtn);
        onLeave(dptBtn);
        onLeave(progBtn);
        onLeave(batchBtn);
        onLeave(studentBtn);
        onLeave(bookBtn);
        onLeave(bookIssueBtn);
        onClick(defaulterStudentsBtn);
        onLeave(exitBtn);

        homeIndicator.setOpaque(false);
        facultyIndicator.setOpaque(false);
        deptIndicator.setOpaque(false);
        programIndicator.setOpaque(false);
        batchIndicator.setOpaque(false);
        studentIndicator.setOpaque(false);
        bookIndicator.setOpaque(false);
        bookIssueIndicator.setOpaque(false);
        defaulterStudentsIndicator.setOpaque(true);
        exitIndicator.setOpaque(false);
    }//GEN-LAST:event_defaulterStudentsButtonMouseClicked

         
    public static void main(String args[]) {
      new DashBoard().setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel batchBtn;
    private javax.swing.JLabel batchButton;
    private javax.swing.JPanel batchIndicator;
    private javax.swing.JPanel bookBtn;
    private javax.swing.JLabel bookButton;
    private javax.swing.JPanel bookIndicator;
    private javax.swing.JPanel bookIssueBtn;
    private javax.swing.JLabel bookIssueButton;
    private javax.swing.JPanel bookIssueIndicator;
    private javax.swing.JLabel closeButton;
    private javax.swing.JPanel dashbard;
    private javax.swing.JPanel defaulterStudentsBtn;
    private javax.swing.JLabel defaulterStudentsButton;
    private javax.swing.JPanel defaulterStudentsIndicator;
    private javax.swing.JPanel deptIndicator;
    private javax.swing.JPanel dptBtn;
    private javax.swing.JLabel dptButton;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel exitButton1;
    private javax.swing.JPanel exitIndicator;
    private javax.swing.JPanel facBtn;
    private javax.swing.JLabel facultyButton;
    private javax.swing.JPanel facultyIndicator;
    private javax.swing.JPanel homeBtn;
    private javax.swing.JLabel homeButton;
    private javax.swing.JPanel homeIndicator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel progBtn;
    private javax.swing.JLabel programButton;
    private javax.swing.JPanel programIndicator;
    private javax.swing.JPanel studentBtn;
    private javax.swing.JLabel studentButton;
    private javax.swing.JPanel studentIndicator;
    // End of variables declaration//GEN-END:variables
}
