public class Movie extends Event {
    public Movie(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public int getReleaseYear() {
        return super.getReleaseYear();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
}
