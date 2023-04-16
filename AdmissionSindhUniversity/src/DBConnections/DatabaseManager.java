package DBConnections;

import java.sql.*;
import java.util.*;
import BeanClasses.*;
import Frames.BookIssue;
import java.util.Date;
import javax.swing.JOptionPane;
public class DatabaseManager {

    public static Connection con;

    static{
        init();
    }

    public static void init(){

        try{

            		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                String path="E:\\java_prog\\Databases\\SindhUniversity.mdb";
                String url = "jdbc:ucanaccess://"+path;      
                con=DriverManager.getConnection(url);
                System.out.println("Connection Successful"); 
                


        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static Vector getDefaulterStudents(String startDate, String endDate) throws SQLException{
        
        String query2; 
        query2 = "select roll_no, student_name, father_name, surname, bi.date_of_issue, b.book_name, b.author "
                + "from book_issue bi, book b, student std "
                + "where bi.student_id = std.student_id "
                + "and bi.book_id = b.book_id "
                + "and date_of_issue >= #"+startDate+"#  and  date_of_issue <= #"+endDate+"# "
                + "and  date_of_return is null";
        
        
        System.out.println(query2);    
        Statement st = null;
        ResultSet result = null;
        
        try{
        
            st = con.createStatement();
            result = st.executeQuery(query2);
            
            Vector v = new Vector();
            BookIssueBean bean = null;
    
            int count = 0;
            
            while(result.next()){
            
                count++;
                
                bean = new BookIssueBean();
                
                bean.setCount(count);
                bean.setRollNo(result.getString("roll_no"));
                bean.setStudentName(result.getString("student_name"));
                bean.setFatherName(result.getString("father_name"));
                bean.setSurname(result.getString("surname"));
                bean.setDateOfIssue(result.getDate("date_of_issue"));
                bean.setBookName(result.getString("book_name"));
                bean.setAuthor(result.getString("author"));
                
                v.addElement(bean);
            }
            return v;
        }finally{
            if(result != null)
                result.close();
            if(st != null)
                st.close();
        }
    }//end of get defaulter students
    
    
    public static BookBean getBooks(int bookId)throws Exception{
        
         String query  = "select * from book where book_id = " + bookId;
        
         System.out.println(query);
         
         Statement st = null;
         ResultSet result = null;
         try{
             
             st = con.createStatement();
             result = st.executeQuery(query);
         
             BookBean bean = new BookBean();
             
             while(result.next()){
                 
                bean.setDptId(result.getInt("dpt_id"));
                bean.setBookId(result.getInt("book_id"));
                bean.setBookName(result.getString("book_name"));
                bean.setAuthor(result.getString("author"));
                bean.setEditor(result.getString("editor"));
                bean.setEditionVolume(result.getString("edition_volume"));
                bean.setYearOfPublish(result.getString("year_of_publishing"));
                bean.setQuantity(result.getInt("quantity"));
                bean.setIsbn(result.getInt("isbn"));
                bean.setAccessNo(result.getInt("access_no"));
                bean.setPurchaseFrom(result.getString("purchase_from"));
                bean.setPrice(result.getInt("price"));
                bean.setPages(result.getInt("pages"));
                bean.setPurchaseDate(result.getDate("purchase_date"));
                bean.setBookCategory(result.getString("book_category"));
                bean.setLanguage(result.getString("language"));
                bean.setRemarks(result.getString("remarks"));
             }
             return bean;             
         }finally{
             if(result != null)
                 result.close();
             if(st != null)
                 st.close();
         }
    }
    public static Vector getBook(int dptId)throws Exception{

        String query  = "select * from book where dpt_id = " + dptId;

        System.out.println(query);

        Statement st = null;
        ResultSet result = null;

        try{

            st = con.createStatement();
            result = st.executeQuery(query);

            Vector v = new Vector();

            while(result.next()){

                BookBean bean = new BookBean();

                bean.setDptId(result.getInt("dpt_id"));
                bean.setBookId(result.getInt("book_id"));
                bean.setBookName(result.getString("book_name"));
                bean.setAuthor(result.getString("author"));
                bean.setEditor(result.getString("editor"));
                bean.setEditionVolume(result.getString("edition_volume"));
                bean.setYearOfPublish(result.getString("year_of_publishing"));
                bean.setQuantity(result.getInt("quantity"));
                bean.setIsbn(result.getInt("isbn"));
                bean.setAccessNo(result.getInt("access_no"));
                bean.setPurchaseFrom(result.getString("purchase_from"));
                bean.setPrice(result.getInt("price"));
                bean.setPages(result.getInt("pages"));
                bean.setPurchaseDate(result.getDate("purchase_date"));
                bean.setBookCategory(result.getString("book_category"));
                bean.setLanguage(result.getString("language"));
                bean.setRemarks(result.getString("remarks"));

                v.addElement(bean);
            }
            return v;
        }finally{
            if(result != null)
                result.close();
            if(st != null)
                st.close();
        }
    }//end of getBook


    public static int addBook(int dptId, String bookName, String author, String editor,
                               String editionVolume, String yearOfPublishing, int quantity,
                               int isbn, int accessNo, String purchaseFrom, int price,
                               int pages, String purchaseDate, String bookCategory, String language, String remarks
            ) throws SQLException{
            String query = "insert into book (dpt_id, book_name, author, editor,"
                    + "edition_volume, year_of_publishing, quantity, isbn, "
                    + "access_no, purchase_from, price, pages, purchase_date, book_category, language, remarks) values"
                    + "("
                    + "'"+dptId+"',"
                    + "'"+bookName+"',"
                    + "'"+author+"',"   
                    + "'"+editor+"',"
                    + "'"+editionVolume+"',"
                    + "'"+yearOfPublishing+"',"
                    + ""+quantity+","
                    + ""+isbn+","
                    + ""+accessNo+","
                    + "'"+purchaseFrom+"',"
                    + ""+price+","
                    + ""+pages+","
                    + "'"+purchaseDate+"',"
                    + "'"+bookCategory+"',"
                    + "'"+language+"',"
                    + "'"+remarks+"'"
                    + ")";



            System.out.println(query);

            Statement st = null;

            try{

                st = con.createStatement();
                int rows = st.executeUpdate(query);

                return rows;

            }finally{
                if(st != null)
                    st.close();
            }

    }//end of addBook

    public static int updateBook(int bookId, String bookName, String author, String editor,
                                 String editionVolume, String yearOfPublishing, int quantity,
                                 int isbn, int accessNo, String purchaseFrom, int price, int pages,
                                 String purchaseDate, String bookCategory, String language, String remarks
            ) throws SQLException{

        String query = "update book set book_name = '"+bookName+"', author = '"+author+"', editor = '"+editor+"',"
                + "edition_volume = '"+editionVolume+"', year_of_publishing = '"+yearOfPublishing+"', quantity = "+quantity+","
                + "isbn = "+isbn+", access_no = "+accessNo+", purchase_from = '"+purchaseFrom+"', price = "+price+","
                + " pages = "+pages+", purchase_date = '"+purchaseDate+"' , book_category = '"+bookCategory+"', "
                + " language = '"+language+"', remarks = '"+remarks+"' "
                + " where book_id = " + bookId;

        System.out.println(query);

        Statement st = null;

        try{

            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;

        }finally{
            if(st != null)
                st.close();
        }
    }//end of updateBook

    public static int deleteBook(int bookId) throws SQLException{

        String query = "delete from book where book_id = " + bookId;

        System.out.println(query);

        Statement st = null;

        try{

            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;

        }finally{
            if(st != null)
                st.close();
        }
    }//end of deleteBook
    

    public static Vector getBookIssued(int bookId) throws SQLException{

        String query = "select * from book_issue where book_id = " + bookId;
        
        Statement st = null;
        ResultSet result = null;
        
        try{

            st = con.createStatement();
            result = st.executeQuery(query);
            
            Vector v = new Vector();
            
            while(result.next()){
            
                BookIssueBean bean = new BookIssueBean();
                
                bean.setStudentId(result.getInt("student_id"));
                bean.setBookId(result.getInt("book_id"));
                bean.setBookIssueId(result.getInt("book_issue_id"));
                bean.setDateOfIssue(result.getDate("date_of_issue"));
                bean.setDateOfReturn(result.getDate("date_of_return"));
                bean.setFine(result.getInt("fine"));
                bean.setRemarks(result.getString("remarks"));

                v.addElement(bean);
            }//end of while
            return v;
        }finally{
            
            if(result != null)
                result.close();
            if(st != null)
                st.close();
        }
    }//end of getBook by book id
    
    public static Vector getBookIssue(int studentId)throws Exception{

        String query = "select * from book_issue where student_id = " + studentId;

        System.out.println(query);

        Statement st = null;
        ResultSet result = null;


        try{


            st = con.createStatement();
            result = st.executeQuery(query);


            Vector v = new Vector();

            while(result.next()){

                BookIssueBean bean = new BookIssueBean();

                bean.setStudentId(result.getInt("student_id"));
                bean.setBookId(result.getInt("book_id"));
                bean.setBookIssueId(result.getInt("book_issue_id"));
                bean.setDateOfIssue(result.getDate("date_of_issue"));
                bean.setDateOfReturn(result.getDate("date_of_return"));
                bean.setFine(result.getInt("fine"));
                bean.setRemarks(result.getString("remarks"));
              
                v.addElement(bean);
            }
            return v;
        }finally{
            if(result != null)
                result.close();
            if(st != null)
                st.close();
        }
    }//end of getBook issue

    
    
    public static BookIssueBean getBookIssue2(int studentId)throws Exception{

        String query = "select * from book_issue where student_id = " + studentId;

        System.out.println(query);

        Statement st = null;
        ResultSet result = null;


        try{


            st = con.createStatement();
            result = st.executeQuery(query);

            BookIssueBean bean = new BookIssueBean();
            
            while(result.next()){

                bean.setStudentId(result.getInt("student_id"));
                bean.setBookId(result.getInt("book_id"));
                bean.setBookIssueId(result.getInt("book_issue_id"));
                bean.setDateOfIssue(result.getDate("date_of_issue"));
                bean.setDateOfReturn(result.getDate("date_of_return"));
                bean.setFine(result.getInt("fine"));
                bean.setRemarks(result.getString("remarks"));
            }
             return bean;
        }finally{
            if(result != null)
                result.close();
            if(st != null)
                st.close();
        }
    }//end of getBook issue

    
    

    public static int addBookIssue(int studentId, int bookId, String dateOfIssue, String dateOfReturn, int fine, String remarks) throws SQLException{

        if(dateOfReturn.equals("")) {
            dateOfReturn = null;
        }
        else { 
            dateOfReturn = "#"+dateOfReturn+"#";
        }
        
        String query = "insert into book_issue (student_id, book_id, date_of_issue, date_of_return, fine, remarks) values"
                + "("+studentId+", "+bookId+", '"+dateOfIssue+"', "+dateOfReturn+", "+fine+", '"+remarks+"')";
        
        System.out.println(query);
        
        Statement st = null;
        
        try{
        
            st = con.createStatement();
            int rows = st.executeUpdate(query);
            
            return rows;
            
        }finally{
            if(st != null)
                st.close();
        }
    }//end of addBookIssue

    
    public static int updateBookIssue(int bookIssueId, String dateOfIssue, String dateOfReturn, int fine, String remarks) throws SQLException{
        
        if(dateOfReturn.equals("")) {
            dateOfReturn = null;
        }
        else { 
            dateOfReturn = "#"+dateOfReturn+"#";
        }
        
        String query = "update book_issue set date_of_issue = '"+dateOfIssue+"', date_of_return = "+dateOfReturn+","
                + " fine = "+fine+", remarks = '"+remarks+"' where book_issue_id = " + bookIssueId;
        
        System.out.println(query);
        
        Statement st = null;
        
        try{
            
            st = con.createStatement();
            int rows = st.executeUpdate(query);
            
            return rows;
        
        }finally{
            if(st != null)
                st.close();
        }
    }//end of updateBookIssue
    

    public static int deleteBookIssue(int bookIssueId) throws SQLException{
        
        String query = "delete from book_issue where book_issue_id = " + bookIssueId;

        System.out.println(query);
        
        Statement st = null;
        
        try{
        
            st = con.createStatement();
            int rows = st.executeUpdate(query);
            
            return rows;
        }finally{
            if(st != null)
                st.close();
        }
    }//end of delete BookIssue
            
    public static Vector getFaculty()throws Exception{

        String query = "select * from faculty ";

        System.out.println(query);

        Statement st = null;
        ResultSet result = null;

        try{

            st = con.createStatement();
            result = st.executeQuery(query);

            Vector v = new Vector();

            while(result.next()){

                FacultyBean bean = new FacultyBean();

                bean.setFacId(result.getInt("fac_id"));
                bean.setFacName(result.getString("fac_name"));
                bean.setRemarks(result.getString("remarks"));

                v.addElement(bean);
            }
            return v;
        }finally{
            if(result != null) result.close();
            if(st != null) st.close();
        }
    }//end getFaculty

    public static Vector getDepartment(int facId)throws Exception{

        String query = "select * from department where fac_id = " + facId;

        System.out.println(query);

        Statement st = null;
        ResultSet result = null;

        try{

            st = con.createStatement();
            result = st.executeQuery(query);

            Vector v = new Vector();

            while(result.next()){

                DepartmentBean bean = new DepartmentBean();

                bean.setFacId(result.getInt("fac_id"));
                bean.setDptId(result.getInt("dept_id"));
                bean.setDptName(result.getString("dept_name"));
                bean.setRemarks(result.getString("remarks"));

                v.addElement(bean);
            }
            return v;
        }finally{
            if(result != null) result.close();
            if(st != null) st.close();
        }
    }//end getDepartment

    public static Vector getDepartment() throws SQLException{

        String query = "select * from Department";

        System.out.println(query);

        Statement st = null;
        ResultSet result = null;

        try{

            st = con.createStatement();
            result = st.executeQuery(query);

            Vector v = new Vector();

            while(result.next()){

                DepartmentBean bean = new DepartmentBean();

                bean.setFacId(result.getInt("fac_id"));
                bean.setDptId(result.getInt("dept_id"));
                bean.setDptName(result.getString("dept_name"));
                bean.setRemarks(result.getString("remarks"));

                v.addElement(bean);
            }
         return v;
        }finally{
            if(result != null) result.close();
            if(st != null) st.close();
        }
    }//end of getDeparrtment

    public static Vector getProgram(int dptId)throws Exception{

        String query = "select * from program where dept_Id = " + dptId;

        System.out.println(query);

        Statement st = null;
        ResultSet result = null;

        try{

            st = con.createStatement();
            result = st.executeQuery(query);

            Vector v = new Vector();

            while(result.next()){

                ProgramBean bean = new ProgramBean();

                bean.setDptId(result.getInt("dept_id"));
                bean.setProgId(result.getInt("prog_id"));
                bean.setProgName(result.getString("prog_name"));
                bean.setDurationInSem(result.getInt("duration_in_sem"));
                bean.setRemarks(result.getString("remarks"));

                v.addElement(bean);
            }
            return v;
        }finally{
            if(result != null) result.close();
            if(st != null) st.close();
        }
    }//end getProgram

    public static Vector getBatch(int progId)throws Exception{

        String query = "select * from Batch where prog_Id = " + progId;

        System.out.println(query);

        Statement st = null;
        ResultSet result = null;

        try{

            st = con.createStatement();
            result = st.executeQuery(query);

            Vector v = new Vector();

            while(result.next()){

                BatchBean bean = new BatchBean();

                bean.setProgId(result.getInt("prog_id"));
                bean.setBatchId(result.getInt("batch_id"));
                bean.setBatchYear(result.getInt("batch_year"));
                bean.setShift(result.getString("shift"));
                bean.setGroup(result.getString("group_desc"));
                bean.setRemarks(result.getString("remarks"));

                v.addElement(bean);
            }
            return v;
        }finally{
            if(result != null) result.close();
            if(st != null) st.close();
        }
    }//end getBatch

    public static StudentBean getStudents(int studentId) throws SQLException{
        
        String query = "select * from student where std_id = " + studentId;
        
        System.out.println(query);
        
        Statement st = null;
        ResultSet result = null;
        
        try{
        
            st = con.createStatement();
            result = st.executeQuery(query);
            
            StudentBean bean = new StudentBean();
            
            while(result.next()){
                
                bean.setBatchId(result.getInt("batch_id"));
                bean.setStudentId(result.getInt("std_id"));
                bean.setRollNo(result.getString("rollno"));
                bean.setStudentName(result.getString("std_name"));
                bean.setFatherName(result.getString("fname"));
                bean.setSurname(result.getString("surname"));
                
                //bean.setPhoneNo(result.getString("phone_no"));
                bean.setGender(result.getString("Gender"));
                bean.setRemarks(result.getString("remarks"));
            }//end of while
            return bean;
        }finally{
            if(result != null)
                result.close();
            if(st != null)
                st.close();
        }
    }//end of get single student data
    
    public static Vector getStudent(int batchId) throws SQLException{

        String query = "select * from student where batch_id = " + batchId;

        System.out.println(query);

        Statement st = null;
        ResultSet result = null;

        try{

            st = con.createStatement();
            result = st.executeQuery(query);

            Vector v = new Vector();

            while(result.next()){

                StudentBean bean = new StudentBean();

                bean.setBatchId(result.getInt("batch_id"));
                bean.setStudentId(result.getInt("std_id"));
                bean.setRollNo(result.getString("rollno"));
                bean.setStudentName(result.getString("std_name"));
                bean.setFatherName(result.getString("fname"));
                bean.setSurname(result.getString("surname"));
               // bean.setEmail(result.getString("email"));
              //  bean.setPhoneNo(result.getString("phone_no"));
                bean.setGender(result.getString("Gender"));
                bean.setRemarks(result.getString("remarks"));
                v.addElement(bean);
            }
            return v;
        }finally{
            if(result != null) result.close();
            if(st != null) st.close();
        }
    }//end of getStudent


    public static int deleteFaculty(int facId)throws Exception{

        String query = "delete from faculty where fac_id = " + facId;
        System.out.println(query);

        Statement st = null;

        try{
            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;
        }finally{
            if(st != null) st.close();
        }
    }//end of deleteFaculty

    public static int deleteDepartment(int dptId)throws Exception{
        String query = "delete from department where dpt_id = " + dptId;
        System.out.println(query);

        Statement st = null;

        try{
            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;
        }finally{
            if(st != null) st.close();
        }
    }//end of deleteDpt

    public static int deleteProgram(int progId)throws Exception{

        String query = "delete from program where prog_id = " + progId;

        System.out.println(query);

        Statement st = null;

        try{
            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;
        }finally{
            if(st != null) st.close();
        }
    }//end of deleteProgram

    public static int deleteBatch(int batchId)throws Exception{

        String query = "delete from batch where batch_Id = " + batchId;

        System.out.println(query);

        Statement st = null;

        try{
            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;
        }finally{
            if(st != null) st.close();
        }
    }//end of deleteBatch

    public static int deleteStudent(int studentId)throws Exception{
        String query = "delete from student where student_id = "+studentId;

        System.out.println(query);

        Statement st = null;

        try{

            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;
        }finally{
            if(st != null)
                st.close();
        }
    }//end of deleteStudent

    public static int addFaculty(String facName, String remarks)throws Exception{

        String query = "insert into faculty (fac_name, remarks) values ('"+facName+"','"+remarks+"')";

        System.out.println(query);

        Statement st = null;

        try{

            st = con.createStatement();
            int rows = st.executeUpdate(query);

            return rows;
        }finally{

        }
    }

    public static int addDepartment(int facId, String dptName,String remarks) throws Exception{
        String query = "insert into department (fac_id, dpt_name, remarks) values "
                + "("+facId+","
                + "'"+dptName+"',"
                + "'"+remarks+"'"
                + ")";
        System.out.println(query);

        Statement st = null;
        try{
            st = con.createStatement();
           int row = st.executeUpdate(query);
           return row;
        }finally{
            if(st != null)
                st.close();
        }
    }

    public static int addProgram(int dptId, String progName,int durationInSem, String remarks)throws Exception{
        String query = "insert into program (dpt_id, prog_name, duration_in_sem, remarks) values "
                + "("+dptId+","
                + "'"+progName+"',"
                + ""+durationInSem+","
                + "'"+remarks+"'"
                + ")";
        System.out.println(query);

        Statement st = null;

        try{
            st = con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if(st != null)
                st.close();
        }
    }

    public static int addBatch(int progId, int batchYear, String shift, String grup, String remarks)throws Exception{


        String query = "insert into batch(prog_id, batch_year, shift, grup, remarks) "
                + "values ("+progId+",'"+batchYear+"','"+shift+"','"+grup+"','"+remarks+"')";

        System.out.println(query);

        Statement st = null;

        try{

            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;
        }finally{
             if(st != null)
                st.close();
        }
    }

    public static int addStudent(int batchId, String rollNo, String studentName, String fatherName, String surname, String gender, String phNo, String email, String remarks) throws Exception{

        String query = "insert into student (batch_id, roll_no, student_name, father_name, surname, gender, phone_no, email, remarks) "
                + "values ("+batchId+",'"+rollNo+"','"+studentName+"','"+fatherName+"','"+surname+"','"+gender+"','"+phNo+"','"+email+"','"+remarks+"')";
        System.out.println(query);

        Statement st = null;
        try{
            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;
        }finally{
            if(st != null)
                st.cancel();
        }
    }

    public static int updateFaculty(int facId, String facName, String remarks)throws Exception{

        String query = "update faculty set fac_name = '"+facName+"', remarks = '"+remarks+"' where fac_id = "+ facId;

        System.out.println(query);

        Statement st = null;

        try{
            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;
        }finally{
            if(st != null)
                st.close();
        }

    }

    public static int updateDepartment(int dptId, String dptName,String remarks) throws Exception{
        String query = "update department "
                + "set dpt_name = '"+dptName+"', remarks = '"+remarks+"' where dpt_id = "+dptId;

        System.out.println(query);

        Statement st = null;
        try{
            st = con.createStatement();
           int row = st.executeUpdate(query);
           return row;
        }finally{
            if(st != null)
                st.close();
        }
    }

    public static int updateProgram(int progId, String progName,int durationInSem, String remarks)throws Exception{
        String query = "update program "
                + "set  prog_name = '"+progName+"', duration_in_sem = '"+durationInSem+"', remarks = '"+remarks+"' "
                + "where prog_id = "+progId;
        System.out.println(query);

        Statement st = null;

        try{
            st = con.createStatement();
            int rows = st.executeUpdate(query);
            return rows;
        }finally{
            if(st != null)
                st.close();
        }
    }

    public static int updateBatch(int batchId, int batchYear, String shift, String grup, String remarks)throws Exception{
                                                                                                               //earror in grup
        String query = "update batch set batch_year = '"+batchYear+"', shift = '"+shift+"', grup = '"+grup+"', remarks = '"+remarks+"' "
                + "where batch_Id = "+batchId;
        System.out.println(query);

        Statement st = null;

        try{

            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;
        }finally{
        }
    }

    public static int updateStudent(int studentId, String rollNo, String studentName, String fatherName, String surname,String gender, String phNo, String email, String remarks) throws Exception{

        String query = "update student "
                + "set roll_no = '"+rollNo+"', student_name = '"+studentName+"', father_name = '"+fatherName+"', surname = '"+surname+"', gender = '"+gender+"', phone_no = '"+phNo+"', "
                + "email = '"+email+"', remarks = '"+remarks+"'"
                + "where student_id = "+studentId;
        System.out.println(query);

        Statement st = null;
        try{
            st = con.createStatement();

            int rows = st.executeUpdate(query);

            return rows;
        }finally{
            if(st != null)
                st.cancel();
        }
    }//end of update students
    
    
    public static Vector getStudent() throws SQLException{

        String query = "select * from student";

        System.out.println(query);

        Statement st = null;
        ResultSet result = null;

        try{

            st = con.createStatement();
            result = st.executeQuery(query);

            Vector v = new Vector();

            while(result.next()){

                StudentBean bean = new StudentBean();

                bean.setBatchId(result.getInt("batch_id"));
                bean.setStudentId(result.getInt("student_id"));
                bean.setRollNo(result.getString("roll_no"));
                bean.setStudentName(result.getString("student_name"));
                bean.setFatherName(result.getString("father_name"));
                bean.setSurname(result.getString("surname"));
                bean.setEmail(result.getString("email"));
                bean.setPhoneNo(result.getString("phone_no"));
                bean.setGender(result.getString("gender"));
                bean.setRemarks(result.getString("remarks"));
                v.addElement(bean);
            }
            return v;
        }finally{
            if(result != null) result.close();
            if(st != null) st.close();
        }
    }//end of getStudent

}