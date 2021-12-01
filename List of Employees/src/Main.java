import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> arrayEmployee = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String surname = scanner.next();
            String name = scanner.next();
            String age = scanner.next();
            String sex = scanner.next();
            String education = scanner.next();
            String position = scanner.next();
            String department = scanner.next();
            Employee employee = new Employee(surname, name, age, sex, education, position, department);
            arrayEmployee.add(employee);
            printArrEmp(arrayEmployee);
            System.out.println("If you want to finish entering data, enter end");
            String input = scanner.next();
            if (!"end".equals(input)) {
                arrayEmployee = changeAttributes(arrayEmployee);
            }
            printArrEmp(arrayEmployee);
            break;
        }
    }

    public static void printArrEmp(ArrayList<Employee> arrPrint) {
        for (Employee emp : arrPrint) {
            System.out.println(emp.toString());
        }
    }

    public static ArrayList<Employee> changeAttributes(ArrayList<Employee> oldArr) {

        return oldArr;
    }
}
