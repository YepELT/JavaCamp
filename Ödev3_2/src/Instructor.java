
public class Instructor extends User {
	
	public Instructor() {
		
	
	};
	
	private String course;
	private String availability;
	
	public Instructor(String course, String availability) {
		
	this();
	this.course = course;
	this.availability = availability;
		
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	};
	
	

}
