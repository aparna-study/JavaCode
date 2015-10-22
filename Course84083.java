import java.util.ArrayList;
import java.util.Date;


public class Course84083 {
	
	private String name;
	private int id;
	Date startDate = new Date(); // (Java Date)
	private int week_length;
	ArrayList<String> studentName = new ArrayList<String>();
	
	public String getName() {
	
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getWeek_length() {
		return week_length;
	}
	public void setWeek_length(int week_length) {
		this.week_length = week_length;
	}
	
	public void addStudent(String studentName){
		
		this.studentName.add(studentName);
	}
	
	

//	length (weeks)
	


}
