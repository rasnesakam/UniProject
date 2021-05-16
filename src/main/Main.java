package main;

import java.time.LocalDate;

import adapters.MerniceServiceAdapter;
import business.abstracts.BaseCustomerManager;
import business.abstracts.ICustomerService;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entities.abstracts.IEntity;
import entities.concretes.Customer;



public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		customerManager.Save(new Customer (LocalDate.of(1982, 12, 01) ,  "Memati",  "Baş",  "12345678901"));
		
		
	}

}
