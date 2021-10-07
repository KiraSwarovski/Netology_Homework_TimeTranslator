import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        long totalTime = 0;
        long biggestTime = 0;
        long smallestTime = Integer.MAX_VALUE;
        int day = 0;
        int hour = 0;
        int minute = 0;
        while (!input.equals("end")) {
            System.out.println("Введите название задачи");
            input = scanner.nextLine();
            System.out.println("Сколько дней потребуется на выполнение?");
            day = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько часов");
            hour = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько минут");
            minute = Integer.parseInt(scanner.nextLine());
            Time time = new Time(day,hour,minute);
            long currentTimeTask =  time.getSecond();
           totalTime+=currentTimeTask;
           if(currentTimeTask>biggestTime)biggestTime=currentTimeTask;
           if(currentTimeTask<smallestTime)smallestTime=currentTimeTask;
            System.out.println("Для завершения работы программы введите `end` / для продолжения нажмите enter\n");
            input=scanner.nextLine();
            if (input.equals("end")) break;

        }
        System.out.println("Всего потребуется: "+totalTime);
        System.out.println("Самая продолжительная задача займет: "+biggestTime);
        System.out.println("Самая короткая задача займет: "+smallestTime);
    }


}
