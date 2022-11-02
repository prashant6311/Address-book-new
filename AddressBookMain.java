package addressBook;

import java.util.Scanner;

public class AddressBookMain {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to master branch ");

		AddressBookMethod addressBookMethod = new AddressBookMethod();
		boolean factos = true;

		while (factos == true) {

			System.out.println("if you want to add new contact press 1");
			System.out.println("if you want to edit any contact press 2");
			System.out.println("if you want to delete any contact press 3");
			System.out.println("if you want to display contact press 4");
			System.out.println("if you want to exit press 5");
			byte check = scanner.nextByte();

			if (check == 1) {
				addressBookMethod.newContact();
			} else if (check == 2) {
				addressBookMethod.editContact();
			} else if (check == 3) {
				addressBookMethod.deleteContact();
			} else if (check == 4) {
				System.out.println(addressBookMethod.list.toString());
			} else if (check == 5) {
				System.out.println("Thanks for using this Address-book");
				factos = false;
			} else {
				System.out.println("Please choose correct option");
			}
		}
	}
}
