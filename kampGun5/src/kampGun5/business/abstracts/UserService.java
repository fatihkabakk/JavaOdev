package kampGun5.business.abstracts;

import kampGun5.entities.concretes.User;

public interface UserService {
	void login(User user);
	void register(User user);
}
