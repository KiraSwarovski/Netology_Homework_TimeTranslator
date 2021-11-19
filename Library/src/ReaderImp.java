public class ReaderImp extends User implements Reader {
    private int numOfBooks;

    public ReaderImp(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }


    @Override
    public void takeBook(int book) {
        setNumOfBooks(book + this.getNumOfBooks());
        System.out.format("%s must return %d book(s) to the Library%n", super.getName(), getNumOfBooks());
    }

    @Override
    public void returnBook() {

    }

}
