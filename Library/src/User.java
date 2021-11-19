public abstract class User {
    private String name;
    private int dateOfBirth;

    public User(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return getName(); //add this. if it run a mistake
    }
}
