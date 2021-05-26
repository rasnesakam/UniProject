package dataAccess.cocnretes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import dataAccess.abstracts.CustomerDao;
import entities.abstracts.Entity;
import entities.concretes.Customer;

public class SerializableCustomerDao implements CustomerDao {

	private static File usersfile = new File("users");
	
	@Override
	public List<Entity> getAll() {
		ArrayList<Entity> customers = new ArrayList<>();
		
		if (usersfile.isDirectory()) {
			
			for (File file : usersfile.listFiles()) {
				
				try {
					FileInputStream fileIn = new FileInputStream(file);
					ObjectInputStream objIn = new ObjectInputStream(fileIn);
					
					Customer customer = (Customer) objIn.readObject();
					
					objIn.close();
					fileIn.close();
					
					customers.add(customer);
					
				} catch ( 
						IOException
						| ClassNotFoundException
						e
						) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}
			
			return customers;
			
		}
		
		return null;
	}

	@Override
	public void add(Entity entity) {

		if (entity instanceof Customer) {
			
			try {
				
				if (!usersfile.exists()) usersfile.mkdirs();
				
				FileOutputStream fileOut = new FileOutputStream(
						usersfile.getAbsolutePath().concat("/").concat( Integer.toHexString(entity.hashCode()) ).concat(".bin")
						);
				
				ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
				
				objOut.writeObject((Customer) entity);
				
				objOut.close();
				fileOut.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
