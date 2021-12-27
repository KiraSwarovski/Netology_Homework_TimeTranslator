package Contacts;

import java.util.HashMap;
import java.util.Map;

public class PhoneContacts {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(String number, Contact contact) {
        contacts.put(number, contact);
    }

    public String getContacts(boolean flag) {
        String _name;
        if(flag==true) {
            for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
                _name = entry.getValue().getName();
                return _name;
            }
        }
            return null;
    }

    public void displayContacts() {
        System.out.println("Contact list: ");
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            System.out.println("Contact: " + entry.getValue());
        }
    }

    public boolean searchContactByPhoneNumber(String phoneNumber) {
        return contacts.containsKey(phoneNumber);
    }

}
