package uniProject.main;

import uniProject.Abstract.BaseCustomerManager;
import uniProject.Adapters.MerniceServiceAdapter;
import uniProject.Concrete.StarbucksCustomerManager;
import uniProject.Entities.Customer;

import java.time.LocalDate;

public class MainClass {

    public static void main(String[] args) {

        BaseCustomerManager customerManager =
                new StarbucksCustomerManager(new MerniceServiceAdapter());
        customerManager.Save(
                new Customer(LocalDate.of(1982, 12, 01) ,
                        "Memati",  "Baş",  "12345678901")
                );


    }
}
