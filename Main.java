package com.addressbook;

import java.util.Scanner;

public class Main {

	public static Contacts contact = new Contacts();

	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		Scanner scan = new Scanner(System.in);
		try {
			boolean quit = false;
			while (!quit) {
				menu();
				System.out.println("Enter your choice");
				int action = scan.nextInt();
				scan.nextLine();
				switch (action) {
				case 0:
					quit = true;
					break;
				case 1:
					if (contact.numContacts() < 50) {
						addContact();
					}
					break;
				case 2:
					if (contact.numContacts() > 0) {
						System.out.println("You have following Person Details in your Address Book");
						contact.printContacts();
						contact.editContactDetail();
					} else {
						System.out.println("you dont have following person in Address Book");
					}
					break;
				case 3:
					if (contact.numContacts() > 0) {
						contact.printContacts();
						contact.deleteContact();
					} else {
						System.out.println("you dont have following person to delete");
					}
					break;
				case 4:
					menu();
					break;
				default:
					System.out.println("Please Give Proper Input");
				}
			}
		} catch (Exception e) {
			System.out.println("Please Give Proper Input");
			mainMenu();
		}
	}

	public static void menu() {
		System.out.println("1 - To Add new person to address book\n" + "2 - To Edit person information\n"
				+ "3 - To delete person information from Address Book\n" + "4 - To print menu again");
	}

	public static void addContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person Details in following manner");
		try {
			System.out.println("Please Enter First name");
			String firstName = sc.next();
			System.out.println("Please Enter Last name");
			String lastName = sc.next();
			System.out.println("Please Enter Address");
			String address = sc.next();
			System.out.println("Please Enter City");
			String city = sc.next();
			System.out.println("Please Enter State");
			String state = sc.next();
			System.out.println("Please Enter Zip");
			int zip = sc.nextInt();
			System.out.println("Please Enter Phone Number");
			String phoneNumber = sc.next();
			contact.addContact(new AddressBookMain(firstName, lastName, address, city, state, zip, phoneNumber));
			System.out.println("Person detail added");
			contact.printContacts();
		} catch (Exception e) {
			System.out.println("you entered String value for int Value Retry");
		}
	}

}
