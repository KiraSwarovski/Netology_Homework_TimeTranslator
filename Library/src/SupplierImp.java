public class SupplierImp extends User implements Supplier {
    private int numOfBook;

    public SupplierImp(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }

    public SupplierImp(){
        super("Lenin",1870);
    }

    public int getBook() {
        return numOfBook;
    }

    public void setBook(int numOfBook) {
        this.numOfBook = numOfBook;
    }

    @Override
    public void supplyingBook(int book) {
    numOfBook+=book;
        System.out.format("%s supply %d book(s) to library%n", super.getName(), getBook());
    }
}
