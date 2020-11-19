package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
	Scanner scan = new Scanner(System.in);
	private final ArrayList<AddressBookMain> friends;

	public Contacts() {
		friends = new ArrayList();
	}

	public void addContact(AddressBookMain c) {
		friends.add(c);
	}

	public void printContacts() {
		for (AddressBookMain friend : friends)
			System.out.println(friend);
	}

	// METHOD TO RETURN SIZE OF CONTACT ARRAYLIST
	public int numContacts() {
		return friends.size();
	}

	// METHOD TO CHECK INDEX OF FIRSTNAME
	private int haveContact(String s) {
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getfirstName().equals(s))
				return i;
		}
		return -1;
	}
	  //METHOD TO CHECK INDEX OF LASTNAME
	private int haveContactLast(String s) {
		for (int i = 0; i < friends.size(); i++)
			if (friends.get(i).getlastName().equals(s))
				return i;
		return -1;
	}

	public void deleteContact() {

		System.out.println("What is the First Name of the contact you want to delete?");
		String searchName = scan.next();
		int firstNameDel = haveContact(searchName);
		int lastNameDel;
		String lNameDel = "";
		if (firstNameDel >= 0) {
			System.out.println("What is the Last Name of the contact you want to delete?");
			lNameDel = scan.nextLine();
			lastNameDel = haveContactLast(lNameDel);
			if (lastNameDel >= 0) {
				friends.remove(firstNameDel);
				System.out.println(searchName + " " + lNameDel + " Contact Deleted From Address Book");
			} else {
				System.out.println("Contact Not Present in Address Book with name " + searchName + " " + lNameDel);
			}
		} else {
			System.out.println("Contact Not Present in Address Book with name " + searchName + " " + lNameDel);
		}
	}

	public void editContactDetail() {
		try {
			int lastname;
			String lName = "";
			System.out.println("Please Enter the First Name to search and EDIT");
			String fName = scan.nextLine();
			int firstname = haveContact(fName);

			if (firstname >= 0) {
				System.out.println("Please Enter the Last Name to search and EDIT");
				lName = scan.nextLine();
				lastname = haveContactLast(lName);
				if (lastname >= 0) {
					System.out.println("Enter Contact Details To EDIT");
					System.out.println("Please Enter First name");
					String firstName = scan.next();
					System.out.println("Please Enter Last name");
					String lastName = scan.next();
					System.out.println("Please Enter Address");
					String address = scan.next();
					System.out.println("Please Enter City");
					String city = scan.next();
					System.out.println("Please Enter State");
					String state = scan.next();
					System.out.println("Please Enter Zip");
					int zip = scan.nextInt();
					System.out.println("Please Enter Phone Number");
					String phoneNumber = scan.next();
					friends.set(firstname,
							new AddressBookMain(firstName, lastName, address, city, state, zip, phoneNumber));
					System.out.println("Contact Detail Updated with the new Detail");
					printContacts();
				} else {
				System.out.println("Contact Not Present in Address Book with name " + fName + " " + lName);
				}

			} else {
				System.out.println("Contact Not Present in Address Book with name " + fName + " " + lName);
			}
		} catch (Exception e) {
			System.out.println("Please give Proper input");
		}
	}

}
