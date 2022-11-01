package addressBook;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to master branch ");

		AddressBookMethod addressBookMethod = new AddressBookMethod();
		addressBookMethod.newContact();

		System.out.println(addressBookMethod.list);

	}
}
