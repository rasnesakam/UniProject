package main;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.Random;

import adapters.MerniceServiceAdapter;
import business.abstracts.BaseCustomerManager;
import business.abstracts.ICustomerService;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entities.abstracts.Entity;
import entities.concretes.Customer;



public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		
		customerManager.Save(
				new Customer (
						1,
						"Memati",
						"Baþ",
						LocalDate.of(1982, 12, 01),
						"12345678901"
					)
				);
		
		
	}

}
