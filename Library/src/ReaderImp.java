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
        numOfBooks += book;
        SupplierImp supplierImp = new SupplierImp(getName(), getDateOfBirth());
        supplierImp.setBookSubstract(book);
        System.out.format("%s has taken %s book(s); totally he must return %d book(s) to the Library%n", super.getName(), book, getNumOfBooks());
    }

    @Override
    public void returnBook(int book) {
        numOfBooks -= book;
        SupplierImp supplierImp = new SupplierImp(getName(), getDateOfBirth());
        supplierImp.setBookSum(book);
        System.out.format("%s has returned %s book(s); totally he must return %d book(s) to the Library%n", super.getName(), book, getNumOfBooks());
    }

    @Override
    //TODO ternary operation
    public boolean isOverdue() {
        return getNumOfBooks()>0? true:false;
   }

}
