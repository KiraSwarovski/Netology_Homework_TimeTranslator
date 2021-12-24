import java.util.HashMap;
import java.util.Map;

public class PhoneContacts {
    Map<String, Contact> contacts = new HashMap<>();

    public void addContact(String number, Contact contact) {
        contacts.put(number, contact);
    }

    public Map<String, Contact> getContacts() {
        return contacts;
    }

    public void displayContacts() {
        System.out.println("Contact list: ");
        for (Map.Entry<String, Contact> entry: contacts.entrySet()) {
            System.out.println("Contact: "+entry.getValue());
        }

    }
}
