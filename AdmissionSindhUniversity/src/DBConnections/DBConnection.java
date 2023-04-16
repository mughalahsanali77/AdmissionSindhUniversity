package DBConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {

    //just for testing purpose
    public static void main(String args[]){
        DBConnection obj = new DBConnection();
        obj.faculty();
        obj.department();
        obj.program();
        obj.batch();
        obj.student();
    }
    
    private void faculty(){
        
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:usindh";
            Connection con = DriverManager.getConnection(url);

            String query = "select * from faculty";

            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(query);
            
            System.out.println("Faculty_id            faculty_name");
            System.out.println("------------------------------------------------------------------");
            while(result.next()){
                int facId;
                facId = result.getInt("fac_id");
                String facName;
                facName = result.getString("fac_name");
                
                System.out.println("\t"+facId +"\t\t" + facName);
            }
            System.out.println("------------------------------------------------------------------");
            result.close();
            st.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
    private void department(){
        
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:usindh";
            Connection con = DriverManager.getConnection(url);
            
            String query = "select * from department";
            
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(query);
            
            System.out.println("Department_Id         Department_Name");
            System.out.println("------------------------------------------------------------------");
            
            while(result.next()){
                
                int dptId;
                dptId = result.getInt("dpt_id");
                
                String dptName;
                dptName = result.getString("dpt_name");
                
                System.out.println("\t"+dptId +"\t\t"+dptName);
            }
            System.out.println("------------------------------------------------------------------");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        
    private void program(){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:usindh";
            Connection con = DriverManager.getConnection(url);
            
            String query = "select * from program";
            
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(query);
            
            System.out.println("Program_id \t Program_Name  \t    Semesters");
            System.out.println("------------------------------------------------------------------");
            while(result.next()){
                 int progId = result.getInt("prog_id");
                String progName = result.getString("prog_Name");
                int semesters = result.getInt("duration_in_sem");
                
                System.out.println("   " + progId + "\t\t" + progName + "\t\t" + semesters);
            }
            System.out.println("------------------------------------------------------------------");
            result.close();
            st.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void batch(){
        try{
        
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:usindh";
            Connection con = DriverManager.getConnection(url);
            
            String query = "select * from  batch";
            
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(query);
            
            System.out.println("Batch_Id \t Batch_Year \t Shift \t Group");
            System.out.println("------------------------------------------------------------------");
            while(result.next()){
                
                int batchId = result.getInt("batch_id");
                int batchYear = result.getInt("batch_year");
                String shift = result.getString("shift");
                String group = result.getString("group");
                
                System.out.println("   " + batchId + " \t\t   " + batchYear + " \t   " + shift + " \t   " + group);
            }
            System.out.println("------------------------------------------------------------------");
            result.close();
            st.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
    
    private void student(){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:usindh";
            Connection con = DriverManager.getConnection(url);
            
            String query = "select * from student";
            
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(query);            
            
            System.out.println("Student_id   Roll_No   Student_Name   Father_Name  \t  Surname   phone_No   email  ");
            System.out.println("-----------------------------------------------------------------------------------------");            
            while(result.next()){
                int studentId = result.getInt("student_id");
                String rollNo = result.getString("roll_no");
                String name = result.getString("student_name");
                String fName = result.getString("father_name");
                String surname = result.getString("surname");
                String phoneNo = result.getString("phone_no");
                String email = result.getString("email");
                
                System.out.println("   " + studentId +"\t\t" + rollNo + "\t" +name + "\t\t" + fName + "\t" + surname + "\t" + phoneNo +"\t" + email);
            }
            System.out.println("-----------------------------------------------------------------------------------------");
            result.close();
            st.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}   