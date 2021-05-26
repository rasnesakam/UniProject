package business.concretes;

import java.util.List;

import business.abstracts.BaseCustomerManager;
import business.abstracts.ICustomerService;
import dataAccess.abstracts.CustomerDao;
import dataAccess.cocnretes.SerializableCustomerDao;
import entities.abstracts.Entity;
import entities.concretes.Customer;

public class SerializableCustomerManager extends BaseCustomerManager {

	private CustomerDao dataAccess;
	
	public SerializableCustomerManager() {
		this.dataAccess = new SerializableCustomerDao();
	}
	
	@Override
	public void Save(Customer customer) {

		this.dataAccess.add(customer);
		
	}

	@Override
	public void listAll() {

		List<Entity> customers = dataAccess.getAll();
		
		for(Entity entity: customers) System.out.println(entity);
		
		
	}

}
