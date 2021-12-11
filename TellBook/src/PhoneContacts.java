import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class PhoneContacts {
    HashMap<String, LinkedList<Contact>> listOfContacts = new HashMap<>();

    public PhoneContacts() {
        this.listOfContacts = listOfContacts;
    }

    public void addGroup(String group){
       if(listOfContacts.containsKey(group)){
           System.out.printf("This %s is already exist",group);
       }
       else {
           listOfContacts.put(group, new LinkedList<>());
       }
    }
//    public void addContact(Contact contact, String[]contactsInfo){
//        for (String addName: contactsInfo) {
//            if(listOfContacts.containsKey(contactsInfo)){
//                listOfContacts.put(contactsInfo, new LinkedList<>());
//            }
//            else {
//                System.out.println("This group doesn't exist");
//            }
//        }
//    }
    public void displayContacts(){
        if(listOfContacts.isEmpty()){
            System.out.println("Empty List");
        }
        else {
            for (Map.Entry<String, LinkedList<Contact>> groupname: listOfContacts.entrySet()) {
                String key = groupname.toString();
                System.out.println(key);
            }
        }
    }
}
