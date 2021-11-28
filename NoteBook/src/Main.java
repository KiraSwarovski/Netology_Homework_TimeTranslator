import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        ArrayList<String> listOfTasks = new ArrayList<>();
        int chooseAction = 0;
        String s = "";
        while (!"0".equals(s)) {
            printAction();
            s = scannerInt.next();
            try {
                chooseAction = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again\n");
                continue;
            }

            switch (chooseAction) {
                case 1:
                    printForSetTask();
                    String task = scannerString.nextLine();
                    listOfTasks.add(task);
                    for (int i = 0; i < listOfTasks.size(); i++) {
                        System.out.printf("%d. %s\n", i + 1, listOfTasks.get(i));
                    }
                case 2:
                    System.out.println("Display list: ");
                    for (int i = 0; i < listOfTasks.size(); i++) {
                        System.out.printf("%d. %s\n", i + 1, listOfTasks.get(i));
                    }
                    System.out.println();
                    displayListOfTasks(listOfTasks);
                case 3:
                    deleteTheTask();
                case 0:
                    break;
            }
        }
    }

    private static void deleteTheTask() {

    }

    private static void displayListOfTasks(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, list.get(i));
        }
        System.out.println();
    }

    private static void addTask() {

    }

    private static void printAction() {
        System.out.println("1. Add a task\n" +
                "2. Display a list of tasks\n" +
                "3. Delete the task\n" +
                "0. Exit\n");
    }

    private static void printForSetTask() {
        System.out.println("Enter the task to schedule:");
    }
}
