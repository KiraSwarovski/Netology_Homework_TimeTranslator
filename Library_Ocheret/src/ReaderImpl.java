public class ReaderImpl extends User implements Reader {
    private int numBooks;

    public int getNumBooks() {
        return this.numBooks;
    }

    public void setNumBooks(int num) {
        this.numBooks = num;
    }

    public ReaderImpl(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public void pickUpBooks(Administrator administrator) {
        this.setNumBooks(this.getNumBooks() + 1);
        System.out.printf("%s picked %d book(s) from the library. He now has %s%n",
                this.getName(), 1, this.getNumBooks());
    }

    @Override
    public void dropOffBooks(Administrator administrator) {
        this.setNumBooks(this.getNumBooks() - 1);
        System.out.printf("%s returned %d book(s) in the library. He now has %s %n",
                this.getName(), 1, this.getNumBooks());
    }
}