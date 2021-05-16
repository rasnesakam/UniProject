package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;
import Abstract.ICustomerCheckService;


public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		_customerCheckService = customerCheckService;
		
	}
	
	
	
	 
	
	public void Save(Customer customer) {
		
		if(_customerCheckService.Check›fRealPerson(customer)) {
			super.Save(customer);	
		}else {
			
			System.out.println("Not a valid person.");
		}
		
		
	 

		
		
		
	}
	
	
	

	
	
	
	
	
	
	
	

}
