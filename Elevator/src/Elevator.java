import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
    Queue<Integer> queueLift = new LinkedList<>();

    public void addFloor(int nextFloor) {
        if (nextFloor < 0 || nextFloor > 25) {
            System.out.println("Invalid floor. Choose floor '0-25' ");
        } else queueLift.add(nextFloor);
    }

    public void printLift() {
        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        int previousFloor = -1;
        int currentFloor;
        System.out.println("The elevator proceeded to the next floors:");
        while (queueLift.peek() != null) {
            if (queueLift.peek() > 0) {
                System.out.print("Floor " + queueLift.poll() + " -> ");
            } else break;
            currentFloor = queueLift.peek();
            totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
            totalSeconds += waitDoorsInSeconds;
            previousFloor = currentFloor;
        }
        System.out.println("Floor " + queueLift.poll());
        System.out.println("The time spent by the elevator on the route =: " + totalSeconds + " s.");
    }
}

