package com.nitish.client;

public interface CustomerOperations {

	void addCustomer(Customer customer, CustomerInterface customerInterface);

	void deleteCustomer(String id, CustomerInterface customerInterface);

	void updateCustomer(String id,Customer customer, CustomerInterface customerInterface);

	void loadCustomers(CustomerInterface customerInterface);

}