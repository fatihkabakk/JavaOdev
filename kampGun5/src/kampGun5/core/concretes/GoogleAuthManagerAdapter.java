package kampGun5.core.concretes;

import kampGun5.core.abstracts.AuthService;
import kampGun5.entities.concretes.User;
import kampGun5.google.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {
	
	private GoogleAuthManager service = new GoogleAuthManager();
	
	@Override
	public void login(User user) {
		service.loginWithGoogle(user.getEmail(), user.getPassword());
		
	}

	@Override
	public void register(User user) {
		service.registerWithGoogle(user.getEmail(), user.getPassword());
		
	}

}
