package Contacts;

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

    public String getPhone() {
        return Phone;
    }

    @Override
    public String toString() {
        return Phone + " " + Name + " " + Surname + " " + Group;
    }
}
