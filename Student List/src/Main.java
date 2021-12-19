import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> studentsList = new HashSet<>();
        addStudent(studentsList);
        displayStudentsList(studentsList);
    }

    private static void addStudent(HashSet<Student> studentsList) {
        Scanner scanner = new Scanner(System.in);
        String inputStudentList = "";
        System.out.println("Enter information about the student: \"Full name, group number, student ID number\"");
        while (!"end".equals(inputStudentList)) {
            inputStudentList = scanner.nextLine();
            String[] studentInfo = inputStudentList.split(",");
            Student student;
            if (studentInfo.length == 3) {
                student = new Student(studentInfo[0], studentInfo[1], studentInfo[2]);
                if (studentsList.contains(student)) {
                    System.out.println("Such student ID exists");
                } else {
                    studentsList.add(student);
                }
            }
            System.out.println("Enter information about the student (to complete the program, enter \"end\")");
        }
    }

    private static void displayStudentsList(HashSet<Student> students) {
        System.out.println("Students lists: ");
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
