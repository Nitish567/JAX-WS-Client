package com.nitish.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.namespace.QName;

public class SOAPApp {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			CustomerOperations customerOperations = new CustomerServiceImpl();
			URL url = new URL("http://localhost:9999/ws/customer?wsdl");
			QName qnme = new QName("http://soap.nitish.com/", "CustomerServiceImplService");
			javax.xml.ws.Service service = javax.xml.ws.Service.create(url, qnme);
			CustomerInterface customerService = service.getPort(CustomerInterface.class);
			while (true) {
				System.out.println(
						"1.Load all customers\n2.Add customer \n3.Delete Customer \n4.Update Customer \n5.Exit");
				int choice = scan.nextInt();

				switch (choice) {
				case 1:
					customerOperations.loadCustomers(customerService);
					break;

				case 2:

					Customer customerToAdd = new Customer();
					
					System.out.println("Enter Customer ID");
					String customerId = scan.next();
					scan.nextLine();
					System.out.println("Enter First Name");
					String firstName = scan.next();
					scan.nextLine();
					System.out.println("Enter Last Name");
					String lastName = scan.next();
					scan.nextLine();
					System.out.println("Enter Email");
					String email = scan.next();
					scan.nextLine();
					System.out.println("Enter Username");
					String username = scan.next();
					scan.nextLine();
					System.out.println("Enter Password");
					String password = scan.next();
					scan.nextLine();
					

					customerToAdd.setCustomerID(customerId);
					customerToAdd.setFirstName(firstName);
					customerToAdd.setLastName(lastName);
					customerToAdd.setEmail(email);
					customerToAdd.setUsername(username);
					customerToAdd.setPassword(password);

					customerOperations.addCustomer(customerToAdd, customerService);

					break;
				case 3:
					System.out.println("Enter ID");
					String id = scan.next();
					customerOperations.deleteCustomer(id, customerService);
					break;
				case 4:
					Customer upCustomer = new Customer();
					System.out.println("Enter ID");
					String idToUpdate = scan.next();
					scan.nextLine();
					System.out.println("Enter First Name");
					String firstNameUpdated = scan.next();
					scan.nextLine();
					System.out.println("Enter Last Name");
					String lastNameUpdated = scan.next();
					scan.nextLine();
					System.out.println("Enter Email");
					String emailUpdated = scan.next();
					scan.nextLine();
					System.out.println("Enter Username");
					String usernameUpdated = scan.next();
					scan.nextLine();
					System.out.println("Enter Password");
					String passwordUpdated = scan.next();

					upCustomer.setFirstName(firstNameUpdated);
					upCustomer.setLastName(lastNameUpdated);
					upCustomer.setEmail(emailUpdated);
					upCustomer.setUsername(usernameUpdated);
					upCustomer.setPassword(passwordUpdated);

					customerOperations.updateCustomer(idToUpdate, upCustomer, customerService);

					break;
				case 5:

					System.exit(0);

					break;

				default:
					break;
				}

			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
