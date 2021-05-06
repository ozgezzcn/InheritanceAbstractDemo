package interfaceAbstractDemo.classes;

import interfaceAbstractDemo.entities.Customer; 
import interfaceAbstractDemo.interfaces.BaseCustomerManager;
import interfaceAbstractDemo.interfaces.CustomerCheckService;

public class NeroCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkPerson(customer))
		{
			System.out.println("Nero customer manager : validation successfull.");
			super.save(customer);
		}
		else
		{
			System.out.println("Nero Customer Manager : Validation Error - Not a valid person.");
		}
	}
}
