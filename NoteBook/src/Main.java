import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listOfTasks = new ArrayList<>();
        Scanner scannerInt = new Scanner(System.in);
        int chooseAction;
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
                    System.out.println("Enter the task to schedule:");
                    listOfTasks = addTask(listOfTasks);
                    break;
                case 2:
                    displayListOfTasks(listOfTasks);
                    break;
                case 3:
                    listOfTasks = deleteTheTask(listOfTasks);
                    displayListOfTasks(listOfTasks);
                    break;

                default:
                    System.out.println("Choose other option");
                    break;
            }
        }
    }

    private static ArrayList<String>  deleteTheTask(ArrayList<String> oldList) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listCut = new ArrayList<>(oldList);
        String s;
        int chooseRemoveIndex;
        while (true){
            System.out.println("Enter the task to remove from schedule:");
            s = scanner.next();
            if(!"Finish".equals(s)){
                try {
                    chooseRemoveIndex = Integer.parseInt(s)-1;
                } catch (NumberFormatException e) {
                    System.out.println("Index is a number. Please choose index of Array, not a Value. \n");
                    continue;
                }
                listCut.remove(chooseRemoveIndex);
            }
            else break;
        }
        return listCut;
    }

    private static void displayListOfTasks(ArrayList<String> list) {
        System.out.println("Tasks from schedule: ");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(list.indexOf(iter.next())+". "+iter.next());
        }
        System.out.println();
    }

    private static ArrayList<String> addTask(ArrayList<String> oldList) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listNewAdd = new ArrayList<>(oldList);
        String task = scanner.nextLine();
        listNewAdd.add(task);
        return listNewAdd;
    }

    private static void printAction() {
        System.out.println("Choose below option:\n" +
                "1. Add a task\n" +
                "2. Display a list of tasks\n" +
                "3. Delete the task\n" +
                "0. Exit\n");
    }
}
