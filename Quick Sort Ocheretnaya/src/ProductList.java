public class ProductList {
    private String name;
    private int price;
    private String description;

    public ProductList(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String toString() {
        return (name + " " + price + " " + description);
    }

    public int getPrice() {
        return this.price;
    }
}