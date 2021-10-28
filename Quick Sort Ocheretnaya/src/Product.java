public class Product {
    private String name;
    private int price;
    private String description;

    public Product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String toString() {
        return (name + " costs " + price + " - " + description);
    }

    // getters and setters
    public int getPrice () {
        return this.price;
    }
}