import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] products = arrayToAddProducts();
        int[] prices = arrayToAddPricesOfProduct();
        System.out.println();
        arrayToPrint(products, prices);

    }

    public static String[] arrayToAddProducts() {
        String[] arrayOfProducts = {"Milk", "Bread", "Cigarettes"};
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
