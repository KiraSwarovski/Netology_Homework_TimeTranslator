import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = arrayToAddProducts();
        int[] prices = arrayToAddPricesOfProduct();
        int[] totalQuantity = new int[products.length];
        String[] title = arrayTitle();
        arrayToPrint(products, prices);
        int totasSumForPay = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose product and quantity OR type `end` ");
            String line = scanner.nextLine();
            if ("end".equals(line)) {
                scanner.close();
                break;
            }
            String[] parts = line.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int quantity = Integer.parseInt(parts[1]);

            totalQuantity[productNumber] += quantity;
            totasSumForPay += prices[productNumber] * quantity;
        }
        for (String s : arrayTitle()) {
            System.out.print(s + "\t");
        }
        System.out.println();
        for (int i = 0; i < products.length; i++) {
            if (totalQuantity[i] > 0)
                System.out.format("%-12s\t%-8d\t%-14d\t%-8d\n", products[i], totalQuantity[i], prices[i], totalQuantity[i] * prices[i]);
        }
        System.out.printf("%41s\t%-8d", "Total Price: ", totasSumForPay);
    }

    public static String[] arrayToAddProducts() {
        String[] arrayOfProducts = {"Milk", "Bread", "Sugar"};
        return arrayOfProducts;
    }

    public static String[] arrayTitle() {
        String[] arrayOfProducts = {"Product Name", "Quantity", "Price for 1 kg", "Total Amount"};
        return arrayOfProducts;
    }

    public static int[] arrayToAddPricesOfProduct() {
        int[] prices = {70, 50, 150};
        return prices;
    }

    public static void arrayToPrint(String[] prod, int[] price) {
        int count = 0;
        for (int i = 0; i < prod.length; i++) {
            count++;
            System.out.println(count + ". " + prod[i] + " " + price[i] + " dollar apiece" + "\t");
        }
    }
}
