package kampGun5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kampGun5.dataAccess.abstracts.UserDao;
import kampGun5.entities.concretes.User;

public class MemoryUserDao implements UserDao {

	List<User> userList = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		userList.add(user);
		System.out.println(user.getFirstName() + " kaydedildi!");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " güncellendi!");
		
	}

	@Override
	public void delete(User user) {
		if (userList.contains(user)) {
			userList.remove(user);
			System.out.println(user.getFirstName() + " silindi!");
		}
		else {
			System.out.println("Böyle bir kullanýcý mevcut deðil!");
		}
		
	}

	@Override
	public List<User> getAll() {
		return userList;
	}

}
