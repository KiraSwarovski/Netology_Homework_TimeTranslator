import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Scanner scanner = new Scanner(System.in);
        String s = "";
        int addNumberStop;
        while (!"0".equals(s)) {
            System.out.println("Choose the floor 1-25. Enter 0 to run lift.");
            s = scanner.next();
            try {
                addNumberStop = Integer.parseInt(s) ;
            } catch (NumberFormatException e) {
                System.out.println("Choose other Value");
                continue;
            }
            elevator.addFloor(addNumberStop);
        }
        elevator.printLift();

    }
}
