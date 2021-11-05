import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int EMPTY = 0;
    public static final int SHIP = 1;
    public static final int DEAD = 2;
    public static final int MISS = 3;
    public static final int MAX_SHIP = 10;
    public static final int MAX_TURN = 30;
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int turnCount = 0;
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
        printArray(warField);
        Scanner scanner = new Scanner(System.in);
        while (turnCount <= 10) {
            int fire = Integer.parseInt(scanner.nextLine());

            switch (fire) {
                case 1:
            }
        }
    }

    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}

