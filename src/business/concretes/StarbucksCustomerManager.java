package business.concretes;

import business.abstracts.BaseCustomerManager;
import business.abstracts.ICustomerCheckService;
import entities.concretes.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		_customerCheckService = customerCheckService;
		
	}
	
	
	
	 
	
	public void Save(Customer customer) {
		
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);	
		}else {
			
			System.out.println("Not a valid person.");
		}
		
		
	 

		
		
		
	}
	
	
	

	
	
	
	
	
	
	
	

}
