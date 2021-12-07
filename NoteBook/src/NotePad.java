import java.util.ArrayList;

public class NotePad {
    ArrayList<String> listOfTasks = new ArrayList<>();

    public void addTask(String newTask) {
        listOfTasks.add(newTask);
    }

    public void displayListOfTasks() {
        System.out.println("Tasks from schedule: ");
        int i = 0;
        for (String value : listOfTasks) {
            System.out.println(++i + ". " + value);
        }
    }

    public void deleteTask(int deleteTask) {
        if (listOfTasks.isEmpty()) {
            System.out.println("You can't delete task from empty list");
        } else if (deleteTask >= 0 && listOfTasks.size() >deleteTask) {//check smthg
            listOfTasks.remove(deleteTask);
        } else {
            System.out.println("Invalid index for remove");

        }
    }
}