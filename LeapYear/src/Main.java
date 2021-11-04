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
}
