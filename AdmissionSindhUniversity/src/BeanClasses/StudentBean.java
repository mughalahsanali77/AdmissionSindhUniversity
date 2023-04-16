package BeanClasses;

public class StudentBean{

	private int batchId;
	private int studentId;
	private String rollNo;
	private String studentName;
	private String fatherName;
	private String surname;
	private String email;
	private String phoneNo;
        private String gender;
        private String remarks;

        
	public void setBatchId(int batchId){
		this.batchId = batchId;
	}
	
	public void setStudentId(int studentId){
		this.studentId = studentId;
	}
	
	public void setRollNo(String rollNo){
		this.rollNo = rollNo;
	}
	
	public void setStudentName(String studentName){
		this.studentName = studentName;
	}
	
	public void setFatherName(String fatherName){
		this.fatherName = fatherName;
	}
	
	public void setSurname(String surname){
		this.surname = surname;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}
        
        
	public void setGender(String gender){
		this.gender = gender;
	}
        
	public void setRemarks(String remarks){
		this.remarks = remarks;
	}

	
	
	public int getBatchId(){
		return batchId;
	}
	
	public int getStudentId(){
		return studentId;
	}
	
	public String getRollNo(){
		return rollNo;
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public String getFatherName(){
		return fatherName;
	}
	
	public String getSurname(){
		return surname;
	}
	
	public String getEmail(){
		return email;
	} 
	
	public String getPhoneNo(){
		return phoneNo;
	}
        
        
	public String getRemarks(){
		return remarks;
	}
        
        
	public String getGender(){
		return gender;
	}
        
        
        @Override
        public String toString(){
            return rollNo;
        }
}