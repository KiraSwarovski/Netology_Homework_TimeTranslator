public class Main {
    public static void main(String[] args) {
        AdministratorLibraryImp admin = new AdministratorLibraryImp("Ksenia", 1996);
        Supplier supplier = new SupplierImp("Justin", 1991);
        Reader reader = new ReaderImp("Max", 1994);

        admin.orderBook(supplier);
        reader.takeBook(1);
        reader.takeBook(1);
        reader.takeBook(1);

    }
}
