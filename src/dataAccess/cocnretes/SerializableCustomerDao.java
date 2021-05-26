package dataAccess.cocnretes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import dataAccess.abstracts.CustomerDao;
import entities.abstracts.Entity;
import entities.concretes.Customer;

public class SerializableCustomerDao implements CustomerDao {

	private static File usersfile = new File("users");
	
	@Override
	public List<Entity> getAll() {
		ArrayList<Customer> customers = new ArrayList<>();
		return null;
	}

	@Override
	public void add(Entity entity) {

		if (entity instanceof Customer) {
			try {
				
				FileOutputStream fileOut = new FileOutputStream(usersfile.getAbsolutePath().concat(entity.toString()).concat(".bin"));
				
				
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
