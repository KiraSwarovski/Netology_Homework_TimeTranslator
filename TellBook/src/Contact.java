public class Contact {
    private String name;
    private String telNumber;

    public Contact(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + " ,number: " + telNumber;
    }
}
