package interfaceAbstractDemo.interfaces;

import interfaceAbstractDemo.entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Customer succesfully saved to database.");

	}

}
