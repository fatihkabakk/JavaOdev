package odev2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "Fatih", "Kabak", LocalDate.of(1995, 1, 1), "1111111");
		neroCustomerManager.save(customer);
		starbucksCustomerManager.save(customer);
		CustomerCheckService mernisServiceAdapter = new MernisServiceAdapter();
		System.out.println(mernisServiceAdapter.checkIfRealPerson(customer));
	}

}
