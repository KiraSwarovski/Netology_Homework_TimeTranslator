import java.util.Scanner;

public class Main {
     static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 0;
        String action = "";
        System.out.println("Выберите операцию:" + "\n" +
                "1. Сравнить" + "\n" +
                "2. Округлить" + "\n" +
                "3. Отбросить дробную часть");
        //Scanner sc = new Scanner(System.in);
        action = sc.next();
        try {
            number = Integer.parseInt(action);
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод");
        }
        switch (number) {
            case 1:
                Compare();
                break;
            case 2:
                Round();
                break;
            case 3:
                DiscardFractionalPart();
                break;
        }

    }

    public static void Compare() {
        System.out.println("Введите первое число:");
        double firstNumber = sc.nextDouble();
        System.out.println("Введите второе число:");
        float secondNumber = sc.nextFloat();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " больше,чем " + secondNumber);
        } else if (secondNumber > firstNumber) System.out.println(secondNumber + " больше,чем " + firstNumber);
        else System.out.println("числа равны");
    }

    public static void Round() {
        System.out.println("Введите  число:");
        double firstNumber = sc.nextDouble();
        int result = (int) Math.round(firstNumber);
        System.out.println("Результат: " + result);
    }

    public static void DiscardFractionalPart() {
        System.out.println("Введите  число:");
        double firstNumber = sc.nextDouble();
        long result = (long) firstNumber;
        System.out.println("Результат: " + result);
    }
}
