package Contacts;

import java.util.HashMap;
import java.util.Map;

public class PhoneContacts {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(String number, Contact contact) {
        contacts.put(number, contact);
    }

    public String searchContactByPhoneNumber(String phoneNumber) {
        String name;
        String surName;
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            if (phoneNumber.equals(entry.getValue().getPhone())) {
                name = entry.getValue().getName();
                surName = entry.getValue().getSurname();
                return name+" "+surName;
            }
        }
        return "";
    }

    public void displayContacts() {
        System.out.println("Contact list: ");
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            System.out.println("Contact: " + entry.getValue());
        }
    }


}