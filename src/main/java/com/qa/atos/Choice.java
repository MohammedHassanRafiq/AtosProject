package com.qa.atos;

import java.util.Scanner;

public class Choice {

	private static Scanner sc = new Scanner(System.in);
	RoyalMail r = new RoyalMail();

	public String getInput() {
		System.out.println("Enter CRUD choice: ");
		return sc.nextLine();
	}

	public void options() {
		CRUDqueries q = new CRUDqueries();
		String crud = getInput();
		try {
			do {
				switch (crud.toLowerCase()) {
				case "create":
					System.out.println("Enter Firstname: ");
					String Firstname = sc.nextLine();
					r.setFirstname(Firstname);
					System.out.println("Enter Secondname: ");
					String Secondname = sc.nextLine();
					System.out.println("Enter PhoneNumber: ");
					int PhoneNumber = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Address: ");
					String Address = sc.nextLine();
					q.create(Firstname, Secondname, PhoneNumber, Address);
					break;
				case "read":
					q.read();
					break;
				case "update":
					System.out.println("Enter id of record to update: ");
					int uid = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the new Firstname of the Customer: ");
					String nModel = sc.nextLine();
					q.update(uid, nModel);					
					break;
				case "delete":
					System.out.println("Enter id of record to delete: ");
					int id = sc.nextInt();
					sc.nextLine();
					q.delete(id);
					break;
				default:
					System.out.println("Invalid CRUD choice");
				}
				System.out.println("Would you like to continue? (y/n)");
				String quit = sc.nextLine();
				if (quit.toLowerCase().equals("y")) {
					crud = getInput();
				} else if (quit.toLowerCase().equals("n")) {
					crud = "quit";
				} else {
					System.out.println("Please enter 'y' or 'n'");
				}

			} while (!crud.equals("quit"));
			System.out.println("Goodbye!");
		} finally {
			q.closeConn();
		}
	}

}
