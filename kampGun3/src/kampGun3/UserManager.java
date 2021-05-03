package kampGun3;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.firstName + " " + user.lastName + " sisteme kaydedildi");
	}
	
	public void addComment(String comment) {
		System.out.println("'" + comment + "' yorumu sisteme eklendi");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.firstName + " " + user.lastName + " sistemden silindi");
	}
}
