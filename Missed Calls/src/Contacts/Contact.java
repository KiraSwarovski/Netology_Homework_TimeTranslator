package Contacts;

import Contacts.Group;

public class Contact {
    private String Name;
    private String Surname;
    private String Phone;
    private Contacts.Group Group;

    public Contact(String name, String surname, String phone, Group group) {
        Name = name;
        Surname = surname;
        Phone = phone;
        Group = group;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    @Override
    public String toString() {
        return Phone+" "+Name+" "+Surname+" "+Group;
    }
}
