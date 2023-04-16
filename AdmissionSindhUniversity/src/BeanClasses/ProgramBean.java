package BeanClasses;

public class ProgramBean{

	private int dptId;
	private int progId;
	private String progName;
	private int durationInSem;
	private String remarks;
	
	public void setDptId(int dptId){
		this.dptId = dptId;
	}
	
	public void setProgId(int progId){
		this.progId = progId;
	}
	
	public void setProgName(String progName){
		this.progName = progName;
	}
	
	public void setDurationInSem(int durationInSem){
		this.durationInSem = durationInSem;
	}
	
	public void setRemarks(String remarks){
		this.remarks = remarks;
	}
	
	
	public int getDptId(){
		return dptId;
	}
	
	public int getProgId(){
		return progId;
	}
	
	public String getProgName(){
		return progName;
	}
	
	public int getDurationInSem(){
		return durationInSem;
	}
	
	public String getRemarks(){
		return remarks;
	}
        
        @Override
        public String toString(){
            return progName;
        }
}


