public class Publisher {
    String publisherName;
    String country;

    public Publisher(String publisherName, String country) {
        this.publisherName = publisherName;
        this.country = country;
    }

    @Override
    public String toString() {
        return ("The publisher is " + publisherName + " ;" + "\n" + "From a country: " + country);
    }
}
