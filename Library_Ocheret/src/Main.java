public class Main {

    public static void main(String[] args) {
        LibrarianAdmin librarianAdmin = new LibrarianAdmin("Ksenia", 1993);
        Reader studentReader = new ReaderImpl("Reader1", 1995);
        Supplier supplier = new SupplierImpl ("Supplier1", 1991);

        librarianAdmin.orderBooks(supplier);
        librarianAdmin.findBooks();
        studentReader.pickUpBooks(3);
        studentReader.pickUpBooks(1);
        librarianAdmin.delayNotice(studentReader);
        studentReader.dropOffBooks(5);
        supplier.bringBooks();
    }
}