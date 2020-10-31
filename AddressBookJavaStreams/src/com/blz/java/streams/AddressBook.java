package com.blz.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
	Scanner sc = new Scanner(System.in);
	public Person p;
	public String firstName;
	public AddressBook(String firstName)
	{
		this.firstName = firstName;
	}
	public Person getPerson()
	{
		return p;
	}
	public void setPerson(Person p)
	{
		this.p = p;
	}
	public List<Person> personList = new ArrayList<Person>();
	public List<Person> getAddressBook()
	{
		return personList;
	}
	public void setAddressBook(List<Person> personList)
	{
		this.personList = personList;
	}
	public void addContact(Person p)
	{
		personList.add(p);
	}
	public void editDetails(String firstName)
	{
		String str = "";
		for(Person p : personList)
		{
			str = p.getFirstName();
			if(firstName.equals(str))
			{
				System.out.println("Select the option to edit....\n1. LastName\n2. Address\n3. City\n4. State\5. Zip\n6. PhoneNumber\n7. email\n");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter last name: ");
					String lastName = sc.next();
					p.setLastName(lastName); 
					break;
				case 2:
					System.out.println("Enter address: ");
					String address = sc.next();
					p.setAddress(address); 
					break;
				case 3:
					System.out.println("Enter city: ");
					String city = sc.next();
					p.setCity(city); 
					break;
				case 4:
					System.out.println("Enter state: ");
					String state = sc.next();
					p.setState(state); 
					break;
				case 5:
					System.out.println("Enter zipcode: ");
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
					System.out.println("Invalid choice");
				}
			}
			else
			{
				System.out.println("No matches found. Enter a valid first name");
			}
		}
	}
	public void deleteDetails(String firstName)
	{
		String str1 = "";
		for(Person p : personList)
		{
			str1 = p.getFirstName();
			if(firstName.equals(str1))
			{
				personList.remove(p);
			}
		}
	}
}
