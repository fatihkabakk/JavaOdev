package kampGun5.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import kampGun5.core.abstracts.AuthService;
import kampGun5.dataAccess.abstracts.UserDao;
import kampGun5.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserDao userDao;
	
	public AuthManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void login(User user) {
		if (this.userDao.getAll().contains(user)) {
			System.out.println("E-mail ile giri� ba�ar�l�!");
		} else {
			System.out.println("E-mail ile giri� ba�ar�s�z!");
		}
	}

	@Override
	public void register(User user) {
		if (isUniqueEmail(user.getEmail()) && isValidEmail(user.getEmail()) && isValidUser(user)) {
			System.out.println("Do�rulama emaili " + user.getEmail() + " adresine g�nderildi");
			System.out.println("Email adresi do�ruland�");
			this.userDao.add(user);
		} else {
			System.out.println("Kullan�c� gereksinimleri kar��lamad��� i�in kaydedilemedi!");
		}
	}
	
	private boolean isValidUser(User user) {
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {
			return true;
		} else {
			System.out.println("�sim soyisim minimum 2 karakter olmal�d�r!");
			return false;
		}
	}
	
	private boolean isValidEmail(String email) {
		final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		boolean result = matcher.find();
		if (!result) {
			System.out.println("E-mail adresiniz ge�ersiz!");
		}
        return result;
	}
	
	private boolean isUniqueEmail(String email) {
		for (User user : this.userDao.getAll()) {
			if (user.getEmail() == email) {
				System.out.println("Bu e-mail adresi daha �nce al�nm��!");
				return false;
			}
		}
		return true;
	}
}
