import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Contact> contacts = new HashMap<>();
//        chooseAction(contacts);
        Scanner scanner = new Scanner(System.in);
        int chooseAction;
        String input = "";
        while ("end".equals(input)){
            printAction();
            input = scanner.nextLine();
            try {
                chooseAction = Integer.parseInt(input);
            }catch (NumberFormatException e){
                System.out.println("Choose action 1-4. Try again");
                continue;
            }
            switch (chooseAction){
                case 1:
                    System.out.println("Enter new contact. Write his Name, Surname, Phone number, Group");
                   Contact contact;
                    String contactBIO = scanner.nextLine();
                   String[] contactInfo = contactBIO.split(",");
//                   contact = new Contact(contactInfo[0],contactInfo[1],contactInfo[2],Group.(contactInfo[3]);
                case 2:
                case 3:
                case 4:
            }
        }
        printAction();


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
