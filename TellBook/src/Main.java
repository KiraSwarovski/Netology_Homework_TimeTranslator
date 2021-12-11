import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        addContact();
        addGroup();
    }

    private static void addGroup() {
        PhoneContacts phoneContacts = new PhoneContacts();
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (!"end".equals(s)) {
            System.out.println("Write group's name for add");
            s = scanner.next();
            phoneContacts.addGroup(s);
        }
        phoneContacts.displayContacts();
    }

    private static void addContact() {
        PhoneContacts phoneContacts = new PhoneContacts();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write list of groups");
            String group = scanner.nextLine();
            String[] groups = group.split(" ");
            System.out.println("Write full name of Contact and his mobile number");

        }
    }
}
