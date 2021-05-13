package kampGun5;

import kampGun5.business.abstracts.UserService;
import kampGun5.business.concretes.AuthManager;
import kampGun5.business.concretes.UserManager;
import kampGun5.core.abstracts.AuthService;
import kampGun5.core.concretes.GoogleAuthManagerAdapter;
import kampGun5.dataAccess.concretes.MemoryUserDao;
import kampGun5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		AuthService authService = new AuthManager(new MemoryUserDao());
		UserService userService = new UserManager(authService);
		UserService googleUserService = new UserManager(new GoogleAuthManagerAdapter());
	
		User fatih = new User(1, "Fatih", "Kabak", "fatih@fatih.com", "999999");
		User engin = new User(2, "Engin", "Demiroð", "engin@engin.com", "123456");
		User ekrem = new User(3, "Ekrem", "Sönmez", "ekrem@gmail.com", "password");
		User testUser = new User(4, "", "", "..com", "");
		
		userService.register(fatih);
		userService.register(engin);
		userService.register(testUser);
		
		googleUserService.register(ekrem);
		googleUserService.login(ekrem);
		
		userService.login(fatih);
		userService.login(testUser);
	
	}

}
