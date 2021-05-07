package odev2;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()) , customer.getFirstName(), customer.getLastName(), customer.getDateofBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}

}
