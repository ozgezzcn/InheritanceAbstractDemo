package interfaceAbstractDemo.classes;

import interfaceAbstractDemo.entities.Customer;
import interfaceAbstractDemo.interfaces.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkPerson(Customer customer) {
		return true;
	}
	
}
