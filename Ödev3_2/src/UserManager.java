
public class UserManager {
	public void add(User user) {
		
		System.out.println("Kullanıcı eklenmiştir.");
		System.out.println("Kullanıcının Adı : " + user.getFirstName());
		System.out.println("Kullanıcının Soyadı : " + user.getLastName());
		System.out.println("Kullanıcının ID'si : " + user.getId());
		System.out.println("Kullanıcının Kimlik Numarası : " + user.getNationalId());
		
		
	};

}
