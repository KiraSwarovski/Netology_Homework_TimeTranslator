import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
    Queue<Integer> queueLift = new LinkedList<>();

    public void addFloor(int nextFloor) {
        if(nextFloor<0||nextFloor>25){
            System.out.println("Invalid floor. Choose floor '0-25' ");
        }
        else queueLift.add(nextFloor);
    }

    public void printLift(){
        System.out.println("The elevator proceeded to the next floors:");
        while (queueLift.peek() !=null){
            System.out.println("Floor"+queueLift.poll()+"->");
        }
    }
}

