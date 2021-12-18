import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите год в формате \"yyyy\"");
        Scanner scanner = new Scanner(System.in);
        String year_nonValid = scanner.nextLine();
        int year = Integer.parseInt(year_nonValid);
        if (year%400==0 || year%4==0 && year%100!=0) System.out.println("Количество дней 366");
        else System.out.println("Количество дней 365");
    }

    public static class NotePadImpl {
        public NotePadImpl(String addTask, int removeTask) {
            this.addTask = addTask;
            this.removeTask = removeTask;
        }

        public String getAddTask() {
            return addTask;
        }

        public void setAddTask(String addTask) {
            this.addTask = addTask;
        }

        public int getRemoveTask() {
            return removeTask;
        }

        public void setRemoveTask(int removeTask) {
            this.removeTask = removeTask;
        }

        private String addTask;
        private int removeTask;


        ArrayList<String> listOfTasks = new ArrayList<>();
        private static ArrayList<String> addTask(ArrayList<String> oldList) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> listNewAdd = new ArrayList<>(oldList);
            String task = "";
            while (true) {
                task = scanner.nextLine();
                if ("end".equals(task)) {
                    break;
                } else {
                    listNewAdd.add(task);
                }
            }
            displayListOfTasks(listNewAdd);
            return listNewAdd;
        }
        public  void displayListOfTasks(ArrayList<String> list) {
            System.out.println("Tasks from schedule: ");
            Iterator<String> iter = list.iterator();
            while (iter.hasNext()) {
                System.out.println(list.indexOf(iter.next()) + ". " + iter.next());
            }
            System.out.println();
        }
        private static ArrayList<String> deleteTheTask(ArrayList<String> oldList) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> listCut = new ArrayList<>(oldList);
            String s;
            int chooseRemoveIndex;
            while (true) {
                System.out.println("Enter the task to remove from schedule:");
                s = scanner.next();
                if (!"Finish".equals(s)) {
                    try {
                        chooseRemoveIndex = Integer.parseInt(s) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Index is a number. Please choose index of Array, not a Value. \n");
                        continue;
                    }
                    listCut.remove(chooseRemoveIndex);
                } else break;
            }
            return listCut;
        }

    }
}
