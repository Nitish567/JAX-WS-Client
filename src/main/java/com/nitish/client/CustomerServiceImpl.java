package com.nitish.client;

import java.util.Iterator;
import java.util.List;

public class CustomerServiceImpl implements CustomerOperations {

	@Override
	public void addCustomer(Customer customer, CustomerInterface customerInterface) {

		customerInterface.addCustomer(customer);

	}

	@Override
	public void deleteCustomer(String id, CustomerInterface customerInterface) {
		customerInterface.deleteCustomer(id);
	}

	@Override
	public void updateCustomer(String id, Customer customer, CustomerInterface customerInterface) {
		customer.setCustomerID(id);
		customerInterface.updateCustomer(customer);
	}

	@Override
	public void loadCustomers(CustomerInterface customerInterface) {
		List<Customer> customerList = customerInterface.loadCustomer();
		Iterator<Customer> customerIterator = customerList.iterator();
		while (customerIterator.hasNext()) {
			Customer customer = customerIterator.next();
			System.out.println("Id : " + customer.getCustomerID() + " Firstname : " + customer.getFirstName()
					+ " Lastname : " + customer.getLastName());
			;
		}
	}

}
