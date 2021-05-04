
public class main {

	public static void main(String[] args) {
		StudentGradeCheck sGC = new StudentGradeCheck();
		
		InstructorManager instructorManager = new InstructorManager();
		
		Instructor instructor1 = new Instructor();
		instructor1.setAvailability("Kurs alınabilir");
		instructor1.setCourse("Java&React");
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setId(19);
		
		StudentManager studentManager = new StudentManager();
		
		Student student = new Student();
		student.setFirstName("Toygar Can");
		student.setGrade("60");
		student.setId(16);
		studentManager.add(student);
		sGC.gradeCheck(student);
		System.out.println("-------------");
		
		UserManager userManager = new UserManager();
		User user1 = new User();
		user1.setFirstName("Yiğit Can");
		user1.setId(20);
		user1.setLastName("POLAT");
		user1.setNationalId("16000000000");
		
		userManager.add(user1);
		System.out.println("-----------------------");
		instructorManager.add(instructor1);
	}

}
