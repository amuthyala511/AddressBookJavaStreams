package com.blz.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
	Scanner sc = new Scanner(System.in);
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
	public static void main(String[] args)
	{
		AddressBook adrBook = new AddressBook();
		System.out.println("Welcome to Address Book Problem");
		adrBook.addContact();
	}
}
