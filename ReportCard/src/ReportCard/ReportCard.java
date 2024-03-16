package ReportCard;

public class ReportCard {
	private String stuName;
	private Subject[] subArray;
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public void setSubArray(Subject[] subArray) {
		for(byte i = 0; i<subArray.length; i++) {
			this.subArray[i] = subArray[i];
		}

	}
	public String getStuName() {
		return this.stuName;
	}
	public Subject[] getSubArray() {
		return this.subArray;
	}
	public ReportCard(String name, int num) {
		this.stuName = name;
		this.subArray = new Subject[num];
		
	}
	public double average() {
		double avg = 0;
		for(byte i = 0; i<this.subArray.length;i++) {
			avg += (double)( this.subArray[i] .getGrade());
		}
		avg /= subArray.length;
		return avg;
	}
	public boolean isExcellent() {
		double avg = average();
		return avg >= 85;
	}
}
