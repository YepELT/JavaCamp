
public class StudentManager {
	
	public void add(Student student) {
		System.out.println("Öğrenci kaydı yapıldı: ");
		System.out.println("Öğrencinin adı : " + student.getFirstName());
		System.out.println("Öğrencinin Notu : " + student.getGrade());
		System.out.println("Öğrencinin ID'si : " + student.getId());
	};
	
	

}
