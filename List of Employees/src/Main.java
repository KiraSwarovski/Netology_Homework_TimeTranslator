import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> arrayEmployee = new ArrayList();
        arrayEmployee = inputEmpData(arrayEmployee);
        arrayEmployee = changeAttributes(arrayEmployee);
        printArrEmp(arrayEmployee);
    }

    private static ArrayList<Employee> inputEmpData(ArrayList<Employee> arrayEmployee) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String surname = scanner.next();
            String name = scanner.next();
            String age = scanner.next();
            String sex = scanner.next();
            String education = scanner.next();
            String position = scanner.next();
            String department = scanner.next();
            Employee employee = new Employee(surname, name, age, sex,
                    education, position, department);
            arrayEmployee.add(employee);
            printArrEmp(arrayEmployee);
            System.out.println("If you want to finish entering data, enter end. If not - enter any key");
            String input = scanner.next();
            if ("end".equalsIgnoreCase(input)) {
                scanner.close();
                break;
            }

        }
        return arrayEmployee;
    }

    public static void printArrEmp(ArrayList<Employee> arrPrint) {
        for (Employee emp:arrPrint) {
            System.out.println(emp.toString());
        }
    }

    public static ArrayList<Employee> changeAttributes(ArrayList<Employee> oldArr) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("If you want to finish entering data, enter end. If not - enter any key");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            System.out.println("Enter the last name and first name of the employee" +
                    " for whom you want to change the data");
            String surname = scanner.next();
            String name = scanner.next();

            int empIndex = searchBySurname(surname, name, oldArr);
            if (empIndex != -1) {
                // TODO опросы по атрибутам
            }
        }
        return oldArr;
    }
    static int searchBySurname(String surname, String name, List<Employee> employeeList){

        for (int i = 0; i < employeeList.size(); i++) {

        }
        return -1;
    }
}
