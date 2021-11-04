import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner myScan = new Scanner(System.in);
        int input = 5;

        ArrayWork arr = new ArrayWork(input);
        Random rand = new Random();
        //create array of Product objects with input size and random prices
        for (int i = 0; i < input; i++) {
            Product temp = new Product("item"+i, rand.nextInt(100), "This is item "+i);
            arr.insert(temp);
        }
        System.out.println("\nCreated array:");
        arr.display();
        //QuickSort algorithm reproduction
        arr.quickSortArr();
        System.out.println("\nSorted array:");
        arr.display();
    }
}