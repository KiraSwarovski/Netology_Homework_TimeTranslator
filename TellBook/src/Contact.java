public class Contact {
    private String name;
    private String telNumber;

    public Contact(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return name + telNumber;
    }
}
