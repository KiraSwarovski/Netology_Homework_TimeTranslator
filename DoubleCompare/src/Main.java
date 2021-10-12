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
                compare();
                break;
            case 2:
                round();
                break;
            case 3:
                discardFractionalPart();
                break;
        }

    }

    public static void compare() {
        System.out.println("Введите первое число:");
        double firstNumber = sc.nextDouble();
        System.out.println("Введите второе число:");
        float secondNumber = sc.nextFloat();
        if(Math.abs(firstNumber-secondNumber)<0.00001) System.out.println("числа равны");
        else if ((firstNumber-secondNumber)>0.00001) {
            System.out.println(firstNumber + " больше,чем " + secondNumber);
        } else if ((firstNumber-secondNumber)<-0.00001) System.out.println(secondNumber + " больше,чем " + firstNumber);
        else System.out.println("Error");
    }

    public static void round() {
        System.out.println("Введите  число:");
        double roundNumber = sc.nextDouble();
        double result =  Math.round(roundNumber);
        System.out.println("Результат: " + result);
    }

    public static void discardFractionalPart() {
        System.out.println("Введите  число:");
        double discardNumber = sc.nextDouble();
        long result = (long) discardNumber;
        System.out.println("Результат: " + result);
    }
}
