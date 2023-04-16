package BeanClasses;

public class BatchBean {

	private int progId;
	private int batchId;
	private int batchYear;
	private String shift;
	private String group;
	private String remarks;
	
	public void setProgId(int progId){
		this.progId = progId;
	}
	
	public void setBatchId(int batchId){
		this.batchId = batchId;
	}
	
	public void setBatchYear(int batchYear){
		this.batchYear = batchYear;
	}
	
	public void setShift(String shift){
		this.shift = shift;
	}

	public void setGroup(String group){
		this.group = group;
	}
	
	public void setRemarks(String remarks){
		this.remarks = remarks;
	}
	
	
	public int getProgId(){
		return progId;
	}
	
	public int getBatchId(){
		return batchId;
	}
	
	public int getBatchYear(){
		return batchYear;
	}
	
	public String getShift(){
		return shift;
	}
	
	public String getGroup(){
		return group;
	}
	
        public String getRemarks(){
            return remarks;
        }
        
        @Override
	public  String toString(){
            return ""+batchYear;
        }
}