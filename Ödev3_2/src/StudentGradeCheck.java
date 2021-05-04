
public class StudentGradeCheck extends Student {

	public void gradeCheck(Student student) {

		if (Integer.valueOf(student.getGrade()) < 50) {

			System.out.println(student.getFirstName() + " adlı öğrenci kalmıştır.");

		}
		
		else {
			System.out.println(student.getFirstName() + " adlı öğrenci geçmiştir.");
		};

	};
}
