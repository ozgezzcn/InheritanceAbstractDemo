package interfaceAbstractDemo.adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemo.entities.Customer;
import interfaceAbstractDemo.interfaces.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkPerson(Customer customer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = soapClient.
								TCKimlikNoDogrula(
													Long.parseLong(customer.getNationalityId()),
													customer.getFirstName(),
													customer.getLastName(),
													customer.getDateOfBirth().getYear());					
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
