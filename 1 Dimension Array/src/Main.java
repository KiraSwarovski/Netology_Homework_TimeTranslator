import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = arrayToAddProducts();
        int[] prices = arrayToAddPricesOfProduct();
        int[] totalQuantity = new int[products.length];
        int[] totalPrice = new int[products.length];
        int sum = 0;
        arrayToPrint(products, prices);
        Scanner scanner = new Scanner(System.in);
        int productNumber = 0;
        int quantity = 0;
        while (true) {
            System.out.println("Choose product and quantity OR type `end` ");
            String line = scanner.nextLine();

            if ("end".equals(line)) {
                scanner.close();
                break;
            }
            String[] parts = line.split(" ");

            try {
                productNumber = Integer.parseInt(parts[0]) - 1;
                quantity = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid format. Try only numbers.");
                continue;
            }
            totalQuantity[productNumber] += quantity;
            totalPrice[productNumber] += quantity * prices[productNumber];
        }
        for (String s : arrayTitle()) {
            System.out.print(s + "\t");
        }
        System.out.println();
        for (int i = 0; i < products.length; i++) {
            if (totalQuantity[i] > 0)

                System.out.format("%-12s\t%-8d\t%-14d\t%-8d\n", products[i], totalQuantity[i], prices[i], totalPrice[i]);
            sum += totalPrice[i];
        }
        System.out.printf("%41s\t%-8d", "Total Price: ", sum);
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
        for (int i = 0; i < prod.length; i++) {
            int countComma = i + 1;
            System.out.printf("%d%s\t%s\t%d\t%15s\n", countComma, ".", prod[i], price[i], "dollar apiece");
        }
    }
}
