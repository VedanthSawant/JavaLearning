package Section_06;

import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts = new ArrayList<Contact>();
	
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<>();
	}
	
	private int findContact(Contact contact) {
	    return findContact(contact.getName());
	}

	private int findContact(String number) {
		for(int i = 0; i < myContacts.size(); i++) {
			if(myContacts.get(i).getName().equals(number)){
				return i;
			}
		}
		return -1;
	}
	
	public  boolean addNewContact(Contact contact) {
		if(findContact(contact) >= 0) {
			return false;
		}else {
			myContacts.add(contact);
			return true;
		}
	}
	
	public boolean updateContact(Contact oldContact, Contact newContact) {
		int position = findContact(oldContact);
		if(position >= 0) {
			myContacts.set(position, newContact);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean removeContact(Contact contact) {
		int position = findContact(contact);
		if(position >= 0) {
			myContacts.remove(position);
			return true;
		}else {
			return false;
		}
	}
	
	public Contact queryContact(String name) {
		int position = findContact(name);
		if(position >= 0) {
			return myContacts.get(position); 
		}
		return null;
	}
	
	public void printContacts() {
		System.out.println("Contact List:");
		for(int i = 0; i < myContacts.size(); i++) {
			System.out.println(i+1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
		}
	}
	
}
