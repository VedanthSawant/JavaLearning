package Section_06;

public class TestMobilePhone {
	public static void main(String[] args) {

        // Create a MobilePhone object
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        // Create contacts
        Contact bob = Contact.createContact("Bob", "1111");
        Contact alice = Contact.createContact("Alice", "2222");
        Contact tom = Contact.createContact("Tom", "3333");

        // Add contacts
        System.out.println("Add Bob: " + mobilePhone.addNewContact(bob));     // true
        System.out.println("Add Alice: " + mobilePhone.addNewContact(alice)); // true
        System.out.println("Add Tom: " + mobilePhone.addNewContact(tom));     // true

        // Try adding duplicate
        System.out.println("Add Bob again: " + mobilePhone.addNewContact(bob)); // false

        System.out.println();
        mobilePhone.printContacts();

        // Update contact
        Contact newBob = Contact.createContact("Bob", "9999");
        System.out.println("\nUpdate Bob: " + mobilePhone.updateContact(bob, newBob));

        System.out.println();
        mobilePhone.printContacts();

        // Query contact
        Contact query = mobilePhone.queryContact("Alice");
        if (query != null) {
            System.out.println("\nFound contact: " +
                    query.getName() + " -> " + query.getPhoneNumber());
        } else {
            System.out.println("\nContact not found");
        }

        // Remove contact
        System.out.println("\nRemove Tom: " + mobilePhone.removeContact(tom));

        System.out.println();
        mobilePhone.printContacts();
    }

}
