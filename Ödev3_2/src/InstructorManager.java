
public class InstructorManager {
	public void add(Instructor instructor) {
		
		System.out.println("Eğitmen ve kurs hakkında bilgiler: ");
		System.out.println("Eğitmenin adı : " + instructor.getFirstName());
		System.out.println("Eğitmenin verdiği kurs : " + instructor.getCourse());
		System.out.println("Eğitmenin kursun müsaitlik durumu : " + instructor.getAvailability());
		System.out.println("Eğitmenin ID'si : " + instructor.getId());
		
		
	};

}
