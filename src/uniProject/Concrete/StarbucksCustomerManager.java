package uniProject.Concrete;

import uniProject.Abstract.BaseCustomerManager;
import uniProject.Entities.Customer;
import uniProject.Abstract.ICustomerCheckService;


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
