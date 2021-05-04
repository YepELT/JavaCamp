
public class Student extends User {
	public Student () {
		
	};
	
	private String studentNumber;
	private String grade;
	
	public Student (String grade, String studentNumber) {
		this();
		this.grade = grade;
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	};

}
