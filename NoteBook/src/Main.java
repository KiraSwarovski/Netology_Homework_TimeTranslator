import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chooseAction = 0;
        String s = "";
        while (!"0".equals(s)) {
            printAction();
            s = scanner.next();
            try {
                chooseAction = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again\n");
                break;
            }
            switch (chooseAction) {
                case 1:
                    addTask();
                    break;
                case 2:
                    displayListOfTasks();
                    break;
                case 3:
                    deleteTheTask();
                    break;
                case 0:
                    break;
            }
        }
    }

    private static void deleteTheTask() {
    }

    private static void displayListOfTasks() {
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
