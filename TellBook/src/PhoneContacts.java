import java.util.*;

public class PhoneContacts {
    private HashMap<String, LinkedList<Contact>> listOfContacts = new HashMap<>();

    public PhoneContacts() {
        this.listOfContacts = new HashMap<String, LinkedList<Contact>>();
    }

    public HashMap<String, LinkedList<Contact>> getGroups() {
        return listOfContacts;
    }

    public void addGroup(String group) {
        if (listOfContacts.containsKey(group)) {
            System.out.printf("This %s is already exist", group);
        } else {
            listOfContacts.put(group, new LinkedList<>());
        }
    }

    public void addContact(Contact contact, String[] contactsInfo) {
        for (String checkName : contactsInfo) {
            if (listOfContacts.containsKey(checkName)) {
                LinkedList<Contact> infoContact = new LinkedList<>();
                infoContact.add(contact);
                listOfContacts.get(checkName).add(contact);
            } else {
                System.out.println("This group doesn't exist");
            }
        }
    }

    public void displayContacts() {
//        if (listOfContacts.isEmpty()) {
//            System.out.println("Empty List");
//        } else {
//            for (Map.Entry<String, LinkedList<Contact>> entry : listOfContacts.entrySet()) {
//                String key = entry.getKey();
//                LinkedList<Contact> value = entry.getValue();
//                System.out.println(key);
//                for (Contact contact : value) {
//                    System.out.println(contact.toString());
//                }
//            }
//        }
        if (listOfContacts.isEmpty()) {
            System.out.println("Phone Book is empty");
        } else {
            System.out.println("My Phone Book:");
            for (Map.Entry<String, LinkedList<Contact>> myGroupsEntry : listOfContacts.entrySet()) {
                System.out.println(" Group:" + myGroupsEntry.getKey());
                Iterator it = myGroupsEntry.getValue().iterator();
                while (it.hasNext()) {
                    System.out.println(it.next().toString());
                }
            }
        }
    }
}
