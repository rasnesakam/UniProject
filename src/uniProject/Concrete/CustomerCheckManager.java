package uniProject.Concrete;

import uniProject.Abstract.ICustomerCheckService;
import uniProject.Entities.Customer;

public class CustomerCheckManager  implements ICustomerCheckService{


	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return false;
	}
}
