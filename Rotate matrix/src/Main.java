import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        fillArrayWithRandomNumbers(colors);
        displayArray(colors);
        int angle = chooseAngle();
        int[][] rotatedColors = transportMatrix(colors, angle);
        displayArray(rotatedColors);
    }

    public static void displayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] transportMatrix(int[][] arr, int angle) {
        int times = angle / 90;
        for (int n = 0; n < times; n++) {
            int[][] transportMatrix = new int[SIZE][SIZE];
            for (int i = 0; i < transportMatrix.length; i++) {
                for (int j = i; j < transportMatrix[0].length; j++) {
                    int temp = arr[i][j];
                    transportMatrix[i][j] = arr[j][i];
                    transportMatrix[j][i] = temp;
                }
            }
            for (int i = 0; i < transportMatrix.length; i++) {
                int ri = transportMatrix[i].length - 1;
                int li = 0;
                while (li < ri) {
                    int temp = transportMatrix[i][li];
                    transportMatrix[i][li] = transportMatrix[i][ri];
                    transportMatrix[i][ri] = temp;
                    ri--;
                    li++;
                }
            }
            arr = transportMatrix;
        }
        return arr;
    }

    public static int[][] fillArrayWithRandomNumbers(int[][] arr) {

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arr[i][j] = random.nextInt(256);
            }
        }
        return arr;
    }

    public static int chooseAngle() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Type angle multiply of 90, no more than 360");
        int angle = Integer.parseInt(scnr.nextLine());
        scnr.close();
        return angle;
    }
}
