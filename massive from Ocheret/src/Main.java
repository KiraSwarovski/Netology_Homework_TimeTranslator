import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] products = new String[]{"Milk", "Beaf", "Eggs", "Soda", "Cake"};
        int[] prices = new int[]{8, 10, 4, 2, 13};
        int[] basket = new int[products.length];

        System.out.println("List of possible items for purchase:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i+1 + "." + products[i]);
        }

        int itemNumber = 0;
        int itemCount = 0;
        int totalSum = 0;

        Scanner myScan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter product number and quantity (separated by a space):");
            String input = myScan.nextLine();
            if ("end".equals(input)) {
                myScan.close();
                break;
            }
            String[] parts = input.split(" ");
            itemNumber = Integer.parseInt(parts[0]) - 1;
            itemCount = Integer.parseInt(parts[1]);
            basket[itemNumber] += itemCount;

            totalSum += itemCount * prices[itemNumber];
        }
        System.out.println("Your basket:");
        System.out.println("Item Quantity Price Amount");
        for (int i: basket
             ) {  if (basket[i] > 0) {
            System.out.println(products[i] + "     " + basket[i] + "      " + prices[i] + "     " + prices[i]*basket[i]);
        }

        }
   /*     for (int i = 0; i < basket.length; i++){
            if (basket[i] > 0) {
                System.out.println(products[i] + "     " + basket[i] + "      " + prices[i] + "     " + prices[i]*basket[i]);
            }
        }*/
        System.out.println("Total: " + totalSum);
    }
}