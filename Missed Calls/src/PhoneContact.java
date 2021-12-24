import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneContact {
    Map<String, Contact> contacts = new HashMap<>();


    public void addContact(String phoneNumber, Contact contact) {
        contacts.put(phoneNumber, contact);
    }

    public void displayContacts() {
        System.out.println("List1: ");
        contacts.entrySet().forEach(contacts -> {
            System.out.println(contacts.getKey() + " " + contacts.getValue());
        });
    }

    public void displayContacts2() {
        System.out.println("List2: ");
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            System.out.println(entry.getKey());
//            Iterator it = entry.getValue();
        }
    }
}
