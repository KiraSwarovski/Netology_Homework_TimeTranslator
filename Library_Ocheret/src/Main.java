public class Main {

    public static void main(String[] args) {
        LibrarianAdmin librarianAdmin = new LibrarianAdmin("Ksenia", 1993);
        Reader studentReader = new ReaderImpl("Alex", 1995);
        Supplier supplier = new SupplierImpl ("Roman", 1991);

        librarianAdmin.orderBooks(supplier);
        librarianAdmin.findBooks();
        studentReader.pickUpBooks(studentReader);
        librarianAdmin.delayNotice(studentReader);
        studentReader.dropOffBooks(studentReader);
        supplier.bringBooks();
    }
}