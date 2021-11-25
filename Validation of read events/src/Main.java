public class Main {
    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("All events are correct");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Inception", 2010, 16),
                new Movie("Lion King", 1994, 0)

        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Anna Karenina", 2017, 16),
                new Theatre("Night in Museum", 2021, 8)

        };
    }

    public static void validEvent(Event event) throws RuntimeException {

        if (event.getTitle() == null ||
                event.getReleaseYear() == 0 ||
                event.getAge() == 0) {
            throw new RuntimeException();
        }
    }
}
