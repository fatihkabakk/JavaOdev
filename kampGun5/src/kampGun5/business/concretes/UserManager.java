package kampGun5.business.concretes;

import kampGun5.business.abstracts.UserService;
import kampGun5.core.abstracts.AuthService;
import kampGun5.entities.concretes.User;

public class UserManager implements UserService {
	
	private AuthService authService;

	public UserManager(AuthService authService) {
		this.authService = authService;
	}

	@Override
	public void login(User user) {
		this.authService.login(user);
	}

	@Override
	public void register(User user) {
		this.authService.register(user);
	}
	
}
