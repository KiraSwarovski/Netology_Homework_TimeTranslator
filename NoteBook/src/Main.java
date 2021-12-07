import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotePad notePad = new NotePad();
        Scanner scanner = new Scanner(System.in);
        int chooseAction;
        String s = "";
        while (!"0".equals(s)) {
            printAction();
            s = scanner.next();
            try {
                chooseAction = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again\n");
                continue;
            }

            switch (chooseAction) {
                case 1:
                    String task = "";
                    while (true) {
                        System.out.println("Enter the new task to add to schedule: \n" +
                                "enter 'end' for exit");
                        task = scanner.next();
                        if ("end".equals(task)) {
                            break;
                        } else {
                            notePad.addTask(task);
                        }
                        notePad.displayListOfTasks();
                    }
                    break;
                case 2:
                    notePad.displayListOfTasks();
                    break;
                case 3:
                    int chooseRemoveIndex;
                    while (true) {
                        System.out.println("Enter the task to remove from schedule: \n" +
                                " For exit enter 'Finish'");
                        s = scanner.next();
                        if (!"Finish".equalsIgnoreCase(s)) {
                            try {
                                chooseRemoveIndex = Integer.parseInt(s) - 1;
                            } catch (NumberFormatException e) {
                                System.out.println("Index should be a number. Please choose index of Array, not a String value. \n");
                                continue;
                            }
                            notePad.deleteTask(chooseRemoveIndex);
                            notePad.displayListOfTasks();
                        } else break;
                        break;
                    }
                default:
                    break;
            }
        }
        System.out.println("Goodbye");
    }

    static void printAction() {
        System.out.println("Choose below option:\n" +
                "1. Add a task\n" +
                "2. Display a list of tasks\n" +
                "3. Delete the task\n" +
                "0. Exit\n");
    }
}

