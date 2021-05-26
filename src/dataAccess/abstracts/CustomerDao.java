package dataAccess.abstracts;

import java.util.List;

import entities.abstracts.Entity;

public interface CustomerDao {

	List<Entity> getAll();
	
	void add(Entity entity);
	
}
