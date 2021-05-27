package business.concretes;

import business.abstracts.ICustomerCheckService;
import entities.concretes.Customer;

public class CustomerCheckManager  implements ICustomerCheckService{
	
	
		
		public boolean CheckIfRealPerson(Customer customer){
			
			return true;
		}
		
		
		
		
	
	
	
	

}
