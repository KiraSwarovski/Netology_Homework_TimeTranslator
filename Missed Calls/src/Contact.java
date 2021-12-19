import java.util.*;

public class Contact {
    private String Name;
    private String Surname;
    private String Phone;
    private Group Group;

    public Contact(String name, String surname, String phone, Group group) {
        Name = name;
        Surname = surname;
        Phone = phone;
        Group = group;
    }

    public static void missedCalls(String newPhone){
        //TODO check if this contact exist


    }

    public static void deleteContact(String newContact) {

    }

    public static void searchContactByNumber(String idNumber) {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public Group getGroup() {
        return Group;
    }

    public void setGroup(Group group) {
        Group = group;
    }

    @Override
    public String toString() {
        return Phone;
    }
}
