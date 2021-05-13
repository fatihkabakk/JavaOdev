package odev3;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()) , gamer.getFirstName(), gamer.getLastName(), gamer.getDateofBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}

}
