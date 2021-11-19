public class ReaderImp extends User implements Reader, Supplier  {
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
//        supplyingBook(getNumOfBooks());
        System.out.format("%s has taken %s book(s); totally he must return %d book(s) to the Library%n", super.getName(), book,getNumOfBooks());
    }

    @Override
    public void returnBook() {

    }

    @Override
    public void supplyingBook(int book) {
        SupplierImp supplierImp = new SupplierImp(getName(),getDateOfBirth());
        int subBook = -book;
        supplierImp.setBook(subBook);
    }


    //       @Override
//    public void supplyingBook(int numOfBooks) {
//        Supplier readerForSubstractBook = new SupplierImp(getName(),getDateOfBirth());
//        readerForSubstractBook.supplyingBook(numOfBooks);
//    }

}
