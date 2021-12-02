import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> arrayEmployee = new ArrayList();
        arrayEmployee = inputEmpData(arrayEmployee);
        printArrEmp(arrayEmployee);

        arrayEmployee = changeAttributes(arrayEmployee);
        printArrEmp(arrayEmployee);
    }

    private static ArrayList<Employee> inputEmpData(ArrayList<Employee> arrayEmployee) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter information about the employee " +
                    "(last name, first name, age, gender, age, education, position, department):");
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
            System.out.println("If you want to finish entering data, enter end. " +
                    "If not you wanna add some more employees, press any key");
            String input = scanner.next();
            if ("end".equalsIgnoreCase(input)) {
                break;
            }
        }
        return arrayEmployee;
    }

    public static void printArrEmp(ArrayList<Employee> arrPrint) {
        for (Employee emp : arrPrint) {
            System.out.println(emp.toString());
        }
    }

    public static ArrayList<Employee> changeAttributes(ArrayList<Employee> oldArr) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" If not you wanna change info - press any key"+
                    "If you don't wanna change employee info, enter end.");
            String input = scanner.next();
            if ("end".equalsIgnoreCase(input)) {
                break;
            }
            System.out.println("Enter the last name and first name of the employee" +
                    " for whom you want to change the data");
            String surname = scanner.next();
            String name = scanner.next();

            int empIndex = searchBySurname(surname, name, oldArr);
            if (empIndex != -1) {
                System.out.println("Per");
//                switch (chooseAction) {
//                    case 1:
//                        System.out.println("Enter the tasks to schedule:");
//                        listOfTasks = addTask(listOfTasks);
//                        break;
//                    case 2:
//                        displayListOfTasks(listOfTasks);
//                        break;
//                    case 3:
//                        listOfTasks = deleteTheTask(listOfTasks);
//                        displayListOfTasks(listOfTasks);
//                        break;
//
//                    default:
//                        System.out.println("Goodbye");
//                        break;
//                }
                Employee employee = oldArr.get(empIndex);
                System.out.printf("Employer %s %s has found\n", employee.getSurname(), employee.getName());
                System.out.printf("Type YES, if you wanna change %s\n", employee.getSurname());
                String flagSurname = scanner.next();
                if ("YES".equalsIgnoreCase(flagSurname)) {
                    String flag = scanner.next();
                    employee.setSurname(flag);
                }
                System.out.printf("Type YES, if you wanna change %s\n", employee.getName());
                String flagName = scanner.next();
                if ("YES".equalsIgnoreCase(flagName)) {
                    String flag = scanner.next();
                    employee.setName(flag);
                }
                System.out.printf("Type YES, if you wanna change %s\n", employee.getAge());
                String flagAge = scanner.next();
                if ("YES".equalsIgnoreCase(flagAge)) {
                    String flag = scanner.next();
                    employee.setAge(flag);
                }
                System.out.printf("Type YES, if you wanna change %s\n", employee.getSex());
                String flagSex = scanner.next();
                if ("YES".equalsIgnoreCase(flagSex)) {
                    String flag = scanner.next();
                    employee.setSex(flag);
                }
                System.out.printf("Type YES, if you wanna change %s\n", employee.getEducation());
                String flagEducation = scanner.next();
                if ("YES".equalsIgnoreCase(flagEducation)) {
                    String flag = scanner.next();
                    employee.setEducation(flag);
                }
                System.out.printf("Type YES, if you wanna change %s\n", employee.getPosition());
                String flagPosition = scanner.next();
                if ("YES".equalsIgnoreCase(flagPosition)) {
                    String flag = scanner.next();
                    employee.setPosition(flag);
                }
                System.out.printf("Type YES, if you wanna change %s\n", employee.getDepartment());
                String flagDepartment = scanner.next();
                if ("YES".equalsIgnoreCase(flagDepartment)) {
                    String flag = scanner.next();
                    employee.setDepartment(flag);
                }
                else {
                    System.out.println("User not found");
                }
            }
        }
        return oldArr;
    }

    static int searchBySurname(String surname, String name, List<Employee> employeeList) {
        int flag = -1;
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            if (surname.equalsIgnoreCase(employee.getSurname()) &&
                    name.equalsIgnoreCase(employee.getName())) {
                flag = i;
            }
        }
        return flag;
    }
}
