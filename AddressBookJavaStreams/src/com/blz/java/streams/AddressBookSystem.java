package com.blz.java.streams;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookSystem
{
	static int option = 0;
	public static void main(String[] args)
	{
		AddressBook[] addressBook = new AddressBook[2];
		addressBook[0] = new AddressBook("Address Book 1");
		addressBook[1] = new AddressBook("Address Book 2");
		Scanner sc = new Scanner(System.in);
		HashMap<String, AddressBook> addressBookMap = new HashMap<>();
		addressBookMap.put("Address Book 1", addressBook[0]);
		addressBookMap.put("Address Book 2", addressBook[1]);
		do {
				sc.nextLine();
				System.out.println("Select an option...\n1. Add new conact\n2. Edit the details\n3. Delete the contact\n");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter the user details into...\n1. Address_Book_1\n2. Address_Book_2");
					option = sc.nextInt();
					System.out.print("Enter first name: ");
					String firstName = sc.next();
					System.out.println("Enter last name: ");
					String lastName = sc.next();
					System.out.println("Enter address: ");
					String address = sc.next();
					System.out.println("Enter city: ");
					String city = sc.next();
					System.out.println("Enter state: ");
					String state = sc.next();
					System.out.println("Enter zipcode: ");
					int zip = sc.nextInt();
					System.out.println("Enter Phone Number: ");
					long phno = sc.nextLong();
					System.out.println("Enter email address: ");
					String emailId = sc.next();
					Person p = new Person(firstName, lastName, address, city, state, zip, phno, emailId);
					if(option == 1)
						addressBook[0].addContact(p);
					else
						addressBook[1].addContact(p);
					break;
				case 2:
					System.out.println("Enter first name to edit: ");
					String Name = sc.nextLine();
					if(option == 1)
						addressBook[0].editDetails(Name);
					else
						addressBook[1].editDetails(Name);
					break;
				case 3:
					System.out.println("Enter first name to delete: ");
					String name = sc.nextLine();
					if(option == 1)
						addressBook[0].deleteDetails(name);
					else
						addressBook[1].deleteDetails(name);
					break;
				default:
					System.out.println("Invalid choice");
				}
				System.out.println("Do you want to continue?(Y/N)");
		} while(sc.next().charAt(0) == 'Y');
		System.out.println("All contacts in Address Book 1: ");
		System.out.println(addressBook[0].getAddressBook());
		System.out.println("All contacts in Address Book 1: ");
		System.out.println(addressBook[1].getAddressBook());
	}
}
