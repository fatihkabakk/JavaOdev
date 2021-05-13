package kampGun5.core.abstracts;

import kampGun5.entities.concretes.User;

public interface AuthService {
	void login(User user);
	void register(User user);
}
