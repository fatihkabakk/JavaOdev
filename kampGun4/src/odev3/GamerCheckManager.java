package odev3;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		if (gamer.getFirstName().length() > 1 && gamer.getLastName().length() > 1 && gamer.getDateofBirth().getYear() > 1900 && gamer.getNationalityId().length() == 11) {
			return true;
		} else {
			return false;
		}
	}

}
