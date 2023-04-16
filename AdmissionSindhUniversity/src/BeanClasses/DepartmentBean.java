package BeanClasses;

public class DepartmentBean{
	
	private int facId;
	private int dptId;
	private String dptName;
	private String remarks;
	
	
	public void setFacId(int facId){
		this.facId = facId;
	}
	
	public void setDptId(int dptId){
		this.dptId = dptId;
	}
	
	public void setDptName(String dptName){
		this.dptName = dptName;
	}
	
	public void setRemarks(String remarks){
		this.remarks = remarks;
	}
	
	
	public int getFacId(){
		return facId;
	}
	
	public int getDptId(){
		return dptId;
	}
	
	public String getDptName(){
		return dptName;
	}
	
	public String getRemarks(){
		return remarks;
	}
        
        
        @Override
        public String toString(){
            return dptName;
        }
}