package business.abstracts;

import entities.concretes.Customer;

public abstract class  BaseCustomerManager implements ICustomerService {
	
	

	public void Save(Customer customer) {
		 
		System.out.println("Saved to db : " +customer.getFirstName());
		
		
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
