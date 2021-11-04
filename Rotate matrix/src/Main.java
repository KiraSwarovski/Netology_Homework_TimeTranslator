import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        displayArray(colors);
        System.out.println("\n");

        Scanner scnr = new Scanner(System.in);
        System.out.println("Type angle multiply of 90, no more than 360");
        int degrees = Integer.parseInt(scnr.nextLine());
        scnr.close();
        int[][] rotatedColors = transportMatrix(colors, degrees);
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

    public static int[][] transportMatrix(int[][] arr, int degrees) {
        int times = degrees / 90;
        for (int n = 0; n < times; n++) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                int ri = arr[i].length - 1;
                int li = 0;
                while (li < ri) {

                    int temp = arr[li][i];
                    arr[li][i] = arr[ri][i];
                    arr[ri][i] = temp;
                    ri--;
                    li++;

                }
            }
        }

        return arr;
    }

}
