import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int EMPTY = 0;
    public static final int SHIP = 1;
    public static final int DEAD = 2;
    public static final int MISS = 3;
    public static final int MAX_SHIP = 1;
    public static final int MAX_TURN = 2;
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int turnCount = 0;
        int deadCount = 0;
        int warField[][] = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < MAX_SHIP; i++) {
            int shipPlace1 = random.nextInt(SIZE);
            int shipPlace2 = random.nextInt(SIZE);
            if (warField[shipPlace1][shipPlace2] == SHIP) {
                i--;
            }
            warField[shipPlace1][shipPlace2] = SHIP;
        }

        Scanner scanner = new Scanner(System.in);
        while (turnCount<=MAX_TURN) {
            printArray(warField);
            int fireY = scanner.nextInt()-1;
            int fireX = scanner.nextInt()-1;
            switch (warField[fireY][fireX]) {
                case EMPTY:
                    turnCount++;
                    warField[fireY][fireX] = MISS;
                    break;
                case SHIP:
                    turnCount++;
                    deadCount++;
                    warField[fireY][fireX] = DEAD;
                    break;
                default:
                    System.out.println("You have already fired this cell. Try again");
                    break;
            }
            if (deadCount == MAX_SHIP) break;

        }
        scanner.close();
        isWin(deadCount);
    }

    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void isWin(int turn) {
        switch (turn) {
            case MAX_SHIP:
                System.out.println("You win");
                break;
            default:
                System.out.println("You lose");
                break;
        }

    }
}

