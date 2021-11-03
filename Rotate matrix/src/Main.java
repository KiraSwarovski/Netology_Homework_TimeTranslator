import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        displayArray(colors);
        System.out.println("\n");
        int[][] rotatedColors  = transportMatrix(colors);
        displayArray(rotatedColors);
    }
public static void displayArray(int [][] arr){
    for (int i = 0; i< arr.length; i++) {
        for (int j = 0; j< arr.length; j++) {
            System.out.format("%4d", arr[i][j]);
        }
        System.out.println();
    }
}

    public static  int [][] transportMatrix(int [][] arr) {
        for (int n = 0; n < 2; n++) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                int li = 0;
                int ri = arr[i].length - 1;
                while (li < ri) {
                    int temp = arr[li][i];
                    arr[li][i] = arr[ri][i];
                    arr[ri][i] = temp;
                    li++;
                    ri--;
                }
            }

        }return arr;
    }
}
