import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] products = arrayToPrintProducts();
        int[] prices = arrayToPrintPricesOfProduct();
        int count = 0;
        for (int i = 0; i < products.length; i++) {
                count++;
                System.out.println(count + ". " + products[i] +" "+ prices[i]+" dollar apiece" + "\t");
            }


    }

    public static String[] arrayToPrintProducts() {
        String[] arrayOfProducts = {"Milk", "Bread", "Cigarettes"};
        return arrayOfProducts;
    }

    public static int[] arrayToPrintPricesOfProduct() {
        int[] prices = {70, 50, 150};
        return prices;
    }

}
