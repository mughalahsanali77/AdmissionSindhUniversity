package Frames;

import BeanClasses.BookIssueBean;
import BeanClasses.Decoder;
import BeanClasses.DepartmentBean;
import DBConnections.DatabaseManager;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.print.Book;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaulterStudents extends javax.swing.JPanel {

    public DefaulterStudents() {
        initComponents();
    }

    
    public void getDefaulterStudents(){
    
        if(startDateChooser.getDate() == null || endDateChooser.getDate() == null){
            JOptionPane.showMessageDialog(this, "please select start_datre and end_date");
            return;
        }
        
        String startDate = Decoder.getDateFormat(startDateChooser.getDate());
        String endDate = Decoder.getDateFormat(endDateChooser.getDate());
        try{
            Vector v = DatabaseManager.getDefaulterStudents(startDate, endDate);

            DefaultTableModel model = (DefaultTableModel) defaulterStudentsTable.getModel();
            
            clear();
            
            Vector vector = null; 
            
            for(int i=0; i<v.size(); i++){
                vector = new Vector();
                BookIssueBean bean = (BookIssueBean) v.elementAt(i);
                
                vector.addElement(bean.getCount());
                vector.addElement(bean.getRollNo());
                vector.addElement(bean.getStudentName());
                vector.addElement(bean.getFatherName());
                vector.addElement(bean.getSurname());
                vector.addElement(Decoder.getDateFormat(bean.getDateOfIssue()));
                vector.addElement(bean.getBookName());
                vector.addElement(bean.getAuthor());
                
                model.addRow(vector);
            }            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//end  of get defaulter students
    
    private void ExportCSVFile(){
        
        //file chooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file save");
        int userSelection = fileChooser.showSaveDialog(this);
        if(userSelection == JFileChooser.APPROVE_OPTION){
            File fileToSave = fileChooser.getSelectedFile();
            
            //lets to write file
            
            try{
            
                FileWriter fw = new FileWriter(fileToSave);
                BufferedWriter bw = new BufferedWriter(fw);
                
                bw.write("SR.N0,Roll NO, Name, Father Name, Surname, Date Of Issue, Book Tittle, Author");
                bw.newLine();
                 
                for(int i = 0; i < defaulterStudentsTable.getRowCount(); i++){
                    for(int j = 0; j < defaulterStudentsTable.getColumnCount(); j++ ){
                    
                        //write

                        bw.write(defaulterStudentsTable.getValueAt(i, j).toString() + ",");        

                    }//end of inner loop
                    
                    bw.newLine();
                    
                }//end of outer loop
                
                JOptionPane.showMessageDialog(this, "SUCCESSFULLY LOADES " + JOptionPane.INFORMATION_MESSAGE);
                bw.close();
                fw.close();
                
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Earror" + JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    private void clear(){
        DefaultTableModel model = (DefaultTableModel) defaulterStudentsTable.getModel();
        
        while(model.getRowCount() > 0){
            for(int i=0; i < model.getRowCount(); i++){
                model.removeRow(i);
            }
        }//end of while
    }//end of clear method

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        defaulterStudentsTable = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        exportCSVBtn = new javax.swing.JLabel();
        exportCSVBtn1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        startDateChooser = new com.toedter.calendar.JDateChooser();

        jSeparator1.setBackground(new java.awt.Color(96, 83, 150));

        jPanel1.setBackground(new java.awt.Color(232, 201, 232));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(181, 71, 180));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/defaulter.png"))); // NOI18N
        home.setText("Defaulter students");
        home.setFocusable(false);
        home.setIconTextGap(15);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .add(home)
                .add(341, 341, 341))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(home, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        defaulterStudentsTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        defaulterStudentsTable.setForeground(new java.awt.Color(116, 57, 195));
        defaulterStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR.NO", "Roll No", "Name", "Father Name", "Surname", "Date Of Issue", "Book Tittle", "Author"
            }
        ));
        defaulterStudentsTable.setGridColor(new java.awt.Color(0, 0, 0));
        defaulterStudentsTable.setSelectionBackground(new java.awt.Color(232, 201, 232));
        defaulterStudentsTable.setSelectionForeground(new java.awt.Color(116, 57, 195));
        jScrollPane2.setViewportView(defaulterStudentsTable);

        jLabel18.setBackground(new java.awt.Color(96, 83, 150));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(96, 83, 150));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Start Date");
        jLabel18.setIconTextGap(3);

        jLabel20.setBackground(new java.awt.Color(96, 83, 150));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(96, 83, 150));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("End Date");
        jLabel20.setIconTextGap(3);

        jLabel21.setBackground(new java.awt.Color(96, 83, 150));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(96, 83, 150));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Search.png"))); // NOI18N
        jLabel21.setIconTextGap(3);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        exportCSVBtn.setBackground(new java.awt.Color(96, 83, 150));
        exportCSVBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exportCSVBtn.setForeground(new java.awt.Color(96, 83, 150));
        exportCSVBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exportCSVBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/icons8_export_csv_50px.png"))); // NOI18N
        exportCSVBtn.setText("Export CSV");
        exportCSVBtn.setIconTextGap(3);
        exportCSVBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportCSVBtnMouseClicked(evt);
            }
        });

        exportCSVBtn1.setBackground(new java.awt.Color(96, 83, 150));
        exportCSVBtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exportCSVBtn1.setForeground(new java.awt.Color(96, 83, 150));
        exportCSVBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exportCSVBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/icons8_printer_48px.png"))); // NOI18N
        exportCSVBtn1.setText("Print");
        exportCSVBtn1.setIconTextGap(3);
        exportCSVBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportCSVBtn1MouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(96, 83, 150));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(96, 83, 150));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/qr.png"))); // NOI18N
        jLabel22.setText("QR-Code");
        jLabel22.setIconTextGap(3);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(32, 32, 32)
                        .add(exportCSVBtn)
                        .add(113, 113, 113)
                        .add(exportCSVBtn1)
                        .add(75, 75, 75)
                        .add(jLabel22))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel18)
                            .add(startDateChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 277, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(28, 28, 28)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel20)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(endDateChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 291, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel21)))))
                .addContainerGap(316, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel21)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel20)
                            .add(jLabel18))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(endDateChooser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .add(startDateChooser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(exportCSVBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(exportCSVBtn1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel22, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSeparator1)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

    }//GEN-LAST:event_homeMouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        getDefaulterStudents();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void exportCSVBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportCSVBtnMouseClicked
        ExportCSVFile();
    }//GEN-LAST:event_exportCSVBtnMouseClicked

    private void exportCSVBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportCSVBtn1MouseClicked
        
        if(startDateChooser.getDate() == null || endDateChooser.getDate() == null){
            JOptionPane.showMessageDialog(this, "Tere is no Data in Table for print");
            return;
        }
        
        
        String startDate = Decoder.getDateFormat(startDateChooser.getDate());
        String endDate = Decoder.getDateFormat(endDateChooser.getDate());
        
        try {        
           
           Vector v = DatabaseManager.getDefaulterStudents(startDate, endDate);
            
           DefaulterListPrint obj =  new  DefaulterListPrint(v);
        } catch (Exception ex) {
            Logger.getLogger(DefaulterStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exportCSVBtn1MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable defaulterStudentsTable;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JLabel exportCSVBtn;
    private javax.swing.JLabel exportCSVBtn1;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser startDateChooser;
    // End of variables declaration//GEN-END:variables
}
