package ödev;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;
import Abstract.IEntity;
import Adapters.MerniceServiceAdapter;
import Abstract.ICustomerService;
import Concrete.StarbucksCustomerManager;



public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		customerManager.Save(new Customer (LocalDate.of(1982, 12, 01) ,  "Memati",  "BaÅŸ",  "12345678901"));
		
		
		
		
		
		
		
		
		
		
	}

}
