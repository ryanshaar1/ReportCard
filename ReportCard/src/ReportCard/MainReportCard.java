package ReportCard;
import java.util.*;
public class MainReportCard {
	public static Scanner reader = new Scanner(System.in);
	
	public static void PrintExcellent(ReportCard[] students) {
		for(int i = 0; i<students.length; i++) {
			if(students[i].isExcellent()) {
				System.out.println(students[i].getStuName());
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
