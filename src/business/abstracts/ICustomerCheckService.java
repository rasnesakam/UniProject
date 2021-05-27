package business.abstracts;

import entities.concretes.Customer;

public interface ICustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer);


}
