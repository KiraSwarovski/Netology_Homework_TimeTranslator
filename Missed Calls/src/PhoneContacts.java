import java.util.HashMap;
import java.util.Iterator;
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
//        Iterator iter = contacts.entrySet().iterator();
////        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
////            System.out.println(entry.getKey());
//            while (iter.hasNext()) {
//                System.out.println(iter.next());
////            }
//        }
        for (Map.Entry<String, Contact> entry: contacts.entrySet()) {
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }

    }
}
