package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMethod {

	Scanner sc = new Scanner(System.in);
	ArrayList<Contact> list = new ArrayList<>();

	public void newContact() {
		System.out.println("Enter first name");
		String firstName = sc.nextLine();

		System.out.println("Enter last name");
		String lastName = sc.nextLine();

		System.out.println("Enter address");
		String address = sc.nextLine();

		System.out.println("Enter city");
		String city = sc.nextLine();

		System.out.println("Enter state");
		String state = sc.nextLine();

		System.out.println("Enter zip");
		String zip = sc.nextLine();

		Contact contact = new Contact(firstName, lastName, address, city, state, zip);

		list.add(contact);
	}

	public void editContact() {
		System.out.println("enter first name to edit the contact ");
		String name = sc.nextLine();

		for (Contact con : list) {
			if (con.getFirstName().equals(name)) {

				System.out.println("Which detail you want to edit");
				System.out.println("press 1 for first name");
				System.out.println("press 2 for last name");
				System.out.println("press 3 for address");
				System.out.println("press 4 for  city");
				System.out.println("press 5 for state");
				System.out.println("press 6 for zip");
				String choice = sc.nextLine();

				switch (choice) {
				case "1":
					System.out.println("Enter new first name ");
					con.setFirstName(sc.nextLine());
					break;
				case "2":
					System.out.println("Enter new last name ");
					con.setLastName(sc.nextLine());
					break;
				case "3":
					System.out.println("Enter new address ");
					con.setAddress(sc.nextLine());
					break;
				case "4":
					System.out.println("Enter new city ");
					con.setCity(sc.nextLine());
					break;
				case "5":
					System.out.println("Enter new state ");
					con.setState(sc.nextLine());
					break;
				case "6":
					System.out.println("Enter new zip ");
					String zipping = sc.nextLine();
					con.setZip(sc.nextLine());
					break;
				default:
					System.out.println("Please make a valid choice ");
				}
			} else {
				System.out.println(name + " not found in the address-book");
			}
		}
	}

}
