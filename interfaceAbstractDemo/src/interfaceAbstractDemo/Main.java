package interfaceAbstractDemo;

import java.util.Date;

import interfaceAbstractDemo.adapters.MernisServiceAdapter;
import interfaceAbstractDemo.classes.CustomerCheckManager;
import interfaceAbstractDemo.classes.NeroCustomerManager;
import interfaceAbstractDemo.classes.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;
import interfaceAbstractDemo.interfaces.BaseCustomerManager;

public class Main {

	public static void main(String[] args) {
		Customer realCustomer = new Customer(1,"MELÝKE", "ÖZCAN", "34741607440", new Date(2001,11,2));
		Customer fakeCustomer = new Customer(2,"Engin","Demiroð","12345678901",new Date(1989,2,11));

		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(realCustomer);
		
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(realCustomer);
		starbucksCustomerManager.save(fakeCustomer);
		
	}

}
