package com.blz.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
	static Scanner sc = new Scanner(System.in);
	public static List<Person> personList = new ArrayList<Person>();
	public void addContact()
	{
		System.out.println("Enter user details");
		System.out.print("Enter first name: ");
		String firstName = sc.next();
		System.out.print("Enter last name: ");
		String lastName = sc.next();
		System.out.print("Enter address: ");
		String address = sc.next();
		System.out.print("Enter city: ");
		String city = sc.next();
		System.out.print("Enter state: ");
		String state = sc.next();
		System.out.print("Enter zip code: ");
		int zip = sc.nextInt();
		System.out.print("Enter Phone number: ");
		long phno = sc.nextLong();
		System.out.print("Enter email address: ");
		String emailId = sc.next();
		Person p = new Person(firstName, lastName, address, city, state, zip, phno, emailId);
		personList.add(p);
		System.out.println("User details added to Address Book successfully");
	}
	public void editDetails()
	{
		if(personList.isEmpty())
		{
			System.out.println("The address book is empty. Enter some details");
			addContact();
		}
		else
		{
			System.out.println("Enter first name of user to edit: ");
			String firstName = sc.next();
			String str = "";
			for(Person p : personList)
			{
				str = p.getFirstName();
				if(firstName.equals(str))
				{
					System.out.println("select the option to edit....\n1. LastName\n2. Address\n3. City\n4. State\n5. Zip\n6. Phone Number\n7. email ");
					int option = sc.nextInt();
					switch(option)
					{
					case 1:
						System.out.println("Enter Last Name: ");
						String lastName = sc.next();
						p.setLastName(lastName);
						break;
					case 2:
						System.out.println("Enter Address: ");
						String address = sc.next();
						p.setAddress(address);
						break;
					case 3:
						System.out.println("Enter City: ");
						String city = sc.next();
						p.setCity(city);
						break;
					case 4:
						System.out.println("Enter State: ");
						String state = sc.next();
						p.setState(state);
						break;
					case 5:
						System.out.println("Enter Zipcode: ");
						int zip = sc.nextInt();
						p.setZip(zip);
						break;
					case 6:
						System.out.println("Enter Phone Number: ");
						long phno = sc.nextLong();
						p.setPhNo(phno);
						break;
					case 7:
						System.out.println("Enter email address: ");
						String emailId = sc.next();
						p.setEmailId(emailId);
						break;
					default:
						System.out.println("Please enter valid option");
						editDetails();
					}
					System.out.println("Successfully edited");
				}
				else
				{
					System.out.println("Enter valid first name of the user");
					editDetails();
				}
			}
		}
	}
	public void deleteDetails()
	{
		if(personList.isEmpty())
		{
			System.out.println("The address book is empty. Enter some details");
			addContact();
		}
		else
		{
			System.out.println("Enter first name of user to delete: ");
			String firstName = sc.next();
			String str = "";
			for(Person p : personList)
			{
				str = p.getFirstName();
				if(firstName.equals(str))
				{
					personList.remove(p); 
				}
				else
				{
					System.out.println("Enter valid first name");
					deleteDetails();
				}
			}
		}
	}
	public static void main(String[] args)
	{
		AddressBook adrBook = new AddressBook();
		System.out.println("Welcome to Address Book Problem");
		int choice;
		do {
			System.out.println("1. Add new contact\n2. Edit contact details\n3. Delete contact\n");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					adrBook.addContact();
					break;
				case 2:
					adrBook.editDetails();
					break;
				case 3:
					adrBook.deleteDetails();
					break;
				default:
					System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue?(Y/N)");
		} while(sc.next().charAt(0) == 'Y');
		System.out.println(personList);
	}
}
