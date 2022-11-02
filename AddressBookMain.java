package addressBook;

import java.util.Scanner;

public class AddressBookMain {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to master branch ");

		AddressBookMethod addressBookMethod = new AddressBookMethod();
		addressBookMethod.newContact();
		addressBookMethod.newContact();

		System.out.println(addressBookMethod.list);

		System.out.println("if you want to edit any contact press 1");
		int check = scanner.nextInt();
		if (check == 1) {
			addressBookMethod.editContact();
		} else {
			System.out.println("Thanks for using this Address-book");
		}
		System.out.println(addressBookMethod.list);

	}
}
