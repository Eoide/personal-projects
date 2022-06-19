package MobilePhoneProject;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MobilePhone {
    private String name;
    private ArrayList<Contact> contacts = new ArrayList<>();

    public MobilePhone(String name) {
        this.name = name;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(Contact c: contacts) {
            System.out.println(c);
        }
    }

    public void addContact(String name, String number) {
        contacts.add(new Contact(name, number));
    }

    public void updateContact(String name, String newNumber) {
        boolean found = false;
        for(Contact c: contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.updateNumber(newNumber);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Contact not found");
        }
    }

    public void removeContact(String name) {
        boolean found = false;
        for(Contact c: contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                contacts.remove(contacts.indexOf(c));
                System.out.println("Contact: " + name + " removed successfully");
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Contact not found");
        }
    }

    public void findContact(String name) {
        boolean found = false;
        for(Contact c: contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println(c);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Contact not found");
        }
    }
}

/*Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.
*/