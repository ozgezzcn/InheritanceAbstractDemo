package interfaceAbstractDemo.classes;

import interfaceAbstractDemo.entities.Customer; 
import interfaceAbstractDemo.interfaces.BaseCustomerManager;
import interfaceAbstractDemo.interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkPerson(customer))
		{
			System.out.println("Starbucks Manager : Validation successfull.");
			super.save(customer);
		}
		else
		{
			System.out.println("Starbucks Manager : Validation Error - Not a valid person.");
		}
	}
	
}
