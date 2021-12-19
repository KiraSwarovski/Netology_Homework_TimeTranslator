import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Missed calls");
        PhoneContact phoneContact = new PhoneContact();
        MissedCalls missedCalls = new MissedCalls();
//        chooseAction(contacts);
        Scanner scanner = new Scanner(System.in);
        int chooseAction;
        String input = "";
        while (!"end".equals(input)) {
            printAction();
            input = scanner.nextLine();
            try {
                chooseAction = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Choose action 1-4. Try again");
                continue;
            }
            switch (chooseAction) {
                case 1:
                    System.out.println("Enter new contact. \nWrite his Name, " +
                            "Surname, Phone number, Group (separated by 'space'");

                    String contactBIO = scanner.nextLine();
                    String[] contactInfo = contactBIO.split(" ");
                    Contact contact;
                    if (contactInfo.length == 4) {
                        contact = new Contact(contactInfo[0], contactInfo[1], contactInfo[2], Group.isEqual(contactInfo[3]));
                        if (phoneContact.contacts.containsValue(contact)) {
                            System.out.println("Such contact exists.");
                        } else {
                            phoneContact.addContact(contactInfo[2], contact);
                        }
                    }
            }
//
//                case 2:
//
//                case 3:
//                case 4:
        }
        phoneContact.displayContacts();
        phoneContact.displayContacts2();
    }

    public static void printAction() {
        System.out.println("Menu:\n" +
                "1. Add contact\n" +
                "2. Add missed call\n" +
                "3. Display all missed calls\n" +
                "4. Clear missed calls\n" +
                "5. Exit\n" +
                "Select an item from the menu (1-4):");
    }
}
