public class SupplierImp extends User implements Supplier {
    private static int numOfBook;

    public SupplierImp(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }


    public int getBook() {
        return numOfBook;
    }

    public void setBook(int numOfBook) {
        this.numOfBook = numOfBook;
    }

    public void setBookSubstract(int numOfBook) {
        this.numOfBook -= numOfBook;
    }

    public void setBookSum(int numOfBook) {
        this.numOfBook += numOfBook;
    }

    @Override
    public void supplyingBook(int book) {
        numOfBook += book;
        System.out.format("%s supply %d book(s) to library; Library bank has %s book(s) left%n", super.getName(), book, numOfBook);
    }
}
